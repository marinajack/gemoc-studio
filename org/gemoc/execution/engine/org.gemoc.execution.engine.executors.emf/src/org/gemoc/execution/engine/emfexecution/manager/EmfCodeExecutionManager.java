package org.gemoc.execution.engine.emfexecution.manager;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;
import org.gemoc.execution.engine.emfexecution.Activator;
import org.gemoc.execution.engine.emfexecution.CodeExecutionHelper;
import org.gemoc.execution.engine.emfexecution.behaviors.EmfExecutionBehavior;
import org.gemoc.execution.engine.emfexecution.persistentoptions.EmfExecutionPersistentOptions;

import com.google.inject.Injector;

import fr.inria.aoste.timesquare.backend.emfExecutionConfiguration.EMFExecutionConfiguration;
import fr.inria.aoste.timesquare.backend.emfExecutionConfiguration.ForcedClockMapping;
import fr.inria.aoste.timesquare.backend.manager.visible.BehaviorConfigurator;
import fr.inria.aoste.timesquare.backend.manager.visible.BehaviorManager;
import fr.inria.aoste.timesquare.backend.manager.visible.ClockBehavior;
import fr.inria.aoste.timesquare.backend.manager.visible.ClockEntity;
import fr.inria.aoste.timesquare.backend.manager.visible.ConfigurationHelper;
import fr.inria.aoste.timesquare.backend.manager.visible.PersistentOptions;
import fr.inria.aoste.timesquare.backend.manager.visible.RelationBehavior;
import fr.inria.aoste.timesquare.backend.ui.internal.EmfExecutionConfigurationActivator;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.Clock;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.ConcreteEntity;
import fr.inria.aoste.timesquare.ccslkernel.model.utils.CCSLKernelUtils;
import fr.inria.aoste.timesquare.launcher.core.inter.ISolverForBackend;
import fr.inria.aoste.timesquare.trace.util.ReferenceNameBuilder;
import fr.inria.aoste.trace.ModelElementReference;



public class EmfCodeExecutionManager<RichMainClass> extends BehaviorManager {
	private ArrayList<EmfExecutionBehavior> _behaviorList;
	private String _configurationFilename;
	//private IFile jarIFile;
	private URLClassLoader _kerLoader =null;
	private EObject _modelRoot = null;
	private EObject _modelLoader = null;
	private URI _modelURI = null;
	private URI _metamodelURI = null;
	protected CodeExecutionHelper ceh = null;
	private EPackage _mmpackage;
	private Map<String, Clock> forcedClockMap = new HashMap<String, Clock>();
	
	public String getConfigurationIFile() {
		return _configurationFilename;
	}

	public void setConfigurationFileName(String confFilename) {
		this._configurationFilename = confFilename;
		EMFExecutionConfiguration confModel = loadEMFExecutionConfiguration(confFilename);
		
		setJarFile(confModel.getJarImportStatement().getPathToJar());
		
		for(ForcedClockMapping mapping: confModel.getForcedClockMappings()){
			String ClkToEvaluate = CCSLKernelUtils.getQualifiedName(mapping.getClock(), "::");
			//String ClkToAvoid = CCSLKernelUtils.getQualifiedName(mapping.getClockToAvoidWhenTrue(), "::");
			forcedClockMap.put(ClkToEvaluate, mapping.getClockToAvoidWhenTrue());
		}
		
	}
	

	
private boolean setJarFile(String jarFileName){
	
			URLClassLoader loader = (URLClassLoader)ClassLoader.getSystemClassLoader();
			URL[] urls = new URL[1];
			try {
				urls[0] =new URL(jarFileName);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			
			_kerLoader = new URLClassLoader(urls,  Activator.class.getClassLoader());  
		return true;
	
	}
	
	private EMFExecutionConfiguration loadEMFExecutionConfiguration(String filename) {
		if (filename == null || filename.isEmpty()) {
			return null;
		}
		String language = EmfExecutionConfigurationActivator.FR_INRIA_AOSTE_TIMESQUARE_BACKEND_EMFEXECUTIONCONFIGURATION;
		Injector injector = EmfExecutionConfigurationActivator.getInstance().getInjector(language);
		XtextResourceSetProvider provider = injector.getInstance(XtextResourceSetProvider.class);

		XtextResourceSet resourceSet = (XtextResourceSet) provider
				.get(findContainingProject(filename));
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

		URI uri = URI.createPlatformResourceURI(filename, true);
		XtextResource resource = (XtextResource) resourceSet.getResource(uri, true);
		List<Diagnostic> errors = resource.getErrors();
		if (!errors.isEmpty()) {
			System.err.println(errors);
			return null;
		}
		return (EMFExecutionConfiguration) resource.getContents().get(0);
	}
	
	
	private IProject findContainingProject(String filename) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IPath path = root.getLocation();
		path = path.append(new Path(filename));
		IFile file = (IFile) root.findMember(filename);
		return (file != null ? file.getProject() : null);
	}
	
	public boolean loadJarFile(IFile iFile) {
		URLClassLoader loader = (URLClassLoader)ClassLoader.getSystemClassLoader();  
		MyURLClassLoader l = new MyURLClassLoader(loader.getURLs(),  Activator.class.getClassLoader());  
		try {
			l.addURL(iFile.getLocationURI().toURL());
			return true;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}  
		return false;
	}

	@Override
	public void clear() {
		_behaviorList.clear();
		super.clear();
	}


	public EmfCodeExecutionManager() {
		ceh = new CodeExecutionHelper(null);
	}

	@Override
	public void beforeExecution(ConfigurationHelper helper, IPath folderin,
			String namefilein, ISolverForBackend solver) {
		ceh.setConfigurationHelper(helper,solver);

	}

	@Override
	public void end(ConfigurationHelper helper) {
		for (EmfExecutionBehavior b : _behaviorList) {
			b.finish();
		}
		_behaviorList.clear();
		ceh.clear();
		ceh = null;
	}

	public String _getid() {
		return "emfexecution";
	}

	@Override
	public String getPluginName() {
		return "EMF Code Execution";
	}

	@Override
	public void init(ConfigurationHelper helper) {
		super.init(helper);
		_behaviorList = new ArrayList<EmfExecutionBehavior>();
	}
	
	private URI retrieveModelURI(ConfigurationHelper helper){
		//retrieve the URI of the domain model linked to CCSL
		for (ClockEntity ce : helper.getClocks()) {
			if (ce.getReferencedElement().size() > 0  ){//not in main block
				if (! (ce.getReferencedElement().get(0) instanceof EOperation)){
					_modelURI = ce.getReferencedElement().get(0).eResource().getURI();
					break;
				}
			}
		}
		return _modelURI;
	}
	
	private URI retrieveMetaModelURI(ConfigurationHelper helper){
		ClockEntity c = helper.getClocks().get(0);
		ResourceSet rs = c.getClock().eResource().getResourceSet();
		EcoreUtil.resolveAll(rs);
		for(Resource r : rs.getResources()){
			if (r instanceof XMIResource){
				EClass clazz = r.getContents().get(0).eClass();
				String mmnsURI = clazz.getEPackage().getNsURI();
				_metamodelURI = URI.createURI(mmnsURI);
				rs.getPackageRegistry().put(mmnsURI, clazz.getEPackage());
				EcoreUtil.resolveAll( clazz.getEPackage().eResource());
				_mmpackage = clazz.getEPackage();
				System.out.println(_metamodelURI);
				break;
			}
		}
		return _modelURI;
	}

	private EObject createAndInitializeModelLoader(){

		if (_kerLoader == null){
			throw new NullPointerException("the _kerLoader is null");
		}

		Properties prop = new Properties();
		InputStream in = _kerLoader.getResourceAsStream("main.properties");
		try {
			prop.load(in);
		
			
		String s = prop.get("mainRunner").toString();
		 Class<?> init = _kerLoader.loadClass(prop.get("mainRunner").toString());
		 init.getDeclaredMethod("init4eclipse").invoke(init);
		 Class<?> fact = _kerLoader.loadClass(prop.get("mainFactory").toString());
			_modelLoader = (EObject)fact.getDeclaredMethod("create"+prop.get("mainClass")).invoke(fact);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	return _modelLoader;

	}
	
	/**
	 * the jarIFile must be set before to call this metamodel. It retrieves the model and metamodel uri and load the model
	 * It considers that the main class is in a mainPackage and that the mainClass have a the following method:
	 * 							loadModel(String modelPath, String metamodelURI)
	 * @param a configuration helper
	 * @return
	 */
	private EObject loadModel(ConfigurationHelper helper){
		retrieveModelURI(helper);
		retrieveMetaModelURI(helper);
		createAndInitializeModelLoader();
//			load kmt model
//java		f = (System) s.loadfsm("platform:/resource/fr.inria.aoste.fsmk.kermeta.xdsml/test.fsm","platform:/plugins/org.gemoc.sample.i3s.fsm.dsa/model/fsm.ecore");
		try {
			Method load = _modelLoader.getClass().getDeclaredMethod("loadModel",String.class,String.class);
			_modelRoot = (EObject) load.invoke(_modelLoader, _modelURI.toString(), _metamodelURI.toString());
			System.out.println(_modelRoot);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return _modelRoot;
	}
	
	public void manageBehavior(ConfigurationHelper helper) {
	
		//load the executable model
		loadModel(helper);
		
		//create the behavior
		for (ClockEntity ce : helper.getClocks()) {
			if (ce.getReferencedElement().size() > 1){// if linked to an object AND an operation
				EObject e = ce.getClock();
				String ClkToEvaluate = CCSLKernelUtils.getQualifiedName(ce.getClock(), "::");
				Clock clockToAvoid = forcedClockMap.get(ClkToEvaluate);
				ArrayList<ClockEntity> clocksToAvoid = new ArrayList<ClockEntity>();
				if (clockToAvoid!=null)
					clocksToAvoid.add(findClockEntity(clockToAvoid));
				addBehavior(ce, clocksToAvoid);
			}
		}
	}

	private ClockEntity findClockEntity(ConcreteEntity clock) {
		String clockPath = CCSLKernelUtils.getQualifiedName(clock, "::");

		for (ClockEntity ce : _helper.getClocks()) {
			ModelElementReference mer = ce.getModelElementReference();
			String path = ReferenceNameBuilder.buildQualifiedName(mer, "::");
			if (clockPath.compareTo(path) == 0) {
				return ce;
			}
		}
		return null;
	}

	private Object invokeMethod(EObject eo, String methodName){
		Method m=null;
		Object res=null;
		try {
			m = eo.getClass().getMethod(methodName);
			res = m.invoke(eo);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			try {
				m = eo.getClass().getMethod("EMFRENAME"+methodName);   //dirty fix due to kermeta dirty fix :-/ ask Didier
				res = m.invoke(eo);
			} catch (SecurityException e1) {
				e1.printStackTrace();
			} catch (NoSuchMethodException e1) {
				e1.printStackTrace();
			} catch (IllegalArgumentException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			} catch (InvocationTargetException e1) {
				e1.printStackTrace();
			}
		}
		
		return res;
	}
	
	private String getQualifiedName(EObject eo){
		String res = getSimpleName(eo);
		EObject tmp = eo.eContainer();
		while (tmp != null){
			res= getSimpleName(tmp)+"::"+res;
			tmp = tmp.eContainer();
		}
		return res;
	}
	
	private String getSimpleName(EObject eo){
		Object res=null;
		res =  invokeMethod(eo, "getName");
		return (String)res;
	}
	
	public void addBehavior(ClockEntity ce, ArrayList<ClockEntity> clockToForce) {
		
		EObject linkedOperation = ce.getReferencedElement().get(1);
		if(linkedOperation.eIsProxy()){
			linkedOperation = EcoreUtil2.resolve(linkedOperation, _mmpackage.eResource());
		}
		if (linkedOperation instanceof EOperation){
			String linkedElementQN = getQualifiedName(ce.getReferencedElement().get(0));
			String operationName = getSimpleName(linkedOperation);
			TreeIterator<EObject> modelIterator = _modelRoot.eAllContents();
			EmfExecutionBehavior behavior = createBehavior(operationName, linkedElementQN, modelIterator, clockToForce);
			EmfExecutionPersistentOptions options = new EmfExecutionPersistentOptions(operationName,linkedElementQN, clockToForce, _configurationFilename);
			_helper.addBehavior(ce, _helper.getTicksState(), this.getPluginName(), behavior, options);
			_behaviorList.add(behavior);
		}
	}


	private EmfExecutionBehavior createBehavior(String operationName, String linkedElementQualifiedName, TreeIterator<EObject> modelIterator, ArrayList<ClockEntity> clockToForce){
		while(modelIterator.hasNext()){
			EObject modelElement = modelIterator.next();
			String modelElementQualifiedName = getQualifiedName(modelElement);
			if (modelElementQualifiedName.compareTo(linkedElementQualifiedName)==0){
				System.out.println(modelElementQualifiedName);
				System.out.println(operationName);
				// ClocktoForce? or ClocktoAvoid?????
				EmfExecutionBehavior behavior = new EmfExecutionBehavior(modelElement, operationName, clockToForce, _helper);
				behavior.setCe(ceh);
				return behavior;
			}
		}
		return null;
	}
	
	@Override
	public BehaviorConfigurator<?> getConfigurator(ConfigurationHelper configurationHelper) {

		return new CodeExecutorConfigurator(configurationHelper, this);
	}

	protected HashMap<String, Object> getData() {
		return ceh.getData();
	}


	

	@Override
	public ClockBehavior redoClockBehavior(ConfigurationHelper helper, PersistentOptions persistentOptions) {
	
		EmfExecutionPersistentOptions options = (EmfExecutionPersistentOptions) persistentOptions;
		String operationName = options.getMethodName();
		String linkedElementQN = options.getObjectQualifiedName();
		String jarFilePath = options.getJarFilePath();
		
		setConfigurationFileName(jarFilePath);
		loadModel(helper);
		TreeIterator<EObject> modelIterator = _modelRoot.eAllContents();
		ArrayList<ClockEntity> clocksToForce = new ArrayList<ClockEntity>();
		for(String clockQualifiedName: options.getClocksQualifiedNameToForce()){
			ClockEntity ce = getClock(helper, clockQualifiedName);
			clocksToForce.add(ce); //Clock to force????? just not be avoid???
		}
		EmfExecutionBehavior behavior = createBehavior(operationName, linkedElementQN, modelIterator, clocksToForce);
		_behaviorList.add(behavior);
		return behavior;
	}
	
	private static ClockEntity getClock(ConfigurationHelper helper, String clockName) {

		for (ClockEntity clock : helper.getClocks()) {
			if (clock.getName().compareTo(clockName) == 0)
				return clock;
		}
		return null;
	}

	@Override
	public RelationBehavior redoRelationBehavior(ConfigurationHelper helper,
			PersistentOptions persistentOptions) {
		return null;
	}

	@Override
	public ClockBehavior redoAssertBehavior(ConfigurationHelper helper,
			PersistentOptions persistentOptions) {
		return null;
	}

}

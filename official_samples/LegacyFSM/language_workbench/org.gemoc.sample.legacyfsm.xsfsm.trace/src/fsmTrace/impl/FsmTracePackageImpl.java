/**
 */
package fsmTrace.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import fsmTrace.FsmTraceFactory;
import fsmTrace.FsmTracePackage;
import fsmTrace.SpecificTrace;

import fsmTrace.States.StatesPackage;

import fsmTrace.States.fsm.impl.FsmPackageImpl;

import fsmTrace.States.impl.StatesPackageImpl;

import fsmTrace.Steps.StepsPackage;

import fsmTrace.Steps.impl.StepsPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmTracePackageImpl extends EPackageImpl implements FsmTracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificTraceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fsmTrace.FsmTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FsmTracePackageImpl() {
		super(eNS_URI, FsmTraceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FsmTracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FsmTracePackage init() {
		if (isInited) return (FsmTracePackage)EPackage.Registry.INSTANCE.getEPackage(FsmTracePackage.eNS_URI);

		// Obtain or create and register package
		FsmTracePackageImpl theFsmTracePackage = (FsmTracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FsmTracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FsmTracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		FsmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		FsmPackageImpl theFsmPackage_1 = (FsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fsmTrace.States.fsm.FsmPackage.eNS_URI) instanceof FsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fsmTrace.States.fsm.FsmPackage.eNS_URI) : fsmTrace.States.fsm.FsmPackage.eINSTANCE);

		// Create package meta-data objects
		theFsmTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theFsmPackage_1.createPackageContents();

		// Initialize created meta-data
		theFsmTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theFsmPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFsmTracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FsmTracePackage.eNS_URI, theFsmTracePackage);
		return theFsmTracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificTrace() {
		return specificTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Fsm_FSMClock_Ticks_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Fsm_FSMEvent_Trigger_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Fsm_FSMEvent_UnTrigger_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Fsm_State_Visit_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Fsm_TimeFSM_Init_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Fsm_Transition_Fire_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Fsm_Transition_Visit_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Fsm_tracedEvaluateGuards() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Fsm_tracedEventGuards() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Fsm_tracedFSMClocks() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Fsm_tracedFSMEvents() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Fsm_tracedStates() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Fsm_tracedTemporalGuards() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Fsm_tracedTimeFSMs() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Fsm_tracedTimedSystems() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Fsm_tracedTransitions() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_StatesTrace() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmTraceFactory getFsmTraceFactory() {
		return (FsmTraceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		specificTraceEClass = createEClass(SPECIFIC_TRACE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FSM_FSM_CLOCK_TICKS_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FSM_FSM_EVENT_TRIGGER_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FSM_FSM_EVENT_UN_TRIGGER_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FSM_STATE_VISIT_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FSM_TIME_FSM_INIT_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FSM_TRANSITION_FIRE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FSM_TRANSITION_VISIT_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FSM_TRACED_EVALUATE_GUARDS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FSM_TRACED_EVENT_GUARDS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FSM_TRACED_FSM_CLOCKS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FSM_TRACED_FSM_EVENTS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FSM_TRACED_STATES);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FSM_TRACED_TEMPORAL_GUARDS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FSM_TRACED_TIME_FS_MS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FSM_TRACED_TIMED_SYSTEMS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FSM_TRACED_TRANSITIONS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__STATES_TRACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		fsmTrace.States.fsm.FsmPackage theFsmPackage_1 = (fsmTrace.States.fsm.FsmPackage)EPackage.Registry.INSTANCE.getEPackage(fsmTrace.States.fsm.FsmPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStepsPackage);
		getESubpackages().add(theStatesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theTracePackage.getTrace());
		EGenericType g2 = createEGenericType(theTracePackage.getSequentialStep());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(theStepsPackage.getSpecificStep());
		g2.getETypeArguments().add(g3);
		specificTraceEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(specificTraceEClass, SpecificTrace.class, "SpecificTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificTrace_Fsm_FSMClock_Ticks_Sequence(), theStepsPackage.getFsm_FSMClock_Ticks(), null, "Fsm_FSMClock_Ticks_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Fsm_FSMEvent_Trigger_Sequence(), theStepsPackage.getFsm_FSMEvent_Trigger(), null, "Fsm_FSMEvent_Trigger_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Fsm_FSMEvent_UnTrigger_Sequence(), theStepsPackage.getFsm_FSMEvent_UnTrigger(), null, "Fsm_FSMEvent_UnTrigger_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Fsm_State_Visit_Sequence(), theStepsPackage.getFsm_State_Visit(), null, "Fsm_State_Visit_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Fsm_TimeFSM_Init_Sequence(), theStepsPackage.getFsm_TimeFSM_Init(), null, "Fsm_TimeFSM_Init_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Fsm_Transition_Fire_Sequence(), theStepsPackage.getFsm_Transition_Fire(), null, "Fsm_Transition_Fire_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Fsm_Transition_Visit_Sequence(), theStepsPackage.getFsm_Transition_Visit(), null, "Fsm_Transition_Visit_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Fsm_tracedEvaluateGuards(), theFsmPackage_1.getTracedEvaluateGuard(), null, "fsm_tracedEvaluateGuards", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Fsm_tracedEventGuards(), theFsmPackage_1.getTracedEventGuard(), null, "fsm_tracedEventGuards", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Fsm_tracedFSMClocks(), theFsmPackage_1.getTracedFSMClock(), null, "fsm_tracedFSMClocks", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Fsm_tracedFSMEvents(), theFsmPackage_1.getTracedFSMEvent(), null, "fsm_tracedFSMEvents", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Fsm_tracedStates(), theFsmPackage_1.getTracedState(), null, "fsm_tracedStates", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Fsm_tracedTemporalGuards(), theFsmPackage_1.getTracedTemporalGuard(), null, "fsm_tracedTemporalGuards", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Fsm_tracedTimeFSMs(), theFsmPackage_1.getTracedTimeFSM(), null, "fsm_tracedTimeFSMs", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Fsm_tracedTimedSystems(), theFsmPackage_1.getTracedTimedSystem(), null, "fsm_tracedTimedSystems", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Fsm_tracedTransitions(), theFsmPackage_1.getTracedTransition(), null, "fsm_tracedTransitions", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_StatesTrace(), theStatesPackage.getState(), null, "statesTrace", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FsmTracePackageImpl
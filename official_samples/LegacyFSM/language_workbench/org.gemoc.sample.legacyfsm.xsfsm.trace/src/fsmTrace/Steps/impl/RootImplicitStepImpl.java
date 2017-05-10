/**
 */
package fsmTrace.Steps.impl;

import fr.inria.diverse.trace.commons.model.trace.impl.SmallStepImpl;

import fsmTrace.States.SpecificState;

import fsmTrace.Steps.RootImplicitStep;
import fsmTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Implicit Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RootImplicitStepImpl extends SmallStepImpl<SpecificState> implements RootImplicitStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImplicitStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ROOT_IMPLICIT_STEP;
	}

} //RootImplicitStepImpl

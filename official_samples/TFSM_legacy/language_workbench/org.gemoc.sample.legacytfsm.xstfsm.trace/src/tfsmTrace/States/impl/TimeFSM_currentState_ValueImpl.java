/**
 */
package tfsmTrace.States.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tfsmTrace.States.State;
import tfsmTrace.States.StatesPackage;
import tfsmTrace.States.TimeFSM_currentState_Value;

import tfsmTrace.States.tfsm.TfsmPackage;
import tfsmTrace.States.tfsm.TracedState;
import tfsmTrace.States.tfsm.TracedTimeFSM;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time FSM current State Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tfsmTrace.States.impl.TimeFSM_currentState_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link tfsmTrace.States.impl.TimeFSM_currentState_ValueImpl#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link tfsmTrace.States.impl.TimeFSM_currentState_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link tfsmTrace.States.impl.TimeFSM_currentState_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeFSM_currentState_ValueImpl extends MinimalEObjectImpl.Container implements TimeFSM_currentState_Value {
	/**
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected TracedState currentState;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeFSM_currentState_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.TIME_FSM_CURRENT_STATE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesNoOpposite() {
		return this.getStates();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedState getCurrentState() {
		if (currentState != null && currentState.eIsProxy()) {
			InternalEObject oldCurrentState = (InternalEObject)currentState;
			currentState = (TracedState)eResolveProxy(oldCurrentState);
			if (currentState != oldCurrentState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__CURRENT_STATE, oldCurrentState, currentState));
			}
		}
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedState basicGetCurrentState() {
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentState(TracedState newCurrentState) {
		TracedState oldCurrentState = currentState;
		currentState = newCurrentState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__CURRENT_STATE, oldCurrentState, currentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTimeFSM getParent() {
		if (eContainerFeatureID() != StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__PARENT) return null;
		return (TracedTimeFSM)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedTimeFSM newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedTimeFSM newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, TfsmPackage.TRACED_TIME_FSM__CURRENT_STATE_SEQUENCE, TracedTimeFSM.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__STATES, StatesPackage.STATE__TIME_FSM_CURRENT_STATE_VALUES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedTimeFSM)otherEnd, msgs);
			case StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, TfsmPackage.TRACED_TIME_FSM__CURRENT_STATE_SEQUENCE, TracedTimeFSM.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__CURRENT_STATE:
				if (resolve) return getCurrentState();
				return basicGetCurrentState();
			case StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__PARENT:
				return getParent();
			case StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__STATES:
				return getStates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__CURRENT_STATE:
				setCurrentState((TracedState)newValue);
				return;
			case StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__PARENT:
				setParent((TracedTimeFSM)newValue);
				return;
			case StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__CURRENT_STATE:
				setCurrentState((TracedState)null);
				return;
			case StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__PARENT:
				setParent((TracedTimeFSM)null);
				return;
			case StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__STATES:
				getStates().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__CURRENT_STATE:
				return currentState != null;
			case StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.TIME_FSM_CURRENT_STATE_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimeFSM_currentState_ValueImpl

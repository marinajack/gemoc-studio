/**
 */
package org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM Clock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.FSMClock#getNumberOfTicks <em>Number Of Ticks</em>}</li>
 * </ul>
 *
 * @see org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.TfsmPackage#getFSMClock()
 * @model
 * @generated
 */
public interface FSMClock extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Number Of Ticks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Ticks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Ticks</em>' attribute.
	 * @see #setNumberOfTicks(int)
	 * @see org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.TfsmPackage#getFSMClock_NumberOfTicks()
	 * @model
	 * @generated
	 */
	int getNumberOfTicks();

	/**
	 * Sets the value of the '{@link org.gemoc.sample.tfsm.concurrent.xtfsm.tfsm.FSMClock#getNumberOfTicks <em>Number Of Ticks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Ticks</em>' attribute.
	 * @see #getNumberOfTicks()
	 * @generated
	 */
	void setNumberOfTicks(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String ticks();

} // FSMClock

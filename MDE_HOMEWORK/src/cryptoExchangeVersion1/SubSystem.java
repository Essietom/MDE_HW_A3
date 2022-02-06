/**
 */
package cryptoExchangeVersion1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangeVersion1.SubSystem#getName <em>Name</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.SubSystem#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.SubSystem#getTokenPairs <em>Token Pairs</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.SubSystem#getOrders <em>Orders</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.SubSystem#getSavingOrders <em>Saving Orders</em>}</li>
 * </ul>
 *
 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getSubSystem()
 * @model
 * @generated
 */
public interface SubSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link cryptoExchangeVersion1.SubSystemName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see cryptoExchangeVersion1.SubSystemName
	 * @see #setName(SubSystemName)
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getSubSystem_Name()
	 * @model
	 * @generated
	 */
	SubSystemName getName();

	/**
	 * Sets the value of the '{@link cryptoExchangeVersion1.SubSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see cryptoExchangeVersion1.SubSystemName
	 * @see #getName()
	 * @generated
	 */
	void setName(SubSystemName value);

	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' containment reference list.
	 * The list contents are of type {@link cryptoExchangeVersion1.Account}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounts</em>' containment reference list.
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getSubSystem_Accounts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Account> getAccounts();

	/**
	 * Returns the value of the '<em><b>Token Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link cryptoExchangeVersion1.TokenPair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Pairs</em>' containment reference list.
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getSubSystem_TokenPairs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TokenPair> getTokenPairs();

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
	 * The list contents are of type {@link cryptoExchangeVersion1.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' containment reference list.
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getSubSystem_Orders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Order> getOrders();

	/**
	 * Returns the value of the '<em><b>Saving Orders</b></em>' containment reference list.
	 * The list contents are of type {@link cryptoExchangeVersion1.SavingOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saving Orders</em>' containment reference list.
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getSubSystem_SavingOrders()
	 * @model containment="true"
	 * @generated
	 */
	EList<SavingOrder> getSavingOrders();

} // SubSystem

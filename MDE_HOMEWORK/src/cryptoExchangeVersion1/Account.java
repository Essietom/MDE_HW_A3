/**
 */
package cryptoExchangeVersion1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangeVersion1.Account#getId <em>Id</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.Account#getTokensBalance <em>Tokens Balance</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.Account#getTransferRequest <em>Transfer Request</em>}</li>
 * </ul>
 *
 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getAccount()
 * @model
 * @generated
 */
public interface Account extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getAccount_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cryptoExchangeVersion1.Account#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Tokens Balance</b></em>' containment reference list.
	 * The list contents are of type {@link cryptoExchangeVersion1.TokenBalance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens Balance</em>' containment reference list.
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getAccount_TokensBalance()
	 * @model containment="true"
	 * @generated
	 */
	EList<TokenBalance> getTokensBalance();

	/**
	 * Returns the value of the '<em><b>Transfer Request</b></em>' containment reference list.
	 * The list contents are of type {@link cryptoExchangeVersion1.TransferRequest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Request</em>' containment reference list.
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getAccount_TransferRequest()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransferRequest> getTransferRequest();

} // Account

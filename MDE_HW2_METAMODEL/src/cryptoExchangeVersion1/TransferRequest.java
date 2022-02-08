/**
 */
package cryptoExchangeVersion1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangeVersion1.TransferRequest#getType <em>Type</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.TransferRequest#getAmount <em>Amount</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.TransferRequest#getToken <em>Token</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.TransferRequest#getDestination <em>Destination</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.TransferRequest#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getTransferRequest()
 * @model
 * @generated
 */
public interface TransferRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cryptoExchangeVersion1.TransferType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cryptoExchangeVersion1.TransferType
	 * @see #setType(TransferType)
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getTransferRequest_Type()
	 * @model
	 * @generated
	 */
	TransferType getType();

	/**
	 * Sets the value of the '{@link cryptoExchangeVersion1.TransferRequest#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cryptoExchangeVersion1.TransferType
	 * @see #getType()
	 * @generated
	 */
	void setType(TransferType value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getTransferRequest_Amount()
	 * @model required="true"
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link cryptoExchangeVersion1.TransferRequest#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' reference.
	 * @see #setToken(Token)
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getTransferRequest_Token()
	 * @model required="true"
	 * @generated
	 */
	Token getToken();

	/**
	 * Sets the value of the '{@link cryptoExchangeVersion1.TransferRequest#getToken <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(Token value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Account)
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getTransferRequest_Destination()
	 * @model required="true"
	 * @generated
	 */
	Account getDestination();

	/**
	 * Sets the value of the '{@link cryptoExchangeVersion1.TransferRequest#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Account value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getTransferRequest_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cryptoExchangeVersion1.TransferRequest#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // TransferRequest

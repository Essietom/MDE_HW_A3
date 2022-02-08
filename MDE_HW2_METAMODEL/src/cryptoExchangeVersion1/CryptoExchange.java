/**
 */
package cryptoExchangeVersion1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crypto Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangeVersion1.CryptoExchange#getIp <em>Ip</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.CryptoExchange#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.CryptoExchange#getSubSystem <em>Sub System</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.CryptoExchange#getTokens <em>Tokens</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.CryptoExchange#getTokenNetworks <em>Token Networks</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.CryptoExchange#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getCryptoExchange()
 * @model
 * @generated
 */
public interface CryptoExchange extends EObject {
	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getCryptoExchange_Ip()
	 * @model
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link cryptoExchangeVersion1.CryptoExchange#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getCryptoExchange_DomainName()
	 * @model
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link cryptoExchangeVersion1.CryptoExchange#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Sub System</b></em>' containment reference list.
	 * The list contents are of type {@link cryptoExchangeVersion1.SubSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub System</em>' containment reference list.
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getCryptoExchange_SubSystem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SubSystem> getSubSystem();

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link cryptoExchangeVersion1.Token}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getCryptoExchange_Tokens()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Token> getTokens();

	/**
	 * Returns the value of the '<em><b>Token Networks</b></em>' containment reference list.
	 * The list contents are of type {@link cryptoExchangeVersion1.TokenNetwork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Networks</em>' containment reference list.
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getCryptoExchange_TokenNetworks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TokenNetwork> getTokenNetworks();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getCryptoExchange_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cryptoExchangeVersion1.CryptoExchange#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CryptoExchange

/**
 */
package cryptoExchangeVersion1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangeVersion1.TokenNetwork#getChainId <em>Chain Id</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.TokenNetwork#getRpc <em>Rpc</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.TokenNetwork#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getTokenNetwork()
 * @model
 * @generated
 */
public interface TokenNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Chain Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain Id</em>' attribute.
	 * @see #setChainId(int)
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getTokenNetwork_ChainId()
	 * @model required="true"
	 * @generated
	 */
	int getChainId();

	/**
	 * Sets the value of the '{@link cryptoExchangeVersion1.TokenNetwork#getChainId <em>Chain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chain Id</em>' attribute.
	 * @see #getChainId()
	 * @generated
	 */
	void setChainId(int value);

	/**
	 * Returns the value of the '<em><b>Rpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpc</em>' attribute.
	 * @see #setRpc(String)
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getTokenNetwork_Rpc()
	 * @model
	 * @generated
	 */
	String getRpc();

	/**
	 * Sets the value of the '{@link cryptoExchangeVersion1.TokenNetwork#getRpc <em>Rpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpc</em>' attribute.
	 * @see #getRpc()
	 * @generated
	 */
	void setRpc(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getTokenNetwork_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cryptoExchangeVersion1.TokenNetwork#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TokenNetwork

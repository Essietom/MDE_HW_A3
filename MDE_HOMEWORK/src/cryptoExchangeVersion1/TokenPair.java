/**
 */
package cryptoExchangeVersion1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangeVersion1.TokenPair#getPrice <em>Price</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.TokenPair#getTokenA <em>Token A</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.TokenPair#getTokenB <em>Token B</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.TokenPair#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getTokenPair()
 * @model
 * @generated
 */
public interface TokenPair extends EObject {
	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getTokenPair_Price()
	 * @model required="true"
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link cryptoExchangeVersion1.TokenPair#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Token A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token A</em>' reference.
	 * @see #setTokenA(Token)
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getTokenPair_TokenA()
	 * @model required="true"
	 * @generated
	 */
	Token getTokenA();

	/**
	 * Sets the value of the '{@link cryptoExchangeVersion1.TokenPair#getTokenA <em>Token A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token A</em>' reference.
	 * @see #getTokenA()
	 * @generated
	 */
	void setTokenA(Token value);

	/**
	 * Returns the value of the '<em><b>Token B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token B</em>' reference.
	 * @see #setTokenB(Token)
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getTokenPair_TokenB()
	 * @model required="true"
	 * @generated
	 */
	Token getTokenB();

	/**
	 * Sets the value of the '{@link cryptoExchangeVersion1.TokenPair#getTokenB <em>Token B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token B</em>' reference.
	 * @see #getTokenB()
	 * @generated
	 */
	void setTokenB(Token value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#getTokenPair_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cryptoExchangeVersion1.TokenPair#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TokenPair

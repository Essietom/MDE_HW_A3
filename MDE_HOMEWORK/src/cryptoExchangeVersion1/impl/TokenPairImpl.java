/**
 */
package cryptoExchangeVersion1.impl;

import cryptoExchangeVersion1.CryptoExchangeVersion1Package;
import cryptoExchangeVersion1.Token;
import cryptoExchangeVersion1.TokenPair;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangeVersion1.impl.TokenPairImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.impl.TokenPairImpl#getTokenA <em>Token A</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.impl.TokenPairImpl#getTokenB <em>Token B</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.impl.TokenPairImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenPairImpl extends MinimalEObjectImpl.Container implements TokenPair {
	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTokenA() <em>Token A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenA()
	 * @generated
	 * @ordered
	 */
	protected Token tokenA;

	/**
	 * The cached value of the '{@link #getTokenB() <em>Token B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenB()
	 * @generated
	 * @ordered
	 */
	protected Token tokenB;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoExchangeVersion1Package.Literals.TOKEN_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangeVersion1Package.TOKEN_PAIR__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token getTokenA() {
		if (tokenA != null && tokenA.eIsProxy()) {
			InternalEObject oldTokenA = (InternalEObject)tokenA;
			tokenA = (Token)eResolveProxy(oldTokenA);
			if (tokenA != oldTokenA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CryptoExchangeVersion1Package.TOKEN_PAIR__TOKEN_A, oldTokenA, tokenA));
			}
		}
		return tokenA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token basicGetTokenA() {
		return tokenA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenA(Token newTokenA) {
		Token oldTokenA = tokenA;
		tokenA = newTokenA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangeVersion1Package.TOKEN_PAIR__TOKEN_A, oldTokenA, tokenA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token getTokenB() {
		if (tokenB != null && tokenB.eIsProxy()) {
			InternalEObject oldTokenB = (InternalEObject)tokenB;
			tokenB = (Token)eResolveProxy(oldTokenB);
			if (tokenB != oldTokenB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CryptoExchangeVersion1Package.TOKEN_PAIR__TOKEN_B, oldTokenB, tokenB));
			}
		}
		return tokenB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token basicGetTokenB() {
		return tokenB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenB(Token newTokenB) {
		Token oldTokenB = tokenB;
		tokenB = newTokenB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangeVersion1Package.TOKEN_PAIR__TOKEN_B, oldTokenB, tokenB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangeVersion1Package.TOKEN_PAIR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CryptoExchangeVersion1Package.TOKEN_PAIR__PRICE:
				return getPrice();
			case CryptoExchangeVersion1Package.TOKEN_PAIR__TOKEN_A:
				if (resolve) return getTokenA();
				return basicGetTokenA();
			case CryptoExchangeVersion1Package.TOKEN_PAIR__TOKEN_B:
				if (resolve) return getTokenB();
				return basicGetTokenB();
			case CryptoExchangeVersion1Package.TOKEN_PAIR__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CryptoExchangeVersion1Package.TOKEN_PAIR__PRICE:
				setPrice((Float)newValue);
				return;
			case CryptoExchangeVersion1Package.TOKEN_PAIR__TOKEN_A:
				setTokenA((Token)newValue);
				return;
			case CryptoExchangeVersion1Package.TOKEN_PAIR__TOKEN_B:
				setTokenB((Token)newValue);
				return;
			case CryptoExchangeVersion1Package.TOKEN_PAIR__NAME:
				setName((String)newValue);
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
			case CryptoExchangeVersion1Package.TOKEN_PAIR__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case CryptoExchangeVersion1Package.TOKEN_PAIR__TOKEN_A:
				setTokenA((Token)null);
				return;
			case CryptoExchangeVersion1Package.TOKEN_PAIR__TOKEN_B:
				setTokenB((Token)null);
				return;
			case CryptoExchangeVersion1Package.TOKEN_PAIR__NAME:
				setName(NAME_EDEFAULT);
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
			case CryptoExchangeVersion1Package.TOKEN_PAIR__PRICE:
				return price != PRICE_EDEFAULT;
			case CryptoExchangeVersion1Package.TOKEN_PAIR__TOKEN_A:
				return tokenA != null;
			case CryptoExchangeVersion1Package.TOKEN_PAIR__TOKEN_B:
				return tokenB != null;
			case CryptoExchangeVersion1Package.TOKEN_PAIR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (price: ");
		result.append(price);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TokenPairImpl

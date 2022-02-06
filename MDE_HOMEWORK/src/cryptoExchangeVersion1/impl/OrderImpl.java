/**
 */
package cryptoExchangeVersion1.impl;

import cryptoExchangeVersion1.Account;
import cryptoExchangeVersion1.CryptoExchangeVersion1Package;
import cryptoExchangeVersion1.LeverageType;
import cryptoExchangeVersion1.Order;
import cryptoExchangeVersion1.OrderType;
import cryptoExchangeVersion1.TokenPair;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangeVersion1.impl.OrderImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.impl.OrderImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.impl.OrderImpl#getLeverage <em>Leverage</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.impl.OrderImpl#getType <em>Type</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.impl.OrderImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.impl.OrderImpl#getTokenPair <em>Token Pair</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends MinimalEObjectImpl.Container implements Order {
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
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeverage() <em>Leverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeverage()
	 * @generated
	 * @ordered
	 */
	protected static final LeverageType LEVERAGE_EDEFAULT = LeverageType._1X;

	/**
	 * The cached value of the '{@link #getLeverage() <em>Leverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeverage()
	 * @generated
	 * @ordered
	 */
	protected LeverageType leverage = LEVERAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final OrderType TYPE_EDEFAULT = OrderType.BUY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OrderType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected Account account;

	/**
	 * The cached value of the '{@link #getTokenPair() <em>Token Pair</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenPair()
	 * @generated
	 * @ordered
	 */
	protected TokenPair tokenPair;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoExchangeVersion1Package.Literals.ORDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangeVersion1Package.ORDER__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(float newAmount) {
		float oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangeVersion1Package.ORDER__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeverageType getLeverage() {
		return leverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeverage(LeverageType newLeverage) {
		LeverageType oldLeverage = leverage;
		leverage = newLeverage == null ? LEVERAGE_EDEFAULT : newLeverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangeVersion1Package.ORDER__LEVERAGE, oldLeverage, leverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(OrderType newType) {
		OrderType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangeVersion1Package.ORDER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account getAccount() {
		if (account != null && account.eIsProxy()) {
			InternalEObject oldAccount = (InternalEObject)account;
			account = (Account)eResolveProxy(oldAccount);
			if (account != oldAccount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CryptoExchangeVersion1Package.ORDER__ACCOUNT, oldAccount, account));
			}
		}
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account basicGetAccount() {
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccount(Account newAccount) {
		Account oldAccount = account;
		account = newAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangeVersion1Package.ORDER__ACCOUNT, oldAccount, account));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenPair getTokenPair() {
		if (tokenPair != null && tokenPair.eIsProxy()) {
			InternalEObject oldTokenPair = (InternalEObject)tokenPair;
			tokenPair = (TokenPair)eResolveProxy(oldTokenPair);
			if (tokenPair != oldTokenPair) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CryptoExchangeVersion1Package.ORDER__TOKEN_PAIR, oldTokenPair, tokenPair));
			}
		}
		return tokenPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenPair basicGetTokenPair() {
		return tokenPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenPair(TokenPair newTokenPair) {
		TokenPair oldTokenPair = tokenPair;
		tokenPair = newTokenPair;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangeVersion1Package.ORDER__TOKEN_PAIR, oldTokenPair, tokenPair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CryptoExchangeVersion1Package.ORDER__PRICE:
				return getPrice();
			case CryptoExchangeVersion1Package.ORDER__AMOUNT:
				return getAmount();
			case CryptoExchangeVersion1Package.ORDER__LEVERAGE:
				return getLeverage();
			case CryptoExchangeVersion1Package.ORDER__TYPE:
				return getType();
			case CryptoExchangeVersion1Package.ORDER__ACCOUNT:
				if (resolve) return getAccount();
				return basicGetAccount();
			case CryptoExchangeVersion1Package.ORDER__TOKEN_PAIR:
				if (resolve) return getTokenPair();
				return basicGetTokenPair();
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
			case CryptoExchangeVersion1Package.ORDER__PRICE:
				setPrice((Float)newValue);
				return;
			case CryptoExchangeVersion1Package.ORDER__AMOUNT:
				setAmount((Float)newValue);
				return;
			case CryptoExchangeVersion1Package.ORDER__LEVERAGE:
				setLeverage((LeverageType)newValue);
				return;
			case CryptoExchangeVersion1Package.ORDER__TYPE:
				setType((OrderType)newValue);
				return;
			case CryptoExchangeVersion1Package.ORDER__ACCOUNT:
				setAccount((Account)newValue);
				return;
			case CryptoExchangeVersion1Package.ORDER__TOKEN_PAIR:
				setTokenPair((TokenPair)newValue);
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
			case CryptoExchangeVersion1Package.ORDER__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case CryptoExchangeVersion1Package.ORDER__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case CryptoExchangeVersion1Package.ORDER__LEVERAGE:
				setLeverage(LEVERAGE_EDEFAULT);
				return;
			case CryptoExchangeVersion1Package.ORDER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CryptoExchangeVersion1Package.ORDER__ACCOUNT:
				setAccount((Account)null);
				return;
			case CryptoExchangeVersion1Package.ORDER__TOKEN_PAIR:
				setTokenPair((TokenPair)null);
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
			case CryptoExchangeVersion1Package.ORDER__PRICE:
				return price != PRICE_EDEFAULT;
			case CryptoExchangeVersion1Package.ORDER__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case CryptoExchangeVersion1Package.ORDER__LEVERAGE:
				return leverage != LEVERAGE_EDEFAULT;
			case CryptoExchangeVersion1Package.ORDER__TYPE:
				return type != TYPE_EDEFAULT;
			case CryptoExchangeVersion1Package.ORDER__ACCOUNT:
				return account != null;
			case CryptoExchangeVersion1Package.ORDER__TOKEN_PAIR:
				return tokenPair != null;
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
		result.append(", amount: ");
		result.append(amount);
		result.append(", leverage: ");
		result.append(leverage);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //OrderImpl

/**
 */
package cryptoExchangeVersion1.impl;

import cryptoExchangeVersion1.CryptoExchange;
import cryptoExchangeVersion1.CryptoExchangeVersion1Package;
import cryptoExchangeVersion1.SubSystem;
import cryptoExchangeVersion1.Token;
import cryptoExchangeVersion1.TokenNetwork;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crypto Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangeVersion1.impl.CryptoExchangeImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.impl.CryptoExchangeImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.impl.CryptoExchangeImpl#getSubSystem <em>Sub System</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.impl.CryptoExchangeImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.impl.CryptoExchangeImpl#getTokenNetworks <em>Token Networks</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.impl.CryptoExchangeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CryptoExchangeImpl extends MinimalEObjectImpl.Container implements CryptoExchange {
	/**
	 * The default value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected String domainName = DOMAIN_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubSystem() <em>Sub System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<SubSystem> subSystem;

	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> tokens;

	/**
	 * The cached value of the '{@link #getTokenNetworks() <em>Token Networks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<TokenNetwork> tokenNetworks;

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
	protected CryptoExchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoExchangeVersion1Package.Literals.CRYPTO_EXCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIp(String newIp) {
		String oldIp = ip;
		ip = newIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__IP, oldIp, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainName(String newDomainName) {
		String oldDomainName = domainName;
		domainName = newDomainName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__DOMAIN_NAME, oldDomainName, domainName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubSystem> getSubSystem() {
		if (subSystem == null) {
			subSystem = new EObjectContainmentEList<SubSystem>(SubSystem.class, this, CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__SUB_SYSTEM);
		}
		return subSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getTokens() {
		if (tokens == null) {
			tokens = new EObjectContainmentEList<Token>(Token.class, this, CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__TOKENS);
		}
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TokenNetwork> getTokenNetworks() {
		if (tokenNetworks == null) {
			tokenNetworks = new EObjectContainmentEList<TokenNetwork>(TokenNetwork.class, this, CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__TOKEN_NETWORKS);
		}
		return tokenNetworks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__SUB_SYSTEM:
				return ((InternalEList<?>)getSubSystem()).basicRemove(otherEnd, msgs);
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__TOKENS:
				return ((InternalEList<?>)getTokens()).basicRemove(otherEnd, msgs);
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__TOKEN_NETWORKS:
				return ((InternalEList<?>)getTokenNetworks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__IP:
				return getIp();
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__DOMAIN_NAME:
				return getDomainName();
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__SUB_SYSTEM:
				return getSubSystem();
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__TOKENS:
				return getTokens();
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__TOKEN_NETWORKS:
				return getTokenNetworks();
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__NAME:
				return getName();
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
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__IP:
				setIp((String)newValue);
				return;
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__DOMAIN_NAME:
				setDomainName((String)newValue);
				return;
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__SUB_SYSTEM:
				getSubSystem().clear();
				getSubSystem().addAll((Collection<? extends SubSystem>)newValue);
				return;
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__TOKENS:
				getTokens().clear();
				getTokens().addAll((Collection<? extends Token>)newValue);
				return;
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__TOKEN_NETWORKS:
				getTokenNetworks().clear();
				getTokenNetworks().addAll((Collection<? extends TokenNetwork>)newValue);
				return;
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__NAME:
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
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__IP:
				setIp(IP_EDEFAULT);
				return;
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__DOMAIN_NAME:
				setDomainName(DOMAIN_NAME_EDEFAULT);
				return;
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__SUB_SYSTEM:
				getSubSystem().clear();
				return;
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__TOKENS:
				getTokens().clear();
				return;
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__TOKEN_NETWORKS:
				getTokenNetworks().clear();
				return;
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__NAME:
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
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__DOMAIN_NAME:
				return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__SUB_SYSTEM:
				return subSystem != null && !subSystem.isEmpty();
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__TOKENS:
				return tokens != null && !tokens.isEmpty();
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__TOKEN_NETWORKS:
				return tokenNetworks != null && !tokenNetworks.isEmpty();
			case CryptoExchangeVersion1Package.CRYPTO_EXCHANGE__NAME:
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
		result.append(" (ip: ");
		result.append(ip);
		result.append(", domainName: ");
		result.append(domainName);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CryptoExchangeImpl

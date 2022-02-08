/**
 */
package cryptoExchangeVersion1.impl;

import cryptoExchangeVersion1.CryptoExchangeVersion1Package;
import cryptoExchangeVersion1.TokenNetwork;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangeVersion1.impl.TokenNetworkImpl#getChainId <em>Chain Id</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.impl.TokenNetworkImpl#getRpc <em>Rpc</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.impl.TokenNetworkImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenNetworkImpl extends MinimalEObjectImpl.Container implements TokenNetwork {
	/**
	 * The default value of the '{@link #getChainId() <em>Chain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainId()
	 * @generated
	 * @ordered
	 */
	protected static final int CHAIN_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChainId() <em>Chain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainId()
	 * @generated
	 * @ordered
	 */
	protected int chainId = CHAIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRpc() <em>Rpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpc()
	 * @generated
	 * @ordered
	 */
	protected static final String RPC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRpc() <em>Rpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpc()
	 * @generated
	 * @ordered
	 */
	protected String rpc = RPC_EDEFAULT;

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
	protected TokenNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoExchangeVersion1Package.Literals.TOKEN_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChainId() {
		return chainId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChainId(int newChainId) {
		int oldChainId = chainId;
		chainId = newChainId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangeVersion1Package.TOKEN_NETWORK__CHAIN_ID, oldChainId, chainId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRpc() {
		return rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRpc(String newRpc) {
		String oldRpc = rpc;
		rpc = newRpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangeVersion1Package.TOKEN_NETWORK__RPC, oldRpc, rpc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangeVersion1Package.TOKEN_NETWORK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CryptoExchangeVersion1Package.TOKEN_NETWORK__CHAIN_ID:
				return getChainId();
			case CryptoExchangeVersion1Package.TOKEN_NETWORK__RPC:
				return getRpc();
			case CryptoExchangeVersion1Package.TOKEN_NETWORK__NAME:
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
			case CryptoExchangeVersion1Package.TOKEN_NETWORK__CHAIN_ID:
				setChainId((Integer)newValue);
				return;
			case CryptoExchangeVersion1Package.TOKEN_NETWORK__RPC:
				setRpc((String)newValue);
				return;
			case CryptoExchangeVersion1Package.TOKEN_NETWORK__NAME:
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
			case CryptoExchangeVersion1Package.TOKEN_NETWORK__CHAIN_ID:
				setChainId(CHAIN_ID_EDEFAULT);
				return;
			case CryptoExchangeVersion1Package.TOKEN_NETWORK__RPC:
				setRpc(RPC_EDEFAULT);
				return;
			case CryptoExchangeVersion1Package.TOKEN_NETWORK__NAME:
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
			case CryptoExchangeVersion1Package.TOKEN_NETWORK__CHAIN_ID:
				return chainId != CHAIN_ID_EDEFAULT;
			case CryptoExchangeVersion1Package.TOKEN_NETWORK__RPC:
				return RPC_EDEFAULT == null ? rpc != null : !RPC_EDEFAULT.equals(rpc);
			case CryptoExchangeVersion1Package.TOKEN_NETWORK__NAME:
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
		result.append(" (chainId: ");
		result.append(chainId);
		result.append(", rpc: ");
		result.append(rpc);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TokenNetworkImpl

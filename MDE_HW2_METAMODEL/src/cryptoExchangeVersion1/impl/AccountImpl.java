/**
 */
package cryptoExchangeVersion1.impl;

import cryptoExchangeVersion1.Account;
import cryptoExchangeVersion1.CryptoExchangeVersion1Package;
import cryptoExchangeVersion1.TokenBalance;
import cryptoExchangeVersion1.TransferRequest;

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
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangeVersion1.impl.AccountImpl#getId <em>Id</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.impl.AccountImpl#getTokensBalance <em>Tokens Balance</em>}</li>
 *   <li>{@link cryptoExchangeVersion1.impl.AccountImpl#getTransferRequest <em>Transfer Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountImpl extends MinimalEObjectImpl.Container implements Account {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTokensBalance() <em>Tokens Balance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokensBalance()
	 * @generated
	 * @ordered
	 */
	protected EList<TokenBalance> tokensBalance;

	/**
	 * The cached value of the '{@link #getTransferRequest() <em>Transfer Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<TransferRequest> transferRequest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoExchangeVersion1Package.Literals.ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangeVersion1Package.ACCOUNT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TokenBalance> getTokensBalance() {
		if (tokensBalance == null) {
			tokensBalance = new EObjectContainmentEList<TokenBalance>(TokenBalance.class, this, CryptoExchangeVersion1Package.ACCOUNT__TOKENS_BALANCE);
		}
		return tokensBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransferRequest> getTransferRequest() {
		if (transferRequest == null) {
			transferRequest = new EObjectContainmentEList<TransferRequest>(TransferRequest.class, this, CryptoExchangeVersion1Package.ACCOUNT__TRANSFER_REQUEST);
		}
		return transferRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CryptoExchangeVersion1Package.ACCOUNT__TOKENS_BALANCE:
				return ((InternalEList<?>)getTokensBalance()).basicRemove(otherEnd, msgs);
			case CryptoExchangeVersion1Package.ACCOUNT__TRANSFER_REQUEST:
				return ((InternalEList<?>)getTransferRequest()).basicRemove(otherEnd, msgs);
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
			case CryptoExchangeVersion1Package.ACCOUNT__ID:
				return getId();
			case CryptoExchangeVersion1Package.ACCOUNT__TOKENS_BALANCE:
				return getTokensBalance();
			case CryptoExchangeVersion1Package.ACCOUNT__TRANSFER_REQUEST:
				return getTransferRequest();
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
			case CryptoExchangeVersion1Package.ACCOUNT__ID:
				setId((String)newValue);
				return;
			case CryptoExchangeVersion1Package.ACCOUNT__TOKENS_BALANCE:
				getTokensBalance().clear();
				getTokensBalance().addAll((Collection<? extends TokenBalance>)newValue);
				return;
			case CryptoExchangeVersion1Package.ACCOUNT__TRANSFER_REQUEST:
				getTransferRequest().clear();
				getTransferRequest().addAll((Collection<? extends TransferRequest>)newValue);
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
			case CryptoExchangeVersion1Package.ACCOUNT__ID:
				setId(ID_EDEFAULT);
				return;
			case CryptoExchangeVersion1Package.ACCOUNT__TOKENS_BALANCE:
				getTokensBalance().clear();
				return;
			case CryptoExchangeVersion1Package.ACCOUNT__TRANSFER_REQUEST:
				getTransferRequest().clear();
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
			case CryptoExchangeVersion1Package.ACCOUNT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CryptoExchangeVersion1Package.ACCOUNT__TOKENS_BALANCE:
				return tokensBalance != null && !tokensBalance.isEmpty();
			case CryptoExchangeVersion1Package.ACCOUNT__TRANSFER_REQUEST:
				return transferRequest != null && !transferRequest.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //AccountImpl

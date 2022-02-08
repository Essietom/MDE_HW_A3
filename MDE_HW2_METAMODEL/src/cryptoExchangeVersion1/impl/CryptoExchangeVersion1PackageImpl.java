/**
 */
package cryptoExchangeVersion1.impl;

import cryptoExchangeVersion1.Account;
import cryptoExchangeVersion1.CryptoExchange;
import cryptoExchangeVersion1.CryptoExchangeVersion1Factory;
import cryptoExchangeVersion1.CryptoExchangeVersion1Package;
import cryptoExchangeVersion1.LeverageType;
import cryptoExchangeVersion1.Order;
import cryptoExchangeVersion1.OrderType;
import cryptoExchangeVersion1.SavingOrder;
import cryptoExchangeVersion1.SubSystem;
import cryptoExchangeVersion1.SubSystemName;
import cryptoExchangeVersion1.Token;
import cryptoExchangeVersion1.TokenBalance;
import cryptoExchangeVersion1.TokenNetwork;
import cryptoExchangeVersion1.TokenPair;
import cryptoExchangeVersion1.TransferRequest;
import cryptoExchangeVersion1.TransferType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CryptoExchangeVersion1PackageImpl extends EPackageImpl implements CryptoExchangeVersion1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cryptoExchangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass savingOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenBalanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum leverageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subSystemNameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transferTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CryptoExchangeVersion1PackageImpl() {
		super(eNS_URI, CryptoExchangeVersion1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CryptoExchangeVersion1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CryptoExchangeVersion1Package init() {
		if (isInited) return (CryptoExchangeVersion1Package)EPackage.Registry.INSTANCE.getEPackage(CryptoExchangeVersion1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredCryptoExchangeVersion1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		CryptoExchangeVersion1PackageImpl theCryptoExchangeVersion1Package = registeredCryptoExchangeVersion1Package instanceof CryptoExchangeVersion1PackageImpl ? (CryptoExchangeVersion1PackageImpl)registeredCryptoExchangeVersion1Package : new CryptoExchangeVersion1PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCryptoExchangeVersion1Package.createPackageContents();

		// Initialize created meta-data
		theCryptoExchangeVersion1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCryptoExchangeVersion1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CryptoExchangeVersion1Package.eNS_URI, theCryptoExchangeVersion1Package);
		return theCryptoExchangeVersion1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCryptoExchange() {
		return cryptoExchangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCryptoExchange_Ip() {
		return (EAttribute)cryptoExchangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCryptoExchange_DomainName() {
		return (EAttribute)cryptoExchangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCryptoExchange_SubSystem() {
		return (EReference)cryptoExchangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCryptoExchange_Tokens() {
		return (EReference)cryptoExchangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCryptoExchange_TokenNetworks() {
		return (EReference)cryptoExchangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCryptoExchange_Name() {
		return (EAttribute)cryptoExchangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccount() {
		return accountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_Id() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_TokensBalance() {
		return (EReference)accountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_TransferRequest() {
		return (EReference)accountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrder() {
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Price() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Amount() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Leverage() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Type() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Account() {
		return (EReference)orderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_TokenPair() {
		return (EReference)orderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSavingOrder() {
		return savingOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSavingOrder_Id() {
		return (EAttribute)savingOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSavingOrder_Amount() {
		return (EAttribute)savingOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSavingOrder_MatureDate() {
		return (EAttribute)savingOrderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSavingOrder_Interest() {
		return (EAttribute)savingOrderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSavingOrder_Account() {
		return (EReference)savingOrderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSavingOrder_Token() {
		return (EReference)savingOrderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubSystem() {
		return subSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSystem_Name() {
		return (EAttribute)subSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubSystem_Accounts() {
		return (EReference)subSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubSystem_TokenPairs() {
		return (EReference)subSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubSystem_Orders() {
		return (EReference)subSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubSystem_SavingOrders() {
		return (EReference)subSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Name() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Address() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Decimal() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_TokenNetwork() {
		return (EReference)tokenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenBalance() {
		return tokenBalanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenBalance_Balance() {
		return (EAttribute)tokenBalanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenBalance_Token() {
		return (EReference)tokenBalanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenNetwork() {
		return tokenNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenNetwork_ChainId() {
		return (EAttribute)tokenNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenNetwork_Rpc() {
		return (EAttribute)tokenNetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenNetwork_Name() {
		return (EAttribute)tokenNetworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenPair() {
		return tokenPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenPair_Price() {
		return (EAttribute)tokenPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenPair_TokenA() {
		return (EReference)tokenPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenPair_TokenB() {
		return (EReference)tokenPairEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenPair_Name() {
		return (EAttribute)tokenPairEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransferRequest() {
		return transferRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransferRequest_Type() {
		return (EAttribute)transferRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransferRequest_Amount() {
		return (EAttribute)transferRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferRequest_Token() {
		return (EReference)transferRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferRequest_Destination() {
		return (EReference)transferRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransferRequest_Id() {
		return (EAttribute)transferRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderType() {
		return orderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLeverageType() {
		return leverageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubSystemName() {
		return subSystemNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransferType() {
		return transferTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoExchangeVersion1Factory getCryptoExchangeVersion1Factory() {
		return (CryptoExchangeVersion1Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cryptoExchangeEClass = createEClass(CRYPTO_EXCHANGE);
		createEAttribute(cryptoExchangeEClass, CRYPTO_EXCHANGE__IP);
		createEAttribute(cryptoExchangeEClass, CRYPTO_EXCHANGE__DOMAIN_NAME);
		createEReference(cryptoExchangeEClass, CRYPTO_EXCHANGE__SUB_SYSTEM);
		createEReference(cryptoExchangeEClass, CRYPTO_EXCHANGE__TOKENS);
		createEReference(cryptoExchangeEClass, CRYPTO_EXCHANGE__TOKEN_NETWORKS);
		createEAttribute(cryptoExchangeEClass, CRYPTO_EXCHANGE__NAME);

		accountEClass = createEClass(ACCOUNT);
		createEAttribute(accountEClass, ACCOUNT__ID);
		createEReference(accountEClass, ACCOUNT__TOKENS_BALANCE);
		createEReference(accountEClass, ACCOUNT__TRANSFER_REQUEST);

		orderEClass = createEClass(ORDER);
		createEAttribute(orderEClass, ORDER__PRICE);
		createEAttribute(orderEClass, ORDER__AMOUNT);
		createEAttribute(orderEClass, ORDER__LEVERAGE);
		createEAttribute(orderEClass, ORDER__TYPE);
		createEReference(orderEClass, ORDER__ACCOUNT);
		createEReference(orderEClass, ORDER__TOKEN_PAIR);

		savingOrderEClass = createEClass(SAVING_ORDER);
		createEAttribute(savingOrderEClass, SAVING_ORDER__ID);
		createEAttribute(savingOrderEClass, SAVING_ORDER__AMOUNT);
		createEAttribute(savingOrderEClass, SAVING_ORDER__MATURE_DATE);
		createEAttribute(savingOrderEClass, SAVING_ORDER__INTEREST);
		createEReference(savingOrderEClass, SAVING_ORDER__ACCOUNT);
		createEReference(savingOrderEClass, SAVING_ORDER__TOKEN);

		subSystemEClass = createEClass(SUB_SYSTEM);
		createEAttribute(subSystemEClass, SUB_SYSTEM__NAME);
		createEReference(subSystemEClass, SUB_SYSTEM__ACCOUNTS);
		createEReference(subSystemEClass, SUB_SYSTEM__TOKEN_PAIRS);
		createEReference(subSystemEClass, SUB_SYSTEM__ORDERS);
		createEReference(subSystemEClass, SUB_SYSTEM__SAVING_ORDERS);

		tokenEClass = createEClass(TOKEN);
		createEAttribute(tokenEClass, TOKEN__NAME);
		createEAttribute(tokenEClass, TOKEN__ADDRESS);
		createEAttribute(tokenEClass, TOKEN__DECIMAL);
		createEReference(tokenEClass, TOKEN__TOKEN_NETWORK);

		tokenBalanceEClass = createEClass(TOKEN_BALANCE);
		createEAttribute(tokenBalanceEClass, TOKEN_BALANCE__BALANCE);
		createEReference(tokenBalanceEClass, TOKEN_BALANCE__TOKEN);

		tokenNetworkEClass = createEClass(TOKEN_NETWORK);
		createEAttribute(tokenNetworkEClass, TOKEN_NETWORK__CHAIN_ID);
		createEAttribute(tokenNetworkEClass, TOKEN_NETWORK__RPC);
		createEAttribute(tokenNetworkEClass, TOKEN_NETWORK__NAME);

		tokenPairEClass = createEClass(TOKEN_PAIR);
		createEAttribute(tokenPairEClass, TOKEN_PAIR__PRICE);
		createEReference(tokenPairEClass, TOKEN_PAIR__TOKEN_A);
		createEReference(tokenPairEClass, TOKEN_PAIR__TOKEN_B);
		createEAttribute(tokenPairEClass, TOKEN_PAIR__NAME);

		transferRequestEClass = createEClass(TRANSFER_REQUEST);
		createEAttribute(transferRequestEClass, TRANSFER_REQUEST__TYPE);
		createEAttribute(transferRequestEClass, TRANSFER_REQUEST__AMOUNT);
		createEReference(transferRequestEClass, TRANSFER_REQUEST__TOKEN);
		createEReference(transferRequestEClass, TRANSFER_REQUEST__DESTINATION);
		createEAttribute(transferRequestEClass, TRANSFER_REQUEST__ID);

		// Create enums
		orderTypeEEnum = createEEnum(ORDER_TYPE);
		leverageTypeEEnum = createEEnum(LEVERAGE_TYPE);
		subSystemNameEEnum = createEEnum(SUB_SYSTEM_NAME);
		transferTypeEEnum = createEEnum(TRANSFER_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(cryptoExchangeEClass, CryptoExchange.class, "CryptoExchange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCryptoExchange_Ip(), ecorePackage.getEString(), "ip", null, 0, 1, CryptoExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCryptoExchange_DomainName(), ecorePackage.getEString(), "domainName", null, 0, 1, CryptoExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCryptoExchange_SubSystem(), this.getSubSystem(), null, "subSystem", null, 1, -1, CryptoExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCryptoExchange_Tokens(), this.getToken(), null, "tokens", null, 1, -1, CryptoExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCryptoExchange_TokenNetworks(), this.getTokenNetwork(), null, "tokenNetworks", null, 1, -1, CryptoExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCryptoExchange_Name(), ecorePackage.getEString(), "name", null, 0, 1, CryptoExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accountEClass, Account.class, "Account", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccount_Id(), ecorePackage.getEString(), "id", null, 1, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccount_TokensBalance(), this.getTokenBalance(), null, "tokensBalance", null, 0, -1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccount_TransferRequest(), this.getTransferRequest(), null, "transferRequest", null, 0, -1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderEClass, Order.class, "Order", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrder_Price(), ecorePackage.getEFloat(), "price", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Amount(), ecorePackage.getEFloat(), "amount", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Leverage(), this.getLeverageType(), "leverage", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Type(), this.getOrderType(), "type", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrder_Account(), this.getAccount(), null, "account", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrder_TokenPair(), this.getTokenPair(), null, "tokenPair", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(savingOrderEClass, SavingOrder.class, "SavingOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSavingOrder_Id(), ecorePackage.getEString(), "id", null, 1, 1, SavingOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSavingOrder_Amount(), ecorePackage.getEFloat(), "amount", null, 1, 1, SavingOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSavingOrder_MatureDate(), ecorePackage.getEDate(), "matureDate", null, 0, 1, SavingOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSavingOrder_Interest(), ecorePackage.getEDouble(), "interest", null, 1, 1, SavingOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSavingOrder_Account(), this.getAccount(), null, "account", null, 1, 1, SavingOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSavingOrder_Token(), this.getToken(), null, "token", null, 1, 1, SavingOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subSystemEClass, SubSystem.class, "SubSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubSystem_Name(), this.getSubSystemName(), "name", null, 0, 1, SubSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubSystem_Accounts(), this.getAccount(), null, "accounts", null, 0, -1, SubSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubSystem_TokenPairs(), this.getTokenPair(), null, "tokenPairs", null, 0, -1, SubSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubSystem_Orders(), this.getOrder(), null, "orders", null, 0, -1, SubSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubSystem_SavingOrders(), this.getSavingOrder(), null, "savingOrders", null, 0, -1, SubSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToken_Name(), ecorePackage.getEString(), "name", null, 1, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_Address(), ecorePackage.getEString(), "address", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_Decimal(), ecorePackage.getEInt(), "decimal", null, 1, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToken_TokenNetwork(), this.getTokenNetwork(), null, "tokenNetwork", null, 1, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenBalanceEClass, TokenBalance.class, "TokenBalance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTokenBalance_Balance(), ecorePackage.getEFloat(), "balance", null, 1, 1, TokenBalance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTokenBalance_Token(), this.getToken(), null, "token", null, 1, 1, TokenBalance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenNetworkEClass, TokenNetwork.class, "TokenNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTokenNetwork_ChainId(), ecorePackage.getEInt(), "chainId", null, 1, 1, TokenNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenNetwork_Rpc(), ecorePackage.getEString(), "rpc", null, 0, 1, TokenNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenNetwork_Name(), ecorePackage.getEString(), "name", null, 1, 1, TokenNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenPairEClass, TokenPair.class, "TokenPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTokenPair_Price(), ecorePackage.getEFloat(), "price", null, 1, 1, TokenPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTokenPair_TokenA(), this.getToken(), null, "tokenA", null, 1, 1, TokenPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTokenPair_TokenB(), this.getToken(), null, "tokenB", null, 1, 1, TokenPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenPair_Name(), ecorePackage.getEString(), "name", null, 1, 1, TokenPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transferRequestEClass, TransferRequest.class, "TransferRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransferRequest_Type(), this.getTransferType(), "type", null, 0, 1, TransferRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransferRequest_Amount(), ecorePackage.getEFloat(), "amount", null, 1, 1, TransferRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferRequest_Token(), this.getToken(), null, "token", null, 1, 1, TransferRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferRequest_Destination(), this.getAccount(), null, "destination", null, 1, 1, TransferRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransferRequest_Id(), ecorePackage.getEString(), "id", null, 1, 1, TransferRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(orderTypeEEnum, OrderType.class, "OrderType");
		addEEnumLiteral(orderTypeEEnum, OrderType.BUY);
		addEEnumLiteral(orderTypeEEnum, OrderType.SELL);
		addEEnumLiteral(orderTypeEEnum, OrderType.LEVERAGE_LONG);
		addEEnumLiteral(orderTypeEEnum, OrderType.LEVERAGE_SHORT);

		initEEnum(leverageTypeEEnum, LeverageType.class, "LeverageType");
		addEEnumLiteral(leverageTypeEEnum, LeverageType._1X);
		addEEnumLiteral(leverageTypeEEnum, LeverageType._2X);
		addEEnumLiteral(leverageTypeEEnum, LeverageType._5X);
		addEEnumLiteral(leverageTypeEEnum, LeverageType._10X);

		initEEnum(subSystemNameEEnum, SubSystemName.class, "SubSystemName");
		addEEnumLiteral(subSystemNameEEnum, SubSystemName.SPOT);
		addEEnumLiteral(subSystemNameEEnum, SubSystemName.FUTURE);
		addEEnumLiteral(subSystemNameEEnum, SubSystemName.MARGIN);
		addEEnumLiteral(subSystemNameEEnum, SubSystemName.SAVING);

		initEEnum(transferTypeEEnum, TransferType.class, "TransferType");
		addEEnumLiteral(transferTypeEEnum, TransferType.INTRA_EXCHANGE);
		addEEnumLiteral(transferTypeEEnum, TransferType.EXTRA_EXCHANGE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

} //CryptoExchangeVersion1PackageImpl

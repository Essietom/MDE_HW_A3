/**
 */
package cryptoExchangeVersion1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cryptoExchangeVersion1.CryptoExchangeVersion1Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface CryptoExchangeVersion1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cryptoExchangeVersion1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://cryptoExchangeVersion1/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cryptoExchangeVersion1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CryptoExchangeVersion1Package eINSTANCE = cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl.init();

	/**
	 * The meta object id for the '{@link cryptoExchangeVersion1.impl.CryptoExchangeImpl <em>Crypto Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangeVersion1.impl.CryptoExchangeImpl
	 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getCryptoExchange()
	 * @generated
	 */
	int CRYPTO_EXCHANGE = 0;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE__IP = 0;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE__DOMAIN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Sub System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE__SUB_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE__TOKENS = 3;

	/**
	 * The feature id for the '<em><b>Token Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE__TOKEN_NETWORKS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE__NAME = 5;

	/**
	 * The number of structural features of the '<em>Crypto Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Crypto Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cryptoExchangeVersion1.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangeVersion1.impl.AccountImpl
	 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__ID = 0;

	/**
	 * The feature id for the '<em><b>Tokens Balance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__TOKENS_BALANCE = 1;

	/**
	 * The feature id for the '<em><b>Transfer Request</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__TRANSFER_REQUEST = 2;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cryptoExchangeVersion1.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangeVersion1.impl.OrderImpl
	 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 2;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PRICE = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Leverage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__LEVERAGE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ACCOUNT = 4;

	/**
	 * The feature id for the '<em><b>Token Pair</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TOKEN_PAIR = 5;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cryptoExchangeVersion1.impl.SavingOrderImpl <em>Saving Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangeVersion1.impl.SavingOrderImpl
	 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getSavingOrder()
	 * @generated
	 */
	int SAVING_ORDER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER__ID = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER__AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Mature Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER__MATURE_DATE = 2;

	/**
	 * The feature id for the '<em><b>Interest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER__INTEREST = 3;

	/**
	 * The feature id for the '<em><b>Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER__ACCOUNT = 4;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER__TOKEN = 5;

	/**
	 * The number of structural features of the '<em>Saving Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Saving Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cryptoExchangeVersion1.impl.SubSystemImpl <em>Sub System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangeVersion1.impl.SubSystemImpl
	 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getSubSystem()
	 * @generated
	 */
	int SUB_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Accounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__ACCOUNTS = 1;

	/**
	 * The feature id for the '<em><b>Token Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__TOKEN_PAIRS = 2;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__ORDERS = 3;

	/**
	 * The feature id for the '<em><b>Saving Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__SAVING_ORDERS = 4;

	/**
	 * The number of structural features of the '<em>Sub System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sub System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cryptoExchangeVersion1.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangeVersion1.impl.TokenImpl
	 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__DECIMAL = 2;

	/**
	 * The feature id for the '<em><b>Token Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__TOKEN_NETWORK = 3;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cryptoExchangeVersion1.impl.TokenBalanceImpl <em>Token Balance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangeVersion1.impl.TokenBalanceImpl
	 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getTokenBalance()
	 * @generated
	 */
	int TOKEN_BALANCE = 6;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_BALANCE__BALANCE = 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_BALANCE__TOKEN = 1;

	/**
	 * The number of structural features of the '<em>Token Balance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_BALANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Token Balance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_BALANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cryptoExchangeVersion1.impl.TokenNetworkImpl <em>Token Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangeVersion1.impl.TokenNetworkImpl
	 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getTokenNetwork()
	 * @generated
	 */
	int TOKEN_NETWORK = 7;

	/**
	 * The feature id for the '<em><b>Chain Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NETWORK__CHAIN_ID = 0;

	/**
	 * The feature id for the '<em><b>Rpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NETWORK__RPC = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NETWORK__NAME = 2;

	/**
	 * The number of structural features of the '<em>Token Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NETWORK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Token Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cryptoExchangeVersion1.impl.TokenPairImpl <em>Token Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangeVersion1.impl.TokenPairImpl
	 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getTokenPair()
	 * @generated
	 */
	int TOKEN_PAIR = 8;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_PAIR__PRICE = 0;

	/**
	 * The feature id for the '<em><b>Token A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_PAIR__TOKEN_A = 1;

	/**
	 * The feature id for the '<em><b>Token B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_PAIR__TOKEN_B = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_PAIR__NAME = 3;

	/**
	 * The number of structural features of the '<em>Token Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_PAIR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Token Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cryptoExchangeVersion1.impl.TransferRequestImpl <em>Transfer Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangeVersion1.impl.TransferRequestImpl
	 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getTransferRequest()
	 * @generated
	 */
	int TRANSFER_REQUEST = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_REQUEST__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_REQUEST__AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_REQUEST__TOKEN = 2;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_REQUEST__DESTINATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_REQUEST__ID = 4;

	/**
	 * The number of structural features of the '<em>Transfer Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_REQUEST_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transfer Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cryptoExchangeVersion1.OrderType <em>Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangeVersion1.OrderType
	 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getOrderType()
	 * @generated
	 */
	int ORDER_TYPE = 10;

	/**
	 * The meta object id for the '{@link cryptoExchangeVersion1.LeverageType <em>Leverage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangeVersion1.LeverageType
	 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getLeverageType()
	 * @generated
	 */
	int LEVERAGE_TYPE = 11;

	/**
	 * The meta object id for the '{@link cryptoExchangeVersion1.SubSystemName <em>Sub System Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangeVersion1.SubSystemName
	 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getSubSystemName()
	 * @generated
	 */
	int SUB_SYSTEM_NAME = 12;

	/**
	 * The meta object id for the '{@link cryptoExchangeVersion1.TransferType <em>Transfer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangeVersion1.TransferType
	 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getTransferType()
	 * @generated
	 */
	int TRANSFER_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link cryptoExchangeVersion1.CryptoExchange <em>Crypto Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crypto Exchange</em>'.
	 * @see cryptoExchangeVersion1.CryptoExchange
	 * @generated
	 */
	EClass getCryptoExchange();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.CryptoExchange#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see cryptoExchangeVersion1.CryptoExchange#getIp()
	 * @see #getCryptoExchange()
	 * @generated
	 */
	EAttribute getCryptoExchange_Ip();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.CryptoExchange#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see cryptoExchangeVersion1.CryptoExchange#getDomainName()
	 * @see #getCryptoExchange()
	 * @generated
	 */
	EAttribute getCryptoExchange_DomainName();

	/**
	 * Returns the meta object for the containment reference list '{@link cryptoExchangeVersion1.CryptoExchange#getSubSystem <em>Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub System</em>'.
	 * @see cryptoExchangeVersion1.CryptoExchange#getSubSystem()
	 * @see #getCryptoExchange()
	 * @generated
	 */
	EReference getCryptoExchange_SubSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link cryptoExchangeVersion1.CryptoExchange#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see cryptoExchangeVersion1.CryptoExchange#getTokens()
	 * @see #getCryptoExchange()
	 * @generated
	 */
	EReference getCryptoExchange_Tokens();

	/**
	 * Returns the meta object for the containment reference list '{@link cryptoExchangeVersion1.CryptoExchange#getTokenNetworks <em>Token Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Token Networks</em>'.
	 * @see cryptoExchangeVersion1.CryptoExchange#getTokenNetworks()
	 * @see #getCryptoExchange()
	 * @generated
	 */
	EReference getCryptoExchange_TokenNetworks();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.CryptoExchange#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cryptoExchangeVersion1.CryptoExchange#getName()
	 * @see #getCryptoExchange()
	 * @generated
	 */
	EAttribute getCryptoExchange_Name();

	/**
	 * Returns the meta object for class '{@link cryptoExchangeVersion1.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see cryptoExchangeVersion1.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.Account#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cryptoExchangeVersion1.Account#getId()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link cryptoExchangeVersion1.Account#getTokensBalance <em>Tokens Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens Balance</em>'.
	 * @see cryptoExchangeVersion1.Account#getTokensBalance()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_TokensBalance();

	/**
	 * Returns the meta object for the containment reference list '{@link cryptoExchangeVersion1.Account#getTransferRequest <em>Transfer Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transfer Request</em>'.
	 * @see cryptoExchangeVersion1.Account#getTransferRequest()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_TransferRequest();

	/**
	 * Returns the meta object for class '{@link cryptoExchangeVersion1.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see cryptoExchangeVersion1.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.Order#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see cryptoExchangeVersion1.Order#getPrice()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Price();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.Order#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see cryptoExchangeVersion1.Order#getAmount()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Amount();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.Order#getLeverage <em>Leverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leverage</em>'.
	 * @see cryptoExchangeVersion1.Order#getLeverage()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Leverage();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.Order#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cryptoExchangeVersion1.Order#getType()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Type();

	/**
	 * Returns the meta object for the reference '{@link cryptoExchangeVersion1.Order#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Account</em>'.
	 * @see cryptoExchangeVersion1.Order#getAccount()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Account();

	/**
	 * Returns the meta object for the reference '{@link cryptoExchangeVersion1.Order#getTokenPair <em>Token Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token Pair</em>'.
	 * @see cryptoExchangeVersion1.Order#getTokenPair()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_TokenPair();

	/**
	 * Returns the meta object for class '{@link cryptoExchangeVersion1.SavingOrder <em>Saving Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Saving Order</em>'.
	 * @see cryptoExchangeVersion1.SavingOrder
	 * @generated
	 */
	EClass getSavingOrder();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.SavingOrder#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cryptoExchangeVersion1.SavingOrder#getId()
	 * @see #getSavingOrder()
	 * @generated
	 */
	EAttribute getSavingOrder_Id();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.SavingOrder#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see cryptoExchangeVersion1.SavingOrder#getAmount()
	 * @see #getSavingOrder()
	 * @generated
	 */
	EAttribute getSavingOrder_Amount();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.SavingOrder#getMatureDate <em>Mature Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mature Date</em>'.
	 * @see cryptoExchangeVersion1.SavingOrder#getMatureDate()
	 * @see #getSavingOrder()
	 * @generated
	 */
	EAttribute getSavingOrder_MatureDate();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.SavingOrder#getInterest <em>Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interest</em>'.
	 * @see cryptoExchangeVersion1.SavingOrder#getInterest()
	 * @see #getSavingOrder()
	 * @generated
	 */
	EAttribute getSavingOrder_Interest();

	/**
	 * Returns the meta object for the reference '{@link cryptoExchangeVersion1.SavingOrder#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Account</em>'.
	 * @see cryptoExchangeVersion1.SavingOrder#getAccount()
	 * @see #getSavingOrder()
	 * @generated
	 */
	EReference getSavingOrder_Account();

	/**
	 * Returns the meta object for the reference '{@link cryptoExchangeVersion1.SavingOrder#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see cryptoExchangeVersion1.SavingOrder#getToken()
	 * @see #getSavingOrder()
	 * @generated
	 */
	EReference getSavingOrder_Token();

	/**
	 * Returns the meta object for class '{@link cryptoExchangeVersion1.SubSystem <em>Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub System</em>'.
	 * @see cryptoExchangeVersion1.SubSystem
	 * @generated
	 */
	EClass getSubSystem();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.SubSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cryptoExchangeVersion1.SubSystem#getName()
	 * @see #getSubSystem()
	 * @generated
	 */
	EAttribute getSubSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cryptoExchangeVersion1.SubSystem#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accounts</em>'.
	 * @see cryptoExchangeVersion1.SubSystem#getAccounts()
	 * @see #getSubSystem()
	 * @generated
	 */
	EReference getSubSystem_Accounts();

	/**
	 * Returns the meta object for the containment reference list '{@link cryptoExchangeVersion1.SubSystem#getTokenPairs <em>Token Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Token Pairs</em>'.
	 * @see cryptoExchangeVersion1.SubSystem#getTokenPairs()
	 * @see #getSubSystem()
	 * @generated
	 */
	EReference getSubSystem_TokenPairs();

	/**
	 * Returns the meta object for the containment reference list '{@link cryptoExchangeVersion1.SubSystem#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orders</em>'.
	 * @see cryptoExchangeVersion1.SubSystem#getOrders()
	 * @see #getSubSystem()
	 * @generated
	 */
	EReference getSubSystem_Orders();

	/**
	 * Returns the meta object for the containment reference list '{@link cryptoExchangeVersion1.SubSystem#getSavingOrders <em>Saving Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Saving Orders</em>'.
	 * @see cryptoExchangeVersion1.SubSystem#getSavingOrders()
	 * @see #getSubSystem()
	 * @generated
	 */
	EReference getSubSystem_SavingOrders();

	/**
	 * Returns the meta object for class '{@link cryptoExchangeVersion1.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see cryptoExchangeVersion1.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.Token#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cryptoExchangeVersion1.Token#getName()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Name();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.Token#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see cryptoExchangeVersion1.Token#getAddress()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Address();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.Token#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see cryptoExchangeVersion1.Token#getDecimal()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Decimal();

	/**
	 * Returns the meta object for the reference '{@link cryptoExchangeVersion1.Token#getTokenNetwork <em>Token Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token Network</em>'.
	 * @see cryptoExchangeVersion1.Token#getTokenNetwork()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_TokenNetwork();

	/**
	 * Returns the meta object for class '{@link cryptoExchangeVersion1.TokenBalance <em>Token Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Balance</em>'.
	 * @see cryptoExchangeVersion1.TokenBalance
	 * @generated
	 */
	EClass getTokenBalance();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.TokenBalance#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balance</em>'.
	 * @see cryptoExchangeVersion1.TokenBalance#getBalance()
	 * @see #getTokenBalance()
	 * @generated
	 */
	EAttribute getTokenBalance_Balance();

	/**
	 * Returns the meta object for the reference '{@link cryptoExchangeVersion1.TokenBalance#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see cryptoExchangeVersion1.TokenBalance#getToken()
	 * @see #getTokenBalance()
	 * @generated
	 */
	EReference getTokenBalance_Token();

	/**
	 * Returns the meta object for class '{@link cryptoExchangeVersion1.TokenNetwork <em>Token Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Network</em>'.
	 * @see cryptoExchangeVersion1.TokenNetwork
	 * @generated
	 */
	EClass getTokenNetwork();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.TokenNetwork#getChainId <em>Chain Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chain Id</em>'.
	 * @see cryptoExchangeVersion1.TokenNetwork#getChainId()
	 * @see #getTokenNetwork()
	 * @generated
	 */
	EAttribute getTokenNetwork_ChainId();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.TokenNetwork#getRpc <em>Rpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rpc</em>'.
	 * @see cryptoExchangeVersion1.TokenNetwork#getRpc()
	 * @see #getTokenNetwork()
	 * @generated
	 */
	EAttribute getTokenNetwork_Rpc();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.TokenNetwork#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cryptoExchangeVersion1.TokenNetwork#getName()
	 * @see #getTokenNetwork()
	 * @generated
	 */
	EAttribute getTokenNetwork_Name();

	/**
	 * Returns the meta object for class '{@link cryptoExchangeVersion1.TokenPair <em>Token Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Pair</em>'.
	 * @see cryptoExchangeVersion1.TokenPair
	 * @generated
	 */
	EClass getTokenPair();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.TokenPair#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see cryptoExchangeVersion1.TokenPair#getPrice()
	 * @see #getTokenPair()
	 * @generated
	 */
	EAttribute getTokenPair_Price();

	/**
	 * Returns the meta object for the reference '{@link cryptoExchangeVersion1.TokenPair#getTokenA <em>Token A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token A</em>'.
	 * @see cryptoExchangeVersion1.TokenPair#getTokenA()
	 * @see #getTokenPair()
	 * @generated
	 */
	EReference getTokenPair_TokenA();

	/**
	 * Returns the meta object for the reference '{@link cryptoExchangeVersion1.TokenPair#getTokenB <em>Token B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token B</em>'.
	 * @see cryptoExchangeVersion1.TokenPair#getTokenB()
	 * @see #getTokenPair()
	 * @generated
	 */
	EReference getTokenPair_TokenB();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.TokenPair#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cryptoExchangeVersion1.TokenPair#getName()
	 * @see #getTokenPair()
	 * @generated
	 */
	EAttribute getTokenPair_Name();

	/**
	 * Returns the meta object for class '{@link cryptoExchangeVersion1.TransferRequest <em>Transfer Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Request</em>'.
	 * @see cryptoExchangeVersion1.TransferRequest
	 * @generated
	 */
	EClass getTransferRequest();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.TransferRequest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cryptoExchangeVersion1.TransferRequest#getType()
	 * @see #getTransferRequest()
	 * @generated
	 */
	EAttribute getTransferRequest_Type();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.TransferRequest#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see cryptoExchangeVersion1.TransferRequest#getAmount()
	 * @see #getTransferRequest()
	 * @generated
	 */
	EAttribute getTransferRequest_Amount();

	/**
	 * Returns the meta object for the reference '{@link cryptoExchangeVersion1.TransferRequest#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see cryptoExchangeVersion1.TransferRequest#getToken()
	 * @see #getTransferRequest()
	 * @generated
	 */
	EReference getTransferRequest_Token();

	/**
	 * Returns the meta object for the reference '{@link cryptoExchangeVersion1.TransferRequest#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see cryptoExchangeVersion1.TransferRequest#getDestination()
	 * @see #getTransferRequest()
	 * @generated
	 */
	EReference getTransferRequest_Destination();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangeVersion1.TransferRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cryptoExchangeVersion1.TransferRequest#getId()
	 * @see #getTransferRequest()
	 * @generated
	 */
	EAttribute getTransferRequest_Id();

	/**
	 * Returns the meta object for enum '{@link cryptoExchangeVersion1.OrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Type</em>'.
	 * @see cryptoExchangeVersion1.OrderType
	 * @generated
	 */
	EEnum getOrderType();

	/**
	 * Returns the meta object for enum '{@link cryptoExchangeVersion1.LeverageType <em>Leverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Leverage Type</em>'.
	 * @see cryptoExchangeVersion1.LeverageType
	 * @generated
	 */
	EEnum getLeverageType();

	/**
	 * Returns the meta object for enum '{@link cryptoExchangeVersion1.SubSystemName <em>Sub System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub System Name</em>'.
	 * @see cryptoExchangeVersion1.SubSystemName
	 * @generated
	 */
	EEnum getSubSystemName();

	/**
	 * Returns the meta object for enum '{@link cryptoExchangeVersion1.TransferType <em>Transfer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transfer Type</em>'.
	 * @see cryptoExchangeVersion1.TransferType
	 * @generated
	 */
	EEnum getTransferType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CryptoExchangeVersion1Factory getCryptoExchangeVersion1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cryptoExchangeVersion1.impl.CryptoExchangeImpl <em>Crypto Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangeVersion1.impl.CryptoExchangeImpl
		 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getCryptoExchange()
		 * @generated
		 */
		EClass CRYPTO_EXCHANGE = eINSTANCE.getCryptoExchange();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRYPTO_EXCHANGE__IP = eINSTANCE.getCryptoExchange_Ip();

		/**
		 * The meta object literal for the '<em><b>Domain Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRYPTO_EXCHANGE__DOMAIN_NAME = eINSTANCE.getCryptoExchange_DomainName();

		/**
		 * The meta object literal for the '<em><b>Sub System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRYPTO_EXCHANGE__SUB_SYSTEM = eINSTANCE.getCryptoExchange_SubSystem();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRYPTO_EXCHANGE__TOKENS = eINSTANCE.getCryptoExchange_Tokens();

		/**
		 * The meta object literal for the '<em><b>Token Networks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRYPTO_EXCHANGE__TOKEN_NETWORKS = eINSTANCE.getCryptoExchange_TokenNetworks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRYPTO_EXCHANGE__NAME = eINSTANCE.getCryptoExchange_Name();

		/**
		 * The meta object literal for the '{@link cryptoExchangeVersion1.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangeVersion1.impl.AccountImpl
		 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__ID = eINSTANCE.getAccount_Id();

		/**
		 * The meta object literal for the '<em><b>Tokens Balance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__TOKENS_BALANCE = eINSTANCE.getAccount_TokensBalance();

		/**
		 * The meta object literal for the '<em><b>Transfer Request</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__TRANSFER_REQUEST = eINSTANCE.getAccount_TransferRequest();

		/**
		 * The meta object literal for the '{@link cryptoExchangeVersion1.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangeVersion1.impl.OrderImpl
		 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__PRICE = eINSTANCE.getOrder_Price();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__AMOUNT = eINSTANCE.getOrder_Amount();

		/**
		 * The meta object literal for the '<em><b>Leverage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__LEVERAGE = eINSTANCE.getOrder_Leverage();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__TYPE = eINSTANCE.getOrder_Type();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__ACCOUNT = eINSTANCE.getOrder_Account();

		/**
		 * The meta object literal for the '<em><b>Token Pair</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__TOKEN_PAIR = eINSTANCE.getOrder_TokenPair();

		/**
		 * The meta object literal for the '{@link cryptoExchangeVersion1.impl.SavingOrderImpl <em>Saving Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangeVersion1.impl.SavingOrderImpl
		 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getSavingOrder()
		 * @generated
		 */
		EClass SAVING_ORDER = eINSTANCE.getSavingOrder();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAVING_ORDER__ID = eINSTANCE.getSavingOrder_Id();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAVING_ORDER__AMOUNT = eINSTANCE.getSavingOrder_Amount();

		/**
		 * The meta object literal for the '<em><b>Mature Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAVING_ORDER__MATURE_DATE = eINSTANCE.getSavingOrder_MatureDate();

		/**
		 * The meta object literal for the '<em><b>Interest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAVING_ORDER__INTEREST = eINSTANCE.getSavingOrder_Interest();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAVING_ORDER__ACCOUNT = eINSTANCE.getSavingOrder_Account();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAVING_ORDER__TOKEN = eINSTANCE.getSavingOrder_Token();

		/**
		 * The meta object literal for the '{@link cryptoExchangeVersion1.impl.SubSystemImpl <em>Sub System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangeVersion1.impl.SubSystemImpl
		 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getSubSystem()
		 * @generated
		 */
		EClass SUB_SYSTEM = eINSTANCE.getSubSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SYSTEM__NAME = eINSTANCE.getSubSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Accounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM__ACCOUNTS = eINSTANCE.getSubSystem_Accounts();

		/**
		 * The meta object literal for the '<em><b>Token Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM__TOKEN_PAIRS = eINSTANCE.getSubSystem_TokenPairs();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM__ORDERS = eINSTANCE.getSubSystem_Orders();

		/**
		 * The meta object literal for the '<em><b>Saving Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM__SAVING_ORDERS = eINSTANCE.getSubSystem_SavingOrders();

		/**
		 * The meta object literal for the '{@link cryptoExchangeVersion1.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangeVersion1.impl.TokenImpl
		 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__NAME = eINSTANCE.getToken_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__ADDRESS = eINSTANCE.getToken_Address();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__DECIMAL = eINSTANCE.getToken_Decimal();

		/**
		 * The meta object literal for the '<em><b>Token Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__TOKEN_NETWORK = eINSTANCE.getToken_TokenNetwork();

		/**
		 * The meta object literal for the '{@link cryptoExchangeVersion1.impl.TokenBalanceImpl <em>Token Balance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangeVersion1.impl.TokenBalanceImpl
		 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getTokenBalance()
		 * @generated
		 */
		EClass TOKEN_BALANCE = eINSTANCE.getTokenBalance();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_BALANCE__BALANCE = eINSTANCE.getTokenBalance_Balance();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_BALANCE__TOKEN = eINSTANCE.getTokenBalance_Token();

		/**
		 * The meta object literal for the '{@link cryptoExchangeVersion1.impl.TokenNetworkImpl <em>Token Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangeVersion1.impl.TokenNetworkImpl
		 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getTokenNetwork()
		 * @generated
		 */
		EClass TOKEN_NETWORK = eINSTANCE.getTokenNetwork();

		/**
		 * The meta object literal for the '<em><b>Chain Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_NETWORK__CHAIN_ID = eINSTANCE.getTokenNetwork_ChainId();

		/**
		 * The meta object literal for the '<em><b>Rpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_NETWORK__RPC = eINSTANCE.getTokenNetwork_Rpc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_NETWORK__NAME = eINSTANCE.getTokenNetwork_Name();

		/**
		 * The meta object literal for the '{@link cryptoExchangeVersion1.impl.TokenPairImpl <em>Token Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangeVersion1.impl.TokenPairImpl
		 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getTokenPair()
		 * @generated
		 */
		EClass TOKEN_PAIR = eINSTANCE.getTokenPair();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_PAIR__PRICE = eINSTANCE.getTokenPair_Price();

		/**
		 * The meta object literal for the '<em><b>Token A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_PAIR__TOKEN_A = eINSTANCE.getTokenPair_TokenA();

		/**
		 * The meta object literal for the '<em><b>Token B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_PAIR__TOKEN_B = eINSTANCE.getTokenPair_TokenB();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_PAIR__NAME = eINSTANCE.getTokenPair_Name();

		/**
		 * The meta object literal for the '{@link cryptoExchangeVersion1.impl.TransferRequestImpl <em>Transfer Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangeVersion1.impl.TransferRequestImpl
		 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getTransferRequest()
		 * @generated
		 */
		EClass TRANSFER_REQUEST = eINSTANCE.getTransferRequest();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER_REQUEST__TYPE = eINSTANCE.getTransferRequest_Type();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER_REQUEST__AMOUNT = eINSTANCE.getTransferRequest_Amount();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_REQUEST__TOKEN = eINSTANCE.getTransferRequest_Token();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_REQUEST__DESTINATION = eINSTANCE.getTransferRequest_Destination();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER_REQUEST__ID = eINSTANCE.getTransferRequest_Id();

		/**
		 * The meta object literal for the '{@link cryptoExchangeVersion1.OrderType <em>Order Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangeVersion1.OrderType
		 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getOrderType()
		 * @generated
		 */
		EEnum ORDER_TYPE = eINSTANCE.getOrderType();

		/**
		 * The meta object literal for the '{@link cryptoExchangeVersion1.LeverageType <em>Leverage Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangeVersion1.LeverageType
		 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getLeverageType()
		 * @generated
		 */
		EEnum LEVERAGE_TYPE = eINSTANCE.getLeverageType();

		/**
		 * The meta object literal for the '{@link cryptoExchangeVersion1.SubSystemName <em>Sub System Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangeVersion1.SubSystemName
		 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getSubSystemName()
		 * @generated
		 */
		EEnum SUB_SYSTEM_NAME = eINSTANCE.getSubSystemName();

		/**
		 * The meta object literal for the '{@link cryptoExchangeVersion1.TransferType <em>Transfer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangeVersion1.TransferType
		 * @see cryptoExchangeVersion1.impl.CryptoExchangeVersion1PackageImpl#getTransferType()
		 * @generated
		 */
		EEnum TRANSFER_TYPE = eINSTANCE.getTransferType();

	}

} //CryptoExchangeVersion1Package

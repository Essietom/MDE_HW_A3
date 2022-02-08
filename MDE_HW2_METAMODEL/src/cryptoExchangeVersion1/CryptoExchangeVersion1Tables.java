/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /MDE_HOMEWORK/model/cryptoExchangeModelVersion1.ecore
 * using:
 *   /MDE_HOMEWORK/model/cryptoExchangeModelVersion1.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package cryptoExchangeVersion1;

// import cryptoExchangeVersion1.CryptoExchangeVersion1Package;
// import cryptoExchangeVersion1.CryptoExchangeVersion1Tables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;

/**
 * CryptoExchangeVersion1Tables provides the dispatch tables for the cryptoExchangeVersion1 for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class CryptoExchangeVersion1Tables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(CryptoExchangeVersion1Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_cryptoExchangeVersion1_s_1_0 = IdManager.getNsURIPackageId("https://cryptoExchangeVersion1/1.0", null, CryptoExchangeVersion1Package.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Account = CryptoExchangeVersion1Tables.PACKid_https_c_s_s_cryptoExchangeVersion1_s_1_0.getClassId("Account", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CryptoExchange = CryptoExchangeVersion1Tables.PACKid_https_c_s_s_cryptoExchangeVersion1_s_1_0.getClassId("CryptoExchange", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Order = CryptoExchangeVersion1Tables.PACKid_https_c_s_s_cryptoExchangeVersion1_s_1_0.getClassId("Order", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SavingOrder = CryptoExchangeVersion1Tables.PACKid_https_c_s_s_cryptoExchangeVersion1_s_1_0.getClassId("SavingOrder", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SubSystem = CryptoExchangeVersion1Tables.PACKid_https_c_s_s_cryptoExchangeVersion1_s_1_0.getClassId("SubSystem", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Token = CryptoExchangeVersion1Tables.PACKid_https_c_s_s_cryptoExchangeVersion1_s_1_0.getClassId("Token", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TokenBalance = CryptoExchangeVersion1Tables.PACKid_https_c_s_s_cryptoExchangeVersion1_s_1_0.getClassId("TokenBalance", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TokenNetwork = CryptoExchangeVersion1Tables.PACKid_https_c_s_s_cryptoExchangeVersion1_s_1_0.getClassId("TokenNetwork", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TokenPair = CryptoExchangeVersion1Tables.PACKid_https_c_s_s_cryptoExchangeVersion1_s_1_0.getClassId("TokenPair", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TransferRequest = CryptoExchangeVersion1Tables.PACKid_https_c_s_s_cryptoExchangeVersion1_s_1_0.getClassId("TransferRequest", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = CryptoExchangeVersion1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDouble = CryptoExchangeVersion1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDouble", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = CryptoExchangeVersion1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = CryptoExchangeVersion1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_LeverageType = CryptoExchangeVersion1Tables.PACKid_https_c_s_s_cryptoExchangeVersion1_s_1_0.getEnumerationId("LeverageType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_OrderType = CryptoExchangeVersion1Tables.PACKid_https_c_s_s_cryptoExchangeVersion1_s_1_0.getEnumerationId("OrderType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_SubSystemName = CryptoExchangeVersion1Tables.PACKid_https_c_s_s_cryptoExchangeVersion1_s_1_0.getEnumerationId("SubSystemName");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_TransferType = CryptoExchangeVersion1Tables.PACKid_https_c_s_s_cryptoExchangeVersion1_s_1_0.getEnumerationId("TransferType");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Order = TypeId.BAG.getSpecializedId(CryptoExchangeVersion1Tables.CLSSid_Order);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_SavingOrder = TypeId.BAG.getSpecializedId(CryptoExchangeVersion1Tables.CLSSid_SavingOrder);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Token = TypeId.BAG.getSpecializedId(CryptoExchangeVersion1Tables.CLSSid_Token);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_TokenBalance = TypeId.BAG.getSpecializedId(CryptoExchangeVersion1Tables.CLSSid_TokenBalance);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_TokenPair = TypeId.BAG.getSpecializedId(CryptoExchangeVersion1Tables.CLSSid_TokenPair);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_TransferRequest = TypeId.BAG.getSpecializedId(CryptoExchangeVersion1Tables.CLSSid_TransferRequest);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Account = TypeId.ORDERED_SET.getSpecializedId(CryptoExchangeVersion1Tables.CLSSid_Account);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Order = TypeId.ORDERED_SET.getSpecializedId(CryptoExchangeVersion1Tables.CLSSid_Order);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_SavingOrder = TypeId.ORDERED_SET.getSpecializedId(CryptoExchangeVersion1Tables.CLSSid_SavingOrder);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_SubSystem = TypeId.ORDERED_SET.getSpecializedId(CryptoExchangeVersion1Tables.CLSSid_SubSystem);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Token = TypeId.ORDERED_SET.getSpecializedId(CryptoExchangeVersion1Tables.CLSSid_Token);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_TokenBalance = TypeId.ORDERED_SET.getSpecializedId(CryptoExchangeVersion1Tables.CLSSid_TokenBalance);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_TokenNetwork = TypeId.ORDERED_SET.getSpecializedId(CryptoExchangeVersion1Tables.CLSSid_TokenNetwork);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_TokenPair = TypeId.ORDERED_SET.getSpecializedId(CryptoExchangeVersion1Tables.CLSSid_TokenPair);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_TransferRequest = TypeId.ORDERED_SET.getSpecializedId(CryptoExchangeVersion1Tables.CLSSid_TransferRequest);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			CryptoExchangeVersion1Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CryptoExchangeVersion1Tables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Account = new EcoreExecutorType(CryptoExchangeVersion1Package.Literals.ACCOUNT, PACKAGE, 0);
		public static final EcoreExecutorType _CryptoExchange = new EcoreExecutorType(CryptoExchangeVersion1Package.Literals.CRYPTO_EXCHANGE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _LeverageType = new EcoreExecutorEnumeration(CryptoExchangeVersion1Package.Literals.LEVERAGE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Order = new EcoreExecutorType(CryptoExchangeVersion1Package.Literals.ORDER, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _OrderType = new EcoreExecutorEnumeration(CryptoExchangeVersion1Package.Literals.ORDER_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _SavingOrder = new EcoreExecutorType(CryptoExchangeVersion1Package.Literals.SAVING_ORDER, PACKAGE, 0);
		public static final EcoreExecutorType _SubSystem = new EcoreExecutorType(CryptoExchangeVersion1Package.Literals.SUB_SYSTEM, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _SubSystemName = new EcoreExecutorEnumeration(CryptoExchangeVersion1Package.Literals.SUB_SYSTEM_NAME, PACKAGE, 0);
		public static final EcoreExecutorType _Token = new EcoreExecutorType(CryptoExchangeVersion1Package.Literals.TOKEN, PACKAGE, 0);
		public static final EcoreExecutorType _TokenBalance = new EcoreExecutorType(CryptoExchangeVersion1Package.Literals.TOKEN_BALANCE, PACKAGE, 0);
		public static final EcoreExecutorType _TokenNetwork = new EcoreExecutorType(CryptoExchangeVersion1Package.Literals.TOKEN_NETWORK, PACKAGE, 0);
		public static final EcoreExecutorType _TokenPair = new EcoreExecutorType(CryptoExchangeVersion1Package.Literals.TOKEN_PAIR, PACKAGE, 0);
		public static final EcoreExecutorType _TransferRequest = new EcoreExecutorType(CryptoExchangeVersion1Package.Literals.TRANSFER_REQUEST, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _TransferType = new EcoreExecutorEnumeration(CryptoExchangeVersion1Package.Literals.TRANSFER_TYPE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Account,
			_CryptoExchange,
			_LeverageType,
			_Order,
			_OrderType,
			_SavingOrder,
			_SubSystem,
			_SubSystemName,
			_Token,
			_TokenBalance,
			_TokenNetwork,
			_TokenPair,
			_TransferRequest,
			_TransferType
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CryptoExchangeVersion1Tables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Account__Account = new ExecutorFragment(Types._Account, CryptoExchangeVersion1Tables.Types._Account);
		private static final ExecutorFragment _Account__OclAny = new ExecutorFragment(Types._Account, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Account__OclElement = new ExecutorFragment(Types._Account, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CryptoExchange__CryptoExchange = new ExecutorFragment(Types._CryptoExchange, CryptoExchangeVersion1Tables.Types._CryptoExchange);
		private static final ExecutorFragment _CryptoExchange__OclAny = new ExecutorFragment(Types._CryptoExchange, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CryptoExchange__OclElement = new ExecutorFragment(Types._CryptoExchange, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _LeverageType__LeverageType = new ExecutorFragment(Types._LeverageType, CryptoExchangeVersion1Tables.Types._LeverageType);
		private static final ExecutorFragment _LeverageType__OclAny = new ExecutorFragment(Types._LeverageType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LeverageType__OclElement = new ExecutorFragment(Types._LeverageType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _LeverageType__OclEnumeration = new ExecutorFragment(Types._LeverageType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _LeverageType__OclType = new ExecutorFragment(Types._LeverageType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Order__OclAny = new ExecutorFragment(Types._Order, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Order__OclElement = new ExecutorFragment(Types._Order, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Order__Order = new ExecutorFragment(Types._Order, CryptoExchangeVersion1Tables.Types._Order);

		private static final ExecutorFragment _OrderType__OclAny = new ExecutorFragment(Types._OrderType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OrderType__OclElement = new ExecutorFragment(Types._OrderType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OrderType__OclEnumeration = new ExecutorFragment(Types._OrderType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _OrderType__OclType = new ExecutorFragment(Types._OrderType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _OrderType__OrderType = new ExecutorFragment(Types._OrderType, CryptoExchangeVersion1Tables.Types._OrderType);

		private static final ExecutorFragment _SavingOrder__OclAny = new ExecutorFragment(Types._SavingOrder, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SavingOrder__OclElement = new ExecutorFragment(Types._SavingOrder, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SavingOrder__SavingOrder = new ExecutorFragment(Types._SavingOrder, CryptoExchangeVersion1Tables.Types._SavingOrder);

		private static final ExecutorFragment _SubSystem__OclAny = new ExecutorFragment(Types._SubSystem, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SubSystem__OclElement = new ExecutorFragment(Types._SubSystem, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SubSystem__SubSystem = new ExecutorFragment(Types._SubSystem, CryptoExchangeVersion1Tables.Types._SubSystem);

		private static final ExecutorFragment _SubSystemName__OclAny = new ExecutorFragment(Types._SubSystemName, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SubSystemName__OclElement = new ExecutorFragment(Types._SubSystemName, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SubSystemName__OclEnumeration = new ExecutorFragment(Types._SubSystemName, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _SubSystemName__OclType = new ExecutorFragment(Types._SubSystemName, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _SubSystemName__SubSystemName = new ExecutorFragment(Types._SubSystemName, CryptoExchangeVersion1Tables.Types._SubSystemName);

		private static final ExecutorFragment _Token__OclAny = new ExecutorFragment(Types._Token, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Token__OclElement = new ExecutorFragment(Types._Token, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Token__Token = new ExecutorFragment(Types._Token, CryptoExchangeVersion1Tables.Types._Token);

		private static final ExecutorFragment _TokenBalance__OclAny = new ExecutorFragment(Types._TokenBalance, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TokenBalance__OclElement = new ExecutorFragment(Types._TokenBalance, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TokenBalance__TokenBalance = new ExecutorFragment(Types._TokenBalance, CryptoExchangeVersion1Tables.Types._TokenBalance);

		private static final ExecutorFragment _TokenNetwork__OclAny = new ExecutorFragment(Types._TokenNetwork, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TokenNetwork__OclElement = new ExecutorFragment(Types._TokenNetwork, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TokenNetwork__TokenNetwork = new ExecutorFragment(Types._TokenNetwork, CryptoExchangeVersion1Tables.Types._TokenNetwork);

		private static final ExecutorFragment _TokenPair__OclAny = new ExecutorFragment(Types._TokenPair, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TokenPair__OclElement = new ExecutorFragment(Types._TokenPair, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TokenPair__TokenPair = new ExecutorFragment(Types._TokenPair, CryptoExchangeVersion1Tables.Types._TokenPair);

		private static final ExecutorFragment _TransferRequest__OclAny = new ExecutorFragment(Types._TransferRequest, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TransferRequest__OclElement = new ExecutorFragment(Types._TransferRequest, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TransferRequest__TransferRequest = new ExecutorFragment(Types._TransferRequest, CryptoExchangeVersion1Tables.Types._TransferRequest);

		private static final ExecutorFragment _TransferType__OclAny = new ExecutorFragment(Types._TransferType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TransferType__OclElement = new ExecutorFragment(Types._TransferType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TransferType__OclEnumeration = new ExecutorFragment(Types._TransferType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _TransferType__OclType = new ExecutorFragment(Types._TransferType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _TransferType__TransferType = new ExecutorFragment(Types._TransferType, CryptoExchangeVersion1Tables.Types._TransferType);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CryptoExchangeVersion1Tables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CryptoExchangeVersion1Tables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CryptoExchangeVersion1Tables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Account__id = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.ACCOUNT__ID, Types._Account, 0);
		public static final ExecutorProperty _Account__tokensBalance = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.ACCOUNT__TOKENS_BALANCE, Types._Account, 1);
		public static final ExecutorProperty _Account__transferRequest = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.ACCOUNT__TRANSFER_REQUEST, Types._Account, 2);
		public static final ExecutorProperty _Account__Order__account = new ExecutorPropertyWithImplementation("Order", Types._Account, 3, new EcoreLibraryOppositeProperty(CryptoExchangeVersion1Package.Literals.ORDER__ACCOUNT));
		public static final ExecutorProperty _Account__SavingOrder__account = new ExecutorPropertyWithImplementation("SavingOrder", Types._Account, 4, new EcoreLibraryOppositeProperty(CryptoExchangeVersion1Package.Literals.SAVING_ORDER__ACCOUNT));
		public static final ExecutorProperty _Account__SubSystem__accounts = new ExecutorPropertyWithImplementation("SubSystem", Types._Account, 5, new EcoreLibraryOppositeProperty(CryptoExchangeVersion1Package.Literals.SUB_SYSTEM__ACCOUNTS));
		public static final ExecutorProperty _Account__TransferRequest__destination = new ExecutorPropertyWithImplementation("TransferRequest", Types._Account, 6, new EcoreLibraryOppositeProperty(CryptoExchangeVersion1Package.Literals.TRANSFER_REQUEST__DESTINATION));

		public static final ExecutorProperty _CryptoExchange__domainName = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.CRYPTO_EXCHANGE__DOMAIN_NAME, Types._CryptoExchange, 0);
		public static final ExecutorProperty _CryptoExchange__ip = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.CRYPTO_EXCHANGE__IP, Types._CryptoExchange, 1);
		public static final ExecutorProperty _CryptoExchange__name = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.CRYPTO_EXCHANGE__NAME, Types._CryptoExchange, 2);
		public static final ExecutorProperty _CryptoExchange__subSystem = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.CRYPTO_EXCHANGE__SUB_SYSTEM, Types._CryptoExchange, 3);
		public static final ExecutorProperty _CryptoExchange__tokenNetworks = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.CRYPTO_EXCHANGE__TOKEN_NETWORKS, Types._CryptoExchange, 4);
		public static final ExecutorProperty _CryptoExchange__tokens = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.CRYPTO_EXCHANGE__TOKENS, Types._CryptoExchange, 5);

		public static final ExecutorProperty _Order__account = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.ORDER__ACCOUNT, Types._Order, 0);
		public static final ExecutorProperty _Order__amount = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.ORDER__AMOUNT, Types._Order, 1);
		public static final ExecutorProperty _Order__leverage = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.ORDER__LEVERAGE, Types._Order, 2);
		public static final ExecutorProperty _Order__price = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.ORDER__PRICE, Types._Order, 3);
		public static final ExecutorProperty _Order__tokenPair = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.ORDER__TOKEN_PAIR, Types._Order, 4);
		public static final ExecutorProperty _Order__type = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.ORDER__TYPE, Types._Order, 5);
		public static final ExecutorProperty _Order__SubSystem__orders = new ExecutorPropertyWithImplementation("SubSystem", Types._Order, 6, new EcoreLibraryOppositeProperty(CryptoExchangeVersion1Package.Literals.SUB_SYSTEM__ORDERS));

		public static final ExecutorProperty _SavingOrder__account = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.SAVING_ORDER__ACCOUNT, Types._SavingOrder, 0);
		public static final ExecutorProperty _SavingOrder__amount = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.SAVING_ORDER__AMOUNT, Types._SavingOrder, 1);
		public static final ExecutorProperty _SavingOrder__id = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.SAVING_ORDER__ID, Types._SavingOrder, 2);
		public static final ExecutorProperty _SavingOrder__interest = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.SAVING_ORDER__INTEREST, Types._SavingOrder, 3);
		public static final ExecutorProperty _SavingOrder__matureDate = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.SAVING_ORDER__MATURE_DATE, Types._SavingOrder, 4);
		public static final ExecutorProperty _SavingOrder__token = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.SAVING_ORDER__TOKEN, Types._SavingOrder, 5);
		public static final ExecutorProperty _SavingOrder__SubSystem__savingOrders = new ExecutorPropertyWithImplementation("SubSystem", Types._SavingOrder, 6, new EcoreLibraryOppositeProperty(CryptoExchangeVersion1Package.Literals.SUB_SYSTEM__SAVING_ORDERS));

		public static final ExecutorProperty _SubSystem__accounts = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.SUB_SYSTEM__ACCOUNTS, Types._SubSystem, 0);
		public static final ExecutorProperty _SubSystem__name = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.SUB_SYSTEM__NAME, Types._SubSystem, 1);
		public static final ExecutorProperty _SubSystem__orders = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.SUB_SYSTEM__ORDERS, Types._SubSystem, 2);
		public static final ExecutorProperty _SubSystem__savingOrders = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.SUB_SYSTEM__SAVING_ORDERS, Types._SubSystem, 3);
		public static final ExecutorProperty _SubSystem__tokenPairs = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.SUB_SYSTEM__TOKEN_PAIRS, Types._SubSystem, 4);
		public static final ExecutorProperty _SubSystem__CryptoExchange__subSystem = new ExecutorPropertyWithImplementation("CryptoExchange", Types._SubSystem, 5, new EcoreLibraryOppositeProperty(CryptoExchangeVersion1Package.Literals.CRYPTO_EXCHANGE__SUB_SYSTEM));

		public static final ExecutorProperty _Token__address = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.TOKEN__ADDRESS, Types._Token, 0);
		public static final ExecutorProperty _Token__decimal = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.TOKEN__DECIMAL, Types._Token, 1);
		public static final ExecutorProperty _Token__name = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.TOKEN__NAME, Types._Token, 2);
		public static final ExecutorProperty _Token__tokenNetwork = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.TOKEN__TOKEN_NETWORK, Types._Token, 3);
		public static final ExecutorProperty _Token__CryptoExchange__tokens = new ExecutorPropertyWithImplementation("CryptoExchange", Types._Token, 4, new EcoreLibraryOppositeProperty(CryptoExchangeVersion1Package.Literals.CRYPTO_EXCHANGE__TOKENS));
		public static final ExecutorProperty _Token__SavingOrder__token = new ExecutorPropertyWithImplementation("SavingOrder", Types._Token, 5, new EcoreLibraryOppositeProperty(CryptoExchangeVersion1Package.Literals.SAVING_ORDER__TOKEN));
		public static final ExecutorProperty _Token__TokenBalance__token = new ExecutorPropertyWithImplementation("TokenBalance", Types._Token, 6, new EcoreLibraryOppositeProperty(CryptoExchangeVersion1Package.Literals.TOKEN_BALANCE__TOKEN));
		public static final ExecutorProperty _Token__TokenPair__tokenA = new ExecutorPropertyWithImplementation("TokenPair", Types._Token, 7, new EcoreLibraryOppositeProperty(CryptoExchangeVersion1Package.Literals.TOKEN_PAIR__TOKEN_A));
		public static final ExecutorProperty _Token__TokenPair__tokenB = new ExecutorPropertyWithImplementation("TokenPair", Types._Token, 8, new EcoreLibraryOppositeProperty(CryptoExchangeVersion1Package.Literals.TOKEN_PAIR__TOKEN_B));
		public static final ExecutorProperty _Token__TransferRequest__token = new ExecutorPropertyWithImplementation("TransferRequest", Types._Token, 9, new EcoreLibraryOppositeProperty(CryptoExchangeVersion1Package.Literals.TRANSFER_REQUEST__TOKEN));

		public static final ExecutorProperty _TokenBalance__balance = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.TOKEN_BALANCE__BALANCE, Types._TokenBalance, 0);
		public static final ExecutorProperty _TokenBalance__token = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.TOKEN_BALANCE__TOKEN, Types._TokenBalance, 1);
		public static final ExecutorProperty _TokenBalance__Account__tokensBalance = new ExecutorPropertyWithImplementation("Account", Types._TokenBalance, 2, new EcoreLibraryOppositeProperty(CryptoExchangeVersion1Package.Literals.ACCOUNT__TOKENS_BALANCE));

		public static final ExecutorProperty _TokenNetwork__chainId = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.TOKEN_NETWORK__CHAIN_ID, Types._TokenNetwork, 0);
		public static final ExecutorProperty _TokenNetwork__name = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.TOKEN_NETWORK__NAME, Types._TokenNetwork, 1);
		public static final ExecutorProperty _TokenNetwork__rpc = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.TOKEN_NETWORK__RPC, Types._TokenNetwork, 2);
		public static final ExecutorProperty _TokenNetwork__CryptoExchange__tokenNetworks = new ExecutorPropertyWithImplementation("CryptoExchange", Types._TokenNetwork, 3, new EcoreLibraryOppositeProperty(CryptoExchangeVersion1Package.Literals.CRYPTO_EXCHANGE__TOKEN_NETWORKS));
		public static final ExecutorProperty _TokenNetwork__Token__tokenNetwork = new ExecutorPropertyWithImplementation("Token", Types._TokenNetwork, 4, new EcoreLibraryOppositeProperty(CryptoExchangeVersion1Package.Literals.TOKEN__TOKEN_NETWORK));

		public static final ExecutorProperty _TokenPair__name = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.TOKEN_PAIR__NAME, Types._TokenPair, 0);
		public static final ExecutorProperty _TokenPair__price = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.TOKEN_PAIR__PRICE, Types._TokenPair, 1);
		public static final ExecutorProperty _TokenPair__tokenA = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.TOKEN_PAIR__TOKEN_A, Types._TokenPair, 2);
		public static final ExecutorProperty _TokenPair__tokenB = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.TOKEN_PAIR__TOKEN_B, Types._TokenPair, 3);
		public static final ExecutorProperty _TokenPair__Order__tokenPair = new ExecutorPropertyWithImplementation("Order", Types._TokenPair, 4, new EcoreLibraryOppositeProperty(CryptoExchangeVersion1Package.Literals.ORDER__TOKEN_PAIR));
		public static final ExecutorProperty _TokenPair__SubSystem__tokenPairs = new ExecutorPropertyWithImplementation("SubSystem", Types._TokenPair, 5, new EcoreLibraryOppositeProperty(CryptoExchangeVersion1Package.Literals.SUB_SYSTEM__TOKEN_PAIRS));

		public static final ExecutorProperty _TransferRequest__amount = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.TRANSFER_REQUEST__AMOUNT, Types._TransferRequest, 0);
		public static final ExecutorProperty _TransferRequest__destination = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.TRANSFER_REQUEST__DESTINATION, Types._TransferRequest, 1);
		public static final ExecutorProperty _TransferRequest__id = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.TRANSFER_REQUEST__ID, Types._TransferRequest, 2);
		public static final ExecutorProperty _TransferRequest__token = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.TRANSFER_REQUEST__TOKEN, Types._TransferRequest, 3);
		public static final ExecutorProperty _TransferRequest__type = new EcoreExecutorProperty(CryptoExchangeVersion1Package.Literals.TRANSFER_REQUEST__TYPE, Types._TransferRequest, 4);
		public static final ExecutorProperty _TransferRequest__Account__transferRequest = new ExecutorPropertyWithImplementation("Account", Types._TransferRequest, 5, new EcoreLibraryOppositeProperty(CryptoExchangeVersion1Package.Literals.ACCOUNT__TRANSFER_REQUEST));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CryptoExchangeVersion1Tables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Account =
			{
				Fragments._Account__OclAny /* 0 */,
				Fragments._Account__OclElement /* 1 */,
				Fragments._Account__Account /* 2 */
			};
		private static final int /*@NonNull*/ [] __Account = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CryptoExchange =
			{
				Fragments._CryptoExchange__OclAny /* 0 */,
				Fragments._CryptoExchange__OclElement /* 1 */,
				Fragments._CryptoExchange__CryptoExchange /* 2 */
			};
		private static final int /*@NonNull*/ [] __CryptoExchange = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LeverageType =
			{
				Fragments._LeverageType__OclAny /* 0 */,
				Fragments._LeverageType__OclElement /* 1 */,
				Fragments._LeverageType__OclType /* 2 */,
				Fragments._LeverageType__OclEnumeration /* 3 */,
				Fragments._LeverageType__LeverageType /* 4 */
			};
		private static final int /*@NonNull*/ [] __LeverageType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Order =
			{
				Fragments._Order__OclAny /* 0 */,
				Fragments._Order__OclElement /* 1 */,
				Fragments._Order__Order /* 2 */
			};
		private static final int /*@NonNull*/ [] __Order = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OrderType =
			{
				Fragments._OrderType__OclAny /* 0 */,
				Fragments._OrderType__OclElement /* 1 */,
				Fragments._OrderType__OclType /* 2 */,
				Fragments._OrderType__OclEnumeration /* 3 */,
				Fragments._OrderType__OrderType /* 4 */
			};
		private static final int /*@NonNull*/ [] __OrderType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SavingOrder =
			{
				Fragments._SavingOrder__OclAny /* 0 */,
				Fragments._SavingOrder__OclElement /* 1 */,
				Fragments._SavingOrder__SavingOrder /* 2 */
			};
		private static final int /*@NonNull*/ [] __SavingOrder = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SubSystem =
			{
				Fragments._SubSystem__OclAny /* 0 */,
				Fragments._SubSystem__OclElement /* 1 */,
				Fragments._SubSystem__SubSystem /* 2 */
			};
		private static final int /*@NonNull*/ [] __SubSystem = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SubSystemName =
			{
				Fragments._SubSystemName__OclAny /* 0 */,
				Fragments._SubSystemName__OclElement /* 1 */,
				Fragments._SubSystemName__OclType /* 2 */,
				Fragments._SubSystemName__OclEnumeration /* 3 */,
				Fragments._SubSystemName__SubSystemName /* 4 */
			};
		private static final int /*@NonNull*/ [] __SubSystemName = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Token =
			{
				Fragments._Token__OclAny /* 0 */,
				Fragments._Token__OclElement /* 1 */,
				Fragments._Token__Token /* 2 */
			};
		private static final int /*@NonNull*/ [] __Token = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TokenBalance =
			{
				Fragments._TokenBalance__OclAny /* 0 */,
				Fragments._TokenBalance__OclElement /* 1 */,
				Fragments._TokenBalance__TokenBalance /* 2 */
			};
		private static final int /*@NonNull*/ [] __TokenBalance = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TokenNetwork =
			{
				Fragments._TokenNetwork__OclAny /* 0 */,
				Fragments._TokenNetwork__OclElement /* 1 */,
				Fragments._TokenNetwork__TokenNetwork /* 2 */
			};
		private static final int /*@NonNull*/ [] __TokenNetwork = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TokenPair =
			{
				Fragments._TokenPair__OclAny /* 0 */,
				Fragments._TokenPair__OclElement /* 1 */,
				Fragments._TokenPair__TokenPair /* 2 */
			};
		private static final int /*@NonNull*/ [] __TokenPair = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TransferRequest =
			{
				Fragments._TransferRequest__OclAny /* 0 */,
				Fragments._TransferRequest__OclElement /* 1 */,
				Fragments._TransferRequest__TransferRequest /* 2 */
			};
		private static final int /*@NonNull*/ [] __TransferRequest = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TransferType =
			{
				Fragments._TransferType__OclAny /* 0 */,
				Fragments._TransferType__OclElement /* 1 */,
				Fragments._TransferType__OclType /* 2 */,
				Fragments._TransferType__OclEnumeration /* 3 */,
				Fragments._TransferType__TransferType /* 4 */
			};
		private static final int /*@NonNull*/ [] __TransferType = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Account.initFragments(_Account, __Account);
			Types._CryptoExchange.initFragments(_CryptoExchange, __CryptoExchange);
			Types._LeverageType.initFragments(_LeverageType, __LeverageType);
			Types._Order.initFragments(_Order, __Order);
			Types._OrderType.initFragments(_OrderType, __OrderType);
			Types._SavingOrder.initFragments(_SavingOrder, __SavingOrder);
			Types._SubSystem.initFragments(_SubSystem, __SubSystem);
			Types._SubSystemName.initFragments(_SubSystemName, __SubSystemName);
			Types._Token.initFragments(_Token, __Token);
			Types._TokenBalance.initFragments(_TokenBalance, __TokenBalance);
			Types._TokenNetwork.initFragments(_TokenNetwork, __TokenNetwork);
			Types._TokenPair.initFragments(_TokenPair, __TokenPair);
			Types._TransferRequest.initFragments(_TransferRequest, __TransferRequest);
			Types._TransferType.initFragments(_TransferType, __TransferType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CryptoExchangeVersion1Tables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Account__Account = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Account__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Account__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CryptoExchange__CryptoExchange = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CryptoExchange__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CryptoExchange__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LeverageType__LeverageType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LeverageType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LeverageType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LeverageType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LeverageType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Order__Order = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Order__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Order__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _OrderType__OrderType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SavingOrder__SavingOrder = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SavingOrder__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SavingOrder__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SubSystem__SubSystem = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SubSystem__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SubSystem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SubSystemName__SubSystemName = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SubSystemName__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SubSystemName__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SubSystemName__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SubSystemName__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Token__Token = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Token__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Token__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TokenBalance__TokenBalance = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TokenBalance__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TokenBalance__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TokenNetwork__TokenNetwork = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TokenNetwork__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TokenNetwork__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TokenPair__TokenPair = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TokenPair__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TokenPair__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TransferRequest__TransferRequest = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TransferRequest__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TransferRequest__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TransferType__TransferType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TransferType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TransferType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TransferType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TransferType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Account__Account.initOperations(_Account__Account);
			Fragments._Account__OclAny.initOperations(_Account__OclAny);
			Fragments._Account__OclElement.initOperations(_Account__OclElement);

			Fragments._CryptoExchange__CryptoExchange.initOperations(_CryptoExchange__CryptoExchange);
			Fragments._CryptoExchange__OclAny.initOperations(_CryptoExchange__OclAny);
			Fragments._CryptoExchange__OclElement.initOperations(_CryptoExchange__OclElement);

			Fragments._LeverageType__LeverageType.initOperations(_LeverageType__LeverageType);
			Fragments._LeverageType__OclAny.initOperations(_LeverageType__OclAny);
			Fragments._LeverageType__OclElement.initOperations(_LeverageType__OclElement);
			Fragments._LeverageType__OclEnumeration.initOperations(_LeverageType__OclEnumeration);
			Fragments._LeverageType__OclType.initOperations(_LeverageType__OclType);

			Fragments._Order__OclAny.initOperations(_Order__OclAny);
			Fragments._Order__OclElement.initOperations(_Order__OclElement);
			Fragments._Order__Order.initOperations(_Order__Order);

			Fragments._OrderType__OclAny.initOperations(_OrderType__OclAny);
			Fragments._OrderType__OclElement.initOperations(_OrderType__OclElement);
			Fragments._OrderType__OclEnumeration.initOperations(_OrderType__OclEnumeration);
			Fragments._OrderType__OclType.initOperations(_OrderType__OclType);
			Fragments._OrderType__OrderType.initOperations(_OrderType__OrderType);

			Fragments._SavingOrder__OclAny.initOperations(_SavingOrder__OclAny);
			Fragments._SavingOrder__OclElement.initOperations(_SavingOrder__OclElement);
			Fragments._SavingOrder__SavingOrder.initOperations(_SavingOrder__SavingOrder);

			Fragments._SubSystem__OclAny.initOperations(_SubSystem__OclAny);
			Fragments._SubSystem__OclElement.initOperations(_SubSystem__OclElement);
			Fragments._SubSystem__SubSystem.initOperations(_SubSystem__SubSystem);

			Fragments._SubSystemName__OclAny.initOperations(_SubSystemName__OclAny);
			Fragments._SubSystemName__OclElement.initOperations(_SubSystemName__OclElement);
			Fragments._SubSystemName__OclEnumeration.initOperations(_SubSystemName__OclEnumeration);
			Fragments._SubSystemName__OclType.initOperations(_SubSystemName__OclType);
			Fragments._SubSystemName__SubSystemName.initOperations(_SubSystemName__SubSystemName);

			Fragments._Token__OclAny.initOperations(_Token__OclAny);
			Fragments._Token__OclElement.initOperations(_Token__OclElement);
			Fragments._Token__Token.initOperations(_Token__Token);

			Fragments._TokenBalance__OclAny.initOperations(_TokenBalance__OclAny);
			Fragments._TokenBalance__OclElement.initOperations(_TokenBalance__OclElement);
			Fragments._TokenBalance__TokenBalance.initOperations(_TokenBalance__TokenBalance);

			Fragments._TokenNetwork__OclAny.initOperations(_TokenNetwork__OclAny);
			Fragments._TokenNetwork__OclElement.initOperations(_TokenNetwork__OclElement);
			Fragments._TokenNetwork__TokenNetwork.initOperations(_TokenNetwork__TokenNetwork);

			Fragments._TokenPair__OclAny.initOperations(_TokenPair__OclAny);
			Fragments._TokenPair__OclElement.initOperations(_TokenPair__OclElement);
			Fragments._TokenPair__TokenPair.initOperations(_TokenPair__TokenPair);

			Fragments._TransferRequest__OclAny.initOperations(_TransferRequest__OclAny);
			Fragments._TransferRequest__OclElement.initOperations(_TransferRequest__OclElement);
			Fragments._TransferRequest__TransferRequest.initOperations(_TransferRequest__TransferRequest);

			Fragments._TransferType__OclAny.initOperations(_TransferType__OclAny);
			Fragments._TransferType__OclElement.initOperations(_TransferType__OclElement);
			Fragments._TransferType__OclEnumeration.initOperations(_TransferType__OclEnumeration);
			Fragments._TransferType__OclType.initOperations(_TransferType__OclType);
			Fragments._TransferType__TransferType.initOperations(_TransferType__TransferType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CryptoExchangeVersion1Tables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Account = {
			CryptoExchangeVersion1Tables.Properties._Account__id,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CryptoExchangeVersion1Tables.Properties._Account__tokensBalance,
			CryptoExchangeVersion1Tables.Properties._Account__transferRequest
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CryptoExchange = {
			CryptoExchangeVersion1Tables.Properties._CryptoExchange__domainName,
			CryptoExchangeVersion1Tables.Properties._CryptoExchange__ip,
			CryptoExchangeVersion1Tables.Properties._CryptoExchange__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CryptoExchangeVersion1Tables.Properties._CryptoExchange__subSystem,
			CryptoExchangeVersion1Tables.Properties._CryptoExchange__tokenNetworks,
			CryptoExchangeVersion1Tables.Properties._CryptoExchange__tokens
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LeverageType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Order = {
			CryptoExchangeVersion1Tables.Properties._Order__account,
			CryptoExchangeVersion1Tables.Properties._Order__amount,
			CryptoExchangeVersion1Tables.Properties._Order__leverage,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CryptoExchangeVersion1Tables.Properties._Order__price,
			CryptoExchangeVersion1Tables.Properties._Order__tokenPair,
			CryptoExchangeVersion1Tables.Properties._Order__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OrderType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SavingOrder = {
			CryptoExchangeVersion1Tables.Properties._SavingOrder__account,
			CryptoExchangeVersion1Tables.Properties._SavingOrder__amount,
			CryptoExchangeVersion1Tables.Properties._SavingOrder__id,
			CryptoExchangeVersion1Tables.Properties._SavingOrder__interest,
			CryptoExchangeVersion1Tables.Properties._SavingOrder__matureDate,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CryptoExchangeVersion1Tables.Properties._SavingOrder__token
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SubSystem = {
			CryptoExchangeVersion1Tables.Properties._SubSystem__accounts,
			CryptoExchangeVersion1Tables.Properties._SubSystem__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CryptoExchangeVersion1Tables.Properties._SubSystem__orders,
			CryptoExchangeVersion1Tables.Properties._SubSystem__savingOrders,
			CryptoExchangeVersion1Tables.Properties._SubSystem__tokenPairs
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SubSystemName = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Token = {
			CryptoExchangeVersion1Tables.Properties._Token__address,
			CryptoExchangeVersion1Tables.Properties._Token__decimal,
			CryptoExchangeVersion1Tables.Properties._Token__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CryptoExchangeVersion1Tables.Properties._Token__tokenNetwork
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TokenBalance = {
			CryptoExchangeVersion1Tables.Properties._TokenBalance__balance,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CryptoExchangeVersion1Tables.Properties._TokenBalance__token
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TokenNetwork = {
			CryptoExchangeVersion1Tables.Properties._TokenNetwork__chainId,
			CryptoExchangeVersion1Tables.Properties._TokenNetwork__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CryptoExchangeVersion1Tables.Properties._TokenNetwork__rpc
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TokenPair = {
			CryptoExchangeVersion1Tables.Properties._TokenPair__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CryptoExchangeVersion1Tables.Properties._TokenPair__price,
			CryptoExchangeVersion1Tables.Properties._TokenPair__tokenA,
			CryptoExchangeVersion1Tables.Properties._TokenPair__tokenB
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TransferRequest = {
			CryptoExchangeVersion1Tables.Properties._TransferRequest__amount,
			CryptoExchangeVersion1Tables.Properties._TransferRequest__destination,
			CryptoExchangeVersion1Tables.Properties._TransferRequest__id,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CryptoExchangeVersion1Tables.Properties._TransferRequest__token,
			CryptoExchangeVersion1Tables.Properties._TransferRequest__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TransferType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Account__Account.initProperties(_Account);
			Fragments._CryptoExchange__CryptoExchange.initProperties(_CryptoExchange);
			Fragments._LeverageType__LeverageType.initProperties(_LeverageType);
			Fragments._Order__Order.initProperties(_Order);
			Fragments._OrderType__OrderType.initProperties(_OrderType);
			Fragments._SavingOrder__SavingOrder.initProperties(_SavingOrder);
			Fragments._SubSystem__SubSystem.initProperties(_SubSystem);
			Fragments._SubSystemName__SubSystemName.initProperties(_SubSystemName);
			Fragments._Token__Token.initProperties(_Token);
			Fragments._TokenBalance__TokenBalance.initProperties(_TokenBalance);
			Fragments._TokenNetwork__TokenNetwork.initProperties(_TokenNetwork);
			Fragments._TokenPair__TokenPair.initProperties(_TokenPair);
			Fragments._TransferRequest__TransferRequest.initProperties(_TransferRequest);
			Fragments._TransferType__TransferType.initProperties(_TransferType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CryptoExchangeVersion1Tables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _LeverageType___1x = new EcoreExecutorEnumerationLiteral(CryptoExchangeVersion1Package.Literals.LEVERAGE_TYPE.getEEnumLiteral("_1x"), Types._LeverageType, 0);
		public static final EcoreExecutorEnumerationLiteral _LeverageType___2x = new EcoreExecutorEnumerationLiteral(CryptoExchangeVersion1Package.Literals.LEVERAGE_TYPE.getEEnumLiteral("_2x"), Types._LeverageType, 1);
		public static final EcoreExecutorEnumerationLiteral _LeverageType___5x = new EcoreExecutorEnumerationLiteral(CryptoExchangeVersion1Package.Literals.LEVERAGE_TYPE.getEEnumLiteral("_5x"), Types._LeverageType, 2);
		public static final EcoreExecutorEnumerationLiteral _LeverageType___10x = new EcoreExecutorEnumerationLiteral(CryptoExchangeVersion1Package.Literals.LEVERAGE_TYPE.getEEnumLiteral("_10x"), Types._LeverageType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _LeverageType = {
			_LeverageType___1x,
			_LeverageType___2x,
			_LeverageType___5x,
			_LeverageType___10x
		};

		public static final EcoreExecutorEnumerationLiteral _OrderType__buy = new EcoreExecutorEnumerationLiteral(CryptoExchangeVersion1Package.Literals.ORDER_TYPE.getEEnumLiteral("buy"), Types._OrderType, 0);
		public static final EcoreExecutorEnumerationLiteral _OrderType__sell = new EcoreExecutorEnumerationLiteral(CryptoExchangeVersion1Package.Literals.ORDER_TYPE.getEEnumLiteral("sell"), Types._OrderType, 1);
		public static final EcoreExecutorEnumerationLiteral _OrderType__leverageLong = new EcoreExecutorEnumerationLiteral(CryptoExchangeVersion1Package.Literals.ORDER_TYPE.getEEnumLiteral("leverageLong"), Types._OrderType, 2);
		public static final EcoreExecutorEnumerationLiteral _OrderType__leverageShort = new EcoreExecutorEnumerationLiteral(CryptoExchangeVersion1Package.Literals.ORDER_TYPE.getEEnumLiteral("leverageShort"), Types._OrderType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _OrderType = {
			_OrderType__buy,
			_OrderType__sell,
			_OrderType__leverageLong,
			_OrderType__leverageShort
		};

		public static final EcoreExecutorEnumerationLiteral _SubSystemName__spot = new EcoreExecutorEnumerationLiteral(CryptoExchangeVersion1Package.Literals.SUB_SYSTEM_NAME.getEEnumLiteral("spot"), Types._SubSystemName, 0);
		public static final EcoreExecutorEnumerationLiteral _SubSystemName__future = new EcoreExecutorEnumerationLiteral(CryptoExchangeVersion1Package.Literals.SUB_SYSTEM_NAME.getEEnumLiteral("future"), Types._SubSystemName, 1);
		public static final EcoreExecutorEnumerationLiteral _SubSystemName__margin = new EcoreExecutorEnumerationLiteral(CryptoExchangeVersion1Package.Literals.SUB_SYSTEM_NAME.getEEnumLiteral("margin"), Types._SubSystemName, 2);
		public static final EcoreExecutorEnumerationLiteral _SubSystemName__saving = new EcoreExecutorEnumerationLiteral(CryptoExchangeVersion1Package.Literals.SUB_SYSTEM_NAME.getEEnumLiteral("saving"), Types._SubSystemName, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _SubSystemName = {
			_SubSystemName__spot,
			_SubSystemName__future,
			_SubSystemName__margin,
			_SubSystemName__saving
		};

		public static final EcoreExecutorEnumerationLiteral _TransferType__intraExchange = new EcoreExecutorEnumerationLiteral(CryptoExchangeVersion1Package.Literals.TRANSFER_TYPE.getEEnumLiteral("intraExchange"), Types._TransferType, 0);
		public static final EcoreExecutorEnumerationLiteral _TransferType__extraExchange = new EcoreExecutorEnumerationLiteral(CryptoExchangeVersion1Package.Literals.TRANSFER_TYPE.getEEnumLiteral("extraExchange"), Types._TransferType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _TransferType = {
			_TransferType__intraExchange,
			_TransferType__extraExchange
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._LeverageType.initLiterals(_LeverageType);
			Types._OrderType.initLiterals(_OrderType);
			Types._SubSystemName.initLiterals(_SubSystemName);
			Types._TransferType.initLiterals(_TransferType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CryptoExchangeVersion1Tables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new CryptoExchangeVersion1Tables();
	}

	private CryptoExchangeVersion1Tables() {
		super(CryptoExchangeVersion1Package.eNS_URI);
	}
}

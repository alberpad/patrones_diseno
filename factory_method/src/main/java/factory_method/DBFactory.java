package factory_method;

import java.util.Properties;

import factory_method.impl.MySqlDBAdapterImpl;
import factory_method.impl.PostgreSQLDBAdapterImpl;
import factory_method.util.PropertiesUtil;

public class DBFactory {

	private static final String DB_FACTORY_PROPERTY_URL = "factory_method/configuracion/DBFactory.properties";
	private static final String DEFAULT_DB_CLASS_PROP = "defaultDBClass";

	public static IDBAdapter getDBAdapter(DBType dbType) {
		switch (dbType) {
		case MySQL:
			return new MySqlDBAdapterImpl();
		case PostgreSQL:
			return new PostgreSQLDBAdapterImpl();
		default:
			throw new IllegalArgumentException("No soportado");
		}
	}

	public static IDBAdapter getDefaultDBAdapter() {
		try {

			Properties prop = PropertiesUtil.loadProperty(DB_FACTORY_PROPERTY_URL);
			String defaultDBClass = prop.getProperty(DEFAULT_DB_CLASS_PROP);
			System.out.println("DefaultDBClass: " + defaultDBClass);
//			return (IDBAdapter) Class.forName(defaultDBClass).newInstance();
			return (IDBAdapter) Class.forName(defaultDBClass).getDeclaredConstructor()
					.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}

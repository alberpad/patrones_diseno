package factory_method.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import factory_method.IDBAdapter;
import factory_method.util.PropertiesUtil;

public class MySqlDBAdapterImpl implements IDBAdapter {

	private static final String DB_PROPERTIES = "factory_method/configuracion/DBMySql.properties";

	public Connection getConnection() {
		try {
			Connection connection = DriverManager.getConnection(createConnectionString());
			System.out.println("Clase conexión: " + connection.getClass().getName());
			return connection;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	private String createConnectionString() {
		Properties props = PropertiesUtil.loadProperty(DB_PROPERTIES);
		String host = props.getProperty("host");
		String port = props.getProperty("port");
		String dbname = props.getProperty("dbname");
		String user = props.getProperty("user");
		String password = props.getProperty("password");
		return "jdbc:mysql://" + host + ":" + port + "/" + dbname + "?user=" + user + "&password="
				+ password + "&serverTimezone=UTC";
	}

}

package factory_method;

import java.sql.Connection;

public interface IDBAdapter {
	public Connection getConnection();
}

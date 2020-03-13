package factory_method.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import factory_method.DBFactory;
import factory_method.IDBAdapter;
import factory_method.entity.Producto;

public class ProductoDAO {

	private IDBAdapter dbAdapter;

	public ProductoDAO() {
		dbAdapter = DBFactory.getDefaultDBAdapter();
	}

	public List<Producto> findAllProductos() {
		Connection connection = dbAdapter.getConnection();
		List<Producto> listaProductos = new ArrayList<Producto>();
		try {
			PreparedStatement statement = connection.prepareStatement(
					"SELECT id_producto, nombre_producto, precio_producto FROM productos");
			ResultSet results = statement.executeQuery();
			while (results.next()) {
				listaProductos.add(new Producto(results.getLong(1), results.getString(2),
						results.getDouble(3)));
			}
			return listaProductos;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean saveProduct(Producto producto) {
		Connection connection = dbAdapter.getConnection();
		try {
			PreparedStatement statement = connection
					.prepareStatement("INSERT INTO productos(id_producto,"
							+ "nombre_producto,precio_producto) VALUES (?,?,?)");
			statement.setLong(1, producto.getIdProducto());
			statement.setString(2, producto.getNombreProducto());
			statement.setDouble(3, producto.getPrecioProducto());
			statement.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				connection.close();
			} catch (Exception e) {
			}
		}
	}

}

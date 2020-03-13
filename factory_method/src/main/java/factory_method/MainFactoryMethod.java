package factory_method;

import java.sql.SQLException;
import java.util.List;

import factory_method.dao.ProductoDAO;
import factory_method.entity.Producto;

public class MainFactoryMethod {

	public static void main(String[] args) throws SQLException {
		// populate solo la primera vez
		// Producto productoA = new Producto(1L, "Productco A", 100);
		// Producto productoB = new Producto(2L, "Productco B", 50);

		ProductoDAO productoDAO = new ProductoDAO();
		// solo la primera vez
		// productoDAO.saveProduct(productoA);
		// productoDAO.saveProduct(productoB);
		List<Producto> productos = productoDAO.findAllProductos();
		System.out.println("Número de productos: " + productos.size());
		for (Producto producto : productos) {
			System.out.println(producto);
		}

	}

}

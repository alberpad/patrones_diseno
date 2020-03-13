package abstract_factory_web.service.impl;

import abstract_factory_web.service.IProductoService;

public class ProductoServiceRestImpl implements IProductoService {

	private static final String[] PRODUCTOS = new String[] { "XBOX X SERIES", "NINTENDO SWITCH",
			"PS5" };

	public String[] getProductos() {
		System.out.println("API REST PRODUCTOS");
		return PRODUCTOS;
	}

}

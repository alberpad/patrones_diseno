package abstract_factory_web.service.impl;

import abstract_factory_web.service.IProductoService;

public class ProductoServiceWSImpl implements IProductoService {

	private static final String[] PRODUCTOS = new String[] { "REALME X2 PRO", "ONE PLUS 7",
			"SAMSUNG GALAXY S10" };

	public String[] getProductos() {
		System.out.println("WEB SERVICES PRODUCTOS");
		return PRODUCTOS;
	}

}

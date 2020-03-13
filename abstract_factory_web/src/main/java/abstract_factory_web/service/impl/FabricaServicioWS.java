package abstract_factory_web.service.impl;

import abstract_factory_web.service.IEmpleadoService;
import abstract_factory_web.service.IFabricaService;
import abstract_factory_web.service.IProductoService;

public class FabricaServicioWS implements IFabricaService {

	public IEmpleadoService creaEmpleadoService() {

		return new EmpleadoServiceWSImpl();
	}

	public IProductoService crearProductoService() {

		return new ProductoServiceWSImpl();
	}

}

package abstract_factory_web.service.impl;

import abstract_factory_web.service.IEmpleadoService;
import abstract_factory_web.service.IFabricaService;
import abstract_factory_web.service.IProductoService;

public class FabricaServicioRest implements IFabricaService {

	public IEmpleadoService creaEmpleadoService() {

		return new EmpleadoServiceRestImpl();
	}

	public IProductoService crearProductoService() {

		return new ProductoServiceRestImpl();
	}

}

package abstract_factory_web.service;

import abstract_factory_web.service.IEmpleadoService;
import abstract_factory_web.service.IProductoService;

public interface IFabricaService {

	IEmpleadoService creaEmpleadoService();

	IProductoService crearProductoService();

}

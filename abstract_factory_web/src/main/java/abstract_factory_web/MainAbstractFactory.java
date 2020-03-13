package abstract_factory_web;

import java.util.Arrays;

import abstract_factory_web.service.IEmpleadoService;
import abstract_factory_web.service.IFabricaService;
import abstract_factory_web.service.IProductoService;

public class MainAbstractFactory {

	public static void main(String[] args) {
		IFabricaService fabrica = SeleccionaFabricaService.crearFabricaService();
		IEmpleadoService empleadoService = fabrica.creaEmpleadoService();
		IProductoService productoService = fabrica.crearProductoService();

		System.out.println(
				"EmpleadoService class > " + empleadoService.getClass().getCanonicalName());
		System.out.println(
				"ProductoService class > " + productoService.getClass().getCanonicalName());

		System.out.println("getEmpleados > " + Arrays.toString(empleadoService.getEmpleados()));
		System.out.println("getProductos > " + Arrays.toString(productoService.getProductos()));

	}

}

package abstract_factory_web.service.impl;

import abstract_factory_web.service.IEmpleadoService;

public class EmpleadoServiceRestImpl implements IEmpleadoService {

	private static final String[] EMPLEADOS = new String[] { "Juan", "Pedro", "Manuel" };

	public String[] getEmpleados() {
		System.out.println("API REST EMPLEADOS");
		return EMPLEADOS;
	}

}

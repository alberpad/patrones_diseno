package abstract_factory_web.service.impl;

import abstract_factory_web.service.IEmpleadoService;

public class EmpleadoServiceWSImpl implements IEmpleadoService {

	private static final String[] EMPLEADOS = new String[] { "Maria", "Rebeca", "Liliana" };

	public String[] getEmpleados() {
		System.out.println("WEB SERVICE EMPLEADOS");
		return EMPLEADOS;
	}

}

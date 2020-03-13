package builder_empleado;

import builder_empleado.dto.Empleado;

public class ConstructorMain {

	public static void main(String[] args) {
		Empleado empleado = new Empleado.ConstructorEmpleado().setNombre("Alberto Padrón")
				.setGenero("Hombre").setEdad(43)
				.setDireccion("Alcalde Juan A. Arencibia, 5, 8", "Arucas", "España", "35400")
				.addContactos("Néstor Padrón", "123456789", "123", "Casa")
				.addContactos("Marta Padrón", "456465465", null, "Movil", "Alcalde Ponce", "Arucas",
						"España", "35400")
				.addTelefonos("928633221", "1", "Casa").addTelefonos("686969718", null, "Movil")
				.construye();
		System.out.println(empleado);

	}

}

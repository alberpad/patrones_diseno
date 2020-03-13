package builder_empleado.dto;

import java.util.ArrayList;
import java.util.List;

import builder_empleado.IConstructor;

public class Empleado {

	private String nombre;
	private int edad;
	private String genero;
	private Direccion direccion;
	private List<Telefono> telefonos;
	private List<Contacto> contactos;

	public Empleado(String nombre, int edad, String genero, Direccion direccion,
			List<Telefono> telefonos, List<Contacto> contactos) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.direccion = direccion;
		this.telefonos = telefonos;
		this.contactos = contactos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public List<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(List<Contacto> contactos) {
		this.contactos = contactos;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero
				+ ", direccion=" + direccion + ", telefonos=" + telefonos + ", contactos="
				+ contactos + "]";
	}

	public static class ConstructorEmpleado implements IConstructor<Empleado> {

		private String nombre;
		private int edad;
		private String genero;
		private Direccion direccion;
		private final List<Telefono> telefonos = new ArrayList<Telefono>();
		private final List<Contacto> contactos = new ArrayList<Contacto>();

		public ConstructorEmpleado() {
		}

		public ConstructorEmpleado setNombre(String nombre) {
			this.nombre = nombre;
			return this;
		}

		public ConstructorEmpleado setEdad(int edad) {
			this.edad = edad;
			return this;
		}

		public ConstructorEmpleado setGenero(String genero) {
			this.genero = genero;
			return this;
		}

		public ConstructorEmpleado setDireccion(String calle, String ciudad, String pais,
				String cp) {
			direccion = new Direccion(calle, ciudad, pais, cp);
			return this;
		}

		public ConstructorEmpleado addTelefonos(String phoneNumber, String ext, String phoneType) {
			telefonos.add(new Telefono(phoneNumber, ext, phoneType));
			return this;
		}

		public ConstructorEmpleado addContactos(String nombre, String numeroTelefono, String ext,
				String tipoTelefono, String calle, String ciudad, String pais, String cp) {
			contactos.add(new Contacto(nombre, new Telefono(numeroTelefono, ext, tipoTelefono),
					new Direccion(calle, ciudad, pais, cp)));
			return this;
		}

		public ConstructorEmpleado addContactos(String nombre, String numeroTelefono, String ext,
				String tipoTelefono) {
			contactos.add(new Contacto(nombre, new Telefono(numeroTelefono, ext, tipoTelefono)));
			return this;
		}

		public Empleado construye() {
			return new Empleado(nombre, edad, genero, direccion, telefonos, contactos);
		}

	}

}

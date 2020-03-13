package builder_documentacion;

// DIRECTOR - BUILDER
public class Vendedor {

	protected ConstructorDocumentacionVehiculo constructor;

	// Inyectamos por dependdecia el constructor, no lo crea el Vendedor
	// También se puede inyectar por setter
	public Vendedor(ConstructorDocumentacionVehiculo constructor) {
		this.constructor = constructor;
	}

	public Documentacion construye(String nombreCliente) {
		constructor.construyeSolicitudPedido(nombreCliente);
		constructor.construyeSolicitudMatriculacion(nombreCliente);
		return constructor.getDocumentacion();
	}

}

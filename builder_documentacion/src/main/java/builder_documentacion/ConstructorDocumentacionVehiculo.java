package builder_documentacion;

public abstract class ConstructorDocumentacionVehiculo {

	protected Documentacion documentacion;

	public abstract void construyeSolicitudPedido(String nombreCliente);

	public abstract void construyeSolicitudMatriculacion(String nombreSolicitante);

	public Documentacion getDocumentacion() {
		return documentacion;
	}

}

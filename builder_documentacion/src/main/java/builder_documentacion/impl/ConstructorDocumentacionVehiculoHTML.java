package builder_documentacion.impl;

import builder_documentacion.ConstructorDocumentacionVehiculo;

public class ConstructorDocumentacionVehiculoHTML extends ConstructorDocumentacionVehiculo {

	public ConstructorDocumentacionVehiculoHTML() {
		documentacion = new DocumentacionHTML();
	}

	@Override
	public void construyeSolicitudPedido(String nombreCliente) {
		String documento;
		documento = "<HTML>Solicitud de pedido Cliente: " + nombreCliente + "</HTML>";
		documentacion.agregaDocumento(documento);
	}

	@Override
	public void construyeSolicitudMatriculacion(String nombreSolicitante) {
		String documento;
		documento = "<HTML>Solicitud de matriculación de: " + nombreSolicitante + "</HTML>";
		documentacion.agregaDocumento(documento);
	}

}

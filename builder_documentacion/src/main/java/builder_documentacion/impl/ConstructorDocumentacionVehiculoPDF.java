package builder_documentacion.impl;

import builder_documentacion.ConstructorDocumentacionVehiculo;

public class ConstructorDocumentacionVehiculoPDF extends ConstructorDocumentacionVehiculo {

	public ConstructorDocumentacionVehiculoPDF() {
		documentacion = new DocumentacionPDF();
	}

	@Override
	public void construyeSolicitudPedido(String nombreCliente) {
		String documento;
		documento = "<PDF>Solicitud de pedido Cliente: " + nombreCliente + "</PDF>";
		documentacion.agregaDocumento(documento);
	}

	@Override
	public void construyeSolicitudMatriculacion(String nombreSolicitante) {
		String documento;
		documento = "<PDF>Solicitud de matriculación de: " + nombreSolicitante + "</PDF>";
		documentacion.agregaDocumento(documento);
	}

}

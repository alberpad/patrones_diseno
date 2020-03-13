package builder_documentacion.impl;

import builder_documentacion.Documentacion;

public class DocumentacionPDF extends Documentacion {

	@Override
	public void agregaDocumento(String documento) {

		if (documento.startsWith("<PDF>")) {
			contenido.add(documento);
		}
	}

	@Override
	public void imprime() {
		System.out.println("Documentación PDF");
		for (String s : contenido) {
			System.out.println(s);
		}
	}

}

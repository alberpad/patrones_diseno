package builder_documentacion.impl;

import builder_documentacion.Documentacion;

public class DocumentacionHTML extends Documentacion {

	@Override
	public void agregaDocumento(String documento) {

		if (documento.startsWith("<HTML>")) {
			contenido.add(documento);
		}
	}

	@Override
	public void imprime() {
		System.out.println("Documentación HTML");
		for (String s : contenido) {
			System.out.println(s);
		}

	}

}

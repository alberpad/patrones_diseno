package builder_documentacion;

import java.util.Scanner;

import builder_documentacion.impl.ConstructorDocumentacionVehiculoHTML;
import builder_documentacion.impl.ConstructorDocumentacionVehiculoPDF;

public class ClienteVehiculoMain {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ConstructorDocumentacionVehiculo constructor;
		System.out.println("(1) Generar documentacion HTML\n\r(2) Generar documentaci�n PDF");
		String seleccion = reader.next();
		if (seleccion.equals("1")) {
			constructor = new ConstructorDocumentacionVehiculoHTML();
		} else {
			constructor = new ConstructorDocumentacionVehiculoPDF();
		}
		Vendedor vendedor = new Vendedor(constructor);
		Documentacion documentacion = vendedor.construye("Alberto Padr�n");
		documentacion.imprime();
		reader.close();
	}

}

package abstract_factory_vehiculos.impl;

import abstract_factory_vehiculos.Automovil;

public class AutomovilGasolina extends Automovil {

	public AutomovilGasolina(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Automovil gasolina [modelo=" + modelo + ", color=" + color
				+ ", potencia=" + potencia + ", espacio=" + espacio + "]");
	}

}

package abstract_factory_vehiculos.impl;

import abstract_factory_vehiculos.Automovil;

public class AutomovilElectricidad extends Automovil {

	public AutomovilElectricidad(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Automovil eléctrico [modelo=" + modelo + ", color=" + color
				+ ", potencia=" + potencia + ", espacio=" + espacio + "]");
	}

}

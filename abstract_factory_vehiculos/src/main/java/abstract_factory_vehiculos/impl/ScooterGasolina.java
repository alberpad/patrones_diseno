package abstract_factory_vehiculos.impl;

import abstract_factory_vehiculos.Scooter;

public class ScooterGasolina extends Scooter {

	public ScooterGasolina(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Scooter gasolina [modelo=" + modelo + ", color=" + color + ", potencia="
				+ potencia + "]");
	}

}

package abstract_factory_vehiculos.impl;

import abstract_factory_vehiculos.Scooter;

public class ScooterElectricidad extends Scooter {

	public ScooterElectricidad(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Scooter eléctrico [modelo=" + modelo + ", color=" + color
				+ ", potencia=" + potencia + "]");
	}

}

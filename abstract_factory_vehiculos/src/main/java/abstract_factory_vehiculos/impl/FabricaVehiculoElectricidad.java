package abstract_factory_vehiculos.impl;

import abstract_factory_vehiculos.Automovil;
import abstract_factory_vehiculos.FabricaVehiculo;
import abstract_factory_vehiculos.Scooter;

public class FabricaVehiculoElectricidad implements FabricaVehiculo {

	public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
		return new AutomovilElectricidad(modelo, color, potencia, espacio);
	}

	public Scooter creaScooter(String modelo, String color, int potencia) {

		return new ScooterElectricidad(modelo, color, potencia);
	}

}

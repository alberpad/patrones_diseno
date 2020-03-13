package abstract_factory_vehiculos;

public interface FabricaVehiculo {

	Automovil creaAutomovil(String modelo, String color, int potencia, double eapacio);

	Scooter creaScooter(String modelo, String color, int potencia);

}

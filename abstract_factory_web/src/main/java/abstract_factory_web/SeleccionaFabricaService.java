package abstract_factory_web;

import java.util.Properties;

import abstract_factory_web.service.IFabricaService;
import abstract_factory_web.util.PropertiesUtil;

public class SeleccionaFabricaService {

	public SeleccionaFabricaService() {
	}

	public static IFabricaService crearFabricaService() {
		Properties props = PropertiesUtil.loadProperty(
				"abstract_factory_web/configuracion/AbstractFactoryConfiguration.properties");
		String factoryClass = props.getProperty("serviceProductImplClass");
		try {
			return (IFabricaService) Class.forName(factoryClass).getDeclaredConstructor()
					.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}

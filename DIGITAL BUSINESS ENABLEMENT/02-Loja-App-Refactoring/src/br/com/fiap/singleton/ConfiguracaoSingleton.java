package br.com.fiap.singleton;

import java.util.Properties;

public class ConfiguracaoSingleton {
	
	private static Properties prop;
	
	private ConfiguracaoSingleton() {}

	public static Properties getInstance() {
		if(prop == null) {
			prop = new Properties();
			try {
				prop.load(ConfiguracaoSingleton.class.getResourceAsStream("/configuracao.properties"));
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return prop;
	}
	
}

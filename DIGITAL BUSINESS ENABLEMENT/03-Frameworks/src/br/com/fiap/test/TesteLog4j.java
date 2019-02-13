package br.com.fiap.test;

import org.apache.log4j.Logger;
import br.com.fiap.singleton.ConfiguracaoSingleton;

public class TesteLog4j {
	
	private static Logger log = Logger.getLogger(TesteLog4j.class);
	
	public static void main(String[] args) {
		
		log.info("Iniciando a aplicação");
		
		// Recuperar a configuração de idioma
		String idioma = ConfiguracaoSingleton.getInstance().getProperty("idioma");
		
		log.warn("Recuperando a configuração do sistema");
		
		System.out.println(idioma);
		

	}

}

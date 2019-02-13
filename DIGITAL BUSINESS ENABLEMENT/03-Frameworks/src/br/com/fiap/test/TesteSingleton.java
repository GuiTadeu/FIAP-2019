package br.com.fiap.test;

import br.com.fiap.singleton.ConfiguracaoSingleton;

public class TesteSingleton {

	public static void main(String[] args) {
		
		// Recuperar a configuração de idioma
		String idioma = ConfiguracaoSingleton.getInstance().getProperty("idioma");
		System.out.println(idioma);

	}

}

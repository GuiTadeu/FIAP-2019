package br.com.fiap.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.fiap.beans.Produto;

class TesteProduto {
	
	Produto produto = new Produto(40, 1.80);

	@Test
	public void testeSetPeso() {
		int resultadoEsperado = 8;
		produto.setPeso(8);
		assertEquals(resultadoEsperado, produto.getPeso());
	}
	
	@Test
	public void testeGetPeso() {
		assertEquals(40, produto.getPeso());
	}
	
	@Test
	public void testeSetAltura() {
		int resultadoEsperado = 8;
		produto.setAltura(1.80);
		assertEquals(resultadoEsperado, produto.getAltura());
	}
	
	@Test
	public void testeGetAltura() {
		assertEquals(40, produto.getAltura());
	}

}

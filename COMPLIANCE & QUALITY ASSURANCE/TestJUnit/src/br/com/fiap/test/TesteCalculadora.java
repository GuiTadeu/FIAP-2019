package br.com.fiap.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import br.com.fiap.beans.Calculadora;

class TesteCalculadora {
	
	Calculadora calc = new Calculadora();
	int n1 = 8;
	int n2 = 2;

	@Test
	public void testeSomar() {
		int resultadoEsperado = 10;
		int resultadoReal = calc.somar(n1, n2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testeSubtrair() {
		int resultadoEsperado = 6;
		int resultadoReal = calc.subtrair(n1, n2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testeMultiplicar() {
		int resultadoEsperado = 16;
		int resultadoReal = calc.multiplicar(n1, n2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testeDividir() {
		int resultadoEsperado = 4;
		int resultadoReal = calc.dividir(n1, n2);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
}

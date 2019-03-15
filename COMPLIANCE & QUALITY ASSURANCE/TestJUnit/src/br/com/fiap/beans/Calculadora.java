package br.com.fiap.beans;

public class Calculadora{

	private int resultado = 0;
	
	public int somar(int n1, int n2){
		resultado = n1 + n2; 
		return resultado;
	}
	
	public int subtrair(int n1, int n2 ){
		resultado = n1 - n2; 
		return resultado; 
	}
	
	public int multiplicar( int n1, int n2 ){
		resultado = n1 * n2; 
		return resultado;
	}

	public int dividir( int n1, int n2 ){
		resultado = n1 / n2; 
		return resultado;
	}
}
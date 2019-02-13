package br.com.fiap.bean;

import java.util.Calendar;

public abstract class Conta {
	
	private int agencia;
	private int numero;
	private Calendar dataAbertura;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int agencia, int numero, Calendar dataAbertura) {
		this.agencia = agencia;
		this.numero = numero;
		this.dataAbertura = dataAbertura;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void retirar(double valor) throws Exception{
		if(valor < this.saldo) {
			this.saldo -= valor;
		}
	}

	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public Calendar getDataAbertura() {
		return dataAbertura;
	}
	
	public double getSaldo() {
		return saldo;
	}

}

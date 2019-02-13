package br.com.fiap.bean;

import java.util.Calendar;

public class ContaCorrente extends Conta{
	TipoConta tipo;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(int agencia, int numero, Calendar dataAbertura, TipoConta tipo) {
		super(agencia, numero, dataAbertura);
		this.tipo = tipo;
	}
	
	@Override
	public void retirar(double valor) throws Exception{

		if(tipo == TipoConta.COMUM && valor < this.getSaldo()) {
			super.retirar(valor);
		} else {
			throw new Exception("[ERROR]: VALOR DE SAQUE MAIOR QUE SALDO");
		}
	}
}

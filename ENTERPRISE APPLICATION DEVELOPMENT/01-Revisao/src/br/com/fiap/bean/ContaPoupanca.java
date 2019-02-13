package br.com.fiap.bean;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento{
	
	private static final float RENDIMENTO = 5f;
	private float taxa;
	
	public ContaPoupanca() {
		
	}
	
	public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, float taxa) {
		super(agencia, numero, dataAbertura);
		this.taxa = taxa;
	}
	
	@Override
	public void retirar(double valor) throws Exception{
		if(valor < this.getSaldo()) {
			super.retirar(valor + taxa);
		} else {
			throw new Exception("[ERROR]: VALOR DE SAQUE MAIOR QUE SALDO");
		}
	}
		
	@Override
	public double calculaRetornoInvestimento() {
		return this.getSaldo() * RENDIMENTO;
	}
	
}

package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(123, 321, Calendar.getInstance(), TipoConta.COMUM);
		
		cc.depositar(100);
		
		try {
			cc.retirar(110);
		} catch(Exception e) {
			System.out.println(e);
		}
		
		ContaPoupanca cp = new ContaPoupanca(234, 432, Calendar.getInstance(), 2f);
		
		cp.depositar(100);
		
		try {
			cp.retirar(10);
		} catch(Exception e) {
			System.out.println(e);
		}
		
		ArrayList<ContaCorrente> ccList = new ArrayList<ContaCorrente>();
		ArrayList<ContaPoupanca> cpList = new ArrayList<ContaPoupanca>();
		
		ccList.add(cc);
		cpList.add(cp);
		
		System.out.println("------------------------");
		System.out.println("CONTA CORRENTE          ");
		System.out.println("------------------------");
		
		for (ContaCorrente contaCorrente : ccList) {
			System.out.println(contaCorrente.getAgencia());
			System.out.println(contaCorrente.getNumero());
			System.out.println(contaCorrente.getSaldo());
			System.out.println(contaCorrente.getDataAbertura());
		}
		
		System.out.println("------------------------");
		System.out.println("CONTA POUPANÇA          ");
		System.out.println("------------------------");
		
		for (ContaPoupanca contaPoupanca : cpList) {
			System.out.println(contaPoupanca.getAgencia());
			System.out.println(contaPoupanca.getNumero());
			System.out.println(contaPoupanca.getSaldo());
			System.out.println(contaPoupanca.getDataAbertura());
			System.out.println(contaPoupanca.calculaRetornoInvestimento());
		}
	}
}

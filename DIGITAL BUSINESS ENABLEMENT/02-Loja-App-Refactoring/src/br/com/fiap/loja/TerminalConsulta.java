package br.com.fiap.loja;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import br.com.fiap.bo.EstoqueBO;
import br.com.fiap.singleton.ConfiguracaoSingleton;
import br.com.fiap.to.ProdutoTO;

public class TerminalConsulta {
	
	public static void main(String[] args) {
		
		int codigo;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		EstoqueBO bo = new EstoqueBO();
		String nome = ConfiguracaoSingleton.getInstance().getProperty("nome");
		
		do {
		
		System.out.println(nome + " | " +  sdf.format(Calendar.getInstance().getTime()));
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o código da Camisa: ");
		codigo = input.nextInt();
		ProdutoTO to = bo.consultarProduto(codigo);
		
		if(to != null)
			System.out.println(to);
		else
			System.out.println("PRODUTO NÃO ENCONTRADO!\n");
		} while(codigo != 0);
	}
}
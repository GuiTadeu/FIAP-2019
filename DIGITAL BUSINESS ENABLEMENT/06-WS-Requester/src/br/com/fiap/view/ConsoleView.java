package br.com.fiap.view;

import java.util.Scanner;

import br.com.fiap.bo.EstoqueBOStub;
import br.com.fiap.bo.EstoqueBOStub.ConsultarProduto;
import br.com.fiap.bo.EstoqueBOStub.ConsultarProdutoResponse;
import br.com.fiap.bo.EstoqueBOStub.ProdutoTO;

public class ConsoleView {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Criar o objeto que acessa o Web Service
		try {
		EstoqueBOStub stub = new EstoqueBOStub();
		ConsultarProduto produto = new ConsultarProduto();
		
		System.out.print("Digite o código: ");
		produto.setCodProduto(input.nextInt());
		
		// Chama o Web Service
		ConsultarProdutoResponse resp = stub.consultarProduto(produto);
		ProdutoTO produtoTo = resp.get_return();
		
		System.out.println("A camisa é " + produtoTo.getDescricao());
			
		} catch(Exception e) {
			System.out.println("Por favor, tente mais tarde!");
			e.printStackTrace();
		}
		
		input.close();
		
	}

}

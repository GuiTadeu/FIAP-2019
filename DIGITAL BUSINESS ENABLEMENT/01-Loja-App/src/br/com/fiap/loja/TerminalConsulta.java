package br.com.fiap.loja;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class TerminalConsulta {

	public static void main(String[] args) {

		int codigo;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("FIAPSTORE: " + sdf.format(Calendar.getInstance().getTime()));

		Scanner input = new Scanner(System.in);
		System.out.print("Digite o código da Camisa: ");
		codigo = input.nextInt();

		switch (codigo) {
			case 401:
				System.out.println("CAMISETA BRANCA");;
	
			case 402:
				System.out.println("CAMISETA AZUL");
	
			case 403:
				System.out.println("CAMISETA ROSA");
	
			default:
				System.out.println("PRODUTO NÃO ENCONTRADO");
		}

	}
}
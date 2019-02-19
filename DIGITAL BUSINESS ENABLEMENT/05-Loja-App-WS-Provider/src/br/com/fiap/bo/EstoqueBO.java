package br.com.fiap.bo;

import br.com.fiap.to.ProdutoTO;

public class EstoqueBO {
	
	public ProdutoTO consultarProduto(int codProduto) {
		
		switch(codProduto) {
			case 401:
				return new ProdutoTO(401, 10, 5, "CAMISETA BRANCA");
				
			case 402:
				return new ProdutoTO(402, 10, 5, "CAMISETA AZUL");
				
			case 403:
				return new ProdutoTO(403, 10, 5, "CAMISETA ROSA");
				
			default:
				return new ProdutoTO();
		}
	}
}
package br.com.fiap.dao;

import br.com.fiap.entity.Fornecedor;
import br.com.fiap.exception.CodigoInexistenteException;
import br.com.fiap.exception.CommitException;

public interface FornecedorDAO {
	
	void gravar(Fornecedor fornecedor);
	
	void remover(int codigo) throws CodigoInexistenteException;
	
	Fornecedor consultar(int codigo);
	
	void alterar(Fornecedor fornecedor);
	
	void commit() throws CommitException;
	

}

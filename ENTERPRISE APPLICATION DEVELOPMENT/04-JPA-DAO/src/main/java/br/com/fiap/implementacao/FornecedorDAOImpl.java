package br.com.fiap.implementacao;

import javax.persistence.EntityManager;

import br.com.fiap.dao.FornecedorDAO;
import br.com.fiap.entity.Fornecedor;
import br.com.fiap.exception.CodigoInexistenteException;
import br.com.fiap.exception.CommitException;

public class FornecedorDAOImpl implements FornecedorDAO{
	
	private EntityManager manager;
	
	public FornecedorDAOImpl(EntityManager manager) {
		this.manager = manager;
	}

	public void gravar(Fornecedor fornecedor) {
		manager.persist(fornecedor);
	}

	public void remover(int codigo) throws CodigoInexistenteException {
		Fornecedor f = manager.find(Fornecedor.class, codigo);
		if(f == null) {
			throw new CodigoInexistenteException("Código não existe!");
		}
		
		manager.remove(f);
	}

	public Fornecedor consultar(int codigo) {
		Fornecedor busca = manager.find(Fornecedor.class, codigo);
		return busca;
	}

	public void alterar(Fornecedor fornecedor) {
		manager.merge(fornecedor);
	}

	public void commit() throws CommitException{
		try {
			manager.getTransaction().begin();
			manager.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			manager.getTransaction().rollback();
			throw new CommitException("Erro no commit!");
		}
		
	}
	

}

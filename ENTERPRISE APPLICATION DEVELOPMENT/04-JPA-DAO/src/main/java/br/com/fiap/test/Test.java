package br.com.fiap.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.FornecedorDAO;
import br.com.fiap.entity.Fornecedor;
import br.com.fiap.entity.TipoFornecedor;
import br.com.fiap.exception.CodigoInexistenteException;
import br.com.fiap.exception.CommitException;
import br.com.fiap.implementacao.FornecedorDAOImpl;

public class Test {

	public static void main(String[] args) throws CodigoInexistenteException {
		
		EntityManagerFactory factory =
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager manager = factory.createEntityManager();
		FornecedorDAO dao = new FornecedorDAOImpl(manager);
		
		// Cadastrar um Fornecedor
		Fornecedor f = new Fornecedor("Ambev", 466543, TipoFornecedor.ATACADO);
		
		try {
			dao.gravar(f);
			dao.commit();
			System.out.println("Fornecedor cadastrado!");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Erro no cadastro!");
		}
		
		// Buscar um Fornecedor
		Fornecedor busca = dao.consultar(1);
		
		// Atualizar um Fornecedor
		try {
			busca.setNome("Zorro");
			dao.alterar(busca);
			dao.commit();
			System.out.println("Fornecedor Atualizado!");
		} catch(CommitException e) {
			e.printStackTrace();
			System.out.println("Erro na Atualização!");
		}
		
		// Remover um fornecedor
		try {
			dao.remover(1);
			dao.commit();
			System.out.println("Fornecedor Removido!");
		} catch(CodigoInexistenteException e) {
			System.out.println("Código Inexistente");
			e.printStackTrace();
		} catch(CommitException e) {
			System.out.println("Erro no commit");
			e.printStackTrace();
		}
		
		manager.close();

	}

}

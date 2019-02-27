package br.com.fiap.dao;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.fiap.dao.impl.LivroDAOImpl;
import br.com.fiap.entity.Genero;
import br.com.fiap.entity.Livro;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class LivroDAOTest {
	
	private static LivroDAO dao;
	
	@BeforeClass
	public static void init() {
		// Instanciar os objetos
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		dao = new LivroDAOImpl(em);
	}
	
	@Test
	public void buscaTest() {
		Livro livro = dao.buscar(1);
		
		if(livro == null) {
			fail();
		}
	}
	
	@Test
	public void cadastroTest() {
		
		
		Livro livro = new Livro("Harry Potter", Calendar.getInstance(), Genero.FANTASIA, 500);
		
		// Chamar o método de cadastrar
		try {
			dao.cadastrar(livro);
			dao.commit();
		} catch(CommitException e) {
			e.printStackTrace();
			fail();
		}
		
		// Validar se deu certo
		assertNotEquals(0, livro.getCodigo());
	}

}

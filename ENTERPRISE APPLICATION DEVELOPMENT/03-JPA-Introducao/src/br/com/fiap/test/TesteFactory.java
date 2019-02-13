package br.com.fiap.test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Funcionario;
import br.com.fiap.entity.Nivel;

public class TesteFactory {
	
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		EntityManager em = fabrica.createEntityManager();
		
		Funcionario func = new Funcionario("Guilherme", 1000, new GregorianCalendar(2010, Calendar.APRIL, 2),
				null, Nivel.ESTAGIO);
		
		// CADASTRANDO
		em.persist(func);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		// PESQUISA POR CÓDIGO
		Funcionario busca = em.find(Funcionario.class, 1);
		System.out.println("BUSCA:");
		System.out.println("---------------------");
		System.out.println(busca.toString());
		
		// ATUALIZAÇÃO
		busca.setNome("Guilherme Tadeu");
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		Funcionario atualizacao = new Funcionario("Jack", 1000, Calendar.getInstance(),
				null, Nivel.SENIOR);
		
		em.merge(atualizacao);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		// Remoção
		Funcionario rmf = em.find(Funcionario.class, 5);
		em.remove(rmf);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		fabrica.close();
	}
	
}

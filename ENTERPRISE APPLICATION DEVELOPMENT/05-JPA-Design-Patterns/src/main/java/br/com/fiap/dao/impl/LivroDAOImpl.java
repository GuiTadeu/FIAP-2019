package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.LivroDAO;
import br.com.fiap.entity.Livro;
import br.com.fiap.exception.CommitException;

public class LivroDAOImpl extends GenericDAOImpl<Livro, Integer> implements LivroDAO {
	public LivroDAOImpl(EntityManager em) {
		super(em);
	}

}

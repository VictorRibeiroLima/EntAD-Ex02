package br.com.fiap.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GenericDAO;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.SearchNotFoundException;

public class GenericDAOimpl<T,K> implements GenericDAO<T,K> {
	private EntityManager em;
	public Class<T> clazz;
	@SuppressWarnings("all")
	public GenericDAOimpl(EntityManager em) {
		this.em=em;
		this.clazz=(Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	public void creat(T entity) {
		// TODO Auto-generated method stub
		em.persist(entity);
	}

	public T recover(K key) throws SearchNotFoundException {
		// TODO Auto-generated method stub
		T entity =em.find(clazz, key);
		if(entity == null)
			throw new SearchNotFoundException("This primary key doesn't exist");
		return entity;
	}

	public void update(T entity) {
		// TODO Auto-generated method stub
		em.merge(entity);
	}

	public void delete(K key) throws SearchNotFoundException {
		// TODO Auto-generated method stub
		em.remove(recover(key));
	}

	public void commit() throws CommitException {
		// TODO Auto-generated method stub
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();
			throw new CommitException();
		}
	}

}

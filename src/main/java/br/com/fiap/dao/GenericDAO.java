package br.com.fiap.dao;

import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.SearchNotFoundException;

public interface GenericDAO<T,K> {
	public void creat(T entity);
	public T recover(K key) throws SearchNotFoundException;
	public void update(T entity);
	public void delete(K key) throws SearchNotFoundException;
	public void commit() throws CommitException;
	
}

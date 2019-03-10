package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Driver;

public class DriverDAOimpl extends GenericDAOimpl<Driver,Integer> {

	public DriverDAOimpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}

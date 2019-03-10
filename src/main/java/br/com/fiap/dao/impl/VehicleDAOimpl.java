package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Vehicle;

public class VehicleDAOimpl extends GenericDAOimpl<Vehicle, Integer> {

	public VehicleDAOimpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}

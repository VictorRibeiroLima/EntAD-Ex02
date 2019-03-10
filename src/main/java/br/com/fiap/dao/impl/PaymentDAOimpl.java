package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Payment;

public class PaymentDAOimpl extends GenericDAOimpl<Payment, Integer> {

	public PaymentDAOimpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}

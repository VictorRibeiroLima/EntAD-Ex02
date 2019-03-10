package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {
	private static EntityManagerFactory em = null;
	private EntityManagerFactorySingleton() {
	}
	public static EntityManagerFactory getInstance(String server) {
		if(em == null) {
			em = Persistence.createEntityManagerFactory(server);
		}
		return em;
	}
}

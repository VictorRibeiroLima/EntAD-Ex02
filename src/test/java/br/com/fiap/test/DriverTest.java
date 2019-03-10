package br.com.fiap.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.com.fiap.dao.impl.DriverDAOimpl;
import br.com.fiap.entity.Driver;
import br.com.fiap.entity.Gender;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class DriverTest {

	@Test
	public void test() {
		EntityManager em = EntityManagerFactorySingleton.getInstance("teste").createEntityManager();
		Driver driver = new Driver();
		driver.setGender(Gender.M);
		driver.setName("Victor Ribeiro de Lima");
		driver.setBirthday(new GregorianCalendar(1999,Calendar.APRIL,11));
		DriverDAOimpl dao = new DriverDAOimpl(em);
		dao.creat(driver);
		try {
			dao.commit();
		}catch(CommitException e) {
			e.printStackTrace();
			fail("Test Fail");
		}
		assertNotEquals(driver.getId(),0);
	}
	
}

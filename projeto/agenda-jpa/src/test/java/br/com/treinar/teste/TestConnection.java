package br.com.treinar.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

public class TestConnection {

	@Test
	public void testConnection() {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("agenda-jpa");
		EntityManager em = factory.createEntityManager();
		
		System.out.println(em);
	}

}

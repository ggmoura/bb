package br.com.treinar.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.treinar.jpa.agenda.modelo.Endereco;

public class TestLoadEndereco {

	private EntityManager em;

	@Before
	public void init() {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("agenda-jpa");
		em = factory.createEntityManager();
	}

	@Test
	public void testCreateContato() {
		Endereco e = em.find(Endereco.class, 1);
		Assert.assertNotNull(e);
		System.out.println(e);
	}

	@After
	public void finish() {
		em.close();
	}

}

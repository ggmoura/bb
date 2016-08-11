package br.com.treinar.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Hibernate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.treinar.jpa.agenda.modelo.Contato;
import br.com.treinar.jpa.agenda.modelo.Telefone;

public class TestSelectContato {

	private EntityManager em;

	@Before
	public void init() {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("agenda-jpa");
		em = factory.createEntityManager();
	}

	@Test
	public void testCreateContato() {
		em.getTransaction().begin();
		Contato c = em.find(Contato.class, 1L);
		System.out.println(c);
		Hibernate.initialize(c.getTelefones());
		em.getTransaction().commit();
		em.close();
	}

	@After
	public void finish() {
		em.close();
	}

	
}

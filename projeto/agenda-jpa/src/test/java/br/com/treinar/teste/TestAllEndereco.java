package br.com.treinar.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Assert;
import org.junit.Test;

import br.com.treinar.jpa.agenda.modelo.Endereco;

public class TestAllEndereco {

	@Test
	public void testConnection() {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("agenda-jpa");
		EntityManager em = factory.createEntityManager();
		
		Endereco e = new Endereco();
		e.setBairro("Calafate");
		e.setComplemento("apt 102");
		e.setLogradouro("Rua da paz");
		e.setNumero(202);
		
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		
		Assert.assertNotNull(e.getId());
		
	}

}

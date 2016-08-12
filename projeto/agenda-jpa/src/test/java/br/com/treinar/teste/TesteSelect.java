package br.com.treinar.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.junit.Assert;
import org.junit.Test;

import br.com.treinar.jpa.agenda.modelo.Endereco;

public class TesteSelect {

	@Test
	public void testSelectEndereco() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda-jpa");
		EntityManager em = factory.createEntityManager();
		
		StringBuilder jpql = new StringBuilder();
		jpql.append("select e from Address e where e.id = :id");
		TypedQuery<Endereco> query = em.createQuery(jpql.toString(), Endereco.class);
		query.setParameter("id", 1);
		Endereco e = query.getSingleResult();
		System.out.println(e);
		Assert.assertEquals(e.getBairro().toLowerCase(), "calafate");
	
		query = em.createNamedQuery(Endereco.EnderecoConstante.LIST_KEY, Endereco.class);
		List<Endereco> enderecos = query.getResultList();
		Assert.assertTrue(enderecos.size() > 0);
	}
	
}

package br.com.treinar.teste;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.treinar.jpa.agenda.modelo.Contato;
import br.com.treinar.jpa.agenda.modelo.ContatoTelefone;
import br.com.treinar.jpa.agenda.modelo.Endereco;
import br.com.treinar.jpa.agenda.modelo.Telefone;
import br.com.treinar.jpa.agenda.modelo.TipoTelefone;

public class TestContato {

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

		Endereco e = new Endereco();
		e.setBairro("Calafate");
		e.setComplemento("apt 102");
		e.setLogradouro("Rua da paz");
		e.setNumero(202);

		Contato c = new Contato();
		c.setNome("Isabela");
		c.setDataNascimento(new Date());
		c.setEmail("isabela@bela.com");

		Telefone t1 = new Telefone();
		t1.setDdi(55);
		t1.setDdd(31);
		t1.setNumero(987749131);
		t1.setTipo(TipoTelefone.CELULAR);
		//t1.setContato(c);

		Telefone t2 = new Telefone();
		t2.setDdi(55);
		t2.setDdd(31);
		t2.setNumero(25359131);
		t2.setTipo(TipoTelefone.FIXO);
		
		ContatoTelefone ct1 = new ContatoTelefone();
		ct1.setContato(c);
		ct1.setTelefone(t1);
		
		ContatoTelefone ct2 = new ContatoTelefone();
		ct2.setContato(c);
		ct2.setTelefone(t2);
		
		c.setTelefones(new ArrayList<ContatoTelefone>());
		c.getTelefones().add(ct1);
		c.getTelefones().add(ct2);
		
		
		
		c.setEndereco(e);
		em.persist(c);
		em.getTransaction().commit();
	}

	@After
	public void finish() {
		em.close();
	}

}

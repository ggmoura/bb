package br.com.treinar.jpa.agenda.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-08-11T20:05:42.303-0300")
@StaticMetamodel(Contato.class)
public class Contato_ {
	public static volatile SingularAttribute<Contato, Long> id;
	public static volatile SingularAttribute<Contato, String> nome;
	public static volatile SingularAttribute<Contato, String> email;
	public static volatile SingularAttribute<Contato, Endereco> endereco;
	public static volatile SingularAttribute<Contato, Date> dataNascimento;
	public static volatile ListAttribute<Contato, ContatoTelefone> telefones;
}

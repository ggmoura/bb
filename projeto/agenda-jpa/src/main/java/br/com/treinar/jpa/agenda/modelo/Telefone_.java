package br.com.treinar.jpa.agenda.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-08-11T20:06:11.034-0300")
@StaticMetamodel(Telefone.class)
public class Telefone_ {
	public static volatile SingularAttribute<Telefone, Long> id;
	public static volatile SingularAttribute<Telefone, Integer> ddi;
	public static volatile SingularAttribute<Telefone, Integer> ddd;
	public static volatile SingularAttribute<Telefone, Integer> numero;
	public static volatile ListAttribute<Telefone, ContatoTelefone> contatos;
	public static volatile SingularAttribute<Telefone, TipoTelefone> tipo;
}

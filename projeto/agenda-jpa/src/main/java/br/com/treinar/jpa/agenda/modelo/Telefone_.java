package br.com.treinar.jpa.agenda.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-08-10T22:22:31.690-0300")
@StaticMetamodel(Telefone.class)
public class Telefone_ {
	public static volatile SingularAttribute<Telefone, Long> id;
	public static volatile SingularAttribute<Telefone, Integer> ddi;
	public static volatile SingularAttribute<Telefone, Integer> ddd;
	public static volatile SingularAttribute<Telefone, Integer> numero;
	public static volatile SingularAttribute<Telefone, TipoTelefone> tipo;
	public static volatile SingularAttribute<Telefone, Contato> contato;
}

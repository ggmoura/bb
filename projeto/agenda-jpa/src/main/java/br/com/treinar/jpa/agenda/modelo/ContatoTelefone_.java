package br.com.treinar.jpa.agenda.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-08-11T20:10:53.503-0300")
@StaticMetamodel(ContatoTelefone.class)
public class ContatoTelefone_ {
	public static volatile SingularAttribute<ContatoTelefone, Long> id;
	public static volatile SingularAttribute<ContatoTelefone, Contato> contato;
	public static volatile SingularAttribute<ContatoTelefone, Telefone> telefone;
	public static volatile SingularAttribute<ContatoTelefone, Date> dataCriacao;
}

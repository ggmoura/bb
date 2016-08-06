package br.com.treinarminas.agenda.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinarminas.agenda.modelo.Contato;
import br.com.treinarminas.agenda.modelo.Endereco;
import br.com.treinarminas.agenda.modelo.Telefone;
import br.com.treinarminas.agenda.util.AgendaUtil;

public class CreateContactController implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		Contato contato = new Contato();
		contato.setNome(request.getParameter("nome"));
		contato.setEmail(request.getParameter("email"));
		contato.setTelefone(new Telefone());
		contato.getTelefone().setDdi(Integer.parseInt(request.getParameter("ddi")));
		contato.getTelefone().setDdd(Integer.parseInt(request.getParameter("ddd")));
		contato.getTelefone().setNumero(Integer.parseInt(request.getParameter("numero")));
		contato.setEndereco(new Endereco());
		contato.getEndereco().setLogradouro("logradouro");
		contato.getEndereco().setComplemento("complemento");
		contato.getEndereco().setNumero(Integer.valueOf(request.getParameter("numero")));
		contato.getEndereco().setBairro("bairro");
		
		List<Contato> contatos = AgendaUtil.getInstance().getContatos();
		contatos.add(contato);
		
		AccessListContactController lista = new AccessListContactController();
		return lista.execute(request, response);
		
	}

}

package br.com.treinarminas.agenda.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinarminas.agenda.util.AgendaUtil;

public class AccessListContactController implements ICommand {
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		request.setAttribute("contatos", AgendaUtil.getInstance().getContatos());
		
		return "/pages/listaContato.jsp";
	}

}

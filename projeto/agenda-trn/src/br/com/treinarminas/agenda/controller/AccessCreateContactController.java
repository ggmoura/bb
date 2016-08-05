package br.com.treinarminas.agenda.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AccessCreateContactController implements ICommand {
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		return "/pages/cadastroContato.jsp";
	}

}

package br.com.treinarminas.agenda.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ICommand {
	
	/**
	 * 
	 * @param request
	 * @param response
	 * @return - pagina jsp a ser acessada qdo o metodo for executado
	 */
	String execute(HttpServletRequest request, HttpServletResponse response);
	
}

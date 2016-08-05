package br.com.treinarminas.agenda.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("*.trn")
public class ServletController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String commandStr = request.getParameter("command");
		try {
			ICommand command = (ICommand) Class.forName(commandStr).newInstance();
			command.execute(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

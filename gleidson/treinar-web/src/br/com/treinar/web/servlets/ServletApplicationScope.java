package br.com.treinar.web.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletApplicationScope
 */
@WebServlet("/ServletApplicationScope")
public class ServletApplicationScope extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		config.getServletContext().setAttribute("contadorAcesso", 100);
	}
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
		
		HttpSession session = req.getSession(Boolean.TRUE);
		session.setAttribute("attrSession", "vindo da sessao");
		
		req.setAttribute("numero", "vim da requisicao");
		
		String contadorAcesso = req.getServletContext().getAttribute("contadorAcesso").toString();
		Integer cont = Integer.parseInt(contadorAcesso);
		req.getServletContext().setAttribute("contadorAcesso", ++cont);
		System.out.println(cont);
		RequestDispatcher dispacher = req.getRequestDispatcher("/scope.jsp");
		dispacher.forward(req, resp);
	}

}

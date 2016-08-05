package br.com.treinar.web.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletSession
 */
@WebServlet(value="/jose")
public class ServletSession2 extends HttpServlet {
	private static final long serialVersionUID = 1L;



	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Create a session object if it is already not  created.
		HttpSession session = request.getSession(Boolean.TRUE);
		session.setAttribute("attrSession", "vindo da sessao");
		RequestDispatcher dispacher = request.getRequestDispatcher("/scope.jsp");
		dispacher.forward(request, response);
	}

}



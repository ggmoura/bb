package br.com.treinar.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletScope
 */
@WebServlet("/ServletScope")
public class ServletScope extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	private Integer cont;
	
	@Override
	public void init() throws ServletException {
		super.init();
		cont = 1;
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer numero = 10;
		
		
		PrintWriter out = response.getWriter();
		out.print(cont++);
		
		request.setAttribute("numero", numero);
		
		numero++;
		
		RequestDispatcher dispacher = request.getRequestDispatcher("/scope.jsp");
		dispacher.forward(request, response);
	
		
	}

}

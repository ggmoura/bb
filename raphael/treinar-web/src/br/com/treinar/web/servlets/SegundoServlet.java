package br.com.treinar.web.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SegundoServlet
 */
@WebServlet(value="/segundo")
public class SegundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SegundoServlet() {
        super();        
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Enumeration<String> parametros = request.getParameterNames();
		String key = "";
		String value = "";
		
		while(parametros.hasMoreElements()){
			key = parametros.nextElement();
			value = request.getParameter(key);
			System.out.print(key +" : "+value+"\n");
		}
		request.setAttribute("cadastrador", "Raphael");
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/pessoa.jsp");
		requestDispatcher.forward(request, response);
	}

}

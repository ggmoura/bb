package br.com.treinar.web.servlets;

import java.io.IOException;
import java.util.Enumeration;

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

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Enumeration<String> parametres = req.getParameterNames();
		String key = null;
		String value = null;
		
		while (parametres.hasMoreElements()) {
			key = parametres.nextElement();
			value = req.getParameter(key);
			System.out.println(key + ": "+ value);
		}
	}
}

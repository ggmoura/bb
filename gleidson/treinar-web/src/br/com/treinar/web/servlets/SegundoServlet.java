package br.com.treinar.web.servlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.web.modelo.Pessoa;
import br.com.treinar.web.util.TreinarUtil;

/**
 * Servlet implementation class SegundoServlet
 */
@WebServlet(value="/segundo")
public class SegundoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 3119463703759080551L;

	//private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Enumeration<String> parameters = req.getParameterNames();
		String key = null;
		String value = null;
		while (parameters.hasMoreElements()) {
			key = parameters.nextElement();
			value = req.getParameter(key);
			System.out.println(key + ": " + value);
		}
		
		String cursos = req.getParameter("curso");
		System.out.println(Arrays.asList(cursos));
		req.setAttribute("pessoas", TreinarUtil.getInstance().getPessoas());
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Rubens");
		pessoa.setDataNascimento(new Date());
		req.setAttribute("pessoas", TreinarUtil.getInstance().getPessoas());
		req.setAttribute("pessoa", pessoa);
		
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/pessoa.jsp");
		requestDispatcher.forward(req, resp);
		
	}

}

package br.com.treinarminas.agenda.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinarminas.agenda.modelo.TipoTelefone;

/**
 * Servlet implementation class ServletController
 */
@WebServlet(value = "*.trn", loadOnStartup = 1)
public class ServletController extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		TipoTelefone[] tiposPossiveis = TipoTelefone.values();
		List<TipoTelefone> tipos = Arrays.asList(tiposPossiveis);
		config.getServletContext().setAttribute("tipos", tipos);
	}

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String commandStr = request.getParameter("command");
	
		try {
			ICommand command = (ICommand) Class.forName(commandStr)
					.newInstance();
			String destino = command.execute(request, response);
			request.setAttribute("resourcePage", destino);
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("/index.jsp");
			requestDispatcher.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package br.com.treinar.web.meuservelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeiroServelet
 */
@WebServlet(value="/PrimeiroServelet", loadOnStartup=1)
public class PrimeiroServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("passei no init()");
		super.init(config);
	}
	
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PrimeiroServelet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// Set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"ISO-8859-1\">");
		out.print("<title>Projeto Java em primeiro</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Olá mundo!</h1>");
		out.print("</body>");
		out.print("</html>");
		DateFormat formatador = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		out.print("</h1>" + formatador.format(new Date()) + "</h1>");
	}
}

package br.com.treinar.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeiroServlet
 */
@WebServlet("/PrimeiroServlet")
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		System.out.println("Passei no INIT...");
		super.init();
	}
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PrimeiroServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("<title>Primeiro Projeto</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello World of JAVA!!!!!... not the HUT....</h1>");
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		out.println("<h2>" + formatador.format(new Date()) + "hs</h2>");
		
		out.println("</body>");
		out.println("</html>");
	}

}

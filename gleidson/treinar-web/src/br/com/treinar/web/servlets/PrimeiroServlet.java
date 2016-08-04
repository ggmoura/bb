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
@WebServlet(value={"*.treinar"}, loadOnStartup=1)
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		System.out.println("passei no init()");
		super.init();
	}
	
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PrimeiroServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

//	/**
//	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
//	@Override
//	protected void service(HttpServletRequest request,
//			HttpServletResponse response) throws ServletException, IOException {
//		// Set response content type
//		response.setContentType("text/html");
//
//		// Actual logic goes here.
//		PrintWriter out = response.getWriter();
//		
//		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		
//		out.println("<h1>Isabela " + formatador.format(new Date()) + "</h1>");
//	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		out.println("<h1>Get Isabela " + formatador.format(new Date()) + "</h1>");

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		out.println("<h1>Post Isabela " + formatador.format(new Date()) + "</h1>");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

}

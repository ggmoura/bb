<%@ page import="br.com.treinar.web.modelo.Pessoa"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta charset="ISO-8859-1">
		<title>Primeiro Projeto Java EE</title>
	</head>
	
	<body>
		<% 
			if(request.getAttribute("pessoas") != null) {
				List<Pessoa> pessoas = (List<Pessoa>) request.getAttribute("cadastradores");
				for(Pessoa pessoa : pessoas) {
					out.print("<h1>" + pessoa.getNome() + "</h1>");
				}
				
			}
		%>
		
		<h1>${pessoa.nome}</h1>
		
		<form action="segundo" method="post">
			<label for="nome">Nome</label>
			<input id="nome" name="nome" type="text" placeholder="Nome" value="<%= request.getParameter("nome") != null ? request.getParameter("nome") : "" %>">
			<br />
			<br />
			<label for="idade">Idade</label>
			<input id="idade" name="idade" type="text" placeholder="Idade" value="${idade}">
			<br />
			<br />
			<input type="submit" value="Enviar">
			<br />
			<br />
		</form>
		
		<form action="segundo">
			<label for="peso">Idade</label>
			<input id="peso" name="peso" type="text" placeholder="Peso">
			<br />
			<fieldset data-role="controlgroup" id="checkboxes-1">
				<legend>Cursos</legend>
				<input name="curso" id="checkbox-1a" type="checkbox" value="JAVA_BASICO"/>
				<label for="checkbox-1a">Java Básico</label>
				<input name="curso" id="checkbox-1b" type="checkbox" value="JAVA_AVANCADO"/>
				<label for="checkbox-1b">Java Avançado</label>
				<input name="curso" id="checkbox-1c" type="checkbox" value="JAVA_WEB"/>
				<label for="checkbox-1c">Java Web</label>
			</fieldset>
			<input type="submit" value="Enviar">
		</form>
		
	</body>
	
</html>
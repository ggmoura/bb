<%@ page import="br.com.treinarminas.agenda.modelo.Contato"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="ag" uri="/WEB-INF/agenda.tld" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agenda</title>
</head>
<body>

	<form action="lista.trn" method="post">
		<table data-role="table" id="contatos" >
			<thead>
				<tr>
					<th>Nome</th>
					<th>E-Mail</th>
					<th>Tipo Telefone</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${contatos}" var="contato" varStatus="i">
					<tr>
						<td>${fn:toUpperCase(contato.nome)}</td>
						<td>${contato.email}</td>
						<td><ag:tipoTelefone name="tipoTelefone" id="tipoTelefone" selected="${contato.telefone.tipo}" disabled="true"/></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br>
		<br>
		<br>
		<a href="novo.trn?command=br.com.treinarminas.agenda.controller.AccessCreateContactController">Novo</a>
	</form>

</body>
</html>
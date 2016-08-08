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
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">		
		<link href="./css/simple-sidebar.css" rel="stylesheet">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script src="https://code.jquery.com/jquery-3.1.0.min.js"></script>
	</head>
	<body>	
		<div id="wrapper">
	        <div id="sidebar-wrapper">
	            <ul class="sidebar-nav">
	                <li class="sidebar-brand">
	                    <a href="./index.jsp">
	                        Menu
	                    </a>
	                </li>
	                <li>
	                    <a href="novo.trn?command=br.com.treinarminas.agenda.controller.AccessCreateContactController">Novo</a>
	                </li>
	                <li>
	                    <a href="list.trn?command=br.com.treinarminas.agenda.controller.AccessListContactController">Lista</a>
	                </li>                
	            </ul>
        </div>
        <div id="page-content-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <table data-role="table" id="contatos" class="table table-hover">
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
                    </div>
                </div>
            </div>
        </div>		
	</body>
</html>
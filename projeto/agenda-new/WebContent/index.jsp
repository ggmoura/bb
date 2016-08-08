<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Agenda de Contatos</title>
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script src="https://code.jquery.com/jquery-3.1.0.min.js"></script>
		<link href="css/simple-sidebar.css" rel="stylesheet">
	</head>
	<body>	
		<div id="wrapper">
	        <div id="sidebar-wrapper">
	            <ul class="sidebar-nav">
	                <li class="sidebar-brand">
	                    <a href="#">
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
	                        <h1>Agenda de Contatos</h1>
	                        <p>Este sistema foi desenvolvido pela turma de Java Web na escola Treinar Minas</p>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </div>
	</body>
</html>
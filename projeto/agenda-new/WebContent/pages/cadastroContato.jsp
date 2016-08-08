<%@ page import="br.com.treinarminas.agenda.modelo.TipoTelefone"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="ag" uri="/WEB-INF/agenda.tld" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Agenda de Contatos</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
		<link rel="stylesheet" href="//code.jquery.com/ui/1.12.0/themes/base/jquery-ui.css">
		<link href="./css/simple-sidebar.css" rel="stylesheet">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script src="https://code.jquery.com/jquery-3.1.0.min.js"></script>
	    <script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>		
		  <script>
		  	$(document).ready(function(){
			    $( "#datepicker" ).datepicker();
			});
  		  </script>
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
	                	<div class="col-lg-3"></div>
	                    <div class="col-lg-5">
	                        <form action="cadastro.trn" method="post" class="form-horizontal">
	                        	<div class="form-group">
									<input type="hidden" value="br.com.treinarminas.agenda.controller.CreateContactController" name="command">
									<div class="form-group">
										<label for="nome">Nome Contato:</label>
										<input name="nome" id="nome" class="form-control" placeholder="Nome Contato" type="text"/>
									</div>
									<div class="form-group">
										<label for="nome">Data Nascimento:</label>
										<input name="datepicker" id="datepicker" class="form-control" type="text"/>
									</div>
									<div class="form-group">
										<label for="email">E-Mail:</label>
										<input name="email" class="form-control" id="email" placeholder="E-Mail" type="text"/>
									</div>
									<div class="panel panel-default form-group">
									  <div class="panel-heading">Informações de Contato</div>
									  <div class="panel-body">									
										<div class="col-sm-2">
											<label for="ddi">DDI:</label>
											<input name="ddi" id="ddi" type="text" class="form-control" />&#160;
										</div>
										<div class="col-xs-2">
											<label for="ddd">DDD:</label>
											<input name="ddd" id="ddd" type="text" class="form-control" />&#160;
										</div>
										<div class="col-xs-4">
											<label for="numero">Número:</label>
											<input name="numero" id="numero" type="text" class="form-control"/>&#160;
										</div>
										<div class="col-xs-4">
											<label for="tipoTelefone">Tipo:</label>
											<ag:tipoTelefone name="tipoTelefone" id="tipoTelefone" />
										</div>
									  </div>
									</div>
									<div class="panel panel-default form-group">
									    <div class="panel-heading">Informações de Endereço</div>
									    <div class="panel-body">									
											
												<label for="logradouro">Logradouro:</label>
												<input name="logradouro" id="logradouro" type="text" class="form-control"/>

												<label for="logradouro">Nº:</label>
												<input name="num_logradouro" id="num_logradouro" type="text" class="form-control" maxlength="5"/>
											
												<label for="complemento">Complemento:</label>
												<input name="complemento" id="complemento" type="text" class="form-control"/>
											
												<label for="bairro">Bairro:</label>
												<input name="bairro" id="bairro" type="text" class="form-control"/>
											</div>
										</div>
									</div>
									<input type="submit" value="Gravar" class="btn btn-primary btn-lg btn-block">
								</div>
							</form>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </div>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Agenda</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script src="https://code.jquery.com/jquery-3.1.0.min.js"></script>
	</head>
	<body>
		<div class="row" style="padding: 100px;">
			<div class="col-md-12">
				<div class="panel panel-primary">
					<div class="panel-heading">Cadastro de Contatos</div>	
					<div class="panel-body">
						<form class="form-horizontal" action="ConcentradorServlet">
						  <div class="form-group">
						    <label for="nome" class="col-sm-2 control-label">Nome</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control" id="nome" name="nome" placeholder="Seu Nome">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="email" class="col-sm-2 control-label">Email</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control" id="email" name="email" placeholder="Informe seu email">
						    </div>
						  </div>	
						  <div class="form-group">
						    <label for="telefone" class="col-sm-2 control-label">Telefone</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control" id="telefone" name="telefone" placeholder="(00) 9999-9999">
						    </div>
						  </div>	
						  <div class="form-group">
						    <label for="end" class="col-sm-2 control-label">Endereço</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control" id="end" name="end" placeholder="Informe seu endereço">
						    </div>
						  </div>	
						  <div class="form-group">
						    <label for="data" class="col-sm-2 control-label">Data Nascimento</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control" id="data" name="data" placeholder="">
						    </div>
						  </div>					  
						  <div class="form-group">
						    <div class="col-sm-offset-2 col-sm-10">
						      <button type="submit" class="btn btn-success">Cadastrar</button>
						    </div>
						  </div>
						</form>
					</div>
				</div>
			</div>			
		</div>
	</body>
</html>
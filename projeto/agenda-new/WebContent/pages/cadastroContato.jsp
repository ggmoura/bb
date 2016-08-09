<%@ page import="br.com.treinarminas.agenda.modelo.TipoTelefone"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="ag" uri="/WEB-INF/agenda.tld" %>

<form action="cadastro.trn" method="post" class="form-horizontal">
	<div class="form-group">
		<input type="hidden"
			value="br.com.treinarminas.agenda.controller.CreateContactController"
			name="command">
		<div class="form-group">
			<label for="nome">Nome Contato:</label> <input name="nome" id="nome"
				class="form-control" placeholder="Nome Contato" type="text" />
		</div>
		<div class="form-group">
			<label for="nome">Data Nascimento:</label> <input name="datepicker"
				id="datepicker" class="form-control" type="text" />
		</div>
		<div class="form-group">
			<label for="email">E-Mail:</label> <input name="email"
				class="form-control" id="email" placeholder="E-Mail" type="text" />
		</div>
		<div class="panel panel-default form-group">
			<div class="panel-heading">Informações de Contato</div>
			<div class="panel-body">
				<div class="col-sm-2">
					<label for="ddi">DDI:</label> <input name="ddi" id="ddi"
						type="text" class="form-control" />&#160;
				</div>
				<div class="col-xs-2">
					<label for="ddd">DDD:</label> <input name="ddd" id="ddd"
						type="text" class="form-control" />&#160;
				</div>
				<div class="col-xs-4">
					<label for="numero">Número:</label> <input name="numero"
						id="numero" type="text" class="form-control" />&#160;
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

				<label for="logradouro">Logradouro:</label> <input name="logradouro"
					id="logradouro" type="text" class="form-control" /> <label
					for="logradouro">Nº:</label> <input name="num_logradouro"
					id="num_logradouro" type="text" class="form-control" maxlength="5" />

				<label for="complemento">Complemento:</label> <input
					name="complemento" id="complemento" type="text"
					class="form-control" /> <label for="bairro">Bairro:</label> <input
					name="bairro" id="bairro" type="text" class="form-control" />
			</div>
		</div>
	</div>
	<input type="submit" value="Gravar"
		class="btn btn-primary btn-lg btn-block">
	</div>
</form>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agenda</title>
</head>
<body>

	<form action="cadastro.trn" method="post">
		<input type="hidden" value="br.com.treinarminas.agenda.controller.CreateContactController" name="command">
		<div class="ui-field-contain">
			<label for="nome">Nome Contato:</label>
			<input name="nome" id="nome" placeholder="Nome Contato" type="text"/>
		</div>
		<div class="ui-field-contain">
			<label for="email">E-Mail:</label>
			<input name="email" id="email" placeholder="E-Mail" type="text"/>
		</div>
		<div class="ui-field-contain">
			<label>Telefone:</label>
			<input name="ddi" id="ddi" type="text"/>&#160;
			<input name="ddd" id="ddi" type="text"/>&#160;
			<input name="numero" id="ddi" type="text"/>
		</div>
		<div class="ui-field-contain">
			<label for="logradouro">Logradouro:</label>
			<input name="logradouro" id="logradouro" type="text"/>
		</div>
		<div class="ui-field-contain">
			<label for="numero">Numero:</label>
			<input name="numero" id="numero" type="text"/>
		</div>
		<div class="ui-field-contain">
			<label for="complemento">Complemento:</label>
			<input name="complemento" id="complemento" type="text"/>
		</div>
		<div class="ui-field-contain">
			<label for="bairro">Bairro:</label>
			<input name="bairro" id="bairro" type="text"/>
		</div>
		<input type="submit" value="Gravar">
	</form>

</body>
</html>
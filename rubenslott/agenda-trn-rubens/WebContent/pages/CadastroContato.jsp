<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WebAgenda</title>
</head>
<body>
	<form action="cadastro.trn" method="post">
		<div class="ui-field-contain">
			<label for="nome">Nome:</label>
			<input name="nome" id="nome" type="text"/>
		</div>

		<div class="ui-field-contain">
			<label for="email">E-Mail:</label>
			<input name="email" id="email" type="text"/>
		</div>

		<div class="ui-field-contain">
			<label>Telefone:</label>
			<input name="ddi" id="ddi" type="text"/>&#160;
			<input name="ddd" id="ddd" type="text"/>&#160;
			<input name="telefone" id="telefone" type="text"/>
		</div>

		<div class="ui-field-contain">
			<label for="logradouro">Endereço:</label>
			<input name="logradouro" id="logradouro" type="text"/>
		</div>

		<div class="ui-field-contain">
			<label for="numero">Nro:</label>
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

		<div class="ui-field-contain">
			<label for="dataNascimento">Nascimento:</label>
			<input name="dataNascimento" id="dataNascimento" type="text"/>
		</div>
		<div>
			<input type="submit" value="Gravar">
		</div>
	</form>
</body>
</html>
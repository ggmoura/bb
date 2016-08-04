<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="jumbotron">
		<div class="container">
			<form action="segundo" method="post" class="form-horizontal">
				<div class="form-group">
					<label for="nome">Nome:</label> <input type="text" name="nome">
				</div>
				<div class="form-group">
					<br /> <label for="idade">Idade:</label> <input type="text"
						name="idade" />
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-default">Enviar</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
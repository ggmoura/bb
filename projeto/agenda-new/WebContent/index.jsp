<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	            <jsp:include page="menu.jsp" />
	        </div>
	        
	        <div id="page-content-wrapper">
	            <div class="container-fluid">
	                <div class="row">
	                    <div class="col-lg-12">
	                    	<c:if test="${resourcePage != null}">
				            	<jsp:include page="${resourcePage}"></jsp:include>
	                    	</c:if>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </div>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Roteiro 3</title>
</head>
<body>
<h1>Horários</h1>
	<c:forEach var="lista3" items="${lista3}">
	${lista3.horario} <br>
	</c:forEach>
<form> 
<input type="button" value="Voltar" onClick="history.go(-1)"> 
</form>
</body>

</html>
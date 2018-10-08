<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Roteiro 5</title>
</head>
<body>
<h1>Horários</h1>
	<c:forEach var="lista5" items="${lista5}">
	${lista5} <br>
	</c:forEach>
<br>
<form> 
<input type="button" value="Voltar" onClick="history.go(-1)"> 
</form>
</body>

</html>
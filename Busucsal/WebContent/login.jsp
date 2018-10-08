<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="${erro}"></c:out>
<br><form action="Autenticador" method="post">
 
<p>
	Usuário:<br /> 
	<input type="text" name="usuario"> 
	</p>   
	
	<p>
	Senha:<br /> 
	<input type="password" name="senha"> 
	</p>    
	
	<p> 
	<input type="submit" name="BTEnvia" value="LOGIN"> 
	</p>
	</form>
</body>
</html>
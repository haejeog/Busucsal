<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert title here</title>
</head>
<body>
    <label for="Itinerario">Itinerário:</label>
   <br>
   <form action="Autenticador" id="itinerario" method="get">
    <select name="roteiro" form="itinerario"> 
    <option value="1">Roteiro 1</option> 
    <option value="2">Roteiro 2</option> 
    <option value="3">Roteiro 3</option> 
    <option value="4">Roteiro 4</option> 
    <option value="5">Roteiro 5</option>  
   </select>
  <input type="submit">
</form>
<script type="text/javascript">
function Enviar()
{
location.href="login.jsp"
}
</script>

<input type="button" value="Fazer Login" onClick="Enviar()">
</body>
</html>
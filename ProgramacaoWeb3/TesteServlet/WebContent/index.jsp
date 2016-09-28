<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pedido de presente</title>
</head>
<body>
	<form action="Pedido" method="get">
		<p>Nome:<input type="text" name="nome"></p>
		<p>Presente 1:
		<select name="presente1">
			<option value="PS4">PS4</option>
			<option value="iPhone">iPhone</option>
			<option value="Caminhao">Caminhão</option>
			<option value="Bola">Bola</option>
			<option value="Boneca">Boneca</option>
		</select>
		</p>
		<p>Presente 2:
		<select name="presente2">
			<option value="PS4">PS4</option>
			<option value="iPhone">iPhone</option>
			<option value="Caminhao">Caminhão</option>
			<option value="Bola">Bola</option>
			<option value="Boneca">Boneca</option>
		</select>
		</p>
		<p>Presente 3:
		<select name="presente3">
			<option value="PS4">PS4</option>
			<option value="iPhone">iPhone</option>
			<option value="Caminhao">Caminhão</option>
			<option value="Bola">Bola</option>
			<option value="Boneca">Boneca</option>		
		</select>	
		</p>
		<input type="submit" value="Solicitar Presente">
	</form>
</body>
</html>
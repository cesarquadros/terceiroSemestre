<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Cadastro de Clientes</title>
	<h1>Cadastro de clientes</h1>
</head>
<body>
	<form id="fCadastroCli" action="CadastroCli" method="get">
		<fieldset>
			<legend>Dados do cliente</legend>
			<p><label for="cNome">Nome:
				<input required="required" placeholder="Apenas letras" type="text" name="tNome" id="cUserNome" pattern="[A-Za-z]*"/>
			</p>
			<p><label for="cUserSobrenome">Sobrenome: 
				<input required="required" placeholder="Apenas letras" type="text" name="tUserSobrenome" id="cUserSobrenome" pattern="[A-Za-z]*"/>
			</p>
			<p><label for="cNasc"> Data Nasc.: 
				<input type="date" name="tNasc" id="cNasc"/>
			</p>
			<p><label for="cCpf">CPF:
				 <input required="required" type="text" placeholder="EX:37765289829" size="14" name="cCpf" id="tCpf"/>
			</p>
		</fieldset>
		<button type="submit" id="enviar">Efetuar cadastro</button>
	</form>
</body>
</html>
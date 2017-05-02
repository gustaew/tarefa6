<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Empresa"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Excluir Empresa</title>
</head>
<body>
	<%
		Empresa empresa = (Empresa) request.getAttribute("empresa");
	%>
	<fieldset>
		<h1>
			Empresa com CNPJ:
			<%=empresa.getCNPJ()%>
			foi excluída com sucesso!
		</h1>
	</fieldset>
	<br>
	<fieldset>
		<a href="index.html">Voltar</a>
	</fieldset>
</body>
</html>
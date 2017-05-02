<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Empresa"%>
<html>
<head>
<title>Cadastrar Empresa</title>
</head>
<body>
	<fieldset>
		<%
			Empresa empresa = (Empresa) request.getAttribute("empresa");
		%>
		<h1>
			Empresa com CNPJ:
			<%=empresa.getCNPJ()%>
			cadastrada com Sucesso!
		</h1>
		<a href="index.html">Voltar</a>
	</fieldset>

</body>
</html>
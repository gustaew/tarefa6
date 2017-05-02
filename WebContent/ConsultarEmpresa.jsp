<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Empresa"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Consultar Empresa</title>
</head>
<body>
	<%
		Empresa empresa = (Empresa) request.getAttribute("empresa");
	%>
	<div id='dadosEmpresa'>
		<div id='formularioConsultar'>
			<h3>Dados da Empresa</h3>
			<fieldset>
				<legend>
					<h4>Dados Sociais</h4>
				</legend>
				<label for='Cnpj'>CNPJ:</label> <input id='Cnpj' type='text'
					value=" <%=empresa.getCNPJ()%>" disabled /> <label
					for='razaoSocial'>Nome:</label> <input id='razaoSocial' type='text'
					value="<%=empresa.getRazaoSocial()%>" disabled />

			</fieldset>
			<fieldset>
				<legend>
					<h4>Dados Funcionamento</h4>
				</legend>
				<label for='horarioInicio'>Início:</label> <input id='horarioInicio'
					type='text' value="<%=empresa.getHorarioInicio()%>" disabled /> <label
					for='horarioFim'>Fim:</label> <input id='horarioFim' type='text'
					value="<%=empresa.getHorarioFim()%>" disabled />
			</fieldset>
			<fieldset>
				<legend>
					<h4>Dados Temperatura</h4>
				</legend>
				<label for='horarioArInicio'>Início do Funcionamento(Ar):</label> <input
					id='horarioArInicio' type='text'
					value="<%=empresa.getHorarioArInicio()%>" disabled /> <label
					for='horarioArFim'>Fim do Funcionamento(Ar):</label> <input
					id='horarioArFim' type='text'
					value="<%=empresa.getHorarioArFim()%>" disabled /> <label
					for='temperaturaAr'>Temperatura: </label> <input id='temperaturaAr'
					type='number' value="<%=empresa.getTemperatura()%>" disabled />
			</fieldset>
			<br>
			<fieldset>
				<a href="index.html">Voltar</a>
			</fieldset>
		</div>
	</div>
</body>
</html>


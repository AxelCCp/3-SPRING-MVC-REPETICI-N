<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>      

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRO DE ALUMNO</title>
</head>
<body>

	<h2>REGISTRO DEL ALUMNO</h2>
	
	<form:form action="procesarFormulario" modelAttribute="alumno1">
	
	NOMBRE: <form:input path="nombre"/>
	<form:errors path="nombre" style="color:red"></form:errors>
	<br><br>
	APELLIDO: <form:input path="apellido"/>
	<br><br>
	
	EDAD: <form:input path="edad"/>
	<form:errors path="edad" style="color:red"></form:errors>
	<br><br>
	
	EMAIL: <form:input path="email"/>
	<form:errors path="email" style="color:red"></form:errors>
	<br><br>
	
	C�DIGO POSTAL: <form:input path="codigopostal"/>
	<form:errors path="codigopostal" style="color:red"></form:errors>
	<br><br>
	
	ASIGNATURAS OPTATIVAS:
	<br>
	<form:select path="optativa" multiple="true">
		<form:option value="karate" label="karate"></form:option>
		<form:option value="dise�o" label="dise�o"></form:option>
		<form:option value="spring" label="spring"></form:option>
		<form:option value="java" label="java"></form:option>
	</form:select>
	<br><br>
	
	CIUDAD ESTUDIOS<h5>(radioButton):</h5>
	<br>
	BARCELONA <form:radiobutton path="ciudad" value="BARCELONA"/> 
	VALENCIA <form:radiobutton path="ciudad" value="VALENCIA"/>
	MADRID <form:radiobutton path="ciudad" value="MADRID"/>
	BILBAO <form:radiobutton path="ciudad" value="BILBAO"/>
	<br><br><br>
	
	IDIOMA A ESTUDIAR<h5>(checkbox):</h5>
	<br>
	INGL�S <form:checkbox path="idioma" value="INGL�S"/> 
	CHINO <form:checkbox path="idioma" value="CHINO"/>
	ALEM�N <form:checkbox path="idioma" value="ALEM�N"/>
	FRANC�S <form:checkbox path="idioma" value="FRANC�S"/>
	<br><br><br>
	
	<input type="submit" value="Enviar">
	
	</form:form>
	
</body>
</html>
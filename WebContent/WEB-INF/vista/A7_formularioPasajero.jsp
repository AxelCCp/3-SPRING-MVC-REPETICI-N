<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FORMULARIO PASAJERO</title>
</head>
<body>
	
	<h2>FORMULARIO DE PASAJERO</h2>
	<br><br>
	
	<form:form action="confirmacionVuelo" modelAttribute="pasajero1">
	
	NOMBRE: <form:input path="nombre"/>
	<form:errors path="nombre" style="color:red"></form:errors>
	<br><br>
	APELLIDO: <form:input path="apellido"/>
	<br><br><br>
	EDAD: <form:input path="edad"/>
	<br><br><br>
	AEROPUERTO DE ORIGEN:
	<br><br>
	<form:select path="origen">
		<form:option value="AEROPUERTO UIO879"></form:option>
		<form:option value="AEROPUERTO HJK21"></form:option>
		<form:option value="AEROPUERTO XCVB12"></form:option>
		<form:option value="AEROPUERTO ASDF43"></form:option>
	</form:select>
	
	<br><br><br>
	AEROPUERTO DE DESTINO:
	<br><br>
	<form:select path="destino">
		<form:option value="AEROPUERTO fghjf"></form:option>
		<form:option value="AEROPUERTO vcbnc"></form:option>
		<form:option value="AEROPUERTO iopip"></form:option>
		<form:option value="AEROPUERTO qwree"></form:option>
	</form:select>
	<br><br><br>
	
	<input type="submit" name="Enviar">
	
	</form:form>
	
	
</body>
</html>
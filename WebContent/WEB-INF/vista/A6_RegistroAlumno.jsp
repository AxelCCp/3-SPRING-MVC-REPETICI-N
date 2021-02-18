<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRO</title>
</head>
<body>
	
	<h2>REGISTRO DEL ALUMNO</h2>
	
	<br><br>
	EL ALUMNO <strong>${alumno1.nombre}</strong> <strong>${alumno1.apellido}</strong> SE HA REGISTRADO CON ÉXITO
	
	<br><br>
	EDAD DEL ALUMNO: <strong>${alumno1.edad}</strong> 
	
	<br><br>
	E-MAIL DEL ALUMNO: <strong>${alumno1.email}</strong> 

	<br><br>
	CÓDIGO POSTAL: <strong>${alumno1.codigopostal}</strong>
	
	<br><br>
	LA ASIGNATURA ESCOGIDA ES <strong>${alumno1.optativa}</strong>
	
	<br><br>
	LA CIUDAD ESCOGIDA PARA ESTUDIAR ES: <strong>${alumno1.ciudad}</strong>
	
	<br><br>
	EL IDIOMA ESCOGIDO POR EL ALUMNO ES: <strong>${alumno1.idioma}</strong>
	
</body>
</html>
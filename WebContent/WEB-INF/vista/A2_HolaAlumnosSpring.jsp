<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRO</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/estilos/miEstilo.css">
</head>
<body>
	<h2>REGISTRO COMPLETO</h2>	
	
	EL ALUMNO <strong>${param.nombreAlumno} ${param.apellidoAlumno}</strong>. 
	<br>
	EDAD: ${param.edadAlumno}
	<br><br>
	CIUDAD: ${param.ciudad}
	<br><br>
	SE HA REGISTRADO CON ÉXITO. 
	<br><br>
	::::::::::::::::::::::::::::
	<p>
		${matricula} 
		<br>
		${centroEstudios}
	</p>
	
	<img alt="foto" src="${pageContext.request.contextPath}/recursos/imgs/logoapp.jpg">
	
</body>
</html>
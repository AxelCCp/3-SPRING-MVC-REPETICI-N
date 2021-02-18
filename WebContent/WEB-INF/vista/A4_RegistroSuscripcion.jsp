<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRO DE SUSCRIPCIÓN</title>
</head>
<body>
	
	REGISTRO DE SUSCRIPCIÓN TERMINADO
	<br><br>
	CLIENTE: <strong>${param.nombre} ${param.apellido}</strong>
	<br><br>
	DIRECCIÓN: <strong>${param.direccion}</strong>
	<br><br>
	REVISTA: <strong>${param.revista}</strong>
	<br><br><br>
	
	<p>
		
		***
		RESUMEN:
		${resumen}
	
	
	</p>
	
	
</body>
</html>
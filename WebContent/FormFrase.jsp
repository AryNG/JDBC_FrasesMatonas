<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Agrega Frases!!!</h1>
	<form class="form-group" action="#" method="Post">
		<p>
			<label for="txtContenido">Agrega la frase</label>
			<input class="form-control" type="text" id="txtContenido" name="txtContenido">
		</p>
		<p>
			<label for="txtCantidad">¿Cuantas veces se ha dicho la frase?</label>
			<input class="form-control" type="text" id="txtCantidad" name="txtCantidad">
		</p>
		<p>
			<label for="txtFechaDesde">¿Cuándo se dijo esta frase?</label>
			<input class="form-control" type="text" id="txtFechaDesde" name="txtFechaDesde">
		</p>
		<p>
			<input class="btn btn-info" type="submit" value="Add">
		</p>
	</form>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	<script type="text/javascript" src="js/script.js"></script>
</body>
</html>
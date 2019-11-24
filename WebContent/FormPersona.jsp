<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="uft-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Insert Information to Add a Person</h1>
	<form class="form-group" action="Personas" method="POST">
	<p>
			<label for="txtNombre"></label>
			<input class="form-control" type="text" id="txtNombre" placeholder="Nombre">
		</p>
		<p>
			<label for="txtEdad"></label>
			<input class="form-control" type="text" id="txtEdad" placeholder="Edad">
		</p>
		<p>
			<label for="txtCarrera"></label>
			<input class="form-control" type="text" id="txtCarrera" placeholder="Carrera">
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
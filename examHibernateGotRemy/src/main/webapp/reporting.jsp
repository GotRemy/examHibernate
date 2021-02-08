<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="ISO-8859-1"%>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Toute les informations !</title>
</head>
<body>

	<h1>Nombre de voiture par marque :</h1>
	<table class="table">
	    <thead>
		            <th scope="col">Marque</th>
		            <th scope="col">Nombre de voiture</th>

		</thead>
	    <tbody>
		    <c:forEach var="cars" items="${requestScope.carsMarque}">
		        <tr>
		            <th scope="row">${cars[0]}</th>
		            <td>${cars[1]}</td>
		        </tr>
	        </c:forEach>
		    </tbody>
		</table>
	<br/>
	
	<h1>Nombre de voiture total :</h1>
		${nbCar }
	<br>
	
	<h1>Les 10 dernières voitures ajoutés</h1>
		<table class="table">
		    <thead>
		            <th scope="col">Id</th>
		            <th scope="col">garage</th>
		            <th scope="col">marque</th>
		            <th scope="col">modele</th>
		            <th scope="col">carburant</th>
		            <th scope="col">annee</th>
		            <th scope="col">kilometrage</th>
		            <th scope="col">prix</th>
		            <th scope="col">date_ajout</th>
		            <th scope="col">description</th>

   			</thead>
		    <tbody>
		    <c:forEach var="car" items="${requestScope.carsTen}">
		        <tr>
		            <th scope="row">${car.id}</th>
		            <td>${car.garage_id.nom}</td>
		            <td>${car.marque}</td>
		            <td>${car.modele}</td>
		            <td>${car.carburant}</td>
		            <td>${car.annee}</td>
		            <td>${car.kilometrage}</td>
		            <td>${car.prix}</td>
		            <td>${car.date_ajout}</td>
		            <td>${car.description}</td>
		        </tr>
	        </c:forEach>
		    </tbody>
		</table>
	<br/>

	
	
</body>
</html>
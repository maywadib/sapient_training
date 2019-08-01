<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Coffe Options</title>
</head>
<body>
	<h1>Here are your coffees</h1>
	<form action="coffeepage" >
		<h3>Select Your interest :<br></h3>
		<input type = "radio" value="cappuccino" name = "coffee">  Cappuccino <br>
		<input type = "radio" value="espresso" name = "coffee"> Espresso <br>
		<input type = "radio" value="latte" name = "coffee"> Latte <br>
		<input type = "radio" value="filtercoffee" name = "coffee"> Filter Coffee <br>
		<input type = "radio" value="favcoffee" name = "coffee"> My Favorite Coffee <br>
		<input type = "radio" value="popcoffee" name = "coffee"> Get me the most popular coffee <br><br>
		<input type = "submit" value = "submit" />

</form>

</body>
</html>
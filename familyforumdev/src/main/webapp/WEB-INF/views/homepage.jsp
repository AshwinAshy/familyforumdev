<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
		integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
		crossorigin="anonymous">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<!-- Required meta tags for Bootstrap -->
	<meta charset="utf-8">
	<meta name="viewport"
		content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>homepage.jsp</title>
</head>
	<body>
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
			<div class="collapse navbar-collapse" id="navbarColor01">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active">
						<a class="nav-link" href="#">Home<span class="sr-only">(current)</span></a>
					</li>
					<li class="nav-item"><a class="nav-link" href="/myactivities">Activity</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Gallery</a></li>
					<li class="nav-item"><a class="nav-link" href="#">About</a></li>
				</ul>
				<form:form action="/logout" method="get">
					<button class="btn btn-secondary my-2 my-sm-0" type="submit">Logout</button>
				</form:form>
			</div>
		</nav>

		<!-- Div for Carousel slides -->
		<div id="demo" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ul class="carousel-indicators">
				<li data-target="#demo" data-slide-to="0" class="active"></li>
				<li data-target="#demo" data-slide-to="1"></li>
				<li data-target="#demo" data-slide-to="2"></li>
			</ul>
	
			<!-- The slideshow -->
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="/images/5.jpg" alt="Los Angeles">
				</div>
				<div class="carousel-item">
					<img src="images/6.jpg" alt="Chicago">
				</div>
				<div class="carousel-item">
					<img src="images/7.jpg" alt="New York">
				</div>
			</div>
			<!-- Left and right controls -->
			<a class="carousel-control-prev" href="#demo" data-slide="prev"> <span
				class="carousel-control-prev-icon"></span>
			</a> <a class="carousel-control-next" href="#demo" data-slide="next">
				<span class="carousel-control-next-icon"></span>
			</a>
		</div>




	<!-- Optional JavaScript -->
		<!-- jQuery first, then Popper.js, then Bootstrap JS -->
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
			integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
			crossorigin="anonymous"></script>
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
			integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
			crossorigin="anonymous"></script>
		<script
			src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
			integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
			crossorigin="anonymous"></script>
	</body>
</html>
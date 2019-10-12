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
	<title>myactivities.jsp</title>
</head>
	<body>
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
			<a class="navbar-brand" href="#">Navbar</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarColor01" aria-controls="navbarColor01"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarColor01">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link" href="#">Home
							<span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Features</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Gallery</a></li>
					<li class="nav-item"><a class="nav-link" href="#">About</a></li>
				</ul>
				<button class="btn btn-secondary my-2 my-sm-0" type="submit">
					<a href="/logout">Logout</a>
				</button>
			</div>
		</nav>
		<div class="container">
			<div class="row">
				<div class="col-lg-6 jumbotron">
				   	<div class="form-group">
						<form action="addMyActivity" method="get">
							<fieldset>
								<legend>Add My Activities</legend>
 								<form:select class="custom-select" path="listActivityType" name="actid">
						       		<c:forEach var="activities" items="${listActivityType}">
						       			<form:options items="${listActivityType}" itemValue="actid" name="actid" itemLabel="activitytype"/>
						   			</c:forEach>
					    		</form:select>
					    		<%-- <form:select path="listActivityType" items="${listActivityType}" itemValue="activitytype" /> --%>
					    		<label class="control-label" for="date">Date</label>
        							<input class="form-control" id="date" name="date" placeholder="MM/DD/YYY" type="text"/>
        						<label class="control-label" for="Duration">Duration</label>
        							<div class="form-inline">
	        							<div class="input-sm"><input class="form-control" id="hours" name="hours" placeholder="Hours" type="text" /></div>
	        							<div class="input-sm"><input class="form-control" id="mins" name="minutes" placeholder="Minutes" type="text" /></div>
	        							<div class="input-sm"><input class="form-control" id="secs" name="seconds" placeholder="Seconds" type="text" /></div>
        							</div>
       							<label class="control-label" for="Comments">Comments</label>
       								<div class="input-sm">
       									<textarea name="comments" class="form-control" id="comments" rows="3" placeholder="Comments" ></textarea></div>
							</fieldset>
							<input class="btn btn-primary" type="submit" value="Submit."/>
						</form>
					</div>
				</div>
				<div class="col-lg-6">
				   	<div class="form-group">
						<form action="addNewActivityType" method="post">
							<fieldset>
								<legend>Add New Activity Type</legend>
								<div>${activitymsg}</div>
								<div class="form-group">
      								<label for="activityType">Activity Type</label>
						    		<input type="text" name="activityType" class="form-control" id="activityType" placeholder="Activity Type">
						    	</div>
						    	<button type="submit" class="btn btn-default">Submit</button>
							</fieldset>
						</form>
					</div>
				</div>
			</div>
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
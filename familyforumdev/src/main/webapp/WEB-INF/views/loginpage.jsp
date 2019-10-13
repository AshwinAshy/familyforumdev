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
	<title>login.jsp</title>
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
	</nav>
		<div class="container">
			<div class="row">
				<div class="col-lg-6 jumbotron">
				   	<div class="form-group">
				   		<legend>Login</legend>
				   		<form:form action="login" method="get" commandName="user"	class="form-inline my-2 my-lg-0">
							<form:input class="form-control mr-sm-2" type="text" path="username" placeholder="username" name="username"/>
							<form:input class="form-control mr-sm-2" type="text" path="password" placeholder="password" name="password"/>
							<button class="btn btn-secondary my-2 my-sm-0" type="submit">Login</button>
						</form:form>
					</div>
				</div>
				<div class="col-lg-6">
				   	<div class="form-group">
						<legend>Sign Up Form</legend>
					<form:form action="/signupformsubmit" modelAttribute="user" method="post">
						<fieldset>
							<legend>Sign Up</legend>
							<div class="form-group">
								<label for="firstname">Enter First Name</label> <input
									type="text" name="firstname" class="form-control"
									placeholder="First Name" value="ashwin" />
							</div>
							<div class="form-group">
								<label for="middlename">Middle Name</label> <input type="text"
									name="middlename" class="form-control"
									placeholder="Middle Name" value="HS"/>
							</div>
							<div class="form-group">
								<label for="lastname">Last Name</label> <input type="text"
									name="lastname" class="form-control" placeholder="Last Name" value="kumar"/>
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Email address</label> <input
									type="text" name="emailaddress" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									placeholder="Enter email" value="ashwinaradhya@gmail.com" /> <small id="emailHelp"
									class="form-text text-muted">We'll never share your
									email with anyone else.</small>
							</div>
							<div class="form-group">
								<label for="nickname">NickName</label> <input type="nickname"
									name="nickname" class="form-control" id="nickname"
									placeholder="Nick Name" value="ashy" />
							</div>
							<div class="form-group">
								<label for="exampleTextarea">Hobbies</label>
								<textarea name="hobbies" class="form-control" id="hobbies"
									rows="3" >Guitar</textarea>
							</div>
							<div class="form-group">
								<label for="nickname">Phone No</label> <input type="text"
									name="phonenumber" class="form-control" id="phoneno"
									placeholder="Phone No" value="9900901907" />
							</div>
							<div class="form-group">
								<label for="username">UserName</label> <input type="text"
									name="username" class="form-control" id="username"
									placeholder="UserName" value="ashwin" />
							</div>
							<div class="form-group">
								<label for="password">Password</label> <input type="password"
									name="password" class="form-control"
									id="exampleInputPassword1" placeholder="Password" value="ashwin"/>
							</div>

							<div class="form-group">
								<label for="exampleInputFile">Profile Pic</label> <input
									type="file" class="form-control-file" id="exampleInputFile"
									aria-describedby="fileHelp"> <small id="fileHelp"
									class="form-text text-muted">This is some placeholder
									block-level help text for the above input. It's a bit lighter
									and easily wraps to a new line.</small>
							</div>
							<fieldset class="form-group">
								<legend>Gender</legend>
								<div class="form-check">
									<label class="form-check-label"> <input type="radio"
										class="form-check-input" name="gender" id="radiofemale"
										value="F" checked=""> Female
									</label>
								</div>
								<div class="form-check">
									<label class="form-check-label"> <input type="radio"
										class="form-check-input" name="gender" id="radiomale"
										value="M" checked="checked"> Male
									</label>
								</div>
							</fieldset>
							<button type="submit" class="btn btn-primary">Submit</button>
						</fieldset>
					</form:form>

					</div>
				</div>
			</div>
		</div>

	<div class="container">
<!-- 		<div class="row">
			<div class="col-sm-6">
				<legend>Login</legend>
			</div>
		</div> -->
<%-- 		<div class="row">
			<span class="border">
						<div class="col-sm-6">
				<legend>Login</legend>
			</div>
		</div>
				<div class="col-sm-6">
					<form:form action="/signupformsubmit" modelAttribute="user" method="post">
						<fieldset>
							<legend>Sign Up</legend>
							<div class="form-group">
								<label for="firstname">Enter First Name</label> <input
									type="text" name="firstname" class="form-control"
									placeholder="First Name" value="ashwin" />
							</div>
							<div class="form-group">
								<label for="middlename">Middle Name</label> <input type="text"
									name="middlename" class="form-control"
									placeholder="Middle Name" value="HS"/>
							</div>
							<div class="form-group">
								<label for="lastname">Last Name</label> <input type="text"
									name="lastname" class="form-control" placeholder="Last Name" value="kumar"/>
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Email address</label> <input
									type="text" name="emailaddress" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									placeholder="Enter email" value="ashwinaradhya@gmail.com" /> <small id="emailHelp"
									class="form-text text-muted">We'll never share your
									email with anyone else.</small>
							</div>
							<div class="form-group">
								<label for="nickname">NickName</label> <input type="nickname"
									name="nickname" class="form-control" id="nickname"
									placeholder="Nick Name" value="ashy" />
							</div>
							<div class="form-group">
								<label for="exampleTextarea">Hobbies</label>
								<textarea name="hobbies" class="form-control" id="hobbies"
									rows="3" >Guitar</textarea>
							</div>
							<div class="form-group">
								<label for="nickname">Phone No</label> <input type="text"
									name="phonenumber" class="form-control" id="phoneno"
									placeholder="Phone No" value="9900901907" />
							</div>
							<div class="form-group">
								<label for="username">UserName</label> <input type="text"
									name="username" class="form-control" id="username"
									placeholder="UserName" value="ashwin" />
							</div>
							<div class="form-group">
								<label for="password">Password</label> <input type="password"
									name="password" class="form-control"
									id="exampleInputPassword1" placeholder="Password" value="ashwin"/>
							</div>

							<div class="form-group">
								<label for="exampleInputFile">Profile Pic</label> <input
									type="file" class="form-control-file" id="exampleInputFile"
									aria-describedby="fileHelp"> <small id="fileHelp"
									class="form-text text-muted">This is some placeholder
									block-level help text for the above input. It's a bit lighter
									and easily wraps to a new line.</small>
							</div>
							<fieldset class="form-group">
								<legend>Gender</legend>
								<div class="form-check">
									<label class="form-check-label"> <input type="radio"
										class="form-check-input" name="gender" id="radiofemale"
										value="F" checked=""> Female
									</label>
								</div>
								<div class="form-check">
									<label class="form-check-label"> <input type="radio"
										class="form-check-input" name="gender" id="radiomale"
										value="M" checked="checked"> Male
									</label>
								</div>
							</fieldset>
							<button type="submit" class="btn btn-primary">Submit</button>
						</fieldset>
					</form:form>
				</div>
			</span>
		</div>
	</div> --%>


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
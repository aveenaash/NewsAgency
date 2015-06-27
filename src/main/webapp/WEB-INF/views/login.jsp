<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
<meta charset="utf-8">
<title>User Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="Example of Responsive Layout with Twitter Bootstrap version 2.0 from w3resource.com">
<meta name="author" content="">

<!-- Le styles -->
<link rel="stylesheet"
	href='<c:url value="/resources/css/bootstrap.css" />'>
<link href='<c:url value="/resources/css/bootstrap-responsive.css" />'
	rel="stylesheet">
<style type="text/css">
body {
	padding-top: 70px
}

.row-fluid {
	margin-bottom: 30px;
}

.span6>h1 {
	margin-bottom: 30px
}
</style>
<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>
<body>
	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a>
				<div class="nav-collapse">
					<ul class="nav">
						<li class="active"><a href="index.html">Home</a></li>
						<li><a href="features.html">Features</a></li>
						<li><a href="contact.html">Contact</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<!--container starts -->
		<div class="row-fluid">
			<!--first row starts -->
			<div class="span6">
				<h1>Sign In</h1>

				<form:form modelAttribute="userlogin" method="POST" action="login"
					class="form-horizontal">
					<div class="control-group">
						<label class="control-label" for="loginname">UserName</label>
						<div class="controls">
							<form:input path="loginname" type="text" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="loginpassword">Password</label>
						<div class="controls">
							<form:input path="loginpassword" type="password" />
						</div>
					</div>
					<div class="control-group">
						<div class="controls">
							<label class="checkbox"> <form:radiobutton
									path="logintype" value="Agency" /> Agency <form:radiobutton
									path="logintype" value="Subscriber" /> Subscriber
							</label> <br /> <!-- <label class="checkbox"> <input type="checkbox">
								Remember me
							</label> -->
							<button type="submit" class="btn btn-large btn-success">Sign
								In</button>
						</div>
					</div>
				</form:form>
			</div>
			<!--first row ends -->
			<div class="row-fluid">
				<!--fourth row starts -->
				<div class="span12">
					<hr>
					<p>This is a Creative Common License product.</p>
				</div>
			</div>
			<!--fourth row ends -->
		</div>
		<!--container ends -->
</body>
</html>
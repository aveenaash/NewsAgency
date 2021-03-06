<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
<meta charset="utf-8">
<title>Home</title>
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
				</a> <a class="brand" href="#"><img src="logo.png" width="111"
					height="30" alt="your logo" /></a>
				<div class="nav-collapse">
					<ul class="nav">
						<li class="active"><a href="index.html">Home</a></li>
						<li><a href="features.html">Features</a></li>
						<li><a href="contact.html">Contact</a></li>
						<li><a href='<c:url value="/login" />'>Sign In</a></li>
						<li><a href='/NewsAgency/agencysignup'>Register Agency</a></li>
						<li><a href='/NewsAgency/subscribersignup'>Register Subscriber</a></li>
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
				<form:form method="POST" action="login"	class="form-horizontal">
					<div class="control-group">
						<div class="controls">
							<button type="submit" class="btn btn-large btn-success">Sign
								In</button>
						</div>
					</div>
				</form:form>
				
				<form:form method="POST" action="login"	class="form-horizontal">
					<div class="control-group">
						<div class="controls">
							<button type="submit" class="btn btn-large btn-success">Sign
								Up</button>
						</div>
					</div>
				</form:form>
				
			</div>
			
		</div>
		<!--container ends -->
</body>
</html>
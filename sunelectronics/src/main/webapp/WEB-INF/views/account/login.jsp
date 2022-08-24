<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:url value="/resources" var="resourceUrl" />

<!doctype html>
<html lang="en">
<head>
	<title>Login | Sun Electronics</title>

	<!-- CSS Links File -->
	<%@ include file="/WEB-INF/views/fragments/links.jsp" %>
</head>
<body>
	
	<!-- Header File -->
	<%@ include file="/WEB-INF/views/fragments/header.jsp" %>

<!-- Main Container Starts -->
	<div id="main-container" class="container">
	<!-- Breadcrumb Starts -->
		<ol class="breadcrumb">
			<li><a href="<c:url value="/" />">Home</a></li>
			<li class="active">Login</li>
		</ol>
	<!-- Breadcrumb Ends -->

	<!-- Login Form Section Starts -->
		<section class="login-area">
			<div class="row">
				<div class="col-sm-6">
				<!-- Login Panel Starts -->
					<div class="panel panel-smart">
						<div class="panel-heading">
							<h3 class="panel-title">Login</h3>
						</div>
						<div class="panel-body">
							<p>
								Please login using your existing account
							</p>
						<!-- Login Form Starts -->
							<c:if test="${param.error ne null}">
								<p>Invalid Username or Password</p>
							</c:if>
							<c:url value="/login" var="loginUrl" />
							<form  role="form" class="form-group" method="POST" action="${loginUrl}" >
								<div class="form-group">
									<label for="username">Username : </label>
									<input type="email" class="form-control" name="username" id="username" placeholder="Username" autofocus="autofocus" />
								</div>
								<div class="form-group">
									<label for="password">Password :</label>
									<input type="password" class="form-control" name="password" id="password" placeholder="Password" autofocus="autofocus" />
								</div>
								<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
								<input type="submit" class="btn btn-danger" value="Login">
							</form>
						<!-- Login Form Ends -->
						</div>
					</div>
				<!-- Login Panel Ends -->
				</div>
				<div class="col-sm-6">
				<!-- Account Panel Starts -->
					<div class="panel panel-smart">
						<div class="panel-heading">
							<h3 class="panel-title">
								Create new account
							</h3>
						</div>
						<div class="panel-body">
							<p>
								Registration allows you to avoid filling in billing and shipping forms every time you checkout on this website
							</p>
							<a href="<c:url value="/register" />" class="btn btn-danger">
								Register
							</a>
						</div>
					</div>
				<!-- Account Panel Ends -->
				<!-- Guest Checkout Panel Starts -->
					<div class="panel panel-smart">
						<div class="panel-heading">
							<h3 class="panel-title">
								Checkout as Guest
							</h3>
						</div>
						<div class="panel-body">
							<p>
								Checkout as a guest instead!
							</p>
							<button class="btn btn-danger">As Guest</button>
						</div>
					</div>
				<!-- Guest Checkout Panel Ends -->
				</div>
			</div>
		</section>
	<!-- Login Form Section Ends -->
	</div>
<!-- Main Container Ends -->

<!-- Footer File -->
<%@ include file="/WEB-INF/views/fragments/footer.jsp" %>

</body>

</html>
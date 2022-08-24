<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:url value="/resources" var="resourceUrl" />

<!doctype html>
<html lang="en">
<head>
	<title>Register | Sun Electronics</title>
	
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
			<li class="active">Register</li>
		</ol>
	<!-- Breadcrumb Ends -->

	<!-- Registration Section Starts -->
		<section class="registration-area">
			<div class="row">
				<div class="col-sm-6">
				<!-- Registration Block Starts -->
					<div class="panel panel-smart">
						<div class="panel-heading">
							<h3 class="panel-title">Personal Information</h3>
						</div>
						<div class="panel-body">
						<!-- Registration Form Starts -->
							<form:form class="form-horizontal" role="form" modelAttribute="customerDto" method="POST">
							<!-- Personal Information Starts -->
								<div class="form-group">
									<label for="firstName">First Name : <form:errors path="firstName" cssClass="error" /></label>
									<form:input class="form-control" path="firstName" placeholder="First Name" />
								</div>
								<div class="form-group">
									<label for="lastName">Last Name : <form:errors path="lastName" cssClass="error" /></label>
									<form:input class="form-control" path="lastName" placeholder="Last Name" />
								</div>
								<div class="form-group">
									<label for="email">Email : <form:errors path="email" cssClass="error" /></label>
									<form:input class="form-control" path="email" placeholder="Email" />
								</div>
								<div class="form-group">
									<label for="mobile">Mobile : <form:errors path="mobile" cssClass="error" /></label>
									<form:input class="form-control" path="mobile" placeholder="Mobile" />
								</div>
								<div class="form-group">
									<label for="password">Password : <form:errors path="password" cssClass="error" /></label>
									<form:password class="form-control" path="password" placeholder="Password" />
								</div>
								<div class="form-group">
									<label for="confirmPassword">Confirm Password : <form:errors path="confirmPassword" cssClass="error" /></label>
									<form:password class="form-control" path="confirmPassword" placeholder="Confirm Password" />
								</div>
								<div class="form-group">
									<span class="col-sm-3">Newsletter :</span>
									<div class="col-sm-3">
										<div class="radio">
											<label>
												<form:checkbox path="newsletter" value="true" checked="checked"/>
												Subscribe
											</label>
										</div>
									</div>
								</div>
								<div class="form-group">
									<div class="col-sm-3">
										<input type="submit" class="btn btn-danger" value="Register">
									</div>
									<div class="col-sm-9">
									</div>
								</div>
							</form:form>
						<!-- Registration Form Starts -->
						</div>							
					</div>
				<!-- Registration Block Ends -->
				</div>
				<div class="col-sm-6">
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
	<!-- Registration Section Ends -->
	</div>
<!-- Main Container Ends -->			

<!-- Footer File -->
<%@ include file="/WEB-INF/views/fragments/footer.jsp" %>

</body>

</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:url value="/resources" var="resourceUrl" />

<!doctype html>
<html lang="en">
<head>
	<title>Contact Us | Sun Electronics</title>
	
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
			<li><a href="<c:url value="/"/>">Home</a></li>
			<li class="active">Contact Us</li>
		</ol>
	<!-- Breadcrumb Ends -->

	<!-- Starts -->
		<div class="row">
		<!-- Contact Details Starts -->
			<div class="col-sm-4">
				<div class="panel panel-smart">
					<div class="panel-heading">
						<h3 class="panel-title">Contact Details</h3>
					</div>
					<div class="panel-body">
						<ul class="list-unstyled contact-details">
							<li class="clearfix">
								<i class="fa fa-home pull-left"></i>
								<span class="pull-left">
									www.CodingRAJA.com <br />
									H-10, 2nd Floor, MRA Building <br />
									Roopena Agrahara, Bangalore-560068
								</span>
							</li>
							<li class="clearfix">
								<i class="fa fa-phone pull-left"></i>
								<span class="pull-left">
									+91 9742 900 696 
								</span>
							</li>
							<li class="clearfix">
								<i class="fa fa-envelope-o pull-left"></i>
								<span class="pull-left">
									info@codingraja.com <br />
									support@codingraja.com <br />
								</span>
							</li>
						</ul>
					</div>
				</div>
			</div>
		<!-- Contact Details Ends -->
		<!-- Contact Form Starts -->
			<div class="col-sm-8">
				<div class="panel panel-smart">
					<div class="panel-heading">
						<h3 class="panel-title">
							Send us a mail 
							<c:if test="${contactId != null}">
								<span style="padding-left: 50px; color:green" id="contact_response">Reference Number: ${contactId}</span>
							</c:if>
						</h3>
					</div>
					<div class="panel-body">
						<form:form class="form-horizontal" role="form" modelAttribute="contactus" method="POST">
							<div class="form-group">
								<label for="name" class="col-sm-2 control-label">
									Name
								</label>
								<div class="col-sm-10">
									<form:input class="form-control" path="name"  placeholder="Name" />
									<span><form:errors path="name" cssClass="error" /></span>
								</div>
							</div>
							<div class="form-group">
								<label for="email" class="col-sm-2 control-label">
									Email
								</label>
								<div class="col-sm-10">
									<form:input class="form-control" path="email"  placeholder="Email" />
									<span><form:errors path="email" cssClass="error" /></span>
								</div>
							</div>
							<div class="form-group">
								<label for="subject" class="col-sm-2 control-label">
									Subject 
								</label>
								<div class="col-sm-10">
									<form:input class="form-control" path="subject"  placeholder="Subject" />
									<span><form:errors path="subject" cssClass="error" /></span>
								</div>
							</div>
							<div class="form-group">
								<label for="message" class="col-sm-2 control-label">
									Message
								</label>
								<div class="col-sm-10">
									<form:textarea path="message" class="form-control" rows="5" placeholder="Message" ></form:textarea>
									<span><form:errors path="message" cssClass="error"/></span>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<input type="submit" value="Submit" class="btn btn-danger text-uppercase">
								</div>
							</div>
						</form:form>
					</div>
				</div>
			</div>
		<!-- Contact Form Ends -->
		</div>
	<!-- Ends -->
	</div>
	<!-- Main Container Ends -->			

<!-- Footer File -->
<%@ include file="/WEB-INF/views/fragments/footer.jsp" %>

</body>

</html>
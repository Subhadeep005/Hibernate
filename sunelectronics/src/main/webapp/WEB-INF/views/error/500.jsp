<%@ page isErrorPage="true" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:url value="/resources" var="resourceUrl" />

<!doctype html>
<html lang="en">
<head>
	<title>Compilation Error (500) | Sun Electronics</title>
	
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
			<li class="active">JSP Compilation Error</li>
		</ol>
	<!-- Breadcrumb Ends -->

	<!-- Content Starts -->
		<div class="content-box text-center">
			<h4 class="special-heading">ERROR - 500</h4>
			<h5>
				JSP Compilation Exception, JSP page is not compiled!.<br>
				Send this exception to our support team- 
				<span style="font-style: italic; color: blue;"> support@codingraja.com</span>
			</h5>
			<br />
			<p>
				<a href="<c:url value="/" />" class="btn gtn-lg btn-danger text-uppercase">Back to Home</a>
			</p>
			<p>${exception}</p>
		</div>
	<!-- Content Ends -->
	</div>
<!-- Main Container Ends -->

<!-- Footer File -->
<%@ include file="/WEB-INF/views/fragments/footer.jsp" %>

</body>

</html>
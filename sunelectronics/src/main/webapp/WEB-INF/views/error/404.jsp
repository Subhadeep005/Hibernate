<%@ page isErrorPage="true" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:url value="/resources" var="resourceUrl" />

<!doctype html>
<html lang="en">
<head>
	<title>Page Note Found(404) | Sun Electronics</title>
	
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
			<li class="active">Page Note Found</li>
		</ol>
	<!-- Breadcrumb Ends -->

	<!-- Content Starts -->
		<div class="content-box text-center">
			<h4 class="special-heading">ERROR - 404</h4>
			<h5>
				The page you were looking for could not be found.
			</h5>
			<br />
			<p>
				<a href="<c:url value="/" />" class="btn gtn-lg btn-danger text-uppercase">Back to Home</a>
			</p>
		</div>
	<!-- Content Ends -->
	</div>
<!-- Main Container Ends -->

<!-- Footer File -->
<%@ include file="/WEB-INF/views/fragments/footer.jsp" %>

</body>

</html>
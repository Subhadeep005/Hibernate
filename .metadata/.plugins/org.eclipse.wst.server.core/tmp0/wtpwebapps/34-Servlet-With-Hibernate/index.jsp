<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- <link rel= "stylesheet" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/bootstrap.min.js" ></script>
<script type="text/javascript" src="js/jquery-3.2.1.min.js" ></script> -->

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- <style type="text/css">
	tid2{
		min-width: 700px;
		border: 1px solid #CCC;
	}
	table tr th {background: #000033; color: #FFF;}
	table tr td {border: 1px solid #CCC;}
</style> -->
</head>
<body>
<h1>CRUD Operation with Servlet and Hibernate</h1>
	<c:url value="/customer/register" var="registerUrl"></c:url>
	<form action="${registerUrl }" method="post">
		<table id="tid1">
			<c:if test="${customer.id ne null}">
				<tr>
				<td>Customer ID:</td>
					<td><input type="text" name="id" value="${customer.id}" readonly="readonly"></td>
				</tr>
			</c:if>
			<tr>
					<td>First Name :</td>
					<td><input type="text" name="firstName" value="${customer.firstName}" required="required"/></td>
			</tr>
			<tr>
					<td>Last Name :</td>
					<td><input type="text" name="lastName" value="${customer.lastName}" required="required"/></td>
			</tr>
			<tr>
					<td>Email :</td>
					<td><input type="email" name="email" value="${customer.email}" required="required"/></td>
			</tr>
			<tr>
					<td>Mobile :</td>
					<td><input type="tel" pattern="[789][0-9]{9}" name="mobile" value="${customer.mobile}" required="required"/></td>
			</tr>
			<c:if test="${customer.id ne null}">
				<tr>
					<td><input type="submit" value="Update"></td>
				</tr>
			</c:if>
			<c:if test="${customer.id eq null}">
				<tr>
					<td><input type="submit" value="Save"></td>
				</tr>
			</c:if>
		</table>
	</form>
	
	<h1>List of Customer</h1>
	<!-- <table id="tid2"> -->
	<div class="container">
					<div class="row">
						<div class="col-md-12">
							<div class="table-responsive">
									<table class="table table-striped">
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email </th>
			<th>Mobile </th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${customerList }" var="customer">
			<tr>
					<td>${customer.id}</td>
					<td>${customer.firstName}</td>
					<td>${customer.lastName}</td>
					<td>${customer.email}</td>
					<td>${customer.mobile}</td>
					<td><a href="<c:url value="/customer/delete?"/>custId=${customer.id }" class="btn btn-info" >Delete</a></td>
					<td><a href="<c:url value="/customer/update?"/>custId=${customer.id }" class="btn btn-danger" >Update</a></td>
			</tr>
		</c:forEach>
	</table>
	</div></div></div></div>
</body>
</html>
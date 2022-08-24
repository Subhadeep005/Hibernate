<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:url value="/resources" var="resourceUrl" />
<c:url value="/product" var="productDetailPageUrl" />

<!doctype html>
<html lang="en">
<head>
	<title>Checkout | Sun Electronics</title>
	
	<!-- CSS Links File -->
	<%@ include file="/WEB-INF/views/fragments/links.jsp" %>
	
	<script src="${resourceUrl}/js/ajax/checkoutOperations.js"></script>
</head>
<body>
	
	<!-- Header File -->
	<%@ include file="/WEB-INF/views/fragments/header.jsp" %>

<!-- Main Container Starts -->
	<div id="main-container" class="container">
	<!-- Breadcrumb Starts -->
		<ol class="breadcrumb">
			<li><a href="<c:url value="/" />">Home</a></li>
			<li class="active">Checkout</li>
		</ol>
	<!-- Breadcrumb Ends -->

	<!-- Shipping Section Starts -->
		<section id="cartView" class="registration-area">
		
			<!-- If Cart is Empty forward to Cart -->
			<c:if test="${sessionScope.cart eq null or sessionScope.cart.orderItems.size()==0 }">
				<c:redirect url="/cart/init" />
			</c:if>
		
			<div class="row">
			<c:if test="${sessionScope.cart ne null and sessionScope.cart.orderItems.size() > 0 }">
			<!-- Shipping & Shipment Block Starts -->
				<div class="col-sm-9">
				
					<!-- Shipping Address -->
					<div class="shipping-address">
						<h3>Shipping Address</h3>
						<div class="row">
							<c:forEach items="${customer.addresses}" var="address">
							<div class="col-md-3">
								<span>
									<input type="radio" name="shippingAddress" value="${address.id}" >
									${address.addressLine1} <br>
									${address.addressLine2}, ${address.addressLine3} <br>
									${address.landmark} <br>
									${address.city}, ${address.state} ${address.zipcode} <br>
									${address.phone}
								</span>
							</div>
							</c:forEach>
						</div>
						
						<c:url value="/checkout/shipping-address" var="shippingAddressFormUrl" />
						<a id="addressPopupDisplayBtn" href="${shippingAddressFormUrl}" class="btn btn-info">Add Shipping Address</a>
					</div><!-- Ends Shipping Address -->
				
					<!-- Shopping Cart Table Starts -->
					<div class="table-responsive shopping-cart-table">
						<table class="table table-striped">
							<thead>
								<tr>
									<td class="text-center">
										Image
									</td>
									<td class="text-center">
										Product Details
									</td>							
									<td class="text-center">
										Quantity
									</td>
									<td class="text-center">
										Unit Price
									</td>
									<td class="text-center">
										Total
									</td>
									<td class="text-center">
										Remove
									</td>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${sessionScope.cart.orderItems}" var="item">
								<tr>
									<td class="text-center">
										<a href="${productDetailPageUrl}/${item.category}/${item.productId}/productDetail">
											<img style="max-width: 50px; min-height: 50px;" src="${resourceUrl}/images/products/${item.productId}_1.jpg" alt="${item.name}" title="Product Name" class="img-thumbnail" />
										</a>
									</td>
									<td class="text-center">
										<a href="${productDetailPageUrl}/${item.category}/${item.productId}/productDetail">
											${item.name}
										</a>
									</td>							
									<td class="text-center">
										<!-- Update Item Quantity Button -->
										<div class="updateItemBox">
											<c:url value="/cart/update" var="updateQuantityUrl" />
											<form method="POST" action="${updateQuantityUrl}">
												<input type="text" name="quantity" value="${item.quantity}" size="1" style="display: block; float: left;"  />
												<input type="hidden" name="itemId" value="${item.id}" />
												<input type="hidden" name="productId" value="${item.productId}" />
												<input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}"/>
												<button type="button" title="Update" class="btn btn-success tool-tip" style="max-width: 40px; float: reght;">
													<i class="fa fa-refresh"></i> 
												</button>
											</form>
										</div>							
									</td>
									<td class="text-center">
										${item.salePrice}
									</td>
									<td class="text-center">
										${item.quantity * item.salePrice}
									</td>
									<td class="text-center">									
										<!-- Remove Item From Cart Button -->
										<div class="removeItemBox">
											<c:url value="/cart/remove" var="removeFromCartUrl" />
											<form method="POST" action="${removeFromCartUrl}">
												<input type="hidden" name="itemId" value="${item.id}" />
												<input type="hidden" name="productId" value="${item.productId}" />
												<input type="hidden" name="quantity" value="${item.quantity}" />
												<input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}"/>
												<button type="button" title="Remove" class="btn btn-danger tool-tip" style="max-width: 40px;">
													<i class="fa fa-times-circle"></i> 
												</button>
											</form>
										</div>
									</td>
								</tr>
								</c:forEach>				
							</tbody>
						</table>		
					</div>
				<!-- Shopping Cart Table Ends -->
				</div>
			<!-- Shipping & Shipment Block Ends -->
			<!-- Total Cart Value start -->
				<div class="col-sm-3">
				<!-- Total Panel Starts -->
					<div class="panel panel-smart">
						<div class="panel-heading">
							<div class="text-uppercase clearfix">
								<a href="<c:url value="/product/viewAllProducts" />" class="btn btn-success btn-block">		
									Continue Shopping
								</a>
							</div>
							<hr>
							<h3 class="panel-title">
								Total
							</h3>
						</div>
						<div class="panel-body cart_total">
							<table>
								<tr>
									<td>Subtotal :</td>
									<td>${sessionScope.cart.subTotal}</td>
								</tr>
								<tr>
									<td>Discount :</td>
									<td>${sessionScope.cart.totalDiscount}</td>
								</tr>
								<tr>
									<td>Shipping Charges :</td>
									<td>${sessionScope.cart.totalFulfillmentCharges}</td>
								</tr>
							</table>
							<hr />
							<table>
								<tr>
									<td style="font-size: 20px; font-weight: 500">Total :</td>
									<td>
										<div style="font-size: 20px; font-weight: 500;float: right; width: 125px;">
											${sessionScope.cart.total}
										</div>
									</td>
								</tr>
							</table>
							<hr>
							<div class="text-uppercase clearfix">
								<a href="<c:url value="/payment" />" class="btn btn-danger btn-block">		
									Pay Now
								</a>
							</div>
						</div>
					</div>
				<!-- Total Panel Ends -->
				</div>
			<!-- Toatal Cart Value Ends -->
			</c:if>
			<c:if test="${sessionScope.cart eq null or sessionScope.cart.orderItems.size()==0 }">
						<div class="text-center">
							<h1>There is no item in Shopping Cart</h1>
							<a href="<c:url value="/product/viewAllProducts" />" class="btn btn-lg btn-success">
								Continue Shopping
							</a>
						</div>
					</c:if>
			</div>
		</section>
	<!-- Shipping Section Ends -->
	</div>
<!-- Main Container Ends -->

<!-- Address Popup -->
<div id="addressPopupBox">
	<div class="addressPopupBoxHeader">
		<span>Add Shipping Address</span>
		<button type="button" title="Close" class="btn-danger tool-tip" style="max-width: 40px; float: right;">
			<i class="fa fa-times"></i> 
		</button>
	</div>
	
	<div class="addressPopupForm">
	  
	</div>
	
</div>

<!-- Footer File -->
<%@ include file="/WEB-INF/views/fragments/footer.jsp" %>

</body>

</html>
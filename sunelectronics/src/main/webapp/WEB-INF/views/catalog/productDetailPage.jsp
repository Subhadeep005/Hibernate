<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:url value="/resources" var="resourceUrl" />
<c:url value="/product" var="productDetailPageUrl" />

<!doctype html>
<html lang="en">
<head>
	<title>Product Detail Page</title>
	
	<!-- CSS Links File -->
	<%@ include file="/WEB-INF/views/fragments/links.jsp" %>
	
	<!-- Additional CSS and JavaScript to Display Product Images and hover function -->
	<link rel="stylesheet" href="${resourceUrl}/css/etalage.css">
	<script src="${resourceUrl}/js/jquery.etalage.min.js"></script>
	<script type="text/javascript" src="${resourceUrl}/js/product.views.js"></script>
</head>
<body>
	
	<!-- Header File -->
	<%@ include file="/WEB-INF/views/fragments/header.jsp" %>

<!-- Main Container Starts -->
	<div id="main-container" class="container">
	<!-- Breadcrumb Starts -->
		<ol class="breadcrumb">
			<li><a href="index-2.html">Home</a></li>
			<li><a href="category-grid.html">Category</a></li>
			<li class="active">Product</li>
		</ol>
	<!-- Breadcrumb Ends -->
	<!-- Product Info Starts -->
		<div class="row product-info full">
		<!-- Left Starts -->
			<div class="col-sm-4 images-block">				
				<ul id="etalage">
					<c:forEach items="${product.productImages}" var="productImage">
					<li>
						<a href="optionallink.html">
							<img class="etalage_thumb_image" src="${resourceUrl}/images/products/${productImage.name}" class="img-responsive" />
							<img class="etalage_source_image" src="${resourceUrl}/images/products/${productImage.name}" class="img-responsive" title="" />
						</a>
					</li>
					</c:forEach>
				</ul>		
			</div>
		<!-- Left Ends -->

		
		<!-- Right Starts -->
			<div class="col-sm-8 product-details">
				<div class="panel-smart">
				<!-- Product Name Starts -->
					<h2>${product.name}</h2>
				<!-- Product Name Ends -->
					<hr />
				<!-- Manufacturer Starts -->
					<ul class="list-unstyled manufacturer">
						<li>
							<span>Manufacturer:</span> ${product.manufacturer}
						</li>
						<li><span>Model:</span> ${product.model}</li>
						<li>
							<c:if test="${product.quantity eq null}">
								<span>Availability:</span> <strong class="label label-danger">Out Of Stock</strong>
							</c:if>
							<c:if test="${product.quantity ne null}">
								<span>Availability:</span> <strong>${product.quantity} Items</strong> <strong class="label label-success">Available</strong>
							</c:if>
						</li>
					</ul>
				<!-- Manufacturer Ends -->
					<hr />
				<!-- Price Starts -->
					<div class="price">
						<span class="price-head">Price :</span>
						<span class="price-new">Rs. ${product.price}</span> 
						<span class="price-old">Rs. ${product.price}</span>
						<p class="price-tax">Tax: Rs. 0.0</p>
					</div>
				<!-- Price Ends -->
					<hr />
				<!-- Available Options Starts -->
					<div class="options">
						<div class="cart-button button-group">
							<div class="addItemBox">
								<c:url value="/cart/add" var="addToCartUrl" />
								<form method="POST" action="${addToCartUrl}">
									<input type="hidden" name="productId" value="${product.id}" />
									<input type="hidden" name="quantity" value="1" />
									<input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}"/>
									<button type="button" class="addToCart btn btn-cart">
										Add to cart
										<i class="fa fa-shopping-cart"></i> 
									</button>
								</form>
							</div>									
						</div>
						<!-- Check Availability of product at specified zipcode -->
						<hr>
						<div class="diliveryAvailbility">
							<form class="form-inline" action="#">
								  <div class="form-group">
								    <p class="form-control-static"><strong>Check Availability: </strong></p>
								  </div>
								  <div class="form-group mx-sm-3">
								    <input type="tel" pattern="[0-9]{6}" class="form-control" id="deliveryZipcode" placeholder="Enter Zipcode">
								  </div>
								  <button type="submit" class="btn btn-primary">Check</button>
							</form>
						</div> <!-- Ends Check Availability -->
					</div>
				<!-- Available Options Ends -->
				</div>
			</div>
		<!-- Right Ends -->
		</div>
	<!-- Product Info Ends -->	
	
	<!-- Tabs Starts -->
		<div class="tabs-panel panel-smart">
		<!-- Nav Tabs Starts -->
			<ul class="nav nav-tabs">
				<li class="active">
					<a href="#tab-description">Description</a>
				</li>
				<li>
					<a href="#tab-specification">Specification</a>
				</li>
				<li><a href="#tab-ainfo">Additional Information</a></li>
				<li><a href="#tab-review">Review</a></li>
			</ul>
		<!-- Nav Tabs Ends -->
		<!-- Tab Content Starts -->
			<div class="tab-content clearfix">
			<!-- Description Starts -->
				<div class="tab-pane active" id="tab-description">
					<p>
						${product.description}
					</p>
				</div>
			<!-- Description Ends -->
			<!-- Specification Starts -->
				<div class="tab-pane" id="tab-specification">
					<table class="table table-bordered">
						<tr>
							<th>Name</th>
							<th>Attribute Specification</th>
						  </tr>
						<c:forEach items="${product.productAttributes}" var="attribute">
						  <tr>
							<td>${attribute.name}</td>
							<td>${attribute.value}</td>
						  </tr>
						</c:forEach>
					</table>
				</div>
			<!-- Specification Ends -->
			<!-- Additional Information Starts -->
				<div class="tab-pane" id="tab-ainfo">
					<p>
						${product.additionalInfo}
					</p>
				</div>
			<!-- Additional Information Ends -->
			<!-- Review Starts -->
				<div class="tab-pane" id="tab-review">
					<form class="form-horizontal">
						<div class="form-group required">
							<label class="col-sm-2 control-label" for="input-name">Name</label>
							<div class="col-sm-10">
							<input type="text" name="name" value="" id="input-name" class="form-control" />
							</div>
						</div>
						<div class="form-group required">
							<label class="col-sm-2 control-label" for="input-review">Review</label>
							<div class="col-sm-10">
								<textarea name="text" rows="5" id="input-review" class="form-control"></textarea>
								<div class="help-block">
									Some note goes here..
								</div>
							</div>
						</div>
						<div class="form-group required">
							<label class="col-sm-2 control-label ratings">Ratings</label>
							<div class="col-sm-10">
								Bad&nbsp;
								<input type="radio" name="rating" value="1" />
								&nbsp;
								<input type="radio" name="rating" value="2" />
								&nbsp;
								<input type="radio" name="rating" value="3" />
								&nbsp;
								<input type="radio" name="rating" value="4" />
								&nbsp;
								<input type="radio" name="rating" value="5" />
								&nbsp;Good
							</div>
						</div>
						<div class="buttons">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="button" id="button-review" class="btn btn-main">
									Submit
								</button>
							</div>
						</div>
					</form>
				</div>
			<!-- Review Ends -->
			</div>
		<!-- Tab Content Ends -->
		</div>
	<!-- Tabs Ends -->		
	<!-- Related Products Starts -->
		<div class="product-info-box">
			<h4 class="heading">Related Products</h4>
		<!-- Products Row Starts -->
			<div class="row">
				<c:forEach items="${relatedProducts}" var="product">
					<!-- Product #1 Starts -->
					<div class="col-md-3 col-sm-6">
						<div class="product-col">
							<div class="image">
								<a href="${productDetailPageUrl}/${product.category}/${product.id}/productDetail">
									<img src="${resourceUrl}/images/products/${product.productImages.get(0)}" alt="product" class="img-responsive" />
								</a>
							</div>
							<div class="caption">
								<h4><a href="${productDetailPageUrl}/${product.category}/${product.id}/productDetail">${product.name}</a></h4>
								<h5>${product.model}</h5>
								<h5>${product.manufacturer}</h5>
								
								<div class="price">
									<span class="price-new">${product.price}</span> 
									<span class="price-old">${product.price}</span>
								</div>
								<div class="cart-button button-group">
									<div class="addItemBox">
										<c:url value="/cart/add" var="addToCartUrl" />
										<form method="POST" action="${addToCartUrl}">
											<input type="hidden" name="productId" value="${product.id}" />
											<input type="hidden" name="quantity" value="1" />
											<input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}"/>
											<button type="button" class="addToCart btn btn-cart">
												Add to cart
												<i class="fa fa-shopping-cart"></i> 
											</button>
										</form>
									</div>									
								</div>
							</div>
						</div>
					</div>
					<!-- Product #1 Ends -->
				</c:forEach> 
			</div>
		<!-- Products Row Ends -->
		</div>
	<!-- Related Products Ends -->
	</div>
<!-- Main Container Ends -->			

<!-- Footer File -->
<%@ include file="/WEB-INF/views/fragments/footer.jsp" %>

</body>

</html>
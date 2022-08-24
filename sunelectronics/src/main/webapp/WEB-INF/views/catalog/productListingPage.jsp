<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:url value="/resources" var="resourceUrl" />
<c:url value="/product" var="productDetailPageUrl" />

<!doctype html>
<html lang="en">
<head>
	<title>Products Listing Page</title>
	
	<!-- CSS Links File -->
	<%@ include file="/WEB-INF/views/fragments/links.jsp" %>
</head>
<body>
	
	<!-- Header File -->
	<%@ include file="/WEB-INF/views/fragments/header.jsp" %>

<!-- Main Container Starts -->
	<div id="main-container" class="container">
		<div class="row">
		
		<!-- Sidebar Starts -->
			<div class="col-md-3">
			<!-- Categories Links Starts -->
				<h3 class="side-heading">Categories</h3>
				<div class="list-group categories">
					<a href="<c:url value="/product/electronics/Camera"/>" class="list-group-item">
						<i class="fa fa-chevron-right"></i>
						Digital Cameras
					</a>
					<a href="<c:url value="/product/electronics/sound-device"/>" class="list-group-item">
						<i class="fa fa-chevron-right"></i>
						Sound Devices
					</a>
					<a href="<c:url value="/product/electronics/Television"/>" class="list-group-item">
						<i class="fa fa-chevron-right"></i>
						Televisions
					</a>
					<a href="<c:url value="/product/electronics/Computer"/>" class="list-group-item">
						<i class="fa fa-chevron-right"></i>
						Computers
					</a>
					<a href="<c:url value="/product/electronics/washing-machine"/>" class="list-group-item">
						<i class="fa fa-chevron-right"></i>
						Washing Machines
					</a>
					<a href="<c:url value="/product/electronics/Accessorie"/>" class="list-group-item">
						<i class="fa fa-chevron-right"></i>
						Accessories
					</a>
					<a href="<c:url value="/product/electronics/Mobile"/>" class="list-group-item">
						<i class="fa fa-chevron-right"></i>
						Mobile Phones
					</a>
				</div>
			<!-- Categories Links Ends -->
			<!-- Shopping Options Starts -->
				<h3 class="side-heading">Shopping Options</h3>
				<div class="list-group">
					<div class="list-group-item">
						Brands
					</div>
					<div class="list-group-item">
						<div class="filter-group">
							<label class="checkbox">
								<input name="filter1" type="checkbox" value="br1" checked="checked" />
								Brand Name 1
							</label>
							<label class="checkbox">
								<input name="filter2" type="checkbox" value="br2" />
								Brand Name 2
							</label>
							<label class="checkbox">
								<input name="filter2" type="checkbox" value="br2" />
								Brand Name 3
							</label>
						</div>
					</div>
					<div class="list-group-item">
						Manufacturer
					</div>
					<div class="list-group-item">
						<div class="filter-group">
							<label class="radio">
								<input name="filter-manuf" type="radio" value="mr1" checked="checked" />
								Manufacturer Name 1
							</label>
							<label class="radio">
								<input name="filter-manuf" type="radio" value="mr2" />
								Manufacturer Name 2
							</label>
							<label class="radio">
								<input name="filter-manuf" type="radio" value="mr3" />
								Manufacturer Name 3
							</label>
						</div>							
					</div>	
					<div class="list-group-item">
						<button type="button" class="btn btn-main">Filter</button>
					</div>
				</div>
			<!-- Shopping Options Ends -->
			<!-- Bestsellers Links Starts -->
				<h3 class="side-heading">Bestsellers</h3>
				<div class="product-col">
					<div class="image">
						<img src="${resourceUrl}/images/product-images/pimg1.jpg" alt="product" class="img-responsive" />
					</div>
					<div class="caption">
						<h4>
							<a href="${productDetailPageUrl}/${product.category}/${product.id}/productDetail">Digital Electro Goods</a>
						</h4>
						<div class="description">
							We are so lucky living in such a wonderful time. Our almost unlimited ...
						</div>
						<div class="price">
							<span class="price-new">$199.50</span> 
							<span class="price-old">$249.50</span>
						</div>
						<div class="cart-button button-group">
							<button type="button" title="Wishlist" class="btn btn-wishlist">
								<i class="fa fa-heart"></i>
							</button>
							<button type="button" title="Compare" class="btn btn-compare">
								<i class="fa fa-bar-chart-o"></i>
							</button>
							<button type="button" class="btn btn-cart">
								Add to cart
								<i class="fa fa-shopping-cart"></i> 
							</button>									
						</div>
					</div>
				</div>
			<!-- Bestsellers Links Ends -->
			</div>
		<!-- Sidebar Ends -->
		<!-- Primary Content Starts -->
			<div class="col-md-9">
			<!-- Breadcrumb Starts -->
				<ol class="breadcrumb">
					<li><a href="<c:url value="/" />">Home</a></li>
					<li class="active">Spices &amp; Herbs</li>
				</ol>
			<!-- Breadcrumb Ends -->

			<!-- Product Filter Starts -->
				<div class="product-filter">
					<div class="row">
						<div class="col-md-4">
							<div class="display">
								<a href="category-list.html">
									<i class="fa fa-th-list" title="List View"></i>
								</a>
								<a href="category-grid.html" class="active">
									<i class="fa fa-th" title="Grid View"></i>
								</a>
							</div>
						 </div>
						<div class="col-md-2 text-right">
							<label class="control-label">Sort</label>
						</div>
						<div class="col-md-3 text-right">
							<select class="form-control">
								<option value="default" selected="selected">Default</option>
								<option value="NAZ">Name (A - Z)</option>
								<option value="NZA">Name (Z - A)</option>
							</select>
						</div>
						<div class="col-md-1 text-right">
							<label class="control-label" for="input-limit">Show</label>
						</div>
						<div class="col-md-2 text-right">
							<select id="input-limit" class="form-control">
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3" selected="selected">3</option>
							</select>
						</div>
					</div>						 
				</div>
			<!-- Product Filter Ends -->
			<!-- Product Grid Display Starts -->
				<div class="row">
				<!-- Product #1 Starts -->
					<c:forEach items="${productList}" var="product">
					<div class="col-md-4 col-sm-6">
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
											<button type="button" class="btn btn-cart">
												Add to cart
												<i class="fa fa-shopping-cart"></i> 
											</button>
										</form>
									</div>									
								</div>
							</div>
						</div>
					</div>
					</c:forEach>
				<!-- Product #1 Ends -->
				
				
				</div>
			<!-- Product Grid Display Ends -->
			</div>
		<!-- Primary Content Ends -->
		</div>
	</div>
<!-- Main Container Ends -->			

<!-- Footer File -->
<%@ include file="/WEB-INF/views/fragments/footer.jsp" %>

</body>

</html>
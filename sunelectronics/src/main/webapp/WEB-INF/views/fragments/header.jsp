<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/product/viewAllProducts" var="productListingPageUrl" />

<!-- Header Section Starts -->
	<header id="header-area">
	<!-- Header Top Starts -->
		<div class="header-top">
			<div class="container">
				<div class="row">
				<!-- Header Links Starts -->
					<div class="col-sm-8 col-xs-12">
						<div class="header-links">
							<ul class="nav navbar-nav pull-left">
								<li>
									<a href="<c:url value="/"/>">
										<i class="fa fa-home hidden-lg hidden-md" title="Home"></i>
										<span class="hidden-sm hidden-xs">
											Home
										</span>
									</a>
								</li>
								<li>
									<a href="<c:url value="/contactus"/>">	
										<i class="fa fa-heart hidden-lg hidden-md" title="Contact Us"></i>
										<span class="hidden-sm hidden-xs">
											Contact Us
										</span>
									</a>
								</li>
								<li>
									<a href="#">
										<i class="fa fa-user hidden-lg hidden-md" title="My Account"></i>
										<span class="hidden-sm hidden-xs">
											My Account
										</span>
									</a>
								</li>
								<li>
									<a href="<c:url value="/cart/init" />">
										<i class="fa fa-shopping-cart hidden-lg hidden-md" title="Shopping Cart"></i>
										<span class="hidden-sm hidden-xs">
											Shopping Cart
										</span>
									</a>
								</li>
								<li>
									<a href="<c:url value="/checkout" />">
										<i class="fa fa-crosshairs hidden-lg hidden-md" title="Checkout"></i>
										<span class="hidden-sm hidden-xs">
											Checkout
										</span>
									</a>
								</li>
								<li>
									<a href="<c:url value="/register"/>">
										<i class="fa fa-unlock hidden-lg hidden-md" title="Register"></i>
										<span class="hidden-sm hidden-xs">
											Register
										</span>
									</a>
								</li>
								<li>
									<a href="<c:url value="/login"/>">
										<i class="fa fa-lock hidden-lg hidden-md" title="Login"></i>
										<span class="hidden-sm hidden-xs">
											Login
										</span>
									</a>
								</li>
							</ul>
						</div>
					</div>
				<!-- Header Links Ends -->
				<!-- Currency & Languages Starts -->
					<div class="col-sm-4 col-xs-12">
						<div class="pull-right">
						<!-- Currency Starts -->
							<div>
								<p style="color: #FFF;">
									${pageContext.request.userPrincipal.name}
								</p>
							</div>
						<!-- Currency Ends -->
						<c:if test="${pageContext.request.userPrincipal.name != null}">
						<!-- Languages Starts -->
							<div class="btn-group">
								<c:url value="/j_spring_security_logout" var="logoutUrl" />
								<form action="${logoutUrl}" method="post">
									<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" >
									<input type="submit" value="Logout" class="btn btn-link">
									<i class="fa fa-caret-down"></i>
								</form>
							</div>
						<!-- Languages Ends -->
						</c:if>
						</div>
					</div>
				<!-- Currency & Languages Ends -->
				</div>
			</div>
		</div>
	<!-- Header Top Ends -->
	<!-- Main Header Starts -->
		<div class="main-header">
			<div class="container">
				<div class="row">
					<!-- Logo Starts -->
					<div class="col-md-3">
						<div id="logo" class="pull-left">
							<a href="<c:url value="/"/>"><img src="${resourceUrl}/images/logo.png" title="Sun Electronics" alt="Sun Electronics" class="img-responsive" /></a>
						</div>
					</div>
					<!-- Logo Starts -->
					<!-- Search Starts -->
					<div class="col-md-6">
						<div id="search">
							<div class="input-group">
							  <input type="text" id="w-input-search" value="" class="form-control input-lg" placeholder="Search Products">
							  <div class="autocomplete-suggestions">
							    <div class="autocomplete-group"><strong></strong></div>
							    <div class="autocomplete-suggestion autocomplete-selected"></div>
							    <div class="autocomplete-suggestion"></div>
							    <div class="autocomplete-suggestion"></div>
							  </div>
							  <span class="input-group-btn">
								<button class="btn btn-lg" type="button">
									<i class="fa fa-search"></i>
								</button>
							  </span>							  
							</div>
						</div>	
					</div>
				<!-- Search Ends -->				
				<!-- Shopping Cart Starts -->
					<div class="col-md-3">
						<div id="cart" class="btn-group btn-block">
							<button type="button" data-toggle="dropdown" class="btn btn-block btn-lg dropdown-toggle">
								<i class="fa fa-shopping-cart"></i>
								<span class="hidden-md">Cart:</span> 
								<span id="cart-total">
									<span id="total-cart-items">
										${sessionScope.cart eq null ? 0 : sessionScope.cart.totalQuantity}
									</span> item(s) - Rs 
									<span id="total-cart-price">${sessionScope.cart eq null ? 0.0 :sessionScope.cart.total}</span>
								</span>
								<i class="fa fa-caret-down"></i>
							</button>
							<ul class="dropdown-menu pull-right">
								<c:if test="${sessionScope.cart ne null and sessionScope.cart.orderItems.size() > 0 }">
								<li>
									<table class="table hcart">
										<c:forEach items="${sessionScope.cart.orderItems}" var="item">
										<tr>
											<td class="text-left">
												<a href="${productDetailPageUrl}/${item.category}/${item.productId}/productDetail">
													<img style="max-width: 30px; min-height: 30px;" src="${resourceUrl}/images/products/${item.productId}_1.jpg" alt="${item.name}" title="Product Name" class="img-thumbnail" />
												</a>
											</td>
											<td class="text-left">
												<a href="${productDetailPageUrl}/${item.category}/${item.productId}/productDetail">
													${item.name}
												</a>
											</td>
											<td class="text-right">${item.quantity}</td>
											<td class="text-right">${item.salePrice}</td>
											<td class="text-center">
												<div class="removeItemBox">
													<c:url value="/cart/remove" var="removeFromCartUrl" />
													<form method="POST" action="${removeFromCartUrl}">
														<input type="hidden" name="itemId" value="${item.id}" />
														<input type="hidden" name="productId" value="${item.productId}" />
														<input type="hidden" name="quantity" value="${item.quantity}" />
														<input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}"/>
														<button type="button" title="Remove" class="btn-danger tool-tip" style="max-width: 40px;">
															<i class="fa fa-times"></i> 
														</button>
													</form>
												</div>
											</td>
										</tr>
										</c:forEach>
									</table>
								</li>
								<li>
									<table class="table table-bordered total">
										<tbody>
											<tr>
												<td class="text-right"><strong>Sub-Total</strong></td>
												<td class="text-left">${sessionScope.cart.subTotal}</td>
											</tr>
											<tr>
												<td class="text-right"><strong>Discount</strong></td>
												<td class="text-left">${sessionScope.cart.totalDiscount}</td>
											</tr>
											<tr>
												<td class="text-right"><strong>Shipping Charges</strong></td>
												<td class="text-left">${sessionScope.cart.totalFulfillmentCharges}</td>
											</tr>
											<tr>
												<td class="text-right"><strong>Total</strong></td>
												<td class="text-left">${sessionScope.cart.total}</td>
											</tr>
										</tbody>
									</table>
									<p class="text-right btn-block1">
										<a href="<c:url value="/cart/init" />">
											View Cart
										</a>
										<a href="<c:url value="/checkout" />">
											Checkout
										</a>
									</p>
								</li>
								</c:if>
								<c:if test="${sessionScope.cart eq null or sessionScope.cart.orderItems.size() == 0 }">
									<li>
										<strong>Shipping Chart is Empty!</strong>
									</li>	
								</c:if>								
							</ul>
						</div>
					</div>
				<!-- Shopping Cart Ends -->
				</div>
			</div>
		</div>
	<!-- Main Header Ends -->
	<!-- Main Menu Starts -->
		<nav id="main-menu" class="navbar" role="navigation">
			<div class="container">
			<!-- Nav Header Starts -->
				<div class="navbar-header">
					<button type="button" class="btn btn-navbar navbar-toggle" data-toggle="collapse" data-target=".navbar-cat-collapse">
						<span class="sr-only">Toggle Navigation</span>
						<i class="fa fa-bars"></i>
					</button>
				</div>
			<!-- Nav Header Ends -->
			<!-- Navbar Cat collapse Starts -->
				<div class="collapse navbar-collapse navbar-cat-collapse">
					<ul class="nav navbar-nav">
						
						<li class="dropdown">
							<a href="${productListingPageUrl}" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="10">
								Digital Camera
							</a>
							<ul class="dropdown-menu" role="menu">
								<li><a tabindex="-1" href="${productListingPageUrl}">Canon</a></li>
								<li><a tabindex="-1" href="${productListingPageUrl}">Sony</a></li>
							</ul>
						</li>
						
						<li class="dropdown">
							<a href="${productListingPageUrl}" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="10">
								Sound Devices
							</a>
							<ul class="dropdown-menu" role="menu">
								<li><a tabindex="-1" href="#">I Wall</a></li>
								<li><a tabindex="-1" href="#">Intex</a></li>
							</ul>
						</li>
						
						<li class="dropdown">
							<a href="${productListingPageUrl}" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="10">
								Televisions
							</a>
							<ul class="dropdown-menu" role="menu">
								<li><a tabindex="-1" href="#">Micromax</a></li>
								<li><a tabindex="-1" href="#">Sony</a></li>
							</ul>
						</li>
						
						<li class="dropdown">
							<a href="${productListingPageUrl}" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="10">
								Computers
							</a>
							<ul class="dropdown-menu" role="menu">
								<li><a tabindex="-1" href="#">Apple</a></li>
								<li><a tabindex="-1" href="#">Lenovo</a></li>
							</ul>
						</li>
						
						<li class="dropdown">
							<a href="${productListingPageUrl}" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="10">
								Mobile Phones
							</a>
							<ul class="dropdown-menu" role="menu">
								<li><a tabindex="-1" href="#">Apple</a></li>
								<li><a tabindex="-1" href="#">Mi</a></li>
							</ul>
						</li>
						
						<li class="dropdown">
							<a href="${productListingPageUrl}" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="10">
								Accessories
							</a>
							<ul class="dropdown-menu" role="menu">
								<li><a tabindex="-1" href="#">Pen Drives</a></li>
								<li><a tabindex="-1" href="#">Head Phones</a></li>
							</ul>
						</li>
						
						<li class="dropdown">
							<a href="${productListingPageUrl}" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="10">
								Washing Machines
							</a>
							<ul class="dropdown-menu" role="menu">
								<li><a tabindex="-1" href="#">Samsung</a></li>
								<li><a tabindex="-1" href="#">LG</a></li>
							</ul>
						</li>
					</ul>
				</div>
			<!-- Navbar Cat collapse Ends -->
			</div>
		</nav>
	<!-- Main Menu Ends -->
	</header>
<!-- Header Section Ends -->

<div id="alert-autocloseable-success" class="alert alert-success">
	<strong>Item has been added successfully!</strong>
</div>
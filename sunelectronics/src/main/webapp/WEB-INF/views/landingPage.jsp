<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:url value="/resources" var="resourceUrl" />
<c:url value="/product" var="productDetailPageUrl" />

<!doctype html>
<html lang="en">
<head>
	<title>Sun Electronics</title>
	
	<!-- CSS Links File -->
	<%@ include file="/WEB-INF/views/fragments/links.jsp" %>
</head>
<body>
	
	<!-- Header File -->
	<%@ include file="/WEB-INF/views/fragments/header.jsp" %>

<!-- Main Container Starts -->
	<div id="main-container-home" class="container">
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
			<!-- Special Products Starts -->
				<h3 class="side-heading">Specials</h3>
				<ul class="side-products-list">
				<!-- Special Product #1 Starts -->
					<li class="clearfix">
						<img src="${resourceUrl}/images/product-images/spl-product-img1.jpg" alt="Special product" class="img-responsive" />
						<h5><a href="#">Olympus Digital Camera</a></h5>
						<div class="price">
							<span class="price-new">$199.50</span> 
							<span class="price-old">$249.50</span>
						</div>
					</li>
				<!-- Special Product #1 Ends -->
				<!-- Special Product #2 Starts -->
					<li class="clearfix">
						<img src="${resourceUrl}/images/product-images/spl-product-img2.jpg" alt="Special product" class="img-responsive" />
						<h5><a href="#">Olympus Digital Camera</a></h5>
						<div class="price">
							<span class="price-new">$599.50</span> 
						</div>
					</li>
				<!-- Special Product #2 Ends -->
				<!-- Special Product #3 Starts -->
					<li class="clearfix">
						<img src="${resourceUrl}/images/product-images/spl-product-img3.jpg" alt="Special product" class="img-responsive" />
						<h5><a href="#">Olympus Digital Camera</a></h5>
						<div class="price">
							<span class="price-new">$199.50</span> 
							<span class="price-old">$249.50</span>
						</div>
					</li>
				<!-- Special Product #3 Ends -->
				<!-- Special Product #4 Starts -->
					<li class="clearfix">
						<img src="${resourceUrl}/images/product-images/spl-product-img1.jpg" alt="Special product" class="img-responsive" />
						<h5><a href="#">Olympus Digital Camera</a></h5>
						<div class="price">
							<span class="price-new">$199.50</span> 
						</div>
					</li>
				<!-- Special Product #4 Ends -->
				<!-- Special Product #5 Starts -->
					<li class="clearfix">
						<img src="${resourceUrl}/images/product-images/spl-product-img2.jpg" alt="Special product" class="img-responsive" />
						<h5><a href="#">Olympus Digital Camera</a></h5>
						<div class="price">
							<span class="price-new">$599.50</span> 
						</div>
					</li>
				<!-- Special Product #5 Ends -->
				</ul>
			<!-- Special Products Ends -->
			<!-- Banner #1 Starts -->
				<img src="${resourceUrl}/images/banners/side-banner1.jpg" alt="Side Banner" class="img-responsive" />
				<br>
			<!-- Banner #1 Ends -->
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
								<input name="filter3" type="checkbox" value="br3" />
								Brand Name 3
							</label>
							<label class="checkbox">
								<input name="filter4" type="checkbox" value="br4" />
								Brand Name 4
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
						<button type="button" class="btn btn-black">Filter</button>
					</div>
				</div>
			<!-- Shopping Options Ends -->
			</div>
		<!-- Sidebar Ends -->		
		<!-- Primary Content Starts -->
			<div class="col-md-9">
			<!-- Slider Section Starts -->
				<div class="slider">
					<div id="main-carousel" class="carousel slide" data-ride="carousel">
					<!-- Wrapper For Slides Starts -->
						<div class="carousel-inner">
							<div class="item active">
								<img src="${resourceUrl}/images/slider-imgs/slide1-img.jpg" alt="Slider" class="img-responsive" />
							</div>
							<div class="item">
								<img src="${resourceUrl}/images/slider-imgs/slide2-img.jpg" alt="Slider" class="img-responsive" />
							</div>
						</div>
					<!-- Wrapper For Slides Ends -->
					<!-- Controls Starts -->
						<a class="left carousel-control" href="#main-carousel" role="button" data-slide="prev">
							<span class="glyphicon glyphicon-chevron-left"></span>
						</a>
						<a class="right carousel-control" href="#main-carousel" role="button" data-slide="next">
							<span class="glyphicon glyphicon-chevron-right"></span>
						</a>
					<!-- Controls Ends -->
					</div>	
				</div>
			<!-- Slider Section Ends -->
			<!-- 2 Column Banners Starts -->
				<div class="col2-banners">
					<ul class="row list-unstyled">
						<li class="col-sm-8">
							<img src="${resourceUrl}/images/banners/2col-banner1.jpg" alt="banners" class="img-responsive" />
						</li>
						<li class="col-sm-4">
							<img src="${resourceUrl}/images/banners/2col-banner2.jpg" alt="banners" class="img-responsive" />
						</li>
					</ul>
				</div>
			<!-- 2 Column Banners Ends -->
			<!-- Latest Products Starts -->
				<section class="product-carousel">
				<!-- Heading Starts -->
					<h2 class="product-head">Latest Products</h2>
				<!-- Heading Ends -->
				<!-- Products Row Starts -->
					<div class="row">
						<div class="col-xs-12">
						<!-- Product Carousel Starts -->
							<div id="owl-product" class="owl-carousel">
								<!-- Product #1 Starts -->
								<c:forEach items="${newProducts}" var="product">
								<div class="item">
									<div class="product-col">
										<div class="image">
											<a href="${productDetailPageUrl}/${product.category}/${product.id}/productDetail">
												<img src="${resourceUrl}/images/products/${product.productImages.get(0)}" alt="product" class="img-responsive" />
											</a>
										</div>
										<div class="caption">
											<h4><a href="${productDetailPageUrl}/${product.category}/${product.id}/productDetail">${product.name}</a></h4>
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
						<!-- Product Carousel Ends -->
						</div>
					</div>
				<!-- Products Row Ends -->
				</section>
			<!-- Latest Products Ends -->
			<!-- Specials Products Starts -->
				<section class="products-list">			
				<!-- Heading Starts -->
					<h2 class="product-head">Specials Products</h2>
				<!-- Heading Ends -->
				<!-- Products Row Starts -->
					<div class="row">
					<!-- Product #1 Starts -->
						<div class="col-md-4 col-sm-6">
							<div class="product-col">
								<div class="image">
									<img src="${resourceUrl}/images/product-images/9.jpg" alt="product" class="img-responsive" />
								</div>
								<div class="caption">
									<h4>
										<a href="product-full.html">Digital Electro Goods</a>
									</h4>
									<div class="description">
										We are so lucky living in such a wonderful time. Our almost unlimited ...
									</div>
									<div class="price">
										<span class="price-new">$199.50</span> 
										<span class="price-old">$249.50</span>
									</div>
									<div class="cart-button">
										<button type="button" class="btn btn-cart">
											Add to cart
											<i class="fa fa-shopping-cart"></i> 
										</button>									
									</div>
								</div>
							</div>
						</div>
					<!-- Product #1 Ends -->
					<!-- Product #2 Starts -->
						<div class="col-md-4 col-sm-6">
							<div class="product-col">
								<div class="image">
									<img src="${resourceUrl}/images/product-images/10.jpg" alt="product" class="img-responsive" />
								</div>
								<div class="caption">
									<h4>
										<a href="product-full.html">Digital Electro Goods</a>
									</h4>
									<div class="description">
										We are so lucky living in such a wonderful time. Our almost unlimited ...
									</div>
									<div class="price">
										<span class="price-new">$199.50</span> 
										<span class="price-old">$249.50</span>
									</div>
									<div class="cart-button">
										<button type="button" class="btn btn-cart">
											Add to cart
											<i class="fa fa-shopping-cart"></i> 
										</button>									
									</div>
								</div>
							</div>
						</div>
					<!-- Product #2 Ends -->
					<!-- Product #3 Starts -->
						<div class="col-md-4 col-sm-6">
							<div class="product-col">
								<div class="image">
									<img src="${resourceUrl}/images/product-images/11.jpg" alt="product" class="img-responsive" />
								</div>
								<div class="caption">
									<h4>
										<a href="product-full.html">Digital Electro Goods</a>
									</h4>
									<div class="description">
										We are so lucky living in such a wonderful time. Our almost unlimited ...
									</div>
									<div class="price">
										<span class="price-new">$199.50</span> 
										<span class="price-old">$249.50</span>
									</div>
									<div class="cart-button">
										<button type="button" class="btn btn-cart">
											Add to cart
											<i class="fa fa-shopping-cart"></i> 
										</button>									
									</div>
								</div>
							</div>
						</div>
					<!-- Product #3 Ends -->
					</div>
				<!-- Products Row Ends -->
				</section>
			<!-- Specials Products Ends -->
			</div>
		<!-- Primary Content Ends -->
		</div>
	</div>
<!-- Main Container Ends -->			

<!-- Footer File -->
<%@ include file="/WEB-INF/views/fragments/footer.jsp" %>

</body>

</html>
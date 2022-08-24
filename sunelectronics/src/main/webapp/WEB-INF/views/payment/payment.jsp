<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:url value="/resources" var="resourceUrl" />
<c:url value="/product" var="productDetailPageUrl" />

<!doctype html>
<html lang="en">
<head>
	<title>Payment | Sun Electronics</title>
	
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
			<li class="active">Payment</li>
		</ol>
	<!-- Breadcrumb Ends -->

	<!-- Payment Options Starts -->
		<section class="registration-area">
			<div class="row">
				<div class="col-md-9">
					<!-- Nav tabs -->
					<ul class="nav nav-tabs" role="tablist">
						<li role="presentation" class="active"><a href="#net-banking" aria-controls="net-banking" role="tab" data-toggle="tab">Net Banking</a></li>
						<li role="presentation"><a href="#debit-card" aria-controls="debit-card" role="tab" data-toggle="tab">Debit Card</a></li>
						<li role="presentation"><a href="#credit-card" aria-controls="credit-card" role="tab" data-toggle="tab">Credit Card</a></li>
						<li role="presentation"><a href="#wallet" aria-controls="wallet" role="tab" data-toggle="tab">Wallet</a></li>
					</ul>
					
					<!-- Tab panes -->
					<div class="tab-content">
						<!-- Net Banking Tab -->
						<div role="tabpanel" class="tab-pane active" id="net-banking">
							<h3>Popular Banks</h3>
							<div class="row popular-banks">
								<div class="col-sm-3">
									<input type="radio" name="populerBank" value="">
									<img src="${resourceUrl}/images/bank/indusind.jpg" class="img-responsive img-thumbnail" alt="Indusind Bank">
								</div>
								<div class="col-sm-3">
									<input type="radio" name="populerBank" value="">
									<img src="${resourceUrl}/images/bank/sbi.jpg" class="img-responsive img-thumbnail" alt="State Bank of India">
								</div>
								<div class="col-sm-3">
									<input type="radio" name="populerBank" value="">
									<img src="${resourceUrl}/images/bank/hdfc.jpg" class="img-responsive img-thumbnail" alt="HDFC Bank">
								</div>
								<div class="col-sm-3">
									<input type="radio" name="populerBank" value="">
									<img src="${resourceUrl}/images/bank/icici.jpg" class="img-responsive img-thumbnail" alt="ICICI Bank">
								</div>
							</div><!-- Ends Popular Banks -->
							<hr>
							<!-- Bank List -->
							<div>
								<div class="form-group row">
							      <label for="bankList" class="col-sm-2 col-form-label">Select Your Bank: </label>
							      <div class="col-sm-4">
							        <select name="bankCode" class="form-control">
							        	<option value="">Indusind Bank</option>
							        	<option value="">State Bank of India</option>
							        	<option value="">HDFC Bank</option>
							        	<option value="">ICICI Bank</option>
							        </select>
							      </div>
							    </div>
							</div> <!-- Ends Bank List -->
						</div>
						
						<!-- Debit Card Tab -->
						<div role="tabpanel" class="tab-pane" id="debit-card">
							<form class="debitCard">
							    <div class="form-group row">
							      <label for="debitCardNumber" class="col-sm-2 col-form-label">Debit Card Number: </label>
							      <div class="col-sm-6">
							        <input type="text" class="form-control" id="debitCardNumber" placeholder="Debit Card Number">
							      </div>
							    </div>
							    <div class="form-group row">
							      <label for="cardHolderName" class="col-sm-2 col-form-label">Card Holder Name: </label>
							      <div class="col-sm-6">
							        <input type="text" class="form-control" id="cardHolderName" placeholder="Card Holder Name">
							      </div>
							    </div>
								<div class="form-group row">
							      <label for="cvvNumber" class="col-sm-2 col-form-label">CVV Number: </label>
							      <div class="col-sm-2">
							        <input type="text" class="form-control" id="cvvNumber" placeholder="CVV Number">
							      </div>
							    </div>
								<div class="form-group row">
							      <label for="expiryDate" class="col-sm-2 col-form-label">Expiry Date: </label>
								  <label for="expiryMonth" class="col-sm-1 col-form-label">Month: </label>
							      <div class="col-sm-1">
							        <input type="text" class="form-control" id="expiryMonth" placeholder="Month">
							      </div>
								  <label for="expiryYear" class="col-sm-1 col-form-label">Year: </label>
							      <div class="col-sm-2">
							        <input type="text" class="form-control" id="expiryYear" placeholder="Year">
							      </div>
							    </div>
							</form>
						</div>
						
						<!-- Credit Card Tab -->
						<div role="tabpanel" class="tab-pane" id="credit-card">
							<form class="creditCard">
							    <div class="form-group row">
							      <label for="creditCardNumber" class="col-sm-2 col-form-label">Credit Card Number: </label>
							      <div class="col-sm-6">
							        <input type="text" class="form-control" id="creditCardNumber" placeholder="Credit Card Number">
							      </div>
							    </div>
							    <div class="form-group row">
							      <label for="cardHolderName" class="col-sm-2 col-form-label">Card Holder Name: </label>
							      <div class="col-sm-6">
							        <input type="text" class="form-control" id="cardHolderName" placeholder="Card Holder Name">
							      </div>
							    </div>
								<div class="form-group row">
							      <label for="cvvNumber" class="col-sm-2 col-form-label">CVV Number: </label>
							      <div class="col-sm-2">
							        <input type="text" class="form-control" id="cvvNumber" placeholder="CVV Number">
							      </div>
							    </div>
								<div class="form-group row">
							      <label for="expiryDate" class="col-sm-2 col-form-label">Expiry Date: </label>
								  <label for="expiryMonth" class="col-sm-1 col-form-label">Month: </label>
							      <div class="col-sm-1">
							        <input type="text" class="form-control" id="expiryMonth" placeholder="Month">
							      </div>
								  <label for="expiryYear" class="col-sm-1 col-form-label">Year: </label>
							      <div class="col-sm-2">
							        <input type="text" class="form-control" id="expiryYear" placeholder="Year">
							      </div>
							    </div>
							</form>
						</div>
						
						<!-- Wallet yab -->
						<div role="tabpanel" class="tab-pane" id="wallet">
							<h1>Wallet</h1>
						</div>
					</div>
					<button class="btn btn-lg btn-danger pull-right">Pay Now</button>
				</div>
				<div class="col-md-3">
					<!-- Total Panel Starts -->
					<div class="panel panel-smart">
						<div class="panel-heading">
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
						</div>
					</div>
				<!-- Total Panel Ends -->
				</div>
			</div>
		</section>
	<!-- Payment Options Ends -->
	</div>
<!-- Main Container Ends -->

<!-- Footer File -->
<%@ include file="/WEB-INF/views/fragments/footer.jsp" %>

</body>

</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    

<c:url value="/checkout/shipping-address/add?${_csrf.parameterName}=${_csrf.token}" var="shippingAddressUrl" />

 <form name="addressForm" action="${shippingAddressUrl}" method="POST">
   <div class="form-group row">
     <label for="addressLine1" class="col-sm-2 col-form-label">Address Line1</label>
     <div class="col-sm-10">
       <input type="text" class="form-control" name="addressLine1" placeholder="Address Line1">
     </div>
   </div>
   <div class="form-group row">
     <label for="addressLine2" class="col-sm-2 col-form-label">Address Line2</label>
     <div class="col-sm-10">
       <input type="text" class="form-control" name="addressLine2" placeholder="Address Line2">
     </div>
   </div>
   <div class="form-group row">
     <label for="addressLine3" class="col-sm-2 col-form-label">Address Line3</label>
     <div class="col-sm-10">
       <input type="text" class="form-control" name="addressLine3" placeholder="Address Line3">
     </div>
   </div>
   <div class="form-group row">
     <label for="landmark" class="col-sm-2 col-form-label">Landmark</label>
     <div class="col-sm-10">
       <input type="text" class="form-control" name="landmark" placeholder="Landmark">
     </div>
   </div>
   <div class="form-group row">
     <label for="city" class="col-sm-2 col-form-label">City</label>
     <div class="col-sm-10">
       <input type="text" class="form-control" name="city" placeholder="City">
     </div>
   </div>
   <div class="form-group row">
     <label for="state" class="col-sm-2 col-form-label">State</label>
     <div class="col-sm-10">
       <input type="text" class="form-control" name="state" placeholder="State">
     </div>
   </div>
   <div class="form-group row">
     <label for="zipcode" class="col-sm-2 col-form-label">Zipcode</label>
     <div class="col-sm-10">
       <input type="text" class="form-control" name="zipcode" placeholder="Zipcode">
     </div>
   </div>
   <div class="form-group row">
     <label for="phone" class="col-sm-2 col-form-label">Phone</label>
     <div class="col-sm-10">
       <input type="tel" pattern="[0-9]{10}" class="form-control" name="phone" placeholder="Phone">
     </div>
   </div>
 
   <div class="form-group row">
     <div class="col-sm-2"></div>
     <div class="col-sm-4">
       <input type="checkbox" name="isDefault" value="true">
       Default Address
     </div>
     <div class="col-sm-4">
       <input type="checkbox" name="isBusiness" value="true">
       Business Address
     </div>
     <div class="col-sm-2">
     	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
       <button type="button" class="btn btn-danger pull-right">Save</button>
     </div>
   </div>
 </form>
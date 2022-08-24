/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

/**
 * Intercept add to cart operations and perform them via AJAX instead.
 *  This will trigger on any input with class "addToCart" or "addToWishlist"
 */

$(document).ready(function() {
	//To display Shipping Address Popup
	$(document).on("click", "#addressPopupDisplayBtn", function(event) {
		event.preventDefault();

		$.ajax({
			type: 'GET',
			url: $(this).attr('href'),
			cache: false,
			success: function(response){
				$('.addressPopupForm').html(response);
			},
			error: function (request, status, error) {
		        $('.addressPopupForm').html(request.responseText);
		    }
		});
		
		$('#addressPopupBox').css("display","block");		
	
		return false;
		
	});
	
	//To Remove Shipping Address Popup
	$(document).on("click", ".addressPopupBoxHeader button", function(event) {
		event.preventDefault();
		
		$('#addressPopupBox').css("display","none");

		return false;
		
	});
	
	//To Send the form data to server via AJAX
	$(document).on("click", ".addressPopupForm button", function(event) {
		event.preventDefault();
		
		var $form = $(this).closest('form');
		
		$.ajax({
			type: 'POST',
			url: $form.attr('action'),
			data: serializeObject($form),
			cache: false,
			success: function(response){
				 var arr = $.map(response, function(data) { return data });
		
				$('.addressPopupForm').html(arr[0]);
				$('.shipping-address').load(' .shipping-address');
			},
			error: function (request, status, error) {
		        $('.addressPopupForm').html(request.responseText);
		    },
			beforeSend: function() {
				$('.addressPopupForm').html("Sending.....");
			}
		});

		return false;
	});
	
});



//Serialize form data
function serializeObject($form){
	return $form.serialize();
}

//displaying message after successful add, update and remove
/*function displaySuccessMessage($btnType, $message){
	$('#alert-autocloseable-success strong').html($message);
	$('#alert-autocloseable-success').css("display","block");

	$('#alert-autocloseable-success').delay(1000).fadeOut( "slow", function() {
		$($btnType).prop("disabled", false);
	});
	$('#alert-autocloseable-success').css("display:none");
	return true;
}*/



//Remove Item From Cart
/*$(document).on("click",".removeItemBox button",function(event) {
	event.preventDefault();
	
	var $form = $(this).parent();

	$('.removeItemBox button').prop("disabled", true);
	
	$.ajax({
		type: 'POST',
		url: $form.attr('action'),
		data: serializeObject($form),
		cache: false,
		success: function(response){
			//var arr = $.map(response, function(data) { return data });
			
			$('#cartView').load(" #cartView");
			$('#cart').load(" #cart");

			displaySuccessMessage('.removeItemBox button', 'Item has been removed successfully!');
		}				
	});	
	return false;
	
});*/

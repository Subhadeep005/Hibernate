	<meta charset="utf-8">
	<!--[if IE]>
		<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
	<![endif]-->
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="www.codingraja.com">
	
	<!-- Bootstrap Core CSS -->
	<link href="${resourceUrl}/css/bootstrap.min.css" rel="stylesheet">
	
	<!-- Google Web Fonts -->
	<link href="http://fonts.googleapis.com/css?family=Roboto+Condensed:300italic,400italic,700italic,400,300,700" rel="stylesheet" type="text/css">
	<link href="http://fonts.googleapis.com/css?family=Oswald:400,700,300" rel="stylesheet" type="text/css">
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,700,300,600,800,400" rel="stylesheet" type="text/css">
	
	<!-- CSS Files -->
	<link href="${resourceUrl}/font-awesome/css/font-awesome.min.css" rel="stylesheet">
	<link href="${resourceUrl}/css/owl.carousel.css" rel="stylesheet">
	<link href="${resourceUrl}/css/style.css" rel="stylesheet">
	<link href="${resourceUrl}/css/responsive.css" rel="stylesheet">
	
	<!--[if lt IE 9]>
		<script src="${resourceUrl}/js/ie8-responsive-file-warning.js"></script>
	<![endif]-->
	
	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	
	<!-- Fav and touch icons -->
	<link rel="shortcut icon" href="${resourceUrl}/images/favicon.png">
	
	<script src="${resourceUrl}/js/jquery-1.11.1.min.js"></script>
	<script src="${resourceUrl}/js/jquery.autocomplete.js"></script>
	<script src="${resourceUrl}/js/autocomplete-search.js"></script>
	<script src="${resourceUrl}/js/ajax/cartOperations.js"></script>
	
	<script>
	 $(document).ready(function() {

			$('#w-input-search').autocomplete({
				serviceUrl: '${pageContext.request.contextPath}/product/tags',
				paramName: "tagName",
				delimiter: ",",
			   transformResult: function(response) {

				return {
				  //must convert json to javascript object before process
				  suggestions: $.map($.parseJSON(response), function(item) {
				      return { value: item.tagName, data: item.id };
				   })

				 };

		       }

			 });

		  });
	</script>
	
	<style>
		.autocomplete-suggestions {padding-left: 17px; padding-right: 17px; font-family:sans-serif; font-size: 18px; font-weight: 200%; background: #FFF; overflow: auto; }
		.autocomplete-suggestion {white-space: nowrap; overflow: hidden; }
		.autocomplete-suggestion:hover {color: #FFF; background: #4bac52;}
		.autocomplete-selected { background: #F0F0F0; }
		.autocomplete-suggestions strong { font-weight: 200%; color: #F00;; }
		.autocomplete-group {  }
		.autocomplete-group strong { display: block; }
	</style>
	
$("document").ready(function(){

	var first = $("#first").val();
	var second = $("#second").val();

	$("#plus").on("click", function() {
		
		$("#sum").html(first + second + {{value}});
	});

	$("#minus").on("click", function() {
		
		$("#sum").html(first - second + {{value}});
	});
});

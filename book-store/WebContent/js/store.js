$(function () {
	$("#loader").hide();
});

function addToCart(itemId) {
	//$("#loader").show();
	$.ajax({
		url : `itemManager`,
		type : 'GET',
		data : `item=${itemId}&action=add`,
		success : function(data) {
			alert("The item was successfully added to your shopping cart");
			$("#loader").hide();
		},
		error : function() {
			alert("There was an error");
			$("#loader").hide();
		}
	});

}

function deleteFromCart(itemId) {
	$.ajax({
		url : `itemManager`,
		type : 'GET',
		data : `item=${itemId}&action=delete`,
		success : function(data) {
			location.reload();
			alert("The item was successfully deleted from your shopping cart");
		},
		error : function() {
			alert("There was an error");
		}
	});

}
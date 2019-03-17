$(function () {
	$("#result").hide();
	$("#loader").hide();
});

function addToCart(itemId) {
	$("#result").show();
	$("#loader").show();
	$.ajax({
		url : `itemManager`,
		type : 'GET',
		data : `item=${itemId}&action=add`,
		success : function(data) {
			//alert();
			$("#loader").hide();
			$("#msg").empty();
			$("#msg").append("The item was successfully added to your shopping cart");
			setTimeout(() => {
				$("#result").hide();
			}, 5000);
		},
		error : function() {
			alert("There was an error");
			
		}
	});

}

function deleteFromCart(itemId) {
	$("#result").show();
	$("#loader").show();
	$.ajax({
		url : `itemManager`,
		type : 'GET',
		data : `item=${itemId}&action=delete`,
		success : function(data) {
			$('#templatemo_content_left').load('cart #templatemo_content_left');
			//location.reload();
			$("#loader").hide();
			$("#msg").empty();
			$("#msg").append("The item was successfully deleted from your shopping cart");
			setTimeout(() => {
				$("#result").hide();
			}, 5000);
		},
		error : function() {
			alert("There was an error");
		}
	});

}


$(function () {
	$("#result").hide();
	$("#loader").hide();
	
	$("#loginId").click(logout);
	
	$("#btn_proceed_register").click();
});

function click(){
	
	const order = {
    		"shippingAddress":
    			{
    				"name": $("input[name=name]" ).val(),
    				"addressLine":$("input[name=address]" ).val(),
    				"city":$("input[name=city]" ).val(),
    				"state":$("input[name=state]" ).val(),
    				"country":$("input[name=country]" ).val(),
    				"phoneNumber":$("input[name=phonenumber]" ).val(),
    				"zipCode":$("input[name=zipcode]" ).val()
    			}, 
    		"paymentMethod": $("input[name=payment]:checked" ).val(),
    		"billingAddress":
        		{
        			"name": $("input[name=namebill]" ).val(),
    				"addressLine":$("input[name=addressbill]" ).val(),
    				"city":$("input[name=citybill]" ).val(),
    				"state":$("input[name=statebill]" ).val(),
    				"country":$("input[name=countrybill]" ).val(),
    				"phoneNumber":$("input[name=phonenumberbill]" ).val(),
    				"zipCode":$("input[name=zipcodebill]" ).val()
    			}
    	};
	
	$.get(`register`)
	.done()
	.fail(function() {
		alert("There was an error");
	})
}
function logout(){
	$.get(`logoutServlet`)
	.done()
	.fail(function() {
		alert("There was an error");
	})
}
function addToCart(itemId) {
	$("#result").show();
	$("#loader").show();
	$.get(`itemManager`, {"item":itemId, "action":"add"})
	.done(function(data) {
		$("#msg").empty();
		$("#msg").append("The item was successfully added to your shopping cart");
		setTimeout(() => {
			$("#result").hide();
		}, 5000);
	})
	.fail(function() {
		alert("There was an error");
	})
	.always($("#loader").hide());
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


(function (lib) {
	var $= lib;
    $(function () {
    	$("#result").hide();
    	$("#loader").hide();
		
        $("#btn_proceed_checkout.button-checkout").click(function () {
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
            $.post("checkout", {"order":JSON.stringify(order)}
            	).done(display)
                .fail(ajaxFailure)
                .always(setTimeout(waitnHide,6000));

            $("#result").show();
        	$("#loader").show();
        });
    });

    function waitnHide(){
    	$("#loader").hide();
    }
    
    function display(data) {
    	//To do the call to Transaction.commitTransaction
    	$("#msg").empty();
	//	$("#msg").append("Your order is confirmed!!! Thank you for shopping at FSH Bookstore");
		//setTimeout(() => {
			//$("#result").hide();
		//}, 5000);
    }

    function ajaxFailure() {
        console.log("ajax failure.");
    }
})(jQuery);

//$(function(){
//	$('#btn_proceed_checkout').click(proceedCheckout);
//	
//	function proceedCheckout(){
//		var name = $('#name').val();
//		alert(name);
//		//var productPrice = $('#product_price').val();
//		var checkoutInfo = {shipping : {name: name}};
//		$.post('checkout',{product: JSON.stringify(checkoutInfo)}, processData, "json")
//	}
//
//	function processData(data){
//		//data = JSON.parse(data);
//		alert('Proceeed');
//	}
//});
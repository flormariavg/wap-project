(function (lib) {
	var $= lib;
    $(function () {
    	$("#result").hide();
    	$("#loader").hide();
		
        $("#btn_register").click(function () {
        	const user = {
        		"username":$("input[name=username]" ).val(),
        		"password":$("input[name=password]" ).val(),
        		"person":
        			{
        				"firstName": $("input[name=firstname]" ).val(),
        				"lastName":$("input[name=lastname]" ).val(),
        				"address":
        					{
	    	        			"name": $("input[name=firstname]" ).val()+' '+$("input[name=lastname]" ).val(),
	    	    				"addressLine":$("input[name=address]" ).val(),
	    	    				"city":$("input[name=city]" ).val(),
	    	    				"state":$("input[name=state]" ).val(),
	    	    				"country":$("input[name=country]" ).val(),
	    	    				"phoneNumber":$("input[name=phonenumber]" ).val(),
	    	    				"zipCode":$("input[name=zipcode]" ).val()
            				},
        				"email":$("input[name=email]" ).val()
        			},
        		"paymentMethod":$("input[name=payment]:checked" ).val(),
        		"billingAddress":
	        		{
        				"name": $("input[name=firstname]" ).val()+' '+$("input[name=lastname]" ).val(),
	    				"addressLine":$("input[name=addressbill]" ).val(),
	    				"city":$("input[name=citybill]" ).val(),
	    				"state":$("input[name=statebill]" ).val(),
	    				"country":$("input[name=countrybill]" ).val(),
	    				"phoneNumber":$("input[name=phonenumberbill]" ).val(),
	    				"zipCode":$("input[name=zipcodebill]" ).val()
	    			}
        		
        	};
            $.post("register", {"user":JSON.stringify(user)}
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
		$("#msg").append("Your user was successfully created!!!!");
		setTimeout(() => {
			$("#result").hide();
			window.location.href = "login.jsp";
		}, 5000);
    }

    function ajaxFailure() {
        console.log("ajax failure.");
    }
})(jQuery);
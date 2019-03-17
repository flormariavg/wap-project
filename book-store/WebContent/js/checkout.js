(function (lib) {
	var $= lib;
    $(function () {
		$("#loader").hide();
		
        $("#btn_proceed_checkout.button-checkout").click(function () {
			
            $.get("delay.php")
                .done(display)
                .fail(ajaxFailure)
                .always(setTimeout(waitnHide,5000));

            $("#loader").show();
        });
    });

    function display(data) {
    	//To do the call to Transaction.commitTransaction
		alert("Thanks for purchasing in our BookStore!");
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
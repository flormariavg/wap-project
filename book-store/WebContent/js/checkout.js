$(function(){
	$('#btn_proceed_checkout').click(proceedCheckout);
	
	function proceedCheckout(){
		var name = $('#name').val();
		alert(name);
		//var productPrice = $('#product_price').val();
		var checkoutInfo = {shipping : {name: name}};
		$.post('checkout',{product: JSON.stringify(checkoutInfo)}, processData, "json")
	}

	function processData(data){
		//data = JSON.parse(data);
		alert('Proceeed');
	}
})




function addCart(item){
	$.post('/addItem',{item: JSON.stringify(item)}, processData, "json")
	
}

function processData(data){}
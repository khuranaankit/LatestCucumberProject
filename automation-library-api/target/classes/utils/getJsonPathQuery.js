function getJsonPathQuery(attributeVal, valToSearchBy){
	var attribType = typeof attributeVal;
	
	if(attribType === 'string'){
		return "'" + valToSearchBy + "'";
	}else{
		return valToSearchBy;
	}
}
	
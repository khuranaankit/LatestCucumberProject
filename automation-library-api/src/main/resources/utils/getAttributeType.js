function getAttributeType(attributeVal){

	var attribType = typeof attributeVal;
	
	if(attribType === 'string'){
		return "'" + attributeVal + "'";
	}
	else{
		return attributeVal;
	}
}
	
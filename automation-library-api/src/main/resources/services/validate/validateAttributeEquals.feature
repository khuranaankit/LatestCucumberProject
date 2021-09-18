@ignore
Feature: Validate if response contains part of the attribute value

	@validateAttributeEquals
	Scenario:
	* json responseAsJson = __arg.response	
	
	* def getAttributeType = read('classpath:utils/getAttribute.js')
	* def attributeToCompare = getAttributeType(__arg.attributeVal)
	
	* json compareJSON = '{' + __arg.attributeName + ' : ' + attributeToCompare + '}'
	* match responseAsJson contains compareJSON

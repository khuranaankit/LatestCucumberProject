@ignore
Feature: Validate if response contains part of the attribute value

	Background:
		* def isArray = read('classpath:utils/isArray.js')
		* def getAttributeType = read('classpath:utils/getAttributeType.js')
		
	@validateAttributeEqualsWithParent
	Scenario:
	* json responseAsJson = __arg.response	
	* def attributeToCompare = getAttributeType(__arg.attributeVal)
	
	* json compareJSON = '{' + __arg.attributeName + ' : ' + attributeToCompare + '}'
	* def responseToCompare = karate.jsonPath(responseAsJson , "$.."+__arg.parentAttributeName)
	* def responseToCompare = isArray(responseToCompare[0]) ? responseToCompare[0] : responseToCompare
	* match each responseToCompare == '#(^compareJSON)'

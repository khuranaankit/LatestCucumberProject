@ignore
Feature: Validate if response does not contain the attribute

	Background:
		* def isArray = read('classpath:utils/isArray.js')
		
	@validateAttributeNotEqualsWithParent
	Scenario:
	* json responseAsJson = __arg.response
	* json compareJSON = '{' + __arg.attributeName + ' : ' + __arg.attributeVal + '}'
	* def responseToCompare = karate.jsonPath(responseAsJson , "$.."+__arg.parentAttributeName)
	* def responseToCompare = isArray(responseToCompare[0]) ? responseToCompare[0] : responseToCompare
	* match each responseToCompare == '#(!^compareJSON)'

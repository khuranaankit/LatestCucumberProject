@ignore
Feature: Validate if response contains part of the attribute value

	Background:
		*def isArray = read('classpath:utils/isArray.js')

	@validateAttributeEqualsWithContains
	Scenario:
	* json responseAsJson = __arg.response	
	* json compareJSON = '{' + __arg.attributeName + ' : #regex .*' + __arg.attributeVal + '.*}'
	* def responseToCompare = karate.jsonPath(responseAsJson, "$.."+__arg.parentAttributeName)
	* def responseToCompare = isArray(responseToCompare[0]) ? responseToCompare[0] : responseToCompare
	* match each responseToCompare == '#(^compareJSON)'

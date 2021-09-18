@ignore
Feature: Store attribute value from a response

	@StoreAttributeByName
	Scenario:
	* json responseAsJson = __arg.response
	
	* def matchingAttributes = karate.jsonPath(responseAsJson, "$.."+__arg.attributeName)
	* def valToStore = karate.sizeOf(matchingAttributes) > 0 ? matchingAttributes : ''

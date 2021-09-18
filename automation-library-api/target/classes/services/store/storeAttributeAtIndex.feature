@ignore
Feature: Store attribute value from a response

	@StoreAttributeByNameAtIndex
	Scenario:
	* json responseAsJson = __arg.response
	
	* def matchingAttributes = karate.jsonPath(responseAsJson, "$.."+__arg.attributeName)
	
	#handle nested Array response
	* def matchingAttributes = karate.sizeOf(matchingAttributes) === 1 ? matchingAttributes[0] : matchingAttributes
	* def valToStore = karate.sizeOf(matchingAttributes) > 0 ? matchingAttributes[__arg.arrayIndex - 1] : ''
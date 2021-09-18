@ignore
Feature: Store attribute value from a response

	@StoreAttributeByNameAtIndexWithPArent
	Scenario:
	* json responseAsJson = __arg.response
	
	* def parentContent = karate.jsonPath(responseAsJson, "$.."+__arg.parentAttributeName)
	* def matchingAttributes = karate.jsonPath(parentContent, "$.."+__arg.attributeName)
	
	#handle nested Array response
	* def matchingAttributes = karate.sizeOf(matchingAttributes) === 1 ? matchingAttributes[0] : matchingAttributes
	* def valToStore = karate.sizeOf(matchingAttributes) > 0 ? matchingAttributes[__arg.arrayIndex - 1] : ''
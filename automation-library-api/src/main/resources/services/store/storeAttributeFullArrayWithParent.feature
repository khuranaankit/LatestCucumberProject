@ignore
Feature: Store attribute value from a response

	@StoreAttributeByNameWithinParent
	Scenario:
	* json responseAsJson = __arg.response
	
	* def parentContent = karate.jsonPath(responseAsJson, "$.."+__arg.parentAttributeName)
	* def matchingAttributes = karate.jsonPath(parentContent, "$.."+__arg.attributeName)
	* def valToStore = karate.sizeOf(matchingAttributes) > 0 ? matchingAttributes : ''
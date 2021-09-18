@ignore
Feature: Store attribute value from a response

	@StoreAttributeByNameAtIndexWithParent
	Scenario:
	* def isArray = read('classpath:utils/isArray.js')
	* json responseAsJson = __arg.response
	
	* def parentContent = karate.jsonPath(responseAsJson, "$.."+__arg.parentAttributeName)
	* def responseToCompare = isArray(parentContent[0]) ? parentContent[0] : parentContent
	
	
	* def arrayIndexToUse = responseToCompare.length - 1
	* def matchingAttributes = karate.jsonPath(responseAsJson, '$..'+ __arg.parentAttributeName + '[' + arrayIndexToUse + ']..' + arg.attributeName)
	* def valToStore = karate.sizeOf(matchingAttributes) === 1 ? matchingAttributes[0] : matchingAttributes
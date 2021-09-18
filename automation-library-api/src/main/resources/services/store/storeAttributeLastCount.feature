@ignore
Feature: Store attribute value from a response

	@StoreAttributeLastCount
	Scenario:
	* def isArray = read('classpath:utils/isArray.js')
	* json responseAsJson = __arg.response
	
	* def matchingAttributes = karate.jsonPath(responseAsJson, "$.."+__arg.attributeName)
	* def responseToCompare = isArray(matchingAttributes[0]) ? matchingAttributes[0] : matchingAttributes
	* def valToStore = ~~(responseToCompare.length)
	
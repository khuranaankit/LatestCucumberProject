@ignore
Feature: Store attribute value from a response

	@StoreXMLAttributeSearchBy
	Scenario:
	* xml responseBody = __arg.responseAsXml	
	* def argumentsToUse = { attribToSearchBy: #(__arg.attribToSearchBy), valToSearchBy: #(__arg.valToSearchBy), comparisonOperator: #(__arg.comparisonOperator), response: #(responseBody), attributeName: #(attributeName)}
	* call read('storeAttributeSearchBy.feature') argumentsToUse

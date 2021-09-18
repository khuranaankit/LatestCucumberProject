@ignore
Feature: Store attribute value from a response

	@StoreXMLAttributeByName
	Scenario:
	* xml responseBody = __arg.responseAsXml	
	* def argumentsToUse = { attributeName: #(__arg.attributeName), response: #(responseBody) }
	* call read('storeAttribute.feature') argumentsToUse

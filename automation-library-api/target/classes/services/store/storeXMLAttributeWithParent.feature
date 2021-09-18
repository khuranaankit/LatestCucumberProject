@ignore
Feature: Store attribute value from a response

	@StoreXMLAttributeWithParent
	Scenario:
	* xml responseBody = __arg.responseAsXml	
	* def argumentsToUse = { parentAttributeName: #(__arg.parentAttributeName), attributeName: #(__arg.attributeName), response: #(responseBody) }
	* call read('storeAttributeWithParent.feature') argumentsToUse

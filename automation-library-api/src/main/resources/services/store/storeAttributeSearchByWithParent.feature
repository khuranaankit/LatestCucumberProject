@ignore
Feature: Store attribute value from a response

	@StoreAttributeByMatchingOtherAttribute
	Scenario:
	* json responseAsJson = __arg.response
	
	# Reusable functions
	* def getJsonPathQuery = read('classpath:utils/getJsonPathQuery.js')
	* def getComparisonOperator = read('classpath:utils/getComparisonOperator.js)
	
	* def parentContent = karate.jsonPath(responseAsJson, "$.."+__arg.parentAttributeName)
	
	# Split out strings V . non-strings
	* def attribVal = karate.jsonPath(parentContent, "$.."+__arg.attribToSearchBy)
	* def attribValToSearchBy = getJsonPathQuery(attribVal[0], __arg.valToSearchBy)
	* def comparisonOperator = getComparisonOperator(__arg.comparisonOperator)
	
	#handle nested Array response
	* def matchingAttributes = karate.jsonPath(responseAsJson, "$.."+ "[?(@." + __arg.attribToSearchBy + comparisonOperator + attribValToSearchBy + ")]")
	* def valToStore = karate.sizeOf(matchingAttributes) > 0 ? karate.jsonPath(matchingAttributes, "$.."+__arg.attributeName)[0] : ''
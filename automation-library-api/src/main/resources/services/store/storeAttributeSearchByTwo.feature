@ignore
Feature: Store attribute value from a response

	@StoreAttributeByMatchingOtherAttribute
	Scenario:
	* json responseAsJson = __arg.response
	
	# Reusable functions
	* def getJsonPathQuery = read('classpath:utils/getJsonPathQuery.js')
	* def getComparisonOperator = read('classpath:utils/getComparisonOperator.js)
	
	# Split out strings V . non-strings(attribute 1)
	* def attribVal1 = karate.jsonPath(responseAsJson, "$.."+__arg.attribToSearchBy1)
	* def attribValToSearchBy1 = getJsonPathQuery(attribVal1[0], __arg.valToSearchBy1)
	* def comparisonOperator1 = getComparisonOperator(__arg.comparisonOperator1)
	
	# Split out strings V . non-strings(attribute 2)
	* def attribVal2 = karate.jsonPath(responseAsJson, "$.."+__arg.attribToSearchBy2)
	* def attribValToSearchBy2 = getJsonPathQuery(attribVal2[0], __arg.valToSearchBy2)
	* def comparisonOperator2 = getComparisonOperator(__arg.comparisonOperator2)
	
	
	#handle nested Array response
	* def matchingAttributes = karate.jsonPath(responseAsJson, "$.."+ "[?(@." + __arg.attribToSearchBy1 + comparisonOperator1 + attribValToSearchBy1 + " && @." + __arg.attribToSearchBy2 + comparisonOperator2 + attribValToSearchBy2  + ")]")
	* def valToStore = karate.sizeOf(matchingAttributes) > 0 ? karate.jsonPath(matchingAttributes, "$.."+__arg.attributeName)[0] : ''
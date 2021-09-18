@ignore
Feature: Set Attribute Value in a response

	@setAttribute
	Scenario:
	* def updatedJson = __arg.response
	* def finalJsonPath = '$.' + __arg.attributeName
	
	#replace value
	* karate.set('updatedJson', finalJsonPath, __arg.attributeValue)
	* def replacedVal = karate.jsonPath(updatedJson, finalJsonPath)

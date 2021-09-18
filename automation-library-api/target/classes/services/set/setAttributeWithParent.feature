@ignore
Feature: Set Attribute Value in a response with a parent

	@setAttributeValWithParentAtIndex
	Scenario:
	* def updatedJson = __arg.response
	
	#check for which Json Path to use
	* def arrayJsonPath = '$..' + __arg.parentAttributeName + '[0].' + __arg.attributeName
	* def directJsonPath = '$..' + __arg.parentAttributeName + '.' + __arg.attributeName
	* def valToReplace = karate.jsonPath(updatedJson, arrayJsonPath)
	* def finalJsonPath = karate.sizeOf(valToReplace) > 0 ? arrayJsonPath : directJsonPath
	
	#replace value
	* karate.set('updatedJson', finalJsonPath, __arg.attributeValue)
	* def replacedVal = karate.jsonPath(updatedJson, finalJsonPath)

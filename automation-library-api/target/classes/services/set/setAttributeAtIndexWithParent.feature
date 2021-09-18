@ignore
Feature: Set Attribute Value in a response

	@setAttributeValWithParentAtIndex
	Scenario:
	* def updatedJson = __arg.response
	
	#set up array based JsonPath
	* def arrayIndexToUse = __arg.arrayIndex - 1
	* def finalJsonPath = '$..' + __arg.parentAttributeName + '[' + arrayIndexToUse + '].' + __arg.attributeName
	
	#replace value
	* karate.set('updatedJson', finalJsonPath, __arg.attributeValue)
	* def replacedVal = karate.jsonPath(updatedJson, finalJsonPath)

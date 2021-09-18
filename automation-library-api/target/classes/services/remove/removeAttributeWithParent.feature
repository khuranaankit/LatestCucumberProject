@ignore
Feature: Remove attribute value within parent attribute in a response

	@removeAttributeWithParent
	Scenario:
	* def updatedJson = __arg.response
	* def directJsonPath = '$..' + __arg.parentAttributeName + '.' + __arg.attributeName
	
	#Remove Attribute
	* karate.remove('updatedJson', directJsonPath)

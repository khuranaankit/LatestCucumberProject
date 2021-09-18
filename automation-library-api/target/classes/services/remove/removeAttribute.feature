@ignore
Feature: Remove attribute in a response

	@removeAttribute
	Scenario:
	* def updatedJson = __arg.response
	* def directJsonPath = '$.' + __arg.attributeName
	
	#Remove Attribute
	* karate.remove('updatedJson', directJsonPath)

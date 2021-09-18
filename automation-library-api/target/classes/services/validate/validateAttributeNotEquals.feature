@ignore
Feature: Validate if response does not contain the attribute

	@validateAttributeNotEquals
	Scenario:
	* json responseAsJson = __arg.response		
	* json compareJSON = '{' + __arg.attributeName + ' : ' + __arg.attributeVal + '}'
	* match responseAsJson !contains compareJSON

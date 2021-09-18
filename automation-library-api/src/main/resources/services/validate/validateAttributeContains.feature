@ignore
Feature: Validate if response contains part of the attribute value

	@validateAttributeContains
	Scenario:
	* json responseAsJson = __arg.response	
	* json compareJSON = '{' + __arg.attributeName + ' : #regex .*' + __arg.attributeVal + '.*}'
	* match responseAsJson contains compareJSON

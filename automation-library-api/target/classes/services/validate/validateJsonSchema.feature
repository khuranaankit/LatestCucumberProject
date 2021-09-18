@ignore
Feature: Validate against a defined scehma

	@validateScehma
	Scenario:
	* json responseAsJson = __arg.response	
	And def scehmaRef = read(pathToSchema)
	Then match responseAsJson == scehmaRef

Feature: Check Countries Weather

@Postive_200
Scenario: getListOfAllCountries
Given url 'https://reqres.in'
	And path '/api/products/3'
	And header Accept = 'application/json'
	When method get
	Then status 200
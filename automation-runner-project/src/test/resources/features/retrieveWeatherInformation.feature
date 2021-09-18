Feature: Return_Weather_Information

@postiveCucumberResponse
Scenario: Validate_Weather_API_Response

Given the user sends request to the "countryWeather" API
And the user store "name" within parent attribute "data" from the JSON payload at dictionary key "actualValue"
<<<<<<< HEAD
Then the user validates the API response attribute "name" within parentAtrribute "data" from the JSON payload is "EQUAL" to "true re"
=======
Then the user validates the API response attribute "name" within parentAtrribute "data" from the JSON payload is "EQUAL" to "true red"
>>>>>>> 25c57bbe8748e2a7546bae5c4a0df3442749372b



 
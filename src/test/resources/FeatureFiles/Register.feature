Feature: Registration Functionality Scenarios

@Register @one
Scenario: Verigy whether the user is able to register into the application by providing all the details
	Given I launch the application
	And I navigate to Account Registraion Page
	When I provide all the below details
		|FirstName	|	Thirupathi Reddy					|
		|LastName		|	Ankepalli									|
		|Email			|	thirupathi1462@gmail.com 	|
		|Telephone	|	8500248188							 	|
		|Password		|	Thiru@1462								|
	And I Select the Privacy Policy
	And I click on Continue Button
	Then I should see that User account has Successfully created
	
	
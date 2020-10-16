@First
Feature: This feature consists all scenarios related to Smoke testing on Signup pag
Scenario: Observe behaviour when user enters only First name tries to sign up
	Given User goes to SignUp Page
	When User enters first name as Sushil
	And He click on Signup Button on Signup page
	Then He should not able to signup
	
	
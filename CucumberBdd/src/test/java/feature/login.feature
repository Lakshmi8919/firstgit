Feature: Application Login

Scenario: Successful login with valid Credentials
Given User Launch Chrome browser
When User opens URL "https://tide.com/en-us"
Then page Title should be "Register"
And Click on sign up now
When  user enter "Firstname" and "email" and "password"
When User click on create account
And close browser
 

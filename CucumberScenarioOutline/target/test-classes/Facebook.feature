Feature:Verify the login functionality in Facebook application.
Scenario Outline:Verify the login functionality for valid username and invalid password
Given User is an facebook login page
When user enters "<username>" and "<password>" 
And user click on login button
Then Error page is displayed

Examples:
|username|password|
|User1   |Test123 |
|User2   |Pass456 |
|User3   |Pass789 |
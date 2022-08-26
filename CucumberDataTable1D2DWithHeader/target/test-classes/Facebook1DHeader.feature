Feature:Verify the login fuctionality in Facebook application
Scenario:Verify login functionality for valid username and invalid password
Given User is on Facebook login page
When User enters username and password
|username|user1   |
|password|password1|


And user clicks on login button
Then Error page is displayed
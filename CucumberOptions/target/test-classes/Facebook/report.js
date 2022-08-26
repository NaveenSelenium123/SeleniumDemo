$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Facebook.feature");
formatter.feature({
  "name": "Verify login fuctionality in Facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify login functionality for valid username and invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on Facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_Facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid username and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_valid_username_and_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error page is dispalyed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.error_page_is_dispalyed()"
});
formatter.result({
  "status": "passed"
});
});
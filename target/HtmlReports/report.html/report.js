$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Feature.feature");
formatter.feature({
  "name": "Fealure to test login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check login is successfully with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.ijmeet.stepdefinitions.LoginStep.openLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "com.ijmeet.stepdefinitions.LoginStep.enterCredentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.ijmeet.stepdefinitions.LoginStep.clickOnLoginBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigate to the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ijmeet.stepdefinitions.LoginStep.backToHomePage()"
});
formatter.result({
  "status": "passed"
});
});
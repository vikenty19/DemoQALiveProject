$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles/Register.feature");
formatter.feature({
  "line": 1,
  "name": "Registration functionality scenarios",
  "description": "\r\nScenario : Verify whether user is able to register into the application by providing all the details\r\n  Given I launch the app\r\n  And I navigate to Account Registration page\r\n  When I provide all the below valid details :\r\n\r\n  |FirstName| Ravi                    |\r\n  |LastName | Kiran                   |\r\n  |Email    |Ravi.kiran@gmail.com     |\r\n  |Telephone|9212345678               |\r\n  |Password |rkiran                   |\r\n  And I check-in the Privacy Policy\r\n  And  I click on continue button\r\n  Then I should see that the User Account has successfully been created",
  "id": "registration-functionality-scenarios",
  "keyword": "Feature"
});
});
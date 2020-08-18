$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/bhupe/Wiggle/src/test/Resources/account.feature");
formatter.feature({
  "line": 1,
  "name": "Account Creation",
  "description": "",
  "id": "account-creation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8191311400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "account-creation;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User fill all the details in account page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should able to create his account",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefSwim.user_is_on_homepage()"
});
formatter.result({
  "duration": 166730700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefAcc.user_fill_all_the_details_in_account_page()"
});
formatter.result({
  "duration": 3435177000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefAcc.user_should_able_to_create_his_account()"
});
formatter.result({
  "duration": 20800,
  "status": "passed"
});
});
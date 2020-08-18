$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/bhupe/Wiggle/src/test/Resources/footwear.feature");
formatter.feature({
  "line": 1,
  "name": "User want to buy footwear",
  "description": "",
  "id": "user-want-to-buy-footwear",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8566708800,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "",
  "description": "",
  "id": "user-want-to-buy-footwear;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User Naviagate to footwear page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Select required footwear",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User should able to put footwear in basket",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefSwim.user_is_on_homepage()"
});
formatter.result({
  "duration": 155149500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefFootwear.user_Naviagate_to_footwear_page()"
});
formatter.result({
  "duration": 1426447300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefFootwear.select_required_footwear()"
});
formatter.result({
  "duration": 1479447300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefFootwear.user_should_able_to_put_footwear_in_basket()"
});
formatter.result({
  "duration": 1657180700,
  "status": "passed"
});
});
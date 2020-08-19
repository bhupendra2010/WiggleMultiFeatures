$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/bhupe/Wiggle/src/test/Resources/sale.feature");
formatter.feature({
  "line": 1,
  "name": "User can buy sale products",
  "description": "",
  "id": "user-can-buy-sale-products",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8460671700,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "",
  "description": "",
  "id": "user-can-buy-sale-products;",
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
  "name": "User going on sale page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User find the necessary items",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User should put that item in basket",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User can goback to mainpage to add some more items",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefSwim.user_is_on_homepage()"
});
formatter.result({
  "duration": 173698300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefSale.user_going_on_sale_page()"
});
formatter.result({
  "duration": 2743358400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefSale.user_find_the_necessary_items()"
});
formatter.result({
  "duration": 26900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefSale.user_should_put_that_item_in_basket()"
});
formatter.result({
  "duration": 93900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefSale.user_can_goback_to_mainpage_to_add_some_more_items()"
});
formatter.result({
  "duration": 51200,
  "status": "passed"
});
});
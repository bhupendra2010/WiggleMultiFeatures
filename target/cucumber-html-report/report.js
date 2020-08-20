$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("account.feature");
formatter.feature({
  "line": 1,
  "name": "Account Creation",
  "description": "",
  "id": "account-creation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9812246500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "account-creation;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User fill all the details in account page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should able to create his account",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefSwim.user_is_on_homepage()"
});
formatter.result({
  "duration": 279151700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefAcc.user_fill_all_the_details_in_account_page()"
});
formatter.result({
  "duration": 3681211200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefAcc.user_should_able_to_create_his_account()"
});
formatter.result({
  "duration": 19100,
  "status": "passed"
});
formatter.uri("sale.feature");
formatter.feature({
  "line": 1,
  "name": "User can buy sale products",
  "description": "",
  "id": "user-can-buy-sale-products",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7341766700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "user-can-buy-sale-products;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User going on sale page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User find the necessary items",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should put that item in basket",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User can goback to mainpage to add some more items",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefSwim.user_is_on_homepage()"
});
formatter.result({
  "duration": 20165900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefSale.user_going_on_sale_page()"
});
formatter.result({
  "duration": 7077991900,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"a[data-tracking-name\u003d\u0027Swimwear\u0027]\"}\n  (Session info: chrome\u003d84.0.4147.125)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-98TS530D\u0027, ip: \u0027192.168.0.29\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.125, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: C:\\Users\\bhupe\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:60888}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: e7ead76e424e145b285fc2d6ae5ed117\n*** Element info: {Using\u003dcss selector, value\u003da[data-tracking-name\u003d\u0027Swimwear\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pageobjectpackage.SalePage.saleoption(SalePage.java:24)\r\n\tat stepdefinationpackage.StepDefSale.user_going_on_sale_page(StepDefSale.java:11)\r\n\tat ✽.When User going on sale page(sale.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefSale.user_find_the_necessary_items()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefSale.user_should_put_that_item_in_basket()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefSale.user_can_goback_to_mainpage_to_add_some_more_items()"
});
formatter.result({
  "status": "skipped"
});
});
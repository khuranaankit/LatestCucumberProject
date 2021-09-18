$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/webClickTest.feature");
formatter.feature({
  "name": "Return_Weather_Details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Web_Click_Test_Scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@webClickTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User login with URL and click on login link",
  "keyword": "Given "
});
formatter.match({
  "location": "testStepDefinition.User_login_with_URL_and_click_on_login_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters the login Credential and click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "testStepDefinition.User_Enters_the_login_Credential_and_click_on_login_button()"
});
formatter.result({
<<<<<<< HEAD
  "status": "passed"
=======
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@type\u003d\u0027submit\u0027 and @value\u003d\u0027Log i\u0027]\"}\n  (Session info: chrome\u003d91.0.4472.124)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ANKIT\u0027, ip: \u0027192.168.0.176\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.124, chrome: {chromedriverVersion: 91.0.4472.19 (1bf021f248676..., userDataDir: C:\\Users\\HP\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:63593}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 103aa41fed1eb275be0a88b1ffec9749\n*** Element info: {Using\u003dxpath, value\u003d//input[@type\u003d\u0027submit\u0027 and @value\u003d\u0027Log i\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat com.test.cucumber.testStepDefinition.User_Enters_the_login_Credential_and_click_on_login_button(testStepDefinition.java:36)\r\n\tat ✽.User Enters the login Credential and click on login button(file:src/test/resources/features/webClickTest.feature:7)\r\n",
  "status": "failed"
>>>>>>> 25c57bbe8748e2a7546bae5c4a0df3442749372b
});
formatter.step({
  "name": "User Validates the title of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "testStepDefinition.User_Validates_the_title_of_the_page()"
});
formatter.result({
<<<<<<< HEAD
  "status": "passed"
=======
  "status": "skipped"
>>>>>>> 25c57bbe8748e2a7546bae5c4a0df3442749372b
});
formatter.after({
  "status": "passed"
});
});
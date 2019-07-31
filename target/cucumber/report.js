$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/amazonTitle.feature");
formatter.feature({
  "name": "Amazon Titile",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Amazon Title Verfication",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@amazon"
    }
  ]
});
formatter.step({
  "name": "user goes to Amazon application",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user slhoudl see proper title",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
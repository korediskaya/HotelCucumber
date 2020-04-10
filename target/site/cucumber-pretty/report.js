$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Hotels.feature");
formatter.feature({
  "line": 3,
  "name": "Hotels page features",
  "description": "",
  "id": "hotels-page-features",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.before({
  "duration": 7177941298,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on default location search locations screen",
  "keyword": "Given "
});
formatter.match({
  "location": "Hotels1SD.verifyHomePageUrlAntTitle()"
});
formatter.result({
  "duration": 2194866504,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "List of all of hotel within 10 miles radius of downtown",
  "description": "",
  "id": "hotels-page-features;list-of-all-of-hotel-within-10-miles-radius-of-downtown",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@hotels2"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I enter Cincinnati and select CityName field on the homepage page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter 05/07/20 and select CheckIn field on the homepage page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter 05/09/20 and select CheckOut field on the homepage page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter 1 and select Rooms field on the homepage page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select system displays all hotels within 10 or less mile radius of downtown",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select all Hilton hotels from previous list",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Cincinnati",
      "offset": 8
    },
    {
      "val": "CityName",
      "offset": 30
    }
  ],
  "location": "Hotels1SD.selectValues(String,String)"
});
formatter.result({
  "duration": 567346997,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "05/07/20",
      "offset": 8
    },
    {
      "val": "CheckIn",
      "offset": 28
    }
  ],
  "location": "Hotels1SD.selectValues(String,String)"
});
formatter.result({
  "duration": 2029933937,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "05/09/20",
      "offset": 8
    },
    {
      "val": "CheckOut",
      "offset": 28
    }
  ],
  "location": "Hotels1SD.selectValues(String,String)"
});
formatter.result({
  "duration": 288977748,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 8
    },
    {
      "val": "Rooms",
      "offset": 21
    }
  ],
  "location": "Hotels1SD.selectValues(String,String)"
});
formatter.result({
  "duration": 110273045,
  "status": "passed"
});
formatter.match({
  "location": "Hotels1SD.findHotels()"
});
formatter.result({
  "duration": 16672103900,
  "status": "passed"
});
formatter.match({
  "location": "Hotels1SD.hiltonHotels()"
});
formatter.result({
  "duration": 2562370948,
  "status": "passed"
});
formatter.after({
  "duration": 341720394,
  "status": "passed"
});
});
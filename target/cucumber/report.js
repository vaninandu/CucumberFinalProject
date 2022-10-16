$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/BackgroundColor.feature");
formatter.feature({
  "line": 1,
  "name": "TechFios Testpage background color validation",
  "description": "",
  "id": "techfios-testpage-background-color-validation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "1 User should be able to change the background color to Skyblue",
  "description": "",
  "id": "techfios-testpage-background-color-validation;1-user-should-be-able-to-change-the-background-color-to-skyblue",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on the SkyBlue Background button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "The background color will change to skyblue",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundColorStepDefinition.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 11347830400,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundColorStepDefinition.i_click_on_the_SkyBlue_Background_button()"
});
formatter.result({
  "duration": 292907700,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundColorStepDefinition.the_background_color_will_change_to_skyblue()"
});
formatter.result({
  "duration": 1137777900,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "2 User should be able to change the background color to White",
  "description": "",
  "id": "techfios-testpage-background-color-validation;2-user-should-be-able-to-change-the-background-color-to-white",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Set SkyWhite Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on the SkyWhite Background button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundColorStepDefinition.set_SkyWhite_Background_button_exists()"
});
formatter.result({
  "duration": 160739400,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundColorStepDefinition.i_click_on_the_SkyWhite_Background_button()"
});
formatter.result({
  "duration": 220106400,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundColorStepDefinition.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 107929200,
  "status": "passed"
});
});
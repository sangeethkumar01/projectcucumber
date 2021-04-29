$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/AddTariff.feature");
formatter.feature({
  "name": "Add Tariff plan",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sangeeth"
    },
    {
      "name": "@san"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches telecom applications",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTraiffsDemo.user_launches_telecom_applications()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on add tariff plan button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTraiffsDemo.user_click_on_add_tariff_plan_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate add tariff plan module",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sangeeth"
    },
    {
      "name": "@san"
    },
    {
      "name": "@sangeeth"
    },
    {
      "name": "@kumar"
    }
  ]
});
formatter.step({
  "name": "user need to fill up the fields by one dim map",
  "rows": [
    {
      "cells": [
        "rental",
        "11"
      ]
    },
    {
      "cells": [
        "lname",
        "2200"
      ]
    },
    {
      "cells": [
        "email",
        "3300"
      ]
    },
    {
      "cells": [
        "addr",
        "4400"
      ]
    },
    {
      "cells": [
        "telephoneno",
        "5500"
      ]
    },
    {
      "cells": [
        "addss",
        "6600"
      ]
    },
    {
      "cells": [
        "tele",
        "7700"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddTraiffsDemo.user_need_to_fill_up_the_fields_by_one_dim_map(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTraiffsDemo.user_click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify Congratulation you add Tariff Plan is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTraiffsDemo.user_verify_Congratulation_you_add_Tariff_Plan_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
Feature: Form Step

  Scenario: Form - Patient App Web - Basic
    Given Patient navigate to activity list as "user.provided@medable.com"
    And Patient select Form Step Task on activity list page
    And Patient should see Form Step Task task ready to start
    And Patient completes Form step with values
      | Type                 | Value              |
      | Email Step           | a@a.com            |
      | Text Step            | Automation         |
      | Numeric Step         |                 21 |
      | Value Picker Step    | Option 1           |
      | Boolean Step         | True               |
      | Continuos Scale Step |                5.5 |
      | Integer Scale Step   |                  5 |
      | Location Step        | Cordoba, Argentina |
      | Text Scale Step      |                  1 |
      | Time Interval Step   |                 22 |
      | Time of Day Step     | 11 PM              |
    And Patient click next button in step page
    And Patient click skip button in step page
    And Patient should see the completion step page
    And Patient click done button in step page
    Then Patient should see the activity list page
    And Patient should see Form Step Task completed

Feature: Test OrangeHRM application

  Scenario: Test login funcationmality
    Given user is on login page
    When user enter username and password and click on loginBtn
      | Admin | admin123 |
    Then click on pim link

  Scenario Outline: Test addEmployee Page
    When click on addEmployee
    And user capture test data from from "<Excelsheet>" with <RowNumber>
    Given user enter "firstname" and "middlename" and "lastname"
    Then user click on savebtn

    Examples:
      | Excelsheet  | RowNumber |
      | OrangeLogin | 0         |
      | OrangeLogin | 1         |
      | OrangeLogin | 2         |
      | OrangeLogin | 3         |

Feature: User Login

Scenario: Successful login
    Given I am on the login page
    When I enter username "venu9581215417" and password "ilovevenu"
    And I click the login button
    Then I should be logged in successfully

Scenario: Invalid login credentials
    Given I am on the login page
    When I enter username "venu9581215417" and password "ilovevenu"
    And I click the login button
    Then I should see an error message

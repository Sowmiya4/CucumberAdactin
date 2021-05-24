Feature: Login functionality for adactin application

Scenario: User enter valid username and valid password
    Given User enter url of adactin application
    When User enter "SowmiyaSri" as username
    And User enter "Sowmiya05" as password
    And User click login button
    Then User validate login button
    
Scenario: scenario description
    Given a precondition is valid
    When an action is performed
    Then something should be asserted
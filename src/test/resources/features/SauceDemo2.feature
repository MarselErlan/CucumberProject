Feature: Sauce Demo


  Scenario: verify user is able to login
    Given user is on "url of the page"
    When  user enters the username "username"
    And  user enters teh password "password"
    And user clicks on login button
    Then verify the message "Successfully logged in"


  Scenario: verify user is able to login wrong password
    Given user is on "url of the page"
    When  user enters the username "username"
    And  user enters teh password "password"
    And user clicks on login button
    Then verify the message "Failed to  log in"


  Scenario: verify user is able to login with no password
    And user clicks on login button
    Then verify the message "Failed to  log in"




  Scenario Outline: verify user is able to login
    Given user is on "<url>"
    When  user enters the username "<username>"
    And  user enters teh password "<password>"
    And user clicks on login button
    Then verify the message "<message>"

    Examples:
      | url       | username        | password          | message                       |
      | loginPage | correctUsername | correctPassword   | Successfully logged in        |
      | loginPage | CORRECTUSERNAME | correctPassword   | Successfully logged in        |
      | loginPage | correctUsername | incorrectPassword | Failed to log in              |
      | loginPage | correctUsername |                   | Failed to log in              |
      | loginPage |                 | randomPassword    | Failed to log in              |
      | loginPage |                 |                   | Provide username and password |





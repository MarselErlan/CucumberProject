@searchBar

Feature: Login Functionality

  Background:
    Given  the user is on "https://www.google.com"


  @positive
    Scenario: positive scenario where user searches for apple
      When  user enters "apple" in the search bar
      And  the user click on search button
      Then  user should see "apple" in result page

    @negative
    Scenario: negative scenario where user searches for some random letters
      When user enter "fidhjsknavdghvnakdnfkanfoidjasfkdnsfvebdfkn" in the search bar
      Then the user should see "Your search - fidhjsknavdghvnakdnfkanfoidjasfkdnsfvebdfkn - did not match any documents."


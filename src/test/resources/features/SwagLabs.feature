Feature: Login Functionality

    Background:
      Given the user is on "https://www.saucedemo.com/"


    @SwagLabs
    Scenario Outline:
      Then user enters "<userName>" userName
      Then user enters "passssss" password
      Then the user click on login button

      Examples:

      |userName|
      |standard_user|
      |locked_out_user|
      |problem_user|
      |performance_glitch_user|
      |error_user|
      |visual_user|

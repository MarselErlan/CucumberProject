@Cashwise

  Feature: Cashwise sign up functionality

    Background:
      Given the user want ot sign up to "https://cashwise.us"
      Then  user click on the sign up button for cashwise.us

      Scenario: user want to sign up to the cashwise.us
        When user enters email "erxmen.97@gmail.com" for cashwise
        Then user enters password "Erlan123" for cashwise
        Then user enters confirm password "Erlan123" for cashwise
        Then  user click on continue button


      Scenario: user fills the next page
        When user enters firstName "Erlan" for cashwise.us
        Then user enters lastName "Abduraimov" for cashwise.us
        Then user enters companyName "codeWise" for cashwise.us
        Then user enters select area of company "IT, Software Development"
        Then user enters address "2323 Avenue"
        Then user select cyrrency "KGS (C)"
        Then user select click on sign up button
        Then user verify the current url page "https://cashwise.us/dashboard/infographics"


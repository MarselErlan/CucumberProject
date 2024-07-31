@Saucedemo

  Feature: Login Functionality

    Background:
      Given the user is on "https://www.saucedemo.com/"
      Then user enters "standard_user" userName
      Then user enters "secret_sauce" password
      Then the user click on login button


    @positive
    Scenario: positive scenario where user add product to cart
      When user add all product
      Then user go to cart
      Then user go to check 6 item
      Then user click on checkout button
      Then user enters "Erlan" FirstName
      Then user enters "Abduraimov" LastName
      Then user enters "60660" ZipCode
      Then user click on finish button
      Then validate "Thank you for your order!" here

      @negative
      Scenario: negative scenario where user want to login
        Then user enters  userName
        Then user enters "login" password
        Then the user click on login button





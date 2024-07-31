package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.SearchBarPage;
import utilities.Driver;




public class SearchBarSteps {

    private static  final Logger logger = LogManager.getLogger(SearchBarSteps.class);

//    WebDriver driver = Driver.getDriver();

    @Given("the user is on {string}")
    public void the_user_is_on(String url) {
//        Driver.getDriver().get(url);
        logger.info("User is going to " + url);
//        driver.get(url);
//        logger.info("User successfully landed on the page: " + driver.getTitle());

    }
    @When("user enters {string} in the search bar")
    public void user_enters_in_the_search_bar(String input) {
        SearchBarPage searchBarPage = new SearchBarPage();
        searchBarPage.searchBar.sendKeys(input);
        logger.info("User entered " + input + "in the search bar");
        logger.error("User failed to login because of wrong password");

    }
    @Then("user should see {string} in result page")
    public void user_should_see_in_result_page(String input) {

        SearchBarPage searchBarPage = new SearchBarPage();

        Assert.assertEquals(searchBarPage.checkApple.getText().toLowerCase(), input);


    }


    @When("the user click on search button")
    public void the_user_click_on_search_button() {
        SearchBarPage searchBarPage = new SearchBarPage();
        searchBarPage.searchButton.click();

    }



    @When("user enter {string} in the search bar")
    public void user_enter_in_the_search_bar(String input2) {

        SearchBarPage searchBarPage = new SearchBarPage();
        searchBarPage.searchBar.sendKeys(input2);
        searchBarPage.searchButton.click();

    }



    @Then("the user should see {string}")
    public void the_user_should_see(String input3) {

        SearchBarPage searchBarPage = new SearchBarPage();

        Assert.assertEquals(searchBarPage.checkNoResult.getText(), input3);


    }




    @Given("user is on {string}")
    public void user_is_on(String url) {
        logger.info("user goes to " + url);
    }
    @When("user enters the username {string}")
    public void user_enters_the_username(String username) {
        logger.info("user enters username: " + username);
    }
    @When("user enters teh password {string}")
    public void user_enters_teh_password(String password) {
        logger.info("user enters password: " + password);
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        logger.info("user clicks on login button");

    }
    @Then("verify the message {string}")
    public void verify_the_message(String message) {
        logger.info(message + "appeared on the page");


    }









}

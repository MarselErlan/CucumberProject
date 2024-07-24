package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SearchBarPage;
import utilities.Driver;

public class SearchBarSteps {

    @Given("the user is on {string}")
    public void the_user_is_on(String url) {
        Driver.getDriver().get(url);

    }
    @When("user enters {string} in the search bar")
    public void user_enters_in_the_search_bar(String input) {
        SearchBarPage searchBarPage = new SearchBarPage();
        searchBarPage.searchBar.sendKeys(input);

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
}

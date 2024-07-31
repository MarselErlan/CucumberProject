package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SaucedemPage;

public class SaucedemoSteps {


    @Then("user enters {string} userName")
    public void user_enters_user_name(String inputUserName) {
        SaucedemPage saucedemPage = new SaucedemPage();
        saucedemPage.enterUserName.sendKeys(inputUserName);
    }
    @Then("user enters {string} password")
    public void user_enters_password(String inputPassword) {

        SaucedemPage saucedemPage = new SaucedemPage();
        saucedemPage.enterPassword.sendKeys(inputPassword);

    }



    @Then("the user click on login button")
    public void the_user_click_on_login_button() {
        SaucedemPage saucedemPage = new SaucedemPage();
        saucedemPage.loginButton.click();
    }



    @When("user add all product")
    public void user_add_all_product() {
        SaucedemPage saucedemPage = new SaucedemPage();
        saucedemPage.toAddCart1.click();
        saucedemPage.toAddCart2.click();
        saucedemPage.toAddCart3.click();
        saucedemPage.toAddCart4.click();
        saucedemPage.toAddCart5.click();
        saucedemPage.toAddCart6.click();


    }



    @Then("user go to cart")
    public void user_go_to_cart() {
        SaucedemPage saucedemPage = new SaucedemPage();
        saucedemPage.cartButton.click();

    }


    @Then("user go to check {int} item")
    public void user_go_to_check_item(Integer int1) {
        SaucedemPage saucedemPage = new SaucedemPage();
        Assert.assertEquals(Integer.parseInt(saucedemPage.validate6Number.getText()), 6);

    }

    @Then("user click on checkout button")
    public void user_click_on_checkout_button() {
        SaucedemPage saucedemPage = new SaucedemPage();
        saucedemPage.checkoutButton.click();

    }
    @Then("user enters {string} FirstName")
    public void user_enters_first_name(String firstName) {
        SaucedemPage saucedemPage = new SaucedemPage();
        saucedemPage.FirstName.sendKeys(firstName);
    }
    @Then("user enters {string} LastName")
    public void user_enters_last_name(String lastName) {
        SaucedemPage saucedemPage = new SaucedemPage();
        saucedemPage.LastName.sendKeys(lastName);

    }
    @Then("user enters {string} ZipCode")
    public void user_enters_zip_code(String zipcode) {
        SaucedemPage saucedemPage = new SaucedemPage();
        saucedemPage.ZipCode.sendKeys(zipcode);
        saucedemPage.continueButton.click();
    }
    @Then("user click on finish button")
    public void user_click_on_finish_button() {
        SaucedemPage saucedemPage = new SaucedemPage();
        saucedemPage.finishButton.click();
    }
    @Then("validate {string} here")
    public void validate_here(String val) {
        SaucedemPage saucedemPage = new SaucedemPage();
        Assert.assertEquals(saucedemPage.validateFinish.getText(), val);

    }



    @Then("user enters  userName")
    public void user_enters_user_name() {






    }



}

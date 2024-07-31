package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SaucedemPage {


    WebDriver driver;


    public SaucedemPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name=\"user-name\"]")
    public WebElement enterUserName;

    @FindBy(xpath = "//input[@name=\"password\"]")
    public WebElement enterPassword;

    @FindBy(xpath = "//input[@name=\"login-button\"]")
    public WebElement loginButton;



    @FindBy(xpath = "//button[@name=\"add-to-cart-sauce-labs-backpack\"]")
    public WebElement toAddCart1;

    @FindBy(xpath = "//button[@name=\"add-to-cart-sauce-labs-bike-light\"]")
    public WebElement toAddCart2;

    @FindBy(xpath = "//button[@name=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
    public WebElement toAddCart3;

    @FindBy(xpath = "//button[@data-test=\"add-to-cart-sauce-labs-fleece-jacket\"]")
    public WebElement toAddCart4;

    @FindBy(xpath = "//button[@name=\"add-to-cart-sauce-labs-onesie\"]")
    public WebElement toAddCart5;

    @FindBy(xpath = "//button[@name=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
    public WebElement toAddCart6;


    @FindBy(xpath = "//a[@data-test=\"shopping-cart-link\"]")
    public WebElement cartButton;


    @FindBy(xpath = "//span[@data-test=\"shopping-cart-badge\"]")
    public WebElement validate6Number;

    @FindBy(xpath = "//button[@name=\"checkout\"]")
    public WebElement checkoutButton;

    @FindBy(xpath = "//button[@name=\"finish\"]")
    public WebElement finishButton;

    @FindBy(xpath = "//h2[@data-test=\"complete-header\"]")
    public WebElement validateFinish;

    @FindBy(xpath = "//input[@name=\"firstName\"]")
    public WebElement FirstName;


    @FindBy(xpath = "//input[@name=\"lastName\"]")
    public WebElement LastName;

    @FindBy(xpath = "//input[@name=\"postalCode\"]")
    public WebElement ZipCode;

    @FindBy(xpath = "//input[@name=\"continue\"]")
    public WebElement continueButton;

    @FindBy(xpath = "//div[@class=\"login_credentials\"]")
    public List<WebElement> userNameForNegative;











}

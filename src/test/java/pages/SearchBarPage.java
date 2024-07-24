package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SearchBarPage {


    WebDriver driver;

    public SearchBarPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//textarea[@title=\"Search\"]")
    public WebElement searchBar;

    @FindBy(xpath = "(//input[@value=\"Google Search\"])[1]")
    public WebElement searchButton;

    @FindBy(xpath = "//span[@class=\"OSrXXb\"]")
    public WebElement checkApple;

    @FindBy(xpath = "//p[@role=\"heading\"]")
    public WebElement checkNoResult;




}















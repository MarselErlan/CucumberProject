package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CashwisePage {

    WebDriver driver;



    public CashwisePage(){
    driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class=\"MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButtonBase-root css-k6k41x\"]")
    public WebElement signUpButton;

    @FindBy(xpath = "//input[@class=\"MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputSizeSmall css-1o6z5ng\"]")
    public WebElement email;

    @FindBy(xpath = "//input[@name=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//input[@name=\"repeat_password\"]")
    public WebElement confirmPassword;


    @FindBy(xpath = "//button[@class=\"MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth MuiButtonBase-root css-1hz3hle\"]")
    public WebElement continueButton;

    @FindBy(xpath = "//input[@name=\"first_name\"]")
    public WebElement FirstName;

    @FindBy(xpath = "//input[@name=\"last_name\"]")
    public WebElement LastName;

    @FindBy(xpath = "//input[@name=\"company_name\"]")
    public WebElement companyName;

    @FindBy(xpath = "//div[@aria-labelledby=\"select mui-component-select-business_area_id\"]")
    public WebElement forSelect;

    @FindBy(xpath = "//input[@name=\"address\"]")
    public WebElement address;

    @FindBy(xpath = "//div[@aria-labelledby=\"select mui-component-select-currency\"]")
    public WebElement forSelectCountry;

    @FindBy(xpath = "//button[@class=\"MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth MuiButtonBase-root css-1hz3hle\"]")
    public WebElement SignUpButtonF;







}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    private WebDriver driver;

    private By firstNameField = By.id("first-name");
    private By lastNameField  = By.id("last-name");
    private By zipCodeField   = By.id("postal-code");
    private By continueBtn    = By.id("continue");
    private By finishBtn      = By.id("finish");
    private By successMsg     = By.className("complete-header");

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void enterZipCode(String zip) {
        driver.findElement(zipCodeField).sendKeys(zip);
    }

    public void clickContinue() {
        driver.findElement(continueBtn).click();
    }

    public void clickFinish() {
        driver.findElement(finishBtn).click();
    }

    public void fillCheckoutForm(String firstName, String lastName, String zip) {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterZipCode(zip);
        clickContinue();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMsg).getText();
    }
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userNameField = By.cssSelector("input[placeholder = 'Username']");
    private By passwordField = By.cssSelector("input[placeholder = 'Password']");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("h3[data-test=\"error\"]");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName(String userName) {
        driver.findElement(userNameField).sendKeys(userName);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public InventoryPage clickButton(){
        driver.findElement(loginButton).click();
        return new InventoryPage(driver);
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }
}
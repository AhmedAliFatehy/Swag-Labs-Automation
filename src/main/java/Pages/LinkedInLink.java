package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LinkedInLink {
    private WebDriver driver;
    private By linkedInLink = By.linkText("LinkedIn");

    public LinkedInLink(WebDriver driver){
        this.driver = driver;
    }

    public String openLinkedInLinkAndReturnUrl() {

        String originalWindow = driver.getWindowHandle();
        driver.findElement(linkedInLink).click();

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.numberOfWindowsToBe(2));

        for (String window : driver.getWindowHandles()) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
        return driver.getCurrentUrl();
    }
}

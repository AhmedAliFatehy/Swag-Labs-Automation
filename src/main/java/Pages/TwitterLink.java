package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TwitterLink {
    private WebDriver driver;
    private By twitterLink = By.linkText("Twitter");

    public TwitterLink(WebDriver driver){
        this.driver = driver;
    }

    public String openTwitterLinkAndReturnUrl() {

        String originalWindow = driver.getWindowHandle();
        driver.findElement(twitterLink).click();

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

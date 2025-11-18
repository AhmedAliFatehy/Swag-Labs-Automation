package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FaceBookLink {
    private WebDriver driver;
    private By faceBookLink = By.linkText("Facebook");

    public FaceBookLink(WebDriver driver){
        this.driver = driver;
    }

    public String openFaceBookLinkAndReturnUrl() {

        String originalWindow = driver.getWindowHandle();
        driver.findElement(faceBookLink).click();

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

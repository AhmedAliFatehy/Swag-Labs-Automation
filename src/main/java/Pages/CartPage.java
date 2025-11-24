package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    private By checkOutButton = By.id("checkout");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isProductPresent(String name) {
        return driver.findElements(By.xpath("//div[text()='" + name + "']")).size() > 0;
    }

    public CheckOutPage clickCheckout() {
        driver.findElement(checkOutButton).click();
        return new CheckOutPage(driver);
    }
}

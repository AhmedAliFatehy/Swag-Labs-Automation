package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    private WebDriver driver;

    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }

    private By getAddToCartButton(String productName) {
        return By.xpath("//div[text()='" + productName + "']/../../..//button");
    }

    public void addProductToCart(String productName) {
        driver.findElement(getAddToCartButton(productName)).click();
    }

    private By getRemoveButton(String productName) {
        return By.xpath("//div[text()='" + productName + "']/../../..//button[contains(text(),'Remove')]");
    }

    public void removeProduct(String productName) {
        driver.findElement(getRemoveButton(productName)).click();
    }

    public CartPage openCart() {
        driver.findElement(By.id("shopping_cart_container")).click();
        return new CartPage(driver);
    }
}

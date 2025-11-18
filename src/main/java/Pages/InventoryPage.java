package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class InventoryPage {
    private WebDriver driver;
    private By pageTitle = By.xpath("//div[text() = 'Swag Labs']");
    private By cartIcon = By.cssSelector("#shopping_cart_container > a");
    private By inventoryContainer = By.cssSelector("div[class = 'inventory_item']");


    public InventoryPage (WebDriver driver){
        this.driver = driver;
    }

    public String getText(){
        return driver.findElement(pageTitle).getText();
    }

    public boolean isCartIconDisplayed(){
        return driver.findElement(cartIcon).isDisplayed();
    }

    public int getProductSize(){
        List<WebElement> products = driver.findElements(inventoryContainer);
        return products.size();
    }

    public ShoppingCartBadge clickCartIcon() {
        driver.findElement(cartIcon).click();
        return new ShoppingCartBadge(driver);
    }
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartBadge {
    private WebDriver driver;
    private By shoppingCartBadge = By.cssSelector(".shopping_cart_badge");

    public ShoppingCartBadge(WebDriver driver){
        this.driver = driver;
    }

    public boolean isCartEmpty(){
        return driver.findElements(shoppingCartBadge).isEmpty();
    }

}

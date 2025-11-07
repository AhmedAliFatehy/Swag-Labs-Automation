package Inventory;

import Base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class InventoryTests extends BaseTests {

    @Test
    public void testInventory() {

        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        var inventoryPage = loginPage.clickButton();
        int productSize = inventoryPage.getProductSize();
        
        assertEquals(inventoryPage.getText(), "Swag Labs", "The page title is incorrect.");
        assertTrue(inventoryPage.isCartIconDisplayed(), "The cart icon is not displayed.");
        assertEquals(productSize, 6, "The product size is incorrect.");
    }
}

package Cart;

import Base.BaseTests;
import Pages.InventoryPage;
import Pages.ShoppingCartBadge;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CartEmptyTest extends BaseTests {
    @Test
    public void testCartEmpty(){
        InventoryPage inventoryPage = new InventoryPage(driver);
        loginAsStandardUser();
        boolean empty = inventoryPage.clickCartIcon().isCartEmpty();
        assertTrue(empty, "Cart is not empty.");
    }
}

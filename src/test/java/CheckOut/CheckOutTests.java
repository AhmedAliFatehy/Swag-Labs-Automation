package CheckOut;

import Base.BaseTests;
import Pages.CartPage;
import Pages.CheckOutPage;
import Pages.InventoryPage;
import Pages.ProductsPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CheckOutTests extends BaseTests {
    @Test
    public void testCheckOut(){
        ProductsPage productsPage = new ProductsPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        loginAsStandardUser();
        productsPage.addProductToCart("Sauce Labs Backpack");
        CartPage cartPage = productsPage.openCart();

        CheckOutPage checkOutPage = cartPage.clickCheckout();
        checkOutPage.fillCheckoutForm("Ahmed", "Aly", "123456");
        checkOutPage.clickFinish();

        assertEquals(checkOutPage.getSuccessMessage(), "Thank you for your order!");
    }
}

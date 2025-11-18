package Cart;

import Base.BaseTests;
import Pages.CartPage;
import Pages.ProductsPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class AddToCartTests extends BaseTests {
    @Test
    public void testAddToCart(){
        ProductsPage productsPage = new ProductsPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        productsPage.addProductToCart("Sauce Labs Backpack");
        productsPage.addProductToCart("Sauce Labs Bolt T-Shirt");
        productsPage.addProductToCart("Sauce Labs Onesie");

        CartPage cart = productsPage.openCart();

        assertTrue(cart.isProductPresent("Sauce Labs Backpack"));
        assertTrue(cart.isProductPresent("Sauce Labs Bolt T-Shirt"));
        assertTrue(cart.isProductPresent("Sauce Labs Onesie"));
    }
}

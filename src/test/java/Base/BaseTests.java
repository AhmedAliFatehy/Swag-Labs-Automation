package Base;

import Pages.FaceBookLink;
import Pages.LoginPage;
import Pages.LinkedInLink;
import Pages.TwitterLink;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTests {
    protected WebDriver driver;
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        goHome();
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    public void loginAsStandardUser() {
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLogin();
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

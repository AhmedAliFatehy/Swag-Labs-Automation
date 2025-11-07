package Login;

import Base.BaseTests;
import LogInDataProvider.LogInDataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test(dataProviderClass = LogInDataProvider.class, dataProvider = "logInData")
    public void testLogin(String userName, String password, String expectedResult){
        String actualMessage;
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clickButton();

        if (expectedResult.equals("Success")){
            String currentUrl = loginPage.getCurrentUrl();
            actualMessage = currentUrl.contains("inventory.html") ? "Success" : "Login failed";
        }
        else {
            actualMessage = loginPage.getErrorMessage();
        }
        assertEquals(actualMessage, expectedResult);
        System.out.println("Test passed " + actualMessage);
    }
}

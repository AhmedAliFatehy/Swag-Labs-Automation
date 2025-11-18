package Login;

import Base.BaseTests;
import DataProviders.DataProviders;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test(dataProvider = "loginData", dataProviderClass = DataProviders.class)
    public void testLogin(String userName, String password, String expectedResult) {
        String actualResult = loginPage.login(userName, password);
        assertEquals(actualResult, expectedResult);
    }
}

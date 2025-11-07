package LogInDataProvider;

import org.testng.annotations.DataProvider;

public class LogInDataProvider {
    @DataProvider(name = "logInData")
    public static Object[][] logInData() {
        return new Object[][]{
                {"standard_user", "secret_sauce", "Success"},
                {"wrongUser", "wrongPassword", "Username and password do not match."},
                {"standard_user", "", "Password is required"}
        };
    }
}
package DataProviders;

import org.testng.annotations.DataProvider;
import JsonReader.JsonReader;

public class DataProviders {

    @DataProvider(name = "loginData")
    public static Object[][] getLoginData() {
        return JsonReader.getLoginData();
    }

}

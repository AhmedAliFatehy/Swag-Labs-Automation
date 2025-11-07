package JsonReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class JsonReader {
    public static Object[][] getLoginData() {
        Object[][] testData = null;
        try {
            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("D:\\Faculty\\SwagLabsAutomationAssignment\\resources\\testData.json"));

            JSONObject allCases = (JSONObject) jsonArray.get(0);

            JSONObject valid = (JSONObject) allCases.get("validLogIn");
            JSONObject invalid = (JSONObject) allCases.get("inValidLogIn");
            JSONObject empty = (JSONObject) allCases.get("emptyPassword");

            testData = new Object[3][3];

            testData[0][0] = valid.get("username");
            testData[0][1] = valid.get("password");
            testData[0][2] = valid.get("expected");

            testData[1][0] = invalid.get("username");
            testData[1][1] = invalid.get("password");
            testData[1][2] = invalid.get("expected");

            testData[2][0] = empty.get("username");
            testData[2][1] = empty.get("password");
            testData[2][2] = empty.get("expected");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return testData;
    }
}

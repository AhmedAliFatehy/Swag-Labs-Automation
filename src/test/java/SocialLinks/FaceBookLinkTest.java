package SocialLinks;

import Base.BaseTests;
import Pages.FaceBookLink;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FaceBookLinkTest extends BaseTests {
    @Test
    public void testFaceBookLink(){
        FaceBookLink faceBookLink = new FaceBookLink(driver);
        loginAsStandardUser();
        String url = faceBookLink.openFaceBookLinkAndReturnUrl();
        assertTrue(url.contains("facebook"), "FaceBook URL is incorrect. Actual: " + url);
    }
}

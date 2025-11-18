package SocialLinks;

import Base.BaseTests;
import Pages.TwitterLink;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TwitterLinkTest extends BaseTests {
    @Test
    public void testTwitterLink(){
        TwitterLink twitterLink = new TwitterLink(driver);
        loginAsStandardUser();
        String url = twitterLink.openTwitterLinkAndReturnUrl();
        assertTrue(url.contains("x.com"), "Twitter URL is incorrect. Actual: " + url);
    }
}

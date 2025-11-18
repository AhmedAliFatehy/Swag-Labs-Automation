package SocialLinks;

import Base.BaseTests;
import Pages.LinkedInLink;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LinkedInLinkTest extends BaseTests {
    @Test
    public void testLinkedInLink(){
        LinkedInLink linkedInLink = new LinkedInLink(driver);
        loginAsStandardUser();
        String url = linkedInLink.openLinkedInLinkAndReturnUrl();
        assertTrue(url.contains("linkedin"), "LinkedIn URL is incorrect. Actual: " + url);
    }
}

package runner;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoOfTheSiteTest extends BaseTest {


    @Test
    public void testLogoOfTheSite() {
        boolean logo = getDriver().findElement(By.cssSelector("h1.site-title")).isDisplayed();

        Assert.assertTrue(logo, "Logo is displayed");
    }

}

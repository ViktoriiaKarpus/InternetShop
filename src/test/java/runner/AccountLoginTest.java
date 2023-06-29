package runner;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;;
import org.testng.Assert;

import org.testng.annotations.Test;

public class AccountLoginTest extends BaseTest {
    @Test
    public void testAccountLogin() {
        getDriver().findElement(By.xpath("//li[@id='menu-item-1237']")).click();
        WebElement text = getDriver().findElement(By.xpath("//h1[@class ='has-text-align-center']"));

        Assert.assertEquals(text.getText(), "Account");
    }
}

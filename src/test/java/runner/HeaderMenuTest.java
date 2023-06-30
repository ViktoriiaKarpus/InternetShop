package runner;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HeaderMenuTest extends BaseTest {

    @Test
    public void testGetTitleOfTheSite() {
        getDriver().findElement(By.cssSelector("h1.site-title"));

        Assert.assertEquals(getDriver().getTitle(), "AskOmDch – Become a Selenium automation expert!");
    }

    @Test
    public void testMenuStore(){
        getDriver().findElement(By.xpath("//div//li[@id='menu-item-1227']")).click();
        WebElement store = getDriver().findElement(
                By.xpath("//div//header[@class='woocommerce-products-header']"));

        Assert.assertEquals(store.getText(), "Store");
    }

    @Test
    public void testAccountLogin() {
        getDriver().findElement(By.xpath("//li[@id='menu-item-1237']")).click();
        WebElement text = getDriver().findElement(By.xpath("//h1[@class ='has-text-align-center']"));

        Assert.assertEquals(text.getText(), "Account");
    }
}

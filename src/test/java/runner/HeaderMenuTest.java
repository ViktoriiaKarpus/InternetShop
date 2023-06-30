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
    public void testMenuStore() {
        getDriver().findElement(By.xpath("//div//li[@id='menu-item-1227']")).click();
        WebElement store = getDriver().findElement(
                By.xpath("//div//header[@class='woocommerce-products-header']"));

        Assert.assertEquals(store.getText(), "Store");
    }
    @Test
    public void testMenuMen() {
        getDriver().findElement(By.xpath("//li[@id='menu-item-1228']")).click();
        WebElement men = getDriver().findElement(By.xpath("//div//header[@class='woocommerce-products-header']"));

        Assert.assertEquals(men.getText(), "Men");
    }
    @Test
    public void testMenuWomen() {
        getDriver().findElement(By.xpath("//li[@id='menu-item-1229']")).click();
        WebElement women = getDriver().findElement(By.xpath("//h1[@class='woocommerce-products-header__title page-title']"));

        Assert.assertEquals(women.getText(), "Women");
    }
    @Test
    public void testMenuAccessories() {
        getDriver().findElement(By.xpath("//li[@id='menu-item-1230']")).click();
        WebElement accessories = getDriver().findElement(By.xpath("//header[@class='woocommerce-products-header']/h1"));

        Assert.assertEquals(accessories.getText(), "Accessories");
    }
    @Test
    public void testMenuAccount() {
        getDriver().findElement(By.xpath("//li[@id='menu-item-1237']")).click();
        WebElement account = getDriver().findElement(By.xpath("//div[@class='wp-block-cover__inner-container']/h1"));

        Assert.assertEquals(account.getText(),"Account");
    }

    @Test
    public void testMenuAbout() {
        getDriver().findElement(By.xpath("//li[@id='menu-item-1232']")).click();
        WebElement about = getDriver().findElement(By.xpath("//div[@class='wp-block-cover__inner-container']"));

        Assert.assertEquals(about.getText(),"About Us");
    }
}

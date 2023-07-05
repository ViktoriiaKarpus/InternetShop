package runner;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


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

        Assert.assertEquals(account.getText(), "Account");
    }

    @Test
    public void testMenuAbout() {
        getDriver().findElement(By.xpath("//li[@id='menu-item-1232']")).click();
        WebElement about = getDriver().findElement(By.xpath("//div[@class='wp-block-cover__inner-container']"));

        Assert.assertEquals(about.getText(), "About Us");
    }

    @Test
    public void testCountNumberOfMenuInHeader() {
        List<WebElement> numberOfMenu = getDriver().findElements(By.cssSelector(".site-header-primary-section-right .menu-item"));

        Assert.assertEquals(numberOfMenu.size(), 8);
    }

    @Test
    public void testCardIsClickable() {
        getDriver().findElement(By.cssSelector(".site-header-primary-section-right .ast-builder-menu-1")).click();

        WebElement cart = getDriver().findElement(By.xpath("//div[@class='wp-block-group__inner-container']/h1"));

        Assert.assertEquals(cart.getText(),"Cart");
    }

    @Test
    public void testMainTitle() {
       WebElement title =  getDriver().findElement(By.xpath("//*[contains(text(),'Raining Offers for Hot Summer!')]"));

        Assert.assertEquals(title.getText(),"Raining Offers for Hot Summer!");
    }

    @Test
    public void testDiscountMessage() {
        WebElement text = getDriver().findElement(By.xpath("//h3[contains(text(),'25% OFF On all products')]"));

        Assert.assertEquals(text.getText(),"25% OFF On all products");
    }

    @Test
    public void testClickButtonShopNow() {
       getDriver().findElement(By.xpath("//div/a[@href='/store']")).click();

        Assert.assertEquals(getDriver().getCurrentUrl(),"https://askomdch.com/store");
    }

    @Test
    public void testClickButtonFindMore() {
        getDriver().findElement(By.xpath("//div/a[@href='https://askomdch.com/contact-us/']")).click();

        Assert.assertEquals(getDriver().getCurrentUrl(),"https://askomdch.com/contact-us/");
    }

    @Test
    public void testBackGroundColorOfTheHeader() {
       String backgroundColorOfTheHeader = getDriver().findElement(By.xpath("//div[@class='wp-block-cover alignfull has-background-dim']"))
              .getCssValue("background-color");

        Assert.assertEquals(backgroundColorOfTheHeader, "rgba(0, 29, 53, 1)");
    }
}

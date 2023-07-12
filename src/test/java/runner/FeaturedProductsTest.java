package runner;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class FeaturedProductsTest extends BaseTest {

    @Test
    public void testCountPictures() {
        List<WebElement> numberOfThePictures = getDriver().findElements(By.cssSelector("div.wp-block-group__inner-container"));

        Assert.assertEquals(numberOfThePictures.size(), 3);
    }

    @Test
    public void testDiscountMessageOfTheFirstPicture() {
        getDriver().findElement(By.xpath("//img[@src='https://askomdch.com/wp-content/uploads/2021/06/launchpad9.jpg']"));
        WebElement discountMessage = getDriver().findElement(By.xpath("//*[text()='20% Off on Tank Tops']"));

        Assert.assertTrue(discountMessage.isDisplayed());
    }

    @Test//?
    public void testButtonShopNowOnTheFirstPicture() {
        getDriver().findElement(By.xpath("//div/a[@href='https://askomdch.com/product-category/women/']")).click();
        WebElement mainTitle = getDriver().findElement(By.xpath("//h1"));

        Assert.assertEquals(mainTitle.getText(), "Women");
    }

    @Test
    public void testMessageOfTheSecondPicture() {
        WebElement message = getDriver().findElement(By.xpath("//*[text()='Latest Eyewear']"));

        Assert.assertTrue(message.isDisplayed());
    }

    @Test
    public void testButtonShopNowOnTheSecondPicture() {
        getDriver().findElement(By.xpath("//div/a[@href='https://askomdch.com/product-category/men/']")).click();
        WebElement mainTitle = getDriver().findElement(By.xpath("//div/header[@class='woocommerce-products-header']/h1"));

        Assert.assertEquals(mainTitle.getText(), "Men");
    }

    @Test
    public void testMessageOfTheThirdPicture() {
        WebElement message = getDriver().findElement(By.xpath("//*[text()='Let’s Suit Up']"));

        Assert.assertTrue(message.isDisplayed());
    }

    @Test
    public void testButtonCheckOut() {
        getDriver().findElement(By.xpath("//div/a[@href='https://askomdch.com/product-category/accessories/']")).click();
        WebElement mainTitle = getDriver().findElement(By.xpath("//header[@class='woocommerce-products-header']/h1"));

        Assert.assertTrue(mainTitle.isDisplayed());
    }

    @Test
    public void testTitleFeatureProducts() {
        WebElement title = getDriver().findElement(By.xpath("//*[text()='Featured Products']"));

        Assert.assertTrue(title.isDisplayed());
    }


}

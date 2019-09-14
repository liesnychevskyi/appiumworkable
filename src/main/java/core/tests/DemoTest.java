package core.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class DemoTest extends BaseClass // Every test class extends from BaseTest
{
    @Test(priority = 1)
    public void googleTest()
    {
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Best Appium best tutorial");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Assert.assertTrue(true);
    }

    @Test(priority = 2)
    public void amazonTest()
    {
        driver.get("http://www.amazon.com");
        driver.findElement(By.id("nav-search-keywords")).sendKeys("Appium best tutorial");
        System.out.println("Testing Amazon ---");
    }

    @Test(priority = 3)
    public void appleTest()
    {
        driver.get("http://www.apple.com");
        System.out.println("Testing Apple ---");
    }
}

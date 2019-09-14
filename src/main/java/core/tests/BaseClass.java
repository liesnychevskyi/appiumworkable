package core.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass
{
    // Before testing check carefully chrome driver version for comparable with the browser version
    //
    WebDriver driver;
    //AndroidDriver<WebElement> driver = null;
    //appium --port 9090  - to change the port from terminal
    //
    @BeforeTest
    public void setUp() throws MalformedURLException
    {
        try
        {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            //capabilities.setCapability("platformName", "Android");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            capabilities.setCapability(MobileCapabilityType.VERSION, "7.0");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S6");
            //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Emu");
            //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "MyOnePlus");
            capabilities.setCapability(MobileCapabilityType.UDID, "11160b1df7590503");
            //capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            //capabilities.setCapability(MobileCapabilityType.UDID, "44801993");
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            //capabilities.setCapability(MobileCapabilityType.APP, "C:\Users\stas\IdeaProjects\appium_android\src\main\java\apps\belong.apk");
            capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
            //capabilities.setCapability("noReset", true );


            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            //driver = new AndroidDriver<WebElement>(url, capabilities);
            driver = new RemoteWebDriver(url, capabilities);
        }
        catch (Exception e)
        {
            System.out.println("Cause is: " + e.getCause());
            System.out.println("Massage is: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @AfterSuite
    public void tearDown()
    {
        driver.close();
        driver.quit();
    }

}

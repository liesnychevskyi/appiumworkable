package core.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LandingPage
{
    //Constructor
    //===================================================================||
    public LandingPage(AppiumDriver<WebElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    //Elements
    //===================================================================||
    @AndroidFindBy(id="com.belongtail.belong:id/buttonLogin_next")
    public WebElement signUpItsFree;

    @AndroidFindBy(id = "com.belongtail.belong:id/button_login_already_registered")
    public WebElement alreadyRegistered;
    //Methods
    //=====================================================================||
    public void clickSignupItsFreeButton()
    {

    }


}

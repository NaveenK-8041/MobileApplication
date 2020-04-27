package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//This Class handles MapprrLaunchingPage in our Application, so we will have in this class "the webelements on that page we are going to 
//work with and their methods"
public class MapprrLaunchingPage {
public MapprrLaunchingPage(AndroidDriver<AndroidElement> driver) {
PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Explore']")
	public WebElement exploreBtn;
	public WebElement exploreBtn()
	{
		return exploreBtn;
	}	
}


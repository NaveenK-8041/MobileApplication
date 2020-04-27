package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//This Class handles MobileSelectionPage in our Application, so we will have in this class "the webelements on that page we are going to 
//work with and their methods"
public class MobileSelectionPage {
	public MobileSelectionPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
			@AndroidFindBy(xpath="//android.widget.TextView[@text='Apple Iphone Xs - 64gb - Silver']")
			public WebElement iPhoneXS;
			public WebElement iPhoneXS()
			{
				return iPhoneXS;
			}
}

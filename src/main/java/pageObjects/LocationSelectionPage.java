package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//This Class handles LocationSelectionPage in our Application, so we will have in this class "the webelements on that page we are going to 
//work with and their methods"
public class LocationSelectionPage {
	public LocationSelectionPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
			@AndroidFindBy(xpath="//*[@text='Fetch Location']")
			public WebElement fetchLocationBtn;
			@AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
			public WebElement okBtn;
			public WebElement fetchLocationBtn()
			{
				return fetchLocationBtn;
			}
			public WebElement okBtn()
			{
				return okBtn;
			}
			
}

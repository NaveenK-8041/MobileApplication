package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//This Class handles HomePage in our Application, so we will have in this class "the webelements on that page we are going to 
//work with and their methods"
public class HomePage {
	public HomePage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
			@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='com.bts.consumer:id/searchImage']")
			public WebElement searchMenu;
			@AndroidFindBy(xpath="//android.widget.TextView[@text='Electronics']")
			public WebElement productSelection;
			@AndroidFindBy(xpath="//android.widget.TextView[@text='Mobiles & Accessories']")
			public WebElement mobilesAndAccessories;
			public WebElement searchMenu()
			{
				return searchMenu;
			}
			public WebElement productSelection()
			{
				return productSelection;
			}
			public WebElement mobilesAndAccessories()
			{
				return mobilesAndAccessories;
			}
}

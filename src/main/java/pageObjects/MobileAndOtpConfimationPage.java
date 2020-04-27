package pageObjects;

import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//This Class handles MobileAndOtpConfimationPage in our Application, so we will have in this class "the webelements on that page we are going to 
//work with and their methods"
public class MobileAndOtpConfimationPage {
	public MobileAndOtpConfimationPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
			@AndroidFindBy(xpath="//*[@text='Enter your mobile number']")
			public WebElement mobileNumberBox;
			@AndroidFindBy(xpath="//android.widget.ImageView[@index='1']")
			public WebElement proceedBtn;
			@AndroidFindBy(xpath="//*[@text='Enter OTP received']")
			public WebElement OtpBox;
			@AndroidFindBy(xpath="//android.widget.ImageView[@NAF='true']")
			public WebElement otpProceedBtn;
			
			public WebElement mobileNumberBox()
			{
				return mobileNumberBox;
			}
			public WebElement proceedBtn()
			{
				return proceedBtn;
			}
			public WebElement OtpBox()
			{
				return OtpBox;
			}
			public WebElement otpProceedBtn()
			{
				return otpProceedBtn;
			}
}

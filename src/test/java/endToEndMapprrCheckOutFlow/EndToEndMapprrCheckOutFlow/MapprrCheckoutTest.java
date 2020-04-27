
package endToEndMapprrCheckOutFlow.EndToEndMapprrCheckOutFlow;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HomePage;
import pageObjects.LocationSelectionPage;
import pageObjects.MapprrLaunchingPage;
import pageObjects.MobileAndOtpConfimationPage;
import pageObjects.MobileSelectionPage;
import resources.Base;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.TapOptions.tapOptions;
//This Class is our Actual TestClass where our Test Case exists
public class MapprrCheckoutTest extends Base {
    public static AndroidDriver<AndroidElement> driver; 
    @Test
    public void checkoutTest() throws InterruptedException, IOException {
    	service=startServer();
		AndroidDriver<AndroidElement> driver=capabilities("MapprrApp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	Thread.sleep(7000);
	    MapprrLaunchingPage m=new MapprrLaunchingPage(driver);
	    WebElement btn=m.exploreBtn();
	    TouchAction t=new TouchAction(driver);
	    t.tap(tapOptions().withElement(element(btn))).perform();
	    System.out.println("enter the mobile number");
	    Thread.sleep(13000);
	    Scanner in=new Scanner(System.in);
	    String mobileNumber=in.nextLine();
	    MobileAndOtpConfimationPage mo=new MobileAndOtpConfimationPage(driver);
	    mo.mobileNumberBox().sendKeys(mobileNumber);
	    mo.proceedBtn().click();
	    System.out.println("Enter OTP");
	    String otp=in.nextLine();
	    Thread.sleep(10000);
	    mo.OtpBox().sendKeys(otp);
	    mo.otpProceedBtn().click();
	    Thread.sleep(15000);
	    HomePage h=new HomePage(driver);
	    h.searchMenu().click();
		h.productSelection().click();
	    h.mobilesAndAccessories().click();
	    Thread.sleep(8000);
	    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Apple Iphone Xs - 64gb - Silver\"))");
	    MobileSelectionPage mp=new MobileSelectionPage(driver);
	    mp.iPhoneXS().click();
	    //By this statement appium server will be stopped
		service.stop();
    }	
}

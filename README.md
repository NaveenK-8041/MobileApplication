# MapprrCheckoutTest
## Base Class
* Base.java

For starting ofAppium Server, Application invokation, setting up of capabilities and provision of port for the appium server one Base class is implemented, whatever test cases are there, they will inherit this Base class to invoke the browser as per the requirement
## properties File
* globalVariables.properties

For Global Variables declaration one properties file is implemented.global variables like "device" on which we want to work, "Application" which we want to test can be provided as key-value pair in this properties file

## PageObjectModel with Page Classes
* HomePage.java
* LocationSelectionPage.java
* MapprrLaunchingPage.java
* MobileAndOtpConfimationPage.java
* MobileSelectionPage.java

Totally we've to work on 5 webpages for that pageobjectmodel with 5 Page classes is implemented Whatever the objects we are going to work with and methods for that objects are built in these pages

## TestCase
* MapprrCheckoutTest.java

"MapprrCheckoutTest" is our actual testclass which has our test steps.

## Entering Mobile Number and OTP to get into Mapprr Application
By using Scanner class we can enter Mobile Number and OTP from our console.
It asks us like "Enter the mobile number" and "Enter OTP".

## pom.xml & testng.xml
pom.xml and testng.xml are implemented as per the requirement

## Test Results
For test results we will access the "index.html" file in "test-output" directory of the project

## Note
I was asked to perform test execution till checkout by selecting any product of fourth store available on home page but on home page any stores are not there and it is show a massage like "Low serviceability due to lockdown", so i went through search menu i selected one product category, on that i went through upto one product selection and upto checkout also it is not permitting
as all products are showing a massage "Currently Unavailable". 

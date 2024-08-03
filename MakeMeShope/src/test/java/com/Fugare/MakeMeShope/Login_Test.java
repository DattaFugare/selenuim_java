package com.Fugare.MakeMeShope;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import TestData.LoginDataProvider;

import WebPages.Dashbordpage;
import WebPages.LogIn_Page;
import WebPages.Register;
import utils.ConfigReader;

public class Login_Test extends BaseTest {
	static ConfigReader configReader;
	public static Logger log;
	public static String str;
	static Dashbordpage dashbordpage;

	@BeforeClass
	public void setUp() {
		super.setUp(); // Call the base setup method
        ExtentReportManager.setUp();

	}

	@Test(dataProvider = "loginData", dataProviderClass = LoginDataProvider.class)
	public static void LoginTest(String email, String password) {
		   ExtentReportManager.createTest("Login Test");
		   try {
		// WebDriver driver = new ChromeDriver();
		log = LogManager.getLogger(Login_Test.class);
		configReader = new ConfigReader();
		String url = configReader.getProperty("QA");
		log.info("Environment url get hitting");
		driver.get(url);
	     ExtentReportManager.getTest().log(Status.INFO, "Navigated to login page");
		log.info(" URL get Fine , Application is Up&Running");
		Register register = new Register(driver);
		LogIn_Page login = new LogIn_Page(driver);
		 dashbordpage = new Dashbordpage(driver);
		log.info("Pages are Loaded and element is find ");
		login.useremail(email);//dattatrayfugare77@gmail.com
	     ExtentReportManager.getTest().log(Status.INFO, "enter user name");
		log.info("entered useremail ");
		login.userPassword(password);
	     ExtentReportManager.getTest().log(Status.INFO, " enter password");
		log.info("entered password ");

		login.clickonlogin();
	     ExtentReportManager.getTest().log(Status.INFO, "clicked on login button");
		log.info("clicked loginbtn ");
		 ExtentReportManager.getTest().log(Status.PASS, "Login test passed");
		 
	 } catch (Exception e) {
         ExtentReportManager.getTest().log(Status.FAIL, "Login test failed: " + e.getMessage());
         Assert.fail("Test failed: " + e.getMessage());
     }
	// WebElement login = driver.findElement(By.cssSelector(".ico-login"));
//  login.click();
//  WebElement Email = driver.findElement(By.cssSelector("#Email"));
//  Email.sendKeys("dattatrayfugare18@gmail.com");
//  WebElement Password = driver.findElement(By.cssSelector("#Password"));
//  Password.sendKeys("@Fugare777");
//  WebElement RememberMe = driver.findElement(By.cssSelector("#RememberMe"));
//  RememberMe.click();
//  WebElement loginbutton = driver.findElement(By.cssSelector(".login-button"));
//  loginbutton.click();

	}
	
	@Test (dependsOnMethods = "LoginTest")
	public void dashboardTitle()
	{	ExtentReportManager.createTest("bashbordpage Test");
		try {
		str = dashbordpage.bashbordpage();
	     ExtentReportManager.getTest().log(Status.INFO, "Navigated to  bashbordpage");
	Assert.assertEquals(str, "AUTOMATION");

	log.info("validation is done");
	String title = dashbordpage.getHomePageTitle();
    ExtentReportManager.getTest().log(Status.INFO, "get title of  bashbordpage");

	System.out.println(title);
	 ExtentReportManager.getTest().log(Status.PASS, "bashbordpage test passed");
		 } catch (Exception e) {
		        ExtentReportManager.getTest().log(Status.FAIL, "bashbordpage test failed: " + e.getMessage());
		        Assert.fail("Test failed: " + e.getMessage());
		    }
	}

//	@DataProvider(name="logindata")
//	public Object[][] LoginDataProvider()
//	{
//		return new Object[][] {
//            {"dattatrayfugare18@gmail.com", "@Fugare777"},
	
//            {"dattatrayfugare18@gmail.com","@Fugare779"},
	
//            {"dattatrayfugare81@gmail.com","@Fugare777"}
//	};
//	}
//	@AfterMethod
//	public void tearDown() {
//		super.tearDown(); // Call the base setup method
//	}
	@AfterClass
    public void tearDown() {
        driver.quit();
        ExtentReportManager.tearDown();
    }
}

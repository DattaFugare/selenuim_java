package com.Fugare.MakeMeShope;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import TestData.LoginDataProvider;

import WebPages.Dashbordpage;
import WebPages.LogIn_Page;
import WebPages.Register;
import utils.ConfigReader;

public class Login_Test extends BaseTest {
	ConfigReader configReader;
	public static Logger log;
	public static String str;

	@BeforeMethod
	public void setUp() {
		super.setUp(); // Call the base setup method
	}

	@Test(dataProvider = "loginData", dataProviderClass = LoginDataProvider.class)
	public void LoginTest(String email, String password) throws InterruptedException {
		// WebDriver driver = new ChromeDriver();
		log = LogManager.getLogger(Login_Test.class);
		configReader = new ConfigReader();
		String url = configReader.getProperty("QA");
		log.info("Environment url get hitting");
		driver.get(url);
		log.info(" URL get Fine , Application is Up&Running");
		Register register = new Register(driver);
		LogIn_Page login = new LogIn_Page(driver);
		Dashbordpage dashbordpage = new Dashbordpage(driver);
		log.info("Pages are Loaded and element is find ");
		login.useremail(email);
		log.info("entered useremail ");
		login.userPassword(password);
		log.info("entered password ");
		login.clickonlogin();

		log.info("clicked loginbtn ");
		str = dashbordpage.bashbordpage();
     
		Assert.assertEquals(str, "AUTOMATION");

		log.info("validation is done");

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

//	@DataProvider(name="logindata")
//	public Object[][] LoginDataProvider()
//	{
//		return new Object[][] {
//            {"dattatrayfugare18@gmail.com", "@Fugare777"},
//            {"dattatrayfugare18@gmail.com","@Fugare779"},
//            {"dattatrayfugare81@gmail.com","@Fugare777"}
//	};
//	}
	@AfterMethod
	public void tearDown() {
		super.tearDown(); // Call the base setup method
	}
}

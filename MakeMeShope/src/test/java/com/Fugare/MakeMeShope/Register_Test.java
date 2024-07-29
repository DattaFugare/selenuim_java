package com.Fugare.MakeMeShope;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import WebPages.Register;


public class Register_Test {
	
	@Test
	public void Register_Test()
	{
	//	String projectPath = System.getProperty("user.dir");
		
	//	System.setProperty("webdriver.chrome.driver", "F:\\MyseleniumWrok\\MakeMeShope\\drivers\\chromedriver\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	
		
		Register register1 = new Register(driver);
		register1.clickregister();
		register1.clickmale();
		register1.enterFirstName("Dattatray");
		
		register1.enterLastName("Fugare");
		
		register1.entermail("dattatrayfugare18@gmail.com");
		register1.enterPassword("@Fugare777");
		register1.enterConfirmPassword("@Fugare777");
		register1.clickcontinuebutton();
	
		
       	//driver.findElement(".ico-register")
		//WebElement register = driver.findElement(By.cssSelector(".ico-register"));
		//register.click();
		//WebElement male = driver.findElement(By.cssSelector("#gender-male"));
		//male.click();
		//WebElement FirstName = driver.findElement(By.cssSelector("#FirstName"));
		//FirstName.sendKeys("Dattatray");
		//WebElement LastName = driver.findElement(By.cssSelector("#LastName"));
		//LastName.sendKeys("Fugare");
	//	WebElement Email = driver.findElement(By.cssSelector("#Email"));
		//Email.sendKeys("dattatrayfugare18@gmail.com");
		//WebElement Password = driver.findElement(By.cssSelector("#Password"));
		//Password.sendKeys("@Fugare777");
	//	WebElement ConfirmPassword = driver.findElement(By.cssSelector("#ConfirmPassword"));
	//	ConfirmPassword.sendKeys("@Fugare777");
		//WebElement ConfirmPassword = driver.findElement(By.cssSelector("#ConfirmPassword"));
		//registerButton.click();
	//	WebElement continuebutton = driver.findElement(By.cssSelector("#.register-continue-button"));
		//continuebutton.click();
		

	}

}

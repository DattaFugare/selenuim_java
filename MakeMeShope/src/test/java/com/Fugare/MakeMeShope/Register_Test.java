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
	
		
		Register register = new Register(driver);
		register.clickregister();
		register.clickmale();
		register.enterFirstName("Dattatray");
		
		register.enterLastName("Fugare");
		
		register.entermail("dattatrayfugare18@gmail.com");
		register.enterPassword("@Fugare777");
		register.enterConfirmPassword("@Fugare777");
		register.clickcontinuebutton();
	
		
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

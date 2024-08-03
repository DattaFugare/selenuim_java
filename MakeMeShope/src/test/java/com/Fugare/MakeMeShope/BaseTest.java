package com.Fugare.MakeMeShope;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	 protected static WebDriver driver;
	  protected WebDriverWait wait;
	  
	 
	  
	 public void setUp() {
//	        Set the path of the ChromeDriver executable
//	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

//	         Set Chrome options if needed
//	        ChromeOptions options = new ChromeOptions();
//	        options.addArguments("--start-maximized");  Example option
//	         options.addArguments("--headless");  Uncomment for headless mode
		 ChromeOptions handlingSSL = new ChromeOptions();

			//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
			handlingSSL.setAcceptInsecureCerts(true);
			//handlingSSL.setAcceptInsecureCerts(false);
					
			//Creating instance of Chrome driver by passing reference of ChromeOptions object
			//WebDriver driver = new ChromeDriver(handlingSSL);
	        // Initialize WebDriver
	        driver = new ChromeDriver(handlingSSL);
	        driver.manage().window().maximize();
	        // Initialize WebDriverWait
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }
	 


	    // Method to clean up after tests
	 public void tearDown() {
		 
	        if (driver != null) {
	            driver.quit(); // Close the browser
	        }
	    }

}

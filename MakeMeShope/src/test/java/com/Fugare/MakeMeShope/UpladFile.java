package com.Fugare.MakeMeShope;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import WebPages.UploadFilePage;
import io.reactivex.rxjava3.functions.Action;
import utils.ConfigReader;

public class UpladFile extends BaseTest {
	public static ConfigReader configReader;
	public static Logger log;

	@BeforeClass
	public void setUp() {
		super.setUp(); // Call the base setup method
		ExtentReportManager.setUp();

	}

	@Test
	public void uploadflie() throws InterruptedException, IOException {
		UploadFilePage uploadfile = new UploadFilePage(driver);
		log = LogManager.getLogger(UpladFile.class);
		configReader = new ConfigReader();
		String url = configReader.getProperty("AutoIt");
		log.info("Environment url get hitting");
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement ele = driver.findElement(By.id("file-upload"));
		uploadfile.upload(ele);
		Runtime.getRuntime().exec(".\\AutoIT_Script\\Uploadfile.exe");
	
		uploadfile.clickonuploadfile();

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.elementToBeClickable(By.id("P0-0"))).click();

		// uploadfile.clickonuploadfile(By.id(""));

	}
	@AfterClass
	public void terwoubn() {
		super.tearDown();; // Call the base setup method
        ExtentReportManager.setUp();

	}

}

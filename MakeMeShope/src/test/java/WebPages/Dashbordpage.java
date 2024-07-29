package WebPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Dashbordpage {
	
	private WebDriver driver;	
	
			public Dashbordpage(WebDriver driver)
			{
	        	this.driver=driver;
			}
	
	private By auto = By.cssSelector("div[class='left mt-1'] h3");
	
	public String bashbordpage() {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(auto));
	        return element.getText();
    }
	}


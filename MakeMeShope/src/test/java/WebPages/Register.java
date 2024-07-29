package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Register {
	
	private WebDriver driver;
	
	 public Register(WebDriver driver)
	{
		this.driver=driver;
		
	}
	

	
	//WebElement register = driver.findElement(By.cssSelector(".ico-register"));
	private By register = By.cssSelector(".ico-register");
	private By male = By.cssSelector("#gender-male");
	private By FirstName = By.cssSelector("#FirstName");
	private By LastName = By.cssSelector("#LastName");
	private By Email = By.cssSelector("#Email");
	private By Password = By.cssSelector("#Password");
	private By ConfirmPassword = By.cssSelector("#ConfirmPassword");
	private By registercontinuebutton = By.cssSelector("#register-button");
	
	
	
	  public void clickregister() {
	        driver.findElement(register).click();
	    }
	  public void clickmale() {
	        driver.findElement(male).click();
	    }
	  public void enterFirstName(String username) {
	        driver.findElement(FirstName).sendKeys(username);
	    }
	  public void enterLastName(String lastName) {
		  
	        driver.findElement(LastName).sendKeys(lastName);
	    }
	  public void entermail(String entermail) {
		  
	        driver.findElement(Email).sendKeys(entermail);
	    }
	  public void enterPassword(String enterPassword) {
		  
	        driver.findElement(Password).sendKeys(enterPassword);
	    }
	  public void enterConfirmPassword(String enterConfirmPassword) {
		  
	        driver.findElement(ConfirmPassword).sendKeys(enterConfirmPassword);
	    }
	  public void clickcontinuebutton() {
	        driver.findElement(registercontinuebutton).click();
	    }
}

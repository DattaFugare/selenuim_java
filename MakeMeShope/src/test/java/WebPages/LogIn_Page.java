package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LogIn_Page {

	private WebDriver driver;
	
	public LogIn_Page(WebDriver driver)
	{
		this.driver=driver;
		 
	}
	
	//private By login = By.cssSelector(".ico-login");
	private By userEmail = By.cssSelector("#userEmail");
  private By userPassword = By.cssSelector("#userPassword");
	//private By RememberMe =By.cssSelector("#RememberMe");
	private By loginbutton =By.cssSelector("#login");
	
	
	public void useremail(String mail)
	{
		driver.findElement(userEmail).sendKeys(mail);
	}
	
	public void userPassword(String userpassword)
	{
		driver.findElement(userPassword).sendKeys(userpassword);
	}
	public Dashbordpage clickonlogin()
	{
		driver.findElement(loginbutton).click();
		return new Dashbordpage(driver);
		 
	}
//	
//	  public Dashbordpage login(String usr, String pwd) {
//		  ((WebElement) userEmail).sendKeys(usr);
//		  ((WebElement) userPassword).sendKeys(pwd);
//		  ((WebElement) loginbutton).click();
//	        return new Dashbordpage(driver);  // Return the next page object
//	    }
//	 public void clicklogin() {
//	        driver.findElement(login).click();
//	    }
//	 public void enterEmail(String email) {
//	        driver.findElement(Email).sendKeys(email);
//	    }
//	 public void enterPassword(String password) {
//	        driver.findElement(Password).sendKeys(password);
//	    }
//	 public void clickRememberMe() {
//	        driver.findElement(RememberMe).click();
//	    }
//	 public void clickloginbutton() {
//	        driver.findElement(loginbutton).click();
//	    }
//	
}

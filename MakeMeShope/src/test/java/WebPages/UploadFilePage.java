package WebPages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Enter;

public class UploadFilePage {
	WebDriver driver;

	WebDriverWait wait;

	public UploadFilePage(WebDriver driver) {
		this.driver = driver;

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	private By choosefile = By.cssSelector("#file-upload");
	private By uploadfile = By.cssSelector("#file-submit");

	public void upload(WebElement element) {

		Actions act = new Actions(driver);
		act.moveToElement(element).click().perform();

	}

	public void clickonuploadfile() {
		driver.findElement(uploadfile).click();
	}

}

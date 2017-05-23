package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Home_Page 

{

	private static WebElement element = null;



		public static WebElement lnk_MyAccount(WebDriver driver) {

			element = (new WebDriverWait(driver,10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='/login']")));

			  element = driver.findElement(By.xpath("//a[@href='/login']"));

			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			return element;

	}


}

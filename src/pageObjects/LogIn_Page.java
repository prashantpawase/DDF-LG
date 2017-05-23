package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.ExcelUtils;

public class LogIn_Page 
{

	private static WebElement element = null;



    public static WebElement txtbx_UserName(WebDriver driver)
    {
        element = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Username / Email / Mobile']")));


          element = driver.findElement(By.xpath("//input[@placeholder='Username / Email / Mobile']"));


        return element;
    }

    public static WebElement txtbx_Password(WebDriver driver)
    {
        element = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Password']")));


           element = driver.findElement(By.xpath("//input[@placeholder='Password']"));


        return element;
    }

    public static WebElement btn_LogIn(WebDriver driver)
    {

        element = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));

           element = driver.findElement(By.xpath("//button[@type='submit']"));

        return element;
    }

    
  
}

package automationFramework;

/**
 * Created by edn on 23/5/17.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.ExcelUtils;


        import java.util.concurrent.TimeUnit;

        import org.openqa.selenium.WebDriver;

        import org.openqa.selenium.firefox.FirefoxDriver;

        import pageObjects.*;

        import utility.Constant;

        // Import Package utility.*

        import utility.ExcelUtils;

        import appModules.SignIn_Action;

public class PP {

    private static WebDriver driver = null;

    public static void main(String[] args) throws Exception {

        //This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method

        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");

        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(Constant.URL);


        WebElement city = (new WebDriverWait(driver , 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-url='delhi']")));


        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        city.click();


        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

        SignIn_Action.Execute(driver);

        System.out.println("Login Successfully, now it is the time to Log Off buddy.");

      //  Home_Page.lnk_LogOut(driver).click();

        driver.quit();

        //This is to send the PASS value to the Excel sheet in the result column.

        ExcelUtils.setCellData("Pass", 1, 3);

    }

}

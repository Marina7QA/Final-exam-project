package tests;

import common.Browsers;
import listeners.ScreenshotListener;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest extends Browsers {
    //public WebDriver driver;
    @Parameters({"browser"})
    @BeforeMethod
    public void setup(@Optional("Optional specific browser")String browser) {
        /*WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--disable-notifications","--start_maximize"));
        driver.get("https://www.saucedemo.com/");*/

        switch (browser) {
            case "Chrome":
                startChrome();
                break;
            case "Firefox":
                startFirefox();
                break;
            default:
                startChrome("--start-maximized", "--disable-notifications");
        }
    }

    @AfterMethod

    public void tearDown(){
        /*if(!result.isSuccess()){
            ScreenshotListener.takeScreenshot(driver,result);
        }*/

        driver.quit();

    }
    public WebDriver getDriver(){

        return driver;
    }

}

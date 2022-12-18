package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewCompletePage extends BasePage {
    public CheckoutOverviewCompletePage(WebDriver driver) {
        super(driver);
    }
    By finishButtonBy = By.id("finish");
    By backHomeButtonBy = By.id("back-to-products");

    public void clickFinishButton(){
        clickElement(finishButtonBy);
    }
    public void clickHomeButton(){
        clickElement(backHomeButtonBy);
    }
}



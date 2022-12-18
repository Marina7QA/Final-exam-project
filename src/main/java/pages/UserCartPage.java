package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserCartPage extends BasePage {
    public UserCartPage(WebDriver driver) {
        super(driver);
    }
    By checkOutButtonBy = By.id("checkout");

    public void checkoutButton(){
        clickElement(checkOutButtonBy);
    }
}

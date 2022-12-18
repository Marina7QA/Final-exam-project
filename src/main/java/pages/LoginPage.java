package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {

        super(driver);
    }

    By userNameFieldBy = By.id("user-name");
    By passwordFieldBy = By.id("password");
    By loginButtonBy = By.id("login-button");
    By errorNotificationButtonBy = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

    public void writeUserName(String username) {
        writeText(userNameFieldBy, username);
    }

    public void writePassword(String password) {
        writeText(passwordFieldBy, password);
    }

    public void clickLoginButton() {
        clickElement(loginButtonBy);
    }

    public String readingTextFromNotificationButton() {
        return readText(errorNotificationButtonBy);
    }
    public String readingTextFromLogoutButton(){
        return readText(loginButtonBy);
    }
}

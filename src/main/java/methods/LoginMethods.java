package methods;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;


    public class LoginMethods extends LoginPage {
        public LoginMethods(WebDriver driver) {
            super(driver);
        }
        public void login(String username,String password){
            writeUserName(username);
            writePassword(password);
            clickLoginButton();
        }
}

package methods;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.UserLoggedInPage;


    public class LogoutMethods extends BasePage {


        public LogoutMethods(WebDriver driver) {
            super(driver);
        }
        UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);

        public void logout(){
            userLoggedInPage.clickMenuButton().clickLogoutButton();
        }
}

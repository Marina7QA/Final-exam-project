package tests;

import methods.LoginMethods;
import methods.LogoutMethods;
import methods.VerifyMethods;
import org.testng.annotations.Test;
import utilities.PropertyManager;

public class LogoutTest extends BaseTest {
    @Test
    public void logoutUser() {
        LoginMethods loginMethods = new LoginMethods(driver);
        loginMethods.login(PropertyManager.getInstance().getGoodUsername(),PropertyManager.getInstance().getGoodPassword());
        LogoutMethods logoutMethods = new LogoutMethods(driver);
        logoutMethods.logout();
        VerifyMethods verifyMethods = new VerifyMethods(driver);
        verifyMethods.verifyLogout("");
    }

}

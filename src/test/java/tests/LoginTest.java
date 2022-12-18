package tests;

import methods.LoginMethods;
import methods.VerifyMethods;
import org.testng.annotations.Test;
import utilities.PropertyManager;

public class LoginTest extends BaseTest{
    @Test
    public void successfullLogin() {
        LoginMethods loginMethods = new LoginMethods(driver);
        loginMethods.login(PropertyManager.getInstance().getGoodUsername(),PropertyManager.getInstance().getGoodPassword());
        VerifyMethods verifyMethods = new VerifyMethods(driver);
        verifyMethods.verifyLogin("Open Menu");

    }
}

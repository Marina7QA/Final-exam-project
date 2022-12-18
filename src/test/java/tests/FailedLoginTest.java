package tests;

import dataGenerator.DataProviders;
import methods.LoginMethods;
import methods.VerifyMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedLoginTest extends BaseTest{
    @Test(dataProvider = "failedLogin",dataProviderClass = DataProviders.class)

    public void failedLogin(String email,String password,String error) {
        LoginMethods loginMethods = new LoginMethods(driver);
        loginMethods.login(email,password);
        VerifyMethods verifyMethods = new VerifyMethods(driver);
        try {
            verifyMethods.verifyFailedLogin(error);
            System.out.println("Test passed");
        } catch (Exception e) {
            Assert.fail();

        }
    }
}

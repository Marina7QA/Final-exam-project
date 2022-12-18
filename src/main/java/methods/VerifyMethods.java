package methods;

import org.openqa.selenium.WebDriver;
import pages.*;


    public class VerifyMethods extends BasePage {

        public VerifyMethods(WebDriver driver) {
            super(driver);
        }

        LoginPage loginPage = new LoginPage(driver);
        UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);
        CheckoutYourInformationPage checkoutYourInformationPage = new CheckoutYourInformationPage(driver);
        UserCartPage userCartPage = new UserCartPage(driver);

        public void verifyFailedLogin(String expectedText) {
            assertStringEquals(loginPage.readingTextFromNotificationButton(), expectedText);

        }
        public void verifyLogin(String expectedText){
            assertStringEquals(userLoggedInPage.readingTextFromMenuButton(),expectedText);
        }
        public void verifyShopItem(String expectedText){
            assertStringEquals(userLoggedInPage.readingTextFromMenuButton(),expectedText);
        }
        public void verifyLogout(String expectedText){
            assertStringEquals(loginPage.readingTextFromLogoutButton(),expectedText);
        }
        public void verifyRemoveItem(String expectedText){
            assertStringEquals(userLoggedInPage.readingTextFromAddToCartBackpackButton(),expectedText);
        }

    }

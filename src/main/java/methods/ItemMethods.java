package methods;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.UserCartPage;
import pages.UserLoggedInPage;


    public class ItemMethods extends BasePage {
        public ItemMethods(WebDriver driver) {
            super(driver);
        }
        UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);
        UserCartPage userCartPage = new UserCartPage(driver);

        public void removeItemFromBasket(){
            userLoggedInPage.clickAddToCartBackpack().clickRemoveToCartBackpack();

        }
        public void shopSauceBikeLight(){
            userLoggedInPage.clickAddToCartSauceBikeLight().clickBasketButton();

        }
        public void clickCheckoutButton(){

            userCartPage.checkoutButton();
        }
}

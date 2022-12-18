package tests;

import methods.ItemMethods;
import methods.LoginMethods;
import methods.VerifyMethods;
import org.testng.annotations.Test;
import utilities.PropertyManager;

public class RemoveItemFromBasketTest extends BaseTest{
    @Test

    public void removeItem()  {
        LoginMethods loginMethods = new LoginMethods(driver);
        loginMethods.login(PropertyManager.getInstance().getGoodUsername(),PropertyManager.getInstance().getGoodPassword());
        ItemMethods itemMethods = new ItemMethods(driver);
        itemMethods.removeItemFromBasket();
        VerifyMethods verifyMethods = new VerifyMethods(driver);
        verifyMethods.verifyRemoveItem("ADD TO CART");




    }
}

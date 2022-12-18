package tests;

import dataGenerator.DataCreation;
import methods.CheckInformationMethods;
import methods.ItemMethods;
import methods.LoginMethods;
import methods.VerifyMethods;
import org.testng.annotations.Test;
import utilities.PropertyManager;

public class ShoppingItemTest extends BaseTest {
    @Test

    public void shopItem() {
        LoginMethods loginMethods = new LoginMethods(driver);
        loginMethods.login(PropertyManager.getInstance().getGoodUsername(),PropertyManager.getInstance().getGoodPassword());
        ItemMethods itemMethods = new ItemMethods(driver);
        itemMethods.shopSauceBikeLight();
        itemMethods.clickCheckoutButton();
        CheckInformationMethods checkInformationMethods = new CheckInformationMethods(driver);
        checkInformationMethods.userInformation(DataCreation.generateFirstName(),
                DataCreation.generateLastName(),
                DataCreation.generatePostalCode());
        checkInformationMethods.finishButton();
        checkInformationMethods.backToHome();
        VerifyMethods verifyMethods = new VerifyMethods(driver);
        verifyMethods.verifyShopItem("Open Menu");


    }

}

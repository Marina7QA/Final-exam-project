package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLoggedInPage  extends BasePage{
    public UserLoggedInPage(WebDriver driver) {
        super(driver);
    }
    By menuButtonBy = By.id("react-burger-menu-btn");
    By logoutButtonBy = By.id("logout_sidebar_link");
    By addToCartSauceBackpackBy = By.id("add-to-cart-sauce-labs-backpack");
    By removeToCartSauceBackpack = By.id("remove-sauce-labs-backpack");
    By basketButtonby = By.id("shopping_cart_container");
    By addToCartSauceLabsBike = By.id("add-to-cart-sauce-labs-bike-light");



    public String readingTextFromMenuButton(){
        return readText(menuButtonBy);
    }
    public UserLoggedInPage clickMenuButton(){
        clickElement(menuButtonBy);
        return this;
    }
    public UserLoggedInPage clickLogoutButton(){
        clickElement(logoutButtonBy);
        return this;
    }
    public UserLoggedInPage clickAddToCartBackpack(){
        clickElement(addToCartSauceBackpackBy);
        return this;
    }
    public UserLoggedInPage clickRemoveToCartBackpack(){

        clickElement(removeToCartSauceBackpack);
        return this;
    }
    public String readingTextFromAddToCartBackpackButton(){
        return readText(addToCartSauceBackpackBy);
    }
    public UserLoggedInPage clickAddToCartSauceBikeLight(){
        clickElement(addToCartSauceLabsBike);
        return this;
    }
    public UserLoggedInPage clickBasketButton(){
        clickElement(basketButtonby);
        return this;
    }
}

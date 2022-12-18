package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutYourInformationPage extends BasePage {
    public CheckoutYourInformationPage(WebDriver driver) {
        super(driver);
    }
    By firstNameFieldBy = By.id("first-name");
    By lastNameFieldBy = By.id("last-name");
    By postalCodeBy = By.id("postal-code");
    By continueButtonBy = By.id("continue");

    public CheckoutYourInformationPage writeFirstName(String fname){
        writeText(firstNameFieldBy,fname);
        return this;
    }
    public CheckoutYourInformationPage writeLastName(String lname){
        writeText(lastNameFieldBy,lname);
        return this;
    }
    public CheckoutYourInformationPage writePostalCode(String postalcode){
        writeText(postalCodeBy,postalcode);
        return this;
    }
    public CheckoutYourInformationPage clickContunueButton(){
        clickElement(continueButtonBy);
        return this;
    }



}



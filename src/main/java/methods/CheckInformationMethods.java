package methods;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.CheckoutOverviewCompletePage;
import pages.CheckoutYourInformationPage;


    public class CheckInformationMethods extends BasePage {
        public CheckInformationMethods(WebDriver driver) {

            super(driver);
        }
        CheckoutYourInformationPage checkoutYourInformationPage = new CheckoutYourInformationPage(driver);
        CheckoutOverviewCompletePage checkoutOverviewCompletePage = new CheckoutOverviewCompletePage(driver);

        public void userInformation(String fname,String lname,String postalcode){
            checkoutYourInformationPage.writeFirstName(fname)
                    .writeLastName(lname)
                    .writePostalCode(postalcode)
                    .clickContunueButton();
        }
        public void finishButton(){
            checkoutOverviewCompletePage.clickFinishButton();
        }
        public void backToHome(){
            checkoutOverviewCompletePage.clickHomeButton();
        }

    }

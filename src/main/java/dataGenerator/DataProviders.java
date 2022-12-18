package dataGenerator;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "failedLogin")
    public Object[][] getDataFromDataProvider(){
        return new Object[][]
                {
                        {"", DataCreation.generatePassword(),"Epic sadface: Username is required"},
                        {DataCreation.generateUsername(),"","Epic sadface: Password is required"},
                        {DataCreation.generateUsername(), DataCreation.generatePassword(),
                                "Epic sadface: Username and password do not match any user in this service"},

                };
    }
}

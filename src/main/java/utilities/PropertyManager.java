package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {
    public static String driverPath, goodUsername, goodPassword, firstName, lastName, itemName;
    public static String configeFilePath = "src/main/resources/configuration.properties";

    public static PropertyManager instance;


    public static PropertyManager getInstance() {
        if (instance == null) {
            instance = new PropertyManager();
            instance.loadData();
        }
        return instance;
    }

    private void loadData() {
        Properties properties = new Properties();
        try {
            FileInputStream fi = new FileInputStream(configeFilePath);
            properties.load(fi);
        } catch (Exception e) {
            e.printStackTrace();
        }


        driverPath = properties.getProperty("driverPath");
        goodUsername = properties.getProperty("goodUsername");
        goodPassword = properties.getProperty("goodPassword");
        firstName = properties.getProperty("firstName");
        lastName = properties.getProperty("lastName");


    }


    public String getDriverPath() {
        return driverPath;
    }

    public String getGoodUsername() {

        return goodUsername;
    }

    public String getGoodPassword() {
        return goodPassword;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

}

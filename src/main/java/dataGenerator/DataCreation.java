package dataGenerator;

import com.github.javafaker.Faker;

public class DataCreation {
    public static String generateUsername(){
        return new Faker().name().username();
    }
    public static String generateFirstName(){
        return new Faker().name().firstName();
    }
    public static String generateLastName(){
        return new Faker().name().lastName();
    }
    public static String generatePassword(){
        return new Faker().internet().password(5,10,true,true,true);
    }
    public static String generatePostalCode(){
        return new Faker().number().digits(5);
    }

}

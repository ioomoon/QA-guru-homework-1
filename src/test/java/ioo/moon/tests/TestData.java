package ioo.moon.tests;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {
    static Faker faker = new Faker(new Locale("ru"));

    public static String
        firstName = faker.name().firstName(),
        lastName = faker.name().lastName(),
        address = faker.address().streetAddress(),
        email = faker.internet().emailAddress();


    public static String
            gender = "Female",
            userNumber = "8999999999",
            filepath = "src/resources/img.png",
            firstSubjectLetter = "b",
            subject = "Biology",
            hobby = "Sports",
            state = "Uttar Pradesh",
            city = "Agra";



}

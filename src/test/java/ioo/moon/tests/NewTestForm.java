package ioo.moon.tests;

import org.junit.jupiter.api.Test;

import static ioo.moon.tests.TestData.*;

public class NewTestForm extends BaseTest {

    @Test
    void fillFormTest() {

        StudentRegistrationFormPage.openPage();

        StudentRegistrationFormPage.fillFirstNameInput(firstName)
                .fillLastNameInput(lastName);

        StudentRegistrationFormPage.fillEmailInput(email);

        StudentRegistrationFormPage.fillGenderRadioButton(gender);

        StudentRegistrationFormPage.fillMobileNumberInput(userNumber);

        StudentRegistrationFormPage
                .calendar
                .setDate("23", "November", "1996");

        StudentRegistrationFormPage.selectSubject(firstSubjectLetter, subject);

        StudentRegistrationFormPage.selectHobbies(hobby);

        StudentRegistrationFormPage.uploadFile(filepath);

        StudentRegistrationFormPage.fillAdressInput(address);

        StudentRegistrationFormPage.selectStateAndCity(state, city);

        StudentRegistrationFormPage.submitInformation();

        StudentRegistrationFormPage
                .checkResultTable("Student Name", firstName + " " + lastName)
                .checkResultTable("Student Email", email)
                .checkResultTable("Gender", gender)
                .checkResultTable("Mobile", userNumber)
                .checkResultTable("Date of Birth", "23 November,1996")
                .checkResultTable("Subjects", subject)
                .checkResultTable("Hobbies", hobby)
                .checkResultTable("Picture", "img.png")
                .checkResultTable("Address", address)
                .checkResultTable("State and City", "Uttar Pradesh Agra");
    }
}

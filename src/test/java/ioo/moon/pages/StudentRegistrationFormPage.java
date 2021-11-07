package ioo.moon.pages;

import com.codeborne.selenide.SelenideElement;
import ioo.moon.pages.components.CalendarComponent;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StudentRegistrationFormPage {
    // locators & elements
    private String FORM_TITLE = "Student Registration Form";
    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            numberInput = $("#userNumber"),
            subjectsSelect = $("#subjectsInput"),
            uploadFile = $("#uploadPicture"),
            adressInput = $("#currentAddress"),
            resultsTable = $(".table-responsive"),
            submit = $("#submit");


    public CalendarComponent calendar = new CalendarComponent();

    // actions
    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
    }

    public StudentRegistrationFormPage fillFirstNameInput(String value) {
        /* First name text box */
        firstNameInput.setValue(value);

        return this;
    }

    public StudentRegistrationFormPage fillLastNameInput(String value) {
        /* Last name text box */
        lastNameInput.setValue(value);

        return this;
    }

    public StudentRegistrationFormPage fillEmailInput(String value) {
        /* Email text box */
        emailInput.setValue(value);

        return this;
    }

    public StudentRegistrationFormPage fillGenderRadioButton(String value) {
        /* Gender radio button */
        $(byText(value)).click();

        return this;
    }

    public StudentRegistrationFormPage setDate(String day, String month, String year) {
        calendar.setDate(day, month, year);

        return this;
    }

    public StudentRegistrationFormPage fillMobileNumberInput(String value) {
        /* Mobile number text box */
        numberInput.setValue(value);

        return this;
    }

    public StudentRegistrationFormPage uploadFile(String value) {
        /* Picture download */
        uploadFile.uploadFile(new File(value));

        return this;
    }

    public StudentRegistrationFormPage fillAdressInput(String value) {
        /* Current Address text box */
        adressInput.setValue(value);

        return this;
    }

    public StudentRegistrationFormPage selectSubject(String firstLetter, String value) {
        /* Subjects select */
        subjectsSelect.setValue(firstLetter);
        $(byText(value)).click();

        return this;
    }

    public StudentRegistrationFormPage selectHobbies(String value) {
        /* Hobbies check box */
        $(byText(value)).click();

        return this;
    }

    public void selectStateAndCity(String state, String city) {
        /* State and City select */
        $(byText("Select State")).scrollTo().click();
        $(byText(state)).click();

        $(byText("Select City")).click();
        $(byText(city)).click();
    }

    public StudentRegistrationFormPage checkResultTable(String key, String value) {
        resultsTable.$(byText(key))
                .parent().shouldHave(text(value));
        return this;
    }

    public void submitInformation() {

        submit.click();
    }

}

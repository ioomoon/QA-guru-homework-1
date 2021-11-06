package ioo.moon.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CalendarComponent {
    private SelenideElement dateInput = $("#dateOfBirthInput"),
            monthInput = $(".react-datepicker__month-select"),
            yearInput = $(".react-datepicker__year-select");


    public void setDate(String day, String month, String year) {
        dateInput.click();  /* Date of birth calendar */
        monthInput.click();
        $(byText(month)).click();
        yearInput.click();
        $(byText(year)).click();
        $$(".react-datepicker__day").find(text(day)).click();
    }
}

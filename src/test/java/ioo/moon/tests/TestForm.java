package ioo.moon.tests;

import ioo.moon.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestForm extends BaseTest {

    @Test
    @DisplayName("Проверка формы на demoqa.com")
    void fillFormTest() {

        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("Maria");  /* First name text box */
        $("#lastName").setValue("Lavrushina");  /* Last name text box */
        $("#userEmail").setValue("Lavrushina@ioo.moon");  /* Email text box */

        $(byText("Female")).click();  /* Gender radio button */

        $("#userNumber").setValue("89999999999");  /* Mobile number text box */

        $("#dateOfBirthInput").click();  /* Date of birth calendar */
        $(".react-datepicker__month-select").click();
        $(byText("November")).click();

        $(".react-datepicker__year-select").click();
        $(byText("1996")).click();

        $$(".react-datepicker__day").find(text("23")).click();

        $("#subjectsInput").setValue("b");  /* Subjects select */
        $(byText("Biology")).click();

        $(byText("Sports")).click();  /* Hobbies check box */
        $(byText("Reading")).click();

        $("#uploadPicture").uploadFile(new File("src/resources/img.png")); /* Picture download */

        $("#currentAddress").setValue("Moscow, Russia");  /* Current Address text box */


        $(byText("Select State")).scrollTo().click();  /* State and City select */
        $(byText("Uttar Pradesh")).click();
        $(byText("Select City")).click();
        $(byText("Agra")).click();

        $("#submit").click();

        $(".table-responsive").shouldHave(text("Maria"), text("Lavrushina"), text("Lavrushina@ioo.moon"),
                text("Female"), text("8999999999"), text("23 November,1996"), text("Biology"), text("Biology"),
                text("Sports"), text("Reading"), text("Reading"), text("img.png"), text("Moscow, Russia"),
                text("Uttar Pradesh Agra"));
    }
}

package ioo.moon;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestForm {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Maria");
        $("#lastName").setValue("Lavrushina");
        $("#userEmail").setValue("Lavrushina@ioo.moon");
//        $("#genterWrapper").selectRadio("Female");


    }

}

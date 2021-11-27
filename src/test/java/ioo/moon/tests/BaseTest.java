package ioo.moon.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import ioo.moon.pages.StudentRegistrationFormPage;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    StudentRegistrationFormPage StudentRegistrationFormPage = new StudentRegistrationFormPage();

    @BeforeAll
    static void beforeAll() {

        Configuration.startMaximized = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
}

package ioo.moon.tests;

import com.codeborne.selenide.Configuration;
import ioo.moon.pages.StudentRegistrationFormPage;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    StudentRegistrationFormPage StudentRegistrationFormPage = new StudentRegistrationFormPage();

    @BeforeAll
    static void beforeAll() {

        Configuration.startMaximized = true;
    }
}

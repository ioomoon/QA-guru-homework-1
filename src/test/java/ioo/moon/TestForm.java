package ioo.moon;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestForm {

    // Выполняется перед всеми тестами
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void fillFormTest() {
        // Открываем URL
        open("https://demoqa.com/automation-practice-form");

        // Заполняем текстовые поля Name, Email
        $("#firstName").setValue("Maria");
        $("#lastName").setValue("Lavrushina");
        $("#userEmail").setValue("Lavrushina@ioo.moon");

        // Выбираем пол в radio button
        $(byText("Female")).click();

        // Заполняем текстовое поле Mobile
        $("#userNumber").setValue("89999999999");

        // Выбираем дату рождения, поле Date of Birth типа календарь
        // Устанавливаем месяц
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(byText("November")).click();

        // Устанавливаем год
        $(".react-datepicker__year-select").click();
        $(byText("1996")).click();

        // Устанавливаем день (выбираем все элементы по селекторы и ищем дату)
        $$(".react-datepicker__day").find(text("23")).click();

        // Водим букву и из выпадающего списка выбираем subject
        $("#subjectsInput").setValue("b");
        $(byText("Biology")).click();

        // Выбираем хобби в radio button
        $(byText("Sports")).click();

        // Вводим адрес в текстовое поле
        $("#currentAddress").setValue("Moscow, Russia");

        // Загружаем файл
        $("#uploadPicture").uploadFile(new File("src/resources/img.png"));



        // Выбираем штат и город
        $(byText("Select State")).scrollTo().click();
        $(byText("Uttar Pradesh")).click();
        $(byText("Select City")).click();
        $(byText("Agra")).click();

        // Проверяем, жмем submit
        $("#submit").click();
        sleep(2000);
    }

}

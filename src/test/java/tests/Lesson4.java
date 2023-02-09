package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
public class Lesson4 {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void homework() {
        // переменные
        String firstName, lastName, userEmail, userNumber, currentAddress, subjectsInput, state, city, hobbies, gender, picturename;
        firstName = "Elena";
        lastName = "Semenova";
        userEmail = "kochkurova.en@gmail.com";
        userNumber = "9829306853";
        currentAddress = "Russia";
        subjectsInput = "English";
        state = "Haryana";
        city = "Karnal";
        hobbies = "Music";
        gender = "Female";
        picturename = "fdf.jpg";

        /* Разработайте один автотест на проверку формы
        https://demoqa.com/automation-practice-form */

        // заполнение формы
        open("/automation-practice-form");
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(userEmail);
        $("#userNumber").setValue(userNumber);
        $("#currentAddress").setValue(currentAddress);
        $("#genterWrapper").$(byText(gender)).click();
        $("#subjectsInput").setValue(subjectsInput).pressEnter();
        $("#hobbiesWrapper").$(byText(hobbies)).click();
        $("#react-select-3-input").setValue(state).pressEnter();
        $("#react-select-4-input").setValue(city).pressEnter();
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("November");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("1995");
        $(".react-datepicker__month").$$(".react-datepicker__week").get(4)
                .$(byText("30")).click();

        // вставить фото
        $("#uploadPicture").uploadFromClasspath(picturename);
        $("#submit").pressEnter();


        // Проверка
        $(".modal-body").$(byText("Student Name")).sibling(0)
                .shouldHave(text(firstName + " " + lastName));
        $(".modal-body").$(byText("Student Email")).sibling(0)
                .shouldHave(text(userEmail));
        $(".modal-body").$(byText("Gender")).sibling(0)
                .shouldHave(text(gender));
        $(".modal-body").$(byText("Mobile")).sibling(0)
                .shouldHave(text(userNumber));
        $(".modal-body").$(byText("Date of Birth")).sibling(0)
                .shouldHave(text("30 November,1995"));
        $(".modal-body").$(byText("Subjects")).sibling(0)
                .shouldHave(text(subjectsInput));
        $(".modal-body").$(byText("Hobbies")).sibling(0)
                .shouldHave(text(hobbies));
        $(".modal-body").$(byText("Picture")).sibling(0)
                .shouldHave(text(picturename));
        $(".modal-body").$(byText("Address")).sibling(0)
                .shouldHave(text(currentAddress));
        $(".modal-body").$(byText("State and City")).sibling(0)
                .shouldHave(text(state + " " + city));
    }
}

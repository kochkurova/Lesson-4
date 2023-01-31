import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
public class Lesson4 {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void Homework() {
        /* Разработайте один автотест на проверку формы
        https://demoqa.com/automation-practice-form */
        open("/automation-practice-form");
        $(".main-header").shouldHave(text("Practice Form"));
        // заполняю инпуты
        $("#firstName").setValue("Elena");
        $("#lastName").setValue("Semenova");
        $("#userEmail").setValue("kochkurova.en@gmail.com");
        $("#userNumber").setValue("9829306853");
        $("#currentAddress").setValue("Russia");

        $(("[for=gender-radio-2]")).click();
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("November");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("1995");
        $(".react-datepicker__month").$$(".react-datepicker__week").get(4)
                .$(byText("30")).click();
        $("#subjectsInput").setValue("English").pressEnter();
        $(byText("Music")).click();

        //$(byText("Select State")).click();
        $("#react-select-3-input").setValue("Haryana").pressEnter();
        $("#react-select-4-input").setValue("Karnal").pressEnter();

        // вставить фото
        $("#uploadPicture").uploadFromClasspath("fdf.jpg");

        $("#submit").pressEnter();

        // Проверка

        $(".modal-body").$(byText("Student Name")).sibling(0).shouldHave(text("Elena Semenova"));
        $(".modal-body").$(byText("Student Email")).sibling(0).shouldHave(text("kochkurova.en@gmail.com"));
        $(".modal-body").$(byText("Gender")).sibling(0).shouldHave(text("Female"));
        $(".modal-body").$(byText("Mobile")).sibling(0).shouldHave(text("9829306853"));
        $(".modal-body").$(byText("Date of Birth")).sibling(0).shouldHave(text("30 November,1995"));
        $(".modal-body").$(byText("Subjects")).sibling(0).shouldHave(text("English"));
        $(".modal-body").$(byText("Hobbies")).sibling(0).shouldHave(text("Music"));
        $(".modal-body").$(byText("Picture")).sibling(0).shouldHave(text("fdf.jpg"));
        $(".modal-body").$(byText("Picture")).sibling(0).shouldHave(text("fdf.jpg"));
        $(".modal-body").$(byText("Address")).sibling(0).shouldHave(text("Russia"));
        $(".modal-body").$(byText("State and City")).sibling(0).shouldHave(text("Haryana Karnal"));



    }

}

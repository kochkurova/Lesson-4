package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    private final String titleText = "Student Registration Form";
    public RegistrationPage openPage () {
        open("/automation-practice-form");
        $(".practice-form-wrapper h5").shouldHave(text(titleText));
        return this;
    }


    public RegistrationPage setFirstName (String firstName) {
        $("#firstName").setValue(firstName);
        return this;
    }

    public RegistrationPage setLastName (String lastName) {
        $("#lastName").setValue(lastName);
        return this;
    }

    public RegistrationPage setUserEmail (String userEmail) {
        $("#userEmail").setValue(userEmail);
        return this;
    }

    public RegistrationPage setUserNumber (String userNumber) {
        $("#userNumber").setValue(userNumber);
        return this;
    }

    public RegistrationPage setCurrentAddress (String currentAddress) {
        $("#currentAddress").setValue(currentAddress);
        return this;
    }

    public RegistrationPage setSubjectsInput (String subjectsInput) {
        $("#subjectsInput").setValue(subjectsInput).pressEnter();
        return this;
    }

    public RegistrationPage setState (String state) {
        $("#react-select-3-input").setValue(state).pressEnter();
        return this;
    }

    public RegistrationPage setCity (String city) {
        $("#react-select-4-input").setValue(city).pressEnter();
        return this;
    }

    public RegistrationPage setGender (String gender) {
        $("#genterWrapper").$(byText(gender)).click();
        return this;
    }

    public RegistrationPage setHobbies (String hobbies) {
        $("#hobbiesWrapper").$(byText(hobbies)).click();
        return this;
    }

    public RegistrationPage setPicture (String picturename) {
        $("#uploadPicture").uploadFromClasspath(picturename);
        return this;
    }

    public RegistrationPage checkData (String firstColumn, String secondColumn) {
        $(".modal-body").$(byText(firstColumn)).sibling(0)
                .shouldHave(text(secondColumn));
        return this;

    }

    public RegistrationPage pressSubmit () {
        $("#submit").pressEnter();
        return this;
    }

    public RegistrationPage setBirthDate (String month, String year, String dayInput) {
        String day = ".react-datepicker__day--0" + dayInput;
        $(".react-datepicker__input-container").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__month")
                .$(day + ":not(.react-datepicker__day--outside-month)").click();
        return this;

    }

























































}

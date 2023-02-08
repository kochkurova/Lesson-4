import Pages.RegistrationPage;
import org.junit.jupiter.api.Test;
public class PageObjects extends BasicClass {
    RegistrationPage megaClass = new RegistrationPage();
    @Test

    void homework() throws InterruptedException {
        // переменные
        String day, year, month, dateOfBirth, firstName, lastName, userEmail, userNumber, currentAddress, subjectsInput, state, city, hobbies, gender, picturename;
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
        dateOfBirth = "30 November,1995";
        day = "30";
        month = "November";
        year = "1995";

        /* Разработайте один автотест на проверку формы
        https://demoqa.com/automation-practice-form */

        // заполнение формы
        megaClass.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setUserNumber(userNumber)
                .setCurrentAddress(currentAddress)
                .setSubjectsInput(subjectsInput)
                .setState(state)
                .setCity(city)
                .setGender(gender)
                .setHobbies(hobbies)
                .setPicture(picturename)
                .setBirthDate(month, year, day)
                .pressSubmit();

        // Проверка
        megaClass.checkData("Student Name", firstName + " " + lastName)
                .checkData("Student Email", userEmail)
                .checkData("Gender", gender)
                .checkData("Mobile", userNumber)
                .checkData("Date of Birth", dateOfBirth)
                .checkData("Subjects", subjectsInput)
                .checkData("Hobbies", hobbies)
                .checkData("Picture", picturename)
                .checkData("Address", currentAddress)
                .checkData("State and City", state + " " + city);
    }
}

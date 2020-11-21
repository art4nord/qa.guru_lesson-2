package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StudentRegistrationFormTest {

    @Test
    void fillFormTest() {
        String firstName ="Stanislav",
                lastName = "Dmitruk",
                userEmail = "stanislavtest@gmail.com",
//                genderRadio = "gender-radio-1",
                userNumber = "1234567890",
//                dateOfBirthInput = "",
//                subjectsInput = "",
//                hobbiesCheckbox = "",
//              uploadPicture = "?",
                currentAddress = "Tester Strasse 123, Berlin",
                state = "",
                city = "";

        open("https://demoqa.com/automation-practice-form");

        $("#firstName").val(firstName);
        $("lastName").val(lastName);
        $("#userEmail").val(userEmail);
//        $("#genterWrapper").click(genderRadio);
        $("#userNumber").val(userNumber);
//        $("#dateOfBirthInput").val(dateOfBirthInput);
        $("#subjectsContainer").val();
//        $("#hobbiesWrapper").click();
//        $("#uploadPicture").click();
        $("#currentAddress").val(currentAddress);
//        $("#state").val();
//        $("#city").val();





    }
}

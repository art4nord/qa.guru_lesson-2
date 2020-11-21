package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StudentRegistrationFormTest {

//  startMaximized is not necessary for my objectives so it's turned off for now
/*  @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }
*/
    @Test
    void fillFormTest() {
        String varFirstName ="Stanislav",
                varLastName = "Dmitruk",
                varUserEmail = "stanislavtest@gmail.com",
                varUserNumber = "1234567890",
                hobbiesCheckbox = "",
                uploadPicture = "",
                varCurrentAddress = "Tester Strasse 123, Berlin",
                state = "",
                city = "";

        open("https://demoqa.com/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));

        $("#firstName").val(varFirstName);
        $("#lastName").val(varLastName);
        $("#userEmail").val(varUserEmail);
        $("#genterWrapper").$(byText("Other")).click();
        $("#userNumber").val(varUserNumber);

//      "Set Date" method starts
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("February");
        $(".react-datepicker__year-select").selectOption("1991");
        $(".react-datepicker__day--020").click();
//      "Set Date" method ends

//      "Set subject" method starts
        $("#subjectsInput").val("e");
        $(".subjects-auto-complete__menu-list").$(byText("English")).click();
        $("#subjectsInput").val("p");
        $(".subjects-auto-complete__menu-list").$(byText("Physics")).click();
        $("#subjectsInput").val("m");
        $(".subjects-auto-complete__menu-list").$(byText("Maths")).click();
//      "Set subject" method ends

        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/Screenshot 2020-11-20 at 02.47.53.png"));
        $("#currentAddress").val(varCurrentAddress);

        $("#state").click();
//      $("#stateCity-wrapper").$(byText("Haryana")).click();
        $("#react-select-3-option-2").click();
        $("#city").click();
//      $("#stateCity-wrapper").$(byText("Lucknow")).click();
        $("#react-select-4-option-1").click();

        $("#submit").click();

    }
}

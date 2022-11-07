package Tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class PracticeForm {
        @BeforeAll
        static void setup() {
            Configuration.baseUrl = "https://demoqa.com";
        }

        @Test
        void successfulSubmitForm() {
            open("/automation-practice-form");

            executeJavaScript("$('footer').remove()");
            executeJavaScript("$('#fixedban').remove()");
            executeJavaScript("$('RightSide-Add').remove()");

            $("[id=firstName]").setValue("Larysa");
            $("[id=lastName]").setValue("Shornikava");
            $("[id=userEmail]").setValue("loryshornikova@gmail.com");
            $(new ByText("Female")).click();

            //$(("[for=\"gender-radio-2\"]")).click();

            $("[id=userNumber]").setValue("1234567899");

            $("#dateOfBirthInput").click();
            $(".react-datepicker__month-select [value=\"1\"]").click();
            $(".react-datepicker__year-select").selectOption("1984");
            $(".react-datepicker__day--002").click();

            //$("#subjectsInput").setValue("English");

            $("[for=\"hobbies-checkbox-2\"]").click();
            $("[for=\"hobbies-checkbox-3\"]").click();

            $("#currentAddress").setValue("Homel");

            $("#react-select-3-input").setValue("NCR").pressEnter();
            $("#react-select-4-input").setValue("Delhi").pressEnter();

            $("#submit").click();

            $("#modal-content").shouldBe();
            $("#example-modal-sizes-title-lg").shouldHave((text("Thanks for submitting the form")));
            $(".table-responsive").shouldHave(
                    text("Student Name"), text("Larysa Shornikava"),
                    text("Student Email"), text("loryshornikova@gmail.com"),
                    text("Gender"), text("Female"),
                    text("Mobile"), text("8967424242"),
                    text("Date of Birth"), text("02 February,1984"),
                    text("Subjects"), text("English"),
                    text("Hobbies"), text("Reading, Music"),
                    text("Picture"),
                    text("Address"), text("Homel"),
                    text("State and City"), text("NCR Delhi")
            );

            $("#closeLargeModal").click();
            $("#modal-content").shouldNotBe();
            System.out.println("success!");
        }
    }




package Tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.selector.ByText;

public class DatePicker {
    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    public void datePicker () {
        open("/date-picker");
        $ ("[id=datePickerMonthYearInput]").click();
        $(".react-datepicker__month-select [value=\"1\"]").click();
        $(".react-datepicker__year-select").selectOption("1984");
        $(".react-datepicker__day--002").click();


        $("[id=dateAndTimePickerInput]").click();
        $(".react-datepicker__month-read-view--selected-month").click();
        $ (new ByText ("February")).click();


        $(".react-datepicker__year-read-view--selected-year").click();
        $(new ByText ("2017")).click();

        $ (".react-datepicker__day--023").click();
        //$(".react-datepicker__time-list-item [index=3]").click();


    }
}

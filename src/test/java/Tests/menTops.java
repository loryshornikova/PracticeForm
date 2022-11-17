package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import java.util.concurrent.TimeUnit;


public class menTops {
    @Test
    void addToCart()  {
        open("https://magento.softwaretestingboard.com/men/tops-men/jackets-men.html");
        $(By.xpath("//a/span[text() =\"Men\"]")).hover();


        //$ (By.xpath("//a[@id=\"ui-id-17\"]/span[2]")).click();


    }
}

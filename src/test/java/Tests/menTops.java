package Tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class menTops {

    @Test

    void addToCart()  {
        open("https://magento.softwaretestingboard.com/men/tops-men/jackets-men.html");
        Configuration.holdBrowserOpen=true;

        //$(By.xpath("//a/span[text() =\"Men\"]")).hover();
        //$ (By.xpath("//a[@id=\"ui-id-17\"]/span[2]")).click();

        $(By.xpath("//a/span[text() =\"Men\"]")).click();
        $(By.xpath("//ol/li/a[@href='https://magento.softwaretestingboard.com/men/tops-men.html']")).click();
        $(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[1]")).click();
        $(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[2]/ol/li[6]/a")).click();
        $(By.cssSelector("#mode-list")).click();
        $(By.cssSelector("#sorter.sorter-options")).click();
        $(By.cssSelector("#sorter > option:nth-child(3)")).click();
        $(By.xpath("//*[@id=\"option-label-size-143-item-170\"]")).click();
        $(By.xpath("//*[@id=\"option-label-color-93-item-60\"]")).click();
        $(By.xpath("//button[@title='Add to Cart']")).click();
        $(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a/span[2]/span[1]")).click();



    }
}

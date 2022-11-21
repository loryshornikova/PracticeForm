package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.text;

import static com.codeborne.selenide.Selenide.open;

public class womenBottoms {

    @Test
    void addToWishlist() {

        open ("https://magento.softwaretestingboard.com/");
        $(By.xpath("//span[text() ='Women']")).click();
        $(By.xpath("//a[text() ='Bottoms']")).click();
        $(By.xpath("//div[text()='Material']")).click();
        $(By.xpath("//*[@id=\"narrow-by-list\"]/div[6]/div[2]/ol/li[11]/a")).click();
        $(By.cssSelector("#sorter.sorter-options")).click();
        $(By.cssSelector("#sorter > option:nth-child(2)")).click();
        $(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img")).click();
        $(By.xpath("//div[@option-label='29']")).click();
        $(By.cssSelector("#option-label-color-93-item-49")).click();
        $(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[5]/div/a[1]/span")).click();
        $(By.xpath("//div[@class='message-error error message']")).shouldHave(
                text("You must login or register to add items to your wishlist.")
        );

    }
}

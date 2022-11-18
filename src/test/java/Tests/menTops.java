package Tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class menTops {

    @Test
    void addToCart() {
        open("https://magento.softwaretestingboard.com/men/tops-men/jackets-men.html");
        Configuration.holdBrowserOpen = true;

        //Через ховер не получилось
        //$(By.xpath("//a/span[text() =\"Men\"]")).hover();
        //$ (By.xpath("//a[@id=\"ui-id-17\"]/span[2]")).click();

        //Кликаем на Men, затем на Tops
        $(By.xpath("//a/span[text() =\"Men\"]")).click();
        $(By.xpath("//ol/li/a[@href='https://magento.softwaretestingboard.com/men/tops-men.html']")).click();

        //Кликаем по Style, а затем выбираем Raincoat
        $(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[1]")).click();
        $(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[2]/ol/li[6]/a")).click();

        //Просмотр в виде листа
        $(By.cssSelector("#mode-list")).click();

        //Сортируем по цене
        $(By.cssSelector("#sorter.sorter-options")).click();
        $(By.cssSelector("#sorter > option:nth-child(3)")).click();

        //Выбираем цвет и размер
        $(By.xpath("//*[@id=\"option-label-size-143-item-170\"]")).click();
        $(By.xpath("//*[@id=\"option-label-color-93-item-60\"]")).click();

        //Добавляем в корзину
        $(By.xpath("//button[@title='Add to Cart']")).click();

        //Кликаем на корзину
        $(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a/span[2]/span[1]")).click();

        //Проверяем, что в корзине есть товар
        $(By.xpath("//*[@id=\"ui-id-1\"]")).shouldHave(
                text("1 Item In Cart")
        );

        //Удаляем товар из корзины
        $(By.xpath("//div/a[@title='Remove item']")).click();

        //Проверяем, что появился текст "Are you sure you would like to remove this item from the shopping cart?"
        $(By.xpath("//*[@id=\"modal-content-103\"]/div")).shouldHave(
                text("Are you sure you would like to remove this item from the shopping cart?")
        );

        //Кликаем на ОК на модалке
        $(By.xpath("//button[@class='action-primary action-accept']/span")).click();

        //Проверяем, что отображается надпись "You have no items in your shopping cart."
        $(By.xpath("//strong[@class='subtitle empty']")).shouldHave(
                text("You have no items in your shopping cart.")
        );

        System.out.println("Test passed!!!");

    }
}


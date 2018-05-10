package es.esy.kapcapx;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOfSearch {
    private WebDriver webDriver;

    @Дано("^пользователь заходит на сайт яндекса и вводит \"([^\"]*)\" в строку поиска$")
    public void пользовательЗаходитНаСайтЯндексаИВводитВСтрокуПоиска(String words) throws Throwable {
        webDriver = new ChromeDriver();
        webDriver.get("https://yandex.ru/");
        webDriver.findElement(By.name("text")).sendKeys(words);
    }

    @Когда("^пользователь нажимает на кнопку найти$")
    public void пользовательНажимаетНаКнопкуНайти() throws Throwable {
        webDriver.findElement(By.cssSelector(".suggest2-form__button")).click();
    }

    @Тогда("^происходит поиск по введённым данным$")
    public void происходитПоискПоВведённымДанным() throws Throwable {
        webDriver.quit();
        webDriver = null;
    }
}

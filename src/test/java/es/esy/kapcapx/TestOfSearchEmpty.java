package es.esy.kapcapx;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOfSearchEmpty {
    private WebDriver webDriver;

    @Дано("^пользователь заходит на сайт яндекса и ничего \"([^\"]*)\" не ввёл в строку поиска$")
    public void пользовательЗаходитНаСайтЯндексаИНичегоНеВвёлВСтрокуПоиска(String words) throws Throwable {
        webDriver = new ChromeDriver();
        webDriver.get("https://yandex.ru/");
        webDriver.findElement(By.name("text")).sendKeys(words);
    }

    @Когда("^пользователь нажимает на кнопку найти с пустой строкой поиска$")
    public void пользовательНажимаетНаКнопкуНайтиСПустойСтрокойПоиска() throws Throwable {
        webDriver.findElement(By.cssSelector(".suggest2-form__button")).click();
    }

    @Тогда("^на экран выводится сообщение \"([^\"]*)\"$")
    public void наЭкранВыводитсяСообщение(String arg1) throws Throwable {
        System.out.println(arg1);
        webDriver.quit();
        webDriver = null;
    }
}

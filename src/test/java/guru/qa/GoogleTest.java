package guru.qa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class GoogleTest {

    SelenideElement fieldSearchText = $("[name=q]");

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920*1080";
        Configuration.pageLoadStrategy = "eager";

    }

    @Test
    void googleTest() {
        Selenide.open("https://google.com");
        fieldSearchText.setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("https://selenide.org"));

    }
}
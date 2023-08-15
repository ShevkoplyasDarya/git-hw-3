package guru.qa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class GoogleTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920*1080";
        Configuration.pageLoadStrategy = "eager";

    }

    @Test
    void googleTest() {
        Selenide.open("https://google.com");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("https://selenide.org"));
        // doing some changes
    }
}
package tests;

import helpers.ClickToSkip;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.back;
import static io.qameta.allure.Allure.step;

public class LitresAndroidTests extends TestBase {

    @Feature("Mobile tests Litres")
    @Story("Main page Litres")
    @DisplayName("Check modules")
    @Test
    void checkModulesTest() {
        ClickToSkip.clickAllPopUp();
        ClickToSkip.clickAllPopUp();
        step("Click on the ebooks module",() ->
                $(AppiumBy.id("ru.litres.android:id/nav_store")).click());
        step("Click on the audiobook module",() ->
                $(AppiumBy.id("ru.litres.android:id/nav_my_audiobooks")).click());
    }

    @Feature("Mobile tests Litres")
    @Story("Main page Litres")
    @DisplayName("Valid Search book")
    @Test
    void theValidSearchBook() {
        ClickToSkip.clickAllPopUp();
        step("Search", () ->
                $(AppiumBy.id("ru.litres.android:id/nav_search")).click());
        $(AppiumBy.id("ru.litres.android:id/et_search_query")).sendKeys("The master and margarit");
        step("Search result", () ->
                $(AppiumBy.id("ru.litres.android:id/title")).shouldBe(visible));
    }

    @Feature("Mobile tests Litres")
    @Story("Main page Litres")
    @DisplayName("Invalid search book")
    @Test
    void theInvalidSearchBook() {
        ClickToSkip.clickAllPopUp();
        back();
        step("Search", () ->
                $(AppiumBy.id("ru.litres.android:id/nav_search")).click());
        $(AppiumBy.id("ru.litres.android:id/et_search_query")).sendKeys("There should be a book here");
        step("Проверка результатов поиска", () ->
                $(AppiumBy.id("ru.litres.android:id/title")).shouldHave(text("Nothing found")));
    }
}


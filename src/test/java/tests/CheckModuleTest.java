package tests;

import helpers.ClickToSkip;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class CheckModuleTest {

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
}

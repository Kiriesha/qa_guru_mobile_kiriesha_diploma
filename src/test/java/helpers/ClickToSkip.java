package helpers;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class ClickToSkip {

    @Test
    public static void clickAllPopUp() {

        step("Skip all windows", () -> $(AppiumBy.xpath("//android.widget.ImageView[contains(@resource-id,'dialog_close_btn')]")).click());
        $(AppiumBy.xpath("//android.widget.Button[@text='SKIP' and @index='0']")).click();
        $(AppiumBy.xpath("//android.widget.Button[@text='MORE' and @index='10']")).click();
        $(AppiumBy.xpath("//android.widget.Button[@text='CLEAR' and @index='9']")).click();
        $(AppiumBy.xpath("//android.widget.Button[@text='NO' and @index='1']")).click();
        $(AppiumBy.xpath("//android.widget.LinearLayout[@text='Audiobook' and @index='3']")).click();
        $(AppiumBy.xpath("//android.widget.ImageView[@index='2']")).click();
        $(AppiumBy.xpath("//android.widget.ImageView[contains(@resource-id,'icon')]")).click();

    }
}


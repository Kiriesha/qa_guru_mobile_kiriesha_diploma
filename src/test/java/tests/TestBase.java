package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.MobileConfig;
import drivers.BrowserstackMobileDriver;
import drivers.LocalMobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static helpers.Attach.getSessionId;
import static io.qameta.allure.Allure.step;

public class TestBase {
    static MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
    static String deviceHost = System.getProperty("deviceHost", "browserstack");
    @BeforeAll
    public static void setup() {
        if (Objects.equals(deviceHost, "browserstack"))
            Configuration.browser = BrowserstackMobileDriver.class.getName();
        else {
            Configuration.browser = LocalMobileDriver.class.getName();
        }
        Configuration.timeout = 30000;
        Configuration.browserSize = null;
    }

    @BeforeEach
    public void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());

        open();
    }

    @AfterEach
    public void afterEach() {
        String sessionId = getSessionId();

        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();

        step("Close driver", Selenide::closeWebDriver);
        if (deviceHost.equals("browserstack")) {
            Attach.video(sessionId);
        }
    }
}
//    @BeforeAll
//    public static void setup() {
//        addListener("AllureSelenide", new AllureSelenide());
//
//        switch (config.deviceHost()) {
//            case "local":
//                Configuration.browser = LocalMobileDriver.class.getName();
//                break;
//            case "remote":
//                Configuration.browser = BrowserstackMobileDriver.class.getName();
//                break;
//        }
//
//        Configuration.browserSize = null;
//    }
//
//    @BeforeEach
//    public void startDriver() {
//        open();
//
//    }
//
//    @AfterEach
//    public void afterEach() {
//        String sessionId = getSessionId();
//
//        Attach.screenshotAs("Last screenshot");
//        Attach.pageSource();
//
//        closeWebDriver();
//
//        if (config.deviceHost().contains("remote")) {
//            Attach.video(sessionId);
//        }
//    }
//}

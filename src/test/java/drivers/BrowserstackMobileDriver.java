package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.MobileConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class BrowserstackMobileDriver implements WebDriverProvider {

    static MobileConfig browserStackConfig = ConfigFactory.create(MobileConfig.class, System.getProperties());
    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);

        mutableCapabilities.setCapability("browserstack.user", "bsuser_LwKcmt");
        mutableCapabilities.setCapability("browserstack.key", "Bh7BBYvceKAxNWTBGBod");

        // Set URL of the application under test
        mutableCapabilities.setCapability("app", "bs://357ad67000fb46b49d7d149cc37b2c6760cf1233");

        mutableCapabilities.setCapability("device", browserStackConfig.device());
        //     mutableCapabilities.setCapability("osVersion", browserStackConfig.osVersion());

        mutableCapabilities.setCapability("build", browserStackConfig.build());
        mutableCapabilities.setCapability("name", browserStackConfig.name());
        return new RemoteWebDriver(getBrowserstackUrl(), mutableCapabilities);
    }

    private URL getBrowserstackUrl() {
        try {
            return new URL(browserStackConfig.baseUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
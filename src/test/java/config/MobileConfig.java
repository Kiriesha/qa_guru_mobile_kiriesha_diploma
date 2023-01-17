package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/${deviceHost}.properties",
        "classpath:config/browserstack.properties"})
public interface MobileConfig extends Config {

    @Key("login")
    String login();
    @Key("password")
    String password();

    @Key("deviceName")
    String deviceName();
    @Key("platformName")
    String platformName();
    @Key("platformVersion")
    String platformVersion();
    @Key("app")
    @DefaultValue("bs://b3329f44da140f8046974f5ecdba6c1d950fb9e9")
    String app();
    @Key("build")
    String build();
    @Key("name")
    @DefaultValue("selenide android test")
    String name();
    @Key("deviceHost")
    @DefaultValue("remote")
    String deviceHost();
    @Key("device")
    @DefaultValue("Google Pixel 3a xl")
    String device();
    @Key("baseUrl")
    @DefaultValue("http://hub.browserstack.com/wd/hub")
    String baseUrl();
}

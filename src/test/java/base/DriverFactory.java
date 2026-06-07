package base;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	private static ThreadLocal<WebDriver> driver =
            new ThreadLocal<>();

    public static void initDriver(String browser) {

        if(browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            
            ChromeOptions options = new ChromeOptions();

            // Disable password manager
            options.addArguments("--incognito");
            options.addArguments("--guest");
            options.addArguments("--disable-notifications");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--password-store=basic");

            options.setExperimentalOption("prefs", Map.of(
                    "credentials_enable_service", false,
                    "profile.password_manager_enabled", false,
                    "profile.password_manager_leak_detection", false
            ));

            driver.set(new ChromeDriver(options));
        }
        else {

            throw new RuntimeException(
                    "Browser not supported : " + browser);
        }

        getDriver().manage().window().maximize();
    }

    public static WebDriver getDriver() {

        return driver.get();
    }

    public static void quitDriver() {

        if(driver.get() != null) {

            driver.get().quit();
            driver.remove();
        }
    }
}

package com.apple.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.io.Console;
import java.util.logging.Level;

public class AutomationTest {

    @Test

    public void startWebDriver() {

        System.setProperty("webDriver.gecko.driver", "/usr/local/bin");

        /**       System.getProperty("user.dir") + "/geckoDriver/geckoDriver");
         *
         */

        FirefoxOptions options = new FirefoxOptions()
                .setLogLevel(Level.OFF);
        WebDriver driver = new FirefoxDriver(options);


        driver.navigate().to("http://www.seoatbest.com");
        Assert.assertTrue(driver.getTitle().startsWith(""));

        System.out.println(driver.getTitle());
        driver.close();


        /**       driver.quit();
         *
         */
    }



}

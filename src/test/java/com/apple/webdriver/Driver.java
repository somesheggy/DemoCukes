package com.apple.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.logging.Level;

public class Driver {


        public static WebDriver getWebDriver(){
            FirefoxOptions options = new FirefoxOptions()
                    .setLogLevel(Level.OFF);
            WebDriver driver = new FirefoxDriver(options);
            return driver;

        }
}

package com.tierragro.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumWebDriver {
    public static WebDriver driver;
    public static void chromeDriver(String url){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--star.maximized");
        options.addArguments("---disable-popup-blocking");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get(url);
    }
}

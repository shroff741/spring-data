package com.spring;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import java.time.Duration;
import org.testng.annotations.Test;

public class HelloSelenium {
	@Test
    public static void Test() {
		System.setProperty("webdriver.gecko.driver", "F:/geckodriver/geckodriver.ex");
    	System.out.println("Welcome to Testing");
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);
        try {
            driver.get("https://google.com");
        } finally {
            driver.quit();
        }
    }
}
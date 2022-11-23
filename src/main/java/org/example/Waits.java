package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        String url = "https://demoqa.com/dynamic-properties";
        driver.get(url);

        driver.manage().window().maximize();
       /* driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement theVisibleAfterFiveSecondsButton = driver.findElement(By.id("visibleAfter"));
        theVisibleAfterFiveSecondsButton.click(); */

        WebElement theEnabledButton = new WebDriverWait(driver, Duration.ofSeconds(6)).until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
        theEnabledButton.click();

        //sintaksa

       /* FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(250));
        wait.ignoring(NoSuchElementException.class);
        driver.findElement(By.id("timerAlertButton")).click();
        wait.until(ExpectedConditions.alertIsPresent()); */

        driver.quit();

    }
}

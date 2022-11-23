package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Windows {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        String url = "https://demoqa.com/browser-windows";
        driver.get(url);
        driver.manage().window().maximize();

        WebElement theNewTabButton = driver.findElement(By.id("tabButton"));
        WebElement theNewWindowButton = driver.findElement(By.id("windowButton"));
        WebElement theNewWindowMessage = driver.findElement(By.id("messageWindowButton"));

        theNewWindowButton.click();
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> childWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = childWindowHandles.iterator();

        while (iterator.hasNext()) {
            String childWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(childWindow)) {
                driver.switchTo().window(childWindow);
                WebElement textContainer = driver.findElement(By.id("sampleHeading"));
                System.out.println("Text is " + textContainer.getText());
            }
        }

        driver.switchTo().window(mainWindowHandle);
        WebElement textMainContainer = driver.findElement(By.className("main-header"));
        System.out.println("Main text is " + textMainContainer.getText());
        driver.quit();
    }
}

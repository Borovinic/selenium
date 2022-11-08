package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxHandling {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Korisnik\\Desktop\\SeleniumProject\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://demoqa.com/automation-practice-form";
        driver.get(url);

        WebElement theSportsCheckbox = driver.findElement(By.id("hobbies-checkbox-1"));
        WebElement theReadingCheckbox = driver.findElement(By.cssSelector("label[for=hobbies-checkbox-2]"));
        WebElement theMusicCheckbox = driver.findElement(By.id("hobbies-checkbox-3"));

        List<WebElement> radioButtons = driver.findElements(By.xpath(""));
        if (radioButtons.get(0).isEnabled() && radioButtons.get(1).isEnabled() && radioButtons.get(2).isEnabled()) {
            radioButtons.get(1).click();
        }

        if (radioButtons.get(1).isSelected()) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        theSportsCheckbox.click();
        theReadingCheckbox.click();

        if(theMusicCheckbox.isSelected()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

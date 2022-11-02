package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebUniversity {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Korisnik\\Desktop\\SeleniumProject\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "http://www.webdriveruniversity.com/Contact-Us/contactus.html";
        driver.get(url);

        WebElement theNameField = driver.findElement(By.name("first_name"));
        WebElement theLastNameField = driver.findElement(By.name("last_name"));
        WebElement theEmailField = driver.findElement(By.name("email"));
        WebElement theCommentField = driver.findElement(By.name("message"));
        WebElement theResetButton = driver.findElement(By.xpath("//input[@type='reset']"));
        WebElement theSubmitButton = driver.findElement(By.cssSelector("[type='submit']"));



        theNameField.click();
        theNameField.sendKeys("Sonja");
        theLastNameField.click();
        theLastNameField.sendKeys("Borovinic");
        theEmailField.click();
        theEmailField.sendKeys("sb@mailinator.com");
        theCommentField.click();
        theCommentField.sendKeys("test");
        theResetButton.click();

        theNameField.click();
        theNameField.sendKeys("Sonja");
        theLastNameField.click();
        theLastNameField.sendKeys("Borovinic");
        theEmailField.click();
        theEmailField.sendKeys("sb@mailinator.com");
        theCommentField.click();
        theCommentField.sendKeys("test");
        theSubmitButton.click();

        WebElement theSuccessMessage = driver.findElement(By.cssSelector("#contact_reply h1"));
        if (theSuccessMessage.getText().equalsIgnoreCase("Thank You for your Message!")) {
            System.out.println("Success");
        } else {
            System.out.println("Not");
        }


    }
}

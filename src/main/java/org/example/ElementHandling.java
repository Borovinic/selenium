package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Korisnik\\Desktop\\SeleniumProject\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "http://www.webdriveruniversity.com/Contact-Us/contactus.html";
        driver.get(url);

         int number = driver.findElements(By.tagName("input")).size();
        System.out.println(number);

    }
}

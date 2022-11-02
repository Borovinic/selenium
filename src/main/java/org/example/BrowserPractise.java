package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPractise {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Korisnik\\Desktop\\SeleniumProject\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://akademija.amplitudo.me";
        driver.get(url);

        String title = driver.getTitle();
        int length = driver.getTitle().length();
        System.out.println("URL: " + url + "\n" + "Title: " + title );

        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("https")) {
            System.out.println("Page is secure.");
        } else {
            System.out.println("Page it is not secure.");
        }

       int sourceLength = driver.getPageSource().length();
        System.out.println(sourceLength);

        driver.quit();




    }
}

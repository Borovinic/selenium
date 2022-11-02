package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
   public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Korisnik\\Desktop\\SeleniumProject\\drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();

       String url = "http://automationpractice.com/index.php";
       driver.get(url);

       WebElement theSearchField = driver.findElement(By.id("search_query_top"));
       WebElement theSearchButton = driver.findElement(By.name("submit_search"));

       String stringToSearch = "dress";
       theSearchField.click();
       theSearchField.sendKeys(stringToSearch);
       theSearchButton.click();

       WebElement theSearchPageHeading = driver.findElement(By.cssSelector(".page-heading.product-listing"));

       if (theSearchPageHeading.isDisplayed()) {
           System.out.println("Searh successful");
       } else {
           System.out.println("Search is not successful");
       }

       driver.quit();
    }
}

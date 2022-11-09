package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownPractise {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Korisnik\\Desktop\\SeleniumProject\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://demoqa.com/automation-practice-form";
        driver.get(url);

        WebElement theNameField = driver.findElement(By.id("firstName"));
        WebElement theLastNameField = driver.findElement(By.id("lastName"));
        WebElement theEmailField = driver.findElement(By.id("userEmail"));
        WebElement theGenderRadioButton = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement theMobileField = driver.findElement(By.id("userNumber"));
        WebElement theHobbiesCheckbox = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
        WebElement theCurrentAddressField = driver.findElement(By.id("currentAddress-wrapper"));
        WebElement theStateDropdown = driver.findElement(By.id("state"));
        WebElement theCityDropdown = driver.findElement(By.id("city"));

        theNameField.click();
        theNameField.sendKeys("Sonja");
        theLastNameField.sendKeys("Borovinic");
        theEmailField.sendKeys("sb@mailinator.com");
        theGenderRadioButton.click();
        theMobileField.sendKeys("12345678");
        theHobbiesCheckbox.click();
        theCurrentAddressField.sendKeys("Jovana t.");
        theStateDropdown.click();
        WebElement theStateClickDropdown = driver.findElement(By.id("react-select-3-option-0 NCR country"));

       theStateClickDropdown.click();
       theCityDropdown.click();
        WebElement theCityClickDropdown = driver.findElement(By.id("react-select-4-option-0 Delhi city"));
       theCityClickDropdown.click();
    }
}

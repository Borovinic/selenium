package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Practise {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String url = "https://rahulshettyacademy.com/AutomationPractice";
        driver.get(url);

        String row = "5";
        String column = "3";

        WebElement dynamicTableRow = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[" + row + "]"));
        WebElement dynamicTableColumn = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[" + row + "]/td[" + column + "]"));

        String dynamicTableText = dynamicTableColumn.getText();
        System.out.println(dynamicTableText);

        int sum = 0;

        List<WebElement> list = driver.findElements(By.xpath("//div[@class='tableFixHead']/table[@id='product']//tr/td[last()]"));
        for (WebElement singleElement : list) {
            sum += Integer.parseInt(singleElement.getText());
        }
        System.out.println("Total is " + sum);

        // select 2. radio button
// select 2. option
// select 2. checkbox
// choose dynamically second row and print it from first table
// print all positions from second table

        WebElement theRadionButton = driver.findElement(By.xpath("//input[@value='radio2']"));
        WebElement theCheckbox = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
        WebElement theDropdown = driver.findElement(By.id("dropdown-class-example"));

        theRadionButton.click();
        theCheckbox.click();

        Select select = new Select(theDropdown);

        System.out.println(driver.findElement(By.xpath("//table[@id='product' and @name='courses']//tr[3]")).getText());

        List <WebElement> list1 = driver.findElements(By.xpath("//div[@class='tableFixHead']/table[@id='product']//tr/td[2]"));
        for (WebElement singlePosition : list1) {
            System.out.println(singlePosition.getText());
        }

        int listSize = list1.size();
        System.out.println(listSize);
        driver.quit();
    }
}

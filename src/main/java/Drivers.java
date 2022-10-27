import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {
    public static void main (String[] args){
       /* System.setProperty("webdriver.chrome.driver", "C:\\Users\\Korisnik\\Desktop\\SeleniumProject\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");*/

        /*System.setProperty("webdriver.gecko.driver","C:\\Users\\Korisnik\\Desktop\\SeleniumProject\\drivers\\geckodriver.exe" );

                WebDriver driver = new FirefoxDriver();
        driver.get("https://firefox.com");*/

        System.setProperty("webdriver.edge.driver", "C:\\Users\\Korisnik\\Desktop\\SeleniumProject\\drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");


    }

}

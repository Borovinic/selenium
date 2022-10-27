import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
    public static  void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Korisnik\\Desktop\\SeleniumProject\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://amplitudo.me";

        driver.get(url);

        String title = driver.getTitle();
       /* String source = driver.getPageSource();*/
        String currentUrl = driver.getCurrentUrl();

        if (url.equals(currentUrl)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println("Title of this page is: " + title);
       /* System.out.println("Source: " + source);*/
        System.out.println("Url: " + currentUrl);



        driver.navigate().to("https://google.com");
        driver.navigate().back();



        driver.close();


    }
}


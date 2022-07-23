import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://demo.guru99.com/test/newtours/";
        driver.get(baseURL);
        driver.manage().window().maximize();

        String first = driver.findElement(By.partialLinkText("egis")).getText();
        String second = driver.findElement(By.partialLinkText("EGIS")).getText();

        System.out.println(first);
        System.out.println(second);

        Thread.sleep(20000);
        driver.close(); 
    }
}

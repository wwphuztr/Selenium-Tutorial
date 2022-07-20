import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Form_WebElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://demo.guru99.com/test/login.html";
        driver.get(baseURL);
        driver.manage().window().maximize();

        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.name("passwd"));

        email.sendKeys("wwphuztr@gmail.com");
        password.sendKeys("@Phuminh1011");
        Thread.sleep(2000);
        email.clear();
        password.clear();

        WebElement submit = driver.findElement(By.id("SubmitLogin"));
        submit.click();
        email.click();
        password.click();

        Thread.sleep(2000);
        driver.close();
    }
}

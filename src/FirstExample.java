import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Automation Test\\Selenium-Tutorial\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://output.jsbin.com/usidix/1";
        driver.get(baseURL);
        driver.findElement(By.cssSelector("input[value='Go!']")).click();
        String allertMessage = "";

        allertMessage = driver.switchTo().alert().getText();
        System.out.println(allertMessage);
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        driver.close();
    }
}

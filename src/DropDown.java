import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://demo.guru99.com/test/newtours/register.php";
        driver.get(baseURL);
        driver.manage().window().maximize();

//        WebElement dropdown = driver.findElement(By.cssSelector("select[name='country']"));
//        dropdown.click();
//        driver.findElement(By.cssSelector("option[value='AMERICAN SAMOA']")).click();
        Select dropdown = new Select(driver.findElement(By.cssSelector("select[name='country']")));
        //dropdown.selectByVisibleText("AMERICAN SAMOA");
        dropdown.selectByIndex(3);
        Thread.sleep(1000);
        dropdown.selectByIndex(7);

        Thread.sleep(20000);
        driver.close();
    }
}

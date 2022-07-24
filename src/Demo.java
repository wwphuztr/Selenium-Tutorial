import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String baseURL = "http://www.facebook.com/";
        driver.get(baseURL);
        driver.manage().window().maximize();

        driver.get(baseURL);
        WebElement txtUsername = driver.findElement(By.id("email"));

        Actions builder = new Actions(driver);
        Action seriesOfActions = builder
                .moveToElement(txtUsername)
                .click()
                .keyDown(txtUsername, Keys.SHIFT)
                .sendKeys(txtUsername, "hello")
                .keyUp(txtUsername, Keys.SHIFT)
                .doubleClick(txtUsername)
                .contextClick()
                .build();

        seriesOfActions.perform() ;

        Thread.sleep(20000);
        driver.close();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_RadioButton {
    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        String baseURL = "https://demo.guru99.com/test/radio.html";
//        driver.get(baseURL);
//        driver.manage().window().maximize();
//
//        WebElement radio = driver.findElement(By.id("vfb-7-1"));
//        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
//        radio.click();
//        Thread.sleep(1000);
//        radio2.click();
//
//        Thread.sleep(2000);
//        driver.close();
        ///////////////////////////
        WebDriver driver = new ChromeDriver();
        String baseURL = "http://demo.guru99.com/test/facebook.html";
        driver.get(baseURL);
        driver.manage().window().maximize();

        WebElement checkbox = driver.findElement(By.id("persist_box"));

        for (int i=0; i<2; i++ ) {
            System.out.println(checkbox.isSelected());
            checkbox.click();
        }

        Thread.sleep(2000);
        driver.close();
    }
}

// Open the AUT
// Find and click radio button

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.http.WebSocket;
import java.util.List;

import static java.lang.Thread.sleep;

public class Find_Elements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String baseURL = "http://demo.guru99.com/test/ajax.html";
        driver.get(baseURL);
        driver.manage().window().maximize();

//        String test1 = driver.findElement(By.xpath("//input[@id='no']")).getText();
//
//        String test2 = driver.findElement(By.cssSelector("#buttoncheck")).getText();
//
//        System.out.println(test1);
//        System.out.println(test2);
        List<WebElement> elements = driver.findElements(By.name("name"));
        System.out.println(elements.size());

        for(int i=0; i<elements.size() ; i++) {
            System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
        }
        Thread.sleep(2000);
        driver.close();
    }
}


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String baseURL = "http://demo.guru99.com/test/newtours/";
        driver.get(baseURL);
        driver.manage().window().maximize();

        WebElement link_Home = driver.findElement(By.linkText("Home"));
//        WebElement td_Home = driver
//                .findElement(By
//                        .xpath("//html/body/div"
//                                + "/table/tbody/tr/td"
//                                + "/table/tbody/tr/td"
//                                + "/table/tbody/tr/td"
//                                + "/table/tbody/tr"));
        WebElement td_Home = driver
                .findElement(By
                        .xpath("/html/body/div[2]/table/tbody" +
                                "/tr/td[1]/table/tbody/tr/td/table" +
                                "/tbody/tr/td/table/tbody/tr[1]"));

        Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement(link_Home)
                .build();

        String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);
        mouseOverHome.perform();
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);

        Thread.sleep(2000);
        driver.close();
    }
}

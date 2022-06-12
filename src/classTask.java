import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class classTask {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/mervegurleyen/Desktop/BrowserDrivers/chromedriver-3");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.navigate().to("https://www.facebook.com/");


        driver.findElement(By.id("email")).sendKeys("merve@gmail.com");
        driver.findElement(By.name("login")).sendKeys("sdfefgdsd");
        driver.findElement(By.name("login")).click();

        Thread.sleep(2000);

        String name=driver.findElement(By.className("_9ay7")).getText();

        Assert.assertTrue(driver.getPageSource().contains(name));


        }

    }


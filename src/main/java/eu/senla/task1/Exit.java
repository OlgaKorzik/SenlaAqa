package eu.senla.task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Exit {
    public static void main(String[] args) throws InterruptedException {
        String fileDriver = "C:\\Users\\User\\SenlaAqa\\chromedriver_win32\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", fileDriver);
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.findElement(By.id("session_email")).sendKeys("11111@yandex.ru");
        driver.findElement(By.id("session_password")).sendKeys("12345678");
        driver.findElement(By.name("commit")).click();
        Thread.sleep(1000);
        //login
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/a[3]")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}

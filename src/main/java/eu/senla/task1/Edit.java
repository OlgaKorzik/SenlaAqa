package eu.senla.task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Edit {
    public static void main(String[] args) throws InterruptedException {
        String fileDriver = "C:\\Users\\User\\SenlaAqa\\chromedriver_win32\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", fileDriver);
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.findElement(By.id("session_email")).sendKeys("11111@yandex.ru");
        driver.findElement(By.id("session_password")).sendKeys("12345678");
        driver.findElement(By.name("commit")).click();
        //login
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/a[2]")).click();
        driver.navigate().to("http://a.testaddressbook.com/addresses");
        driver.findElement(By.xpath("//tr/td[6]/a")).click();
        WebElement lastName = driver.findElement(By.id("address_last_name"));
        lastName.clear();
        lastName.sendKeys("Sidorov");
        WebElement address = driver.findElement(By.name("address[address2]"));
        address.clear();
        address.sendKeys("New Street, 65");
        WebElement zipCode = driver.findElement(By.id("address_zip_code"));
        zipCode.clear();
        driver.findElement(By.id("address_zip_code")).sendKeys("999999");
        WebElement birthday = driver.findElement(By.name("address[birthday]"));
        birthday.clear();
        birthday.sendKeys("23071990");
        driver.findElement(By.id("address_color")).sendKeys("#0100FF");
        WebElement age = driver.findElement(By.id("address_age"));
        age.clear();
        age.sendKeys("25");
        WebElement phone = driver.findElement(By.id("address_phone"));
        phone.clear();
        driver.findElement(By.id("address_phone")).sendKeys("+375-29-987-65-43");
        driver.findElement(By.id("address_interest_dance")).click();
        driver.findElement(By.id("address_note")).sendKeys(" and Man");
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/a[2]")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}

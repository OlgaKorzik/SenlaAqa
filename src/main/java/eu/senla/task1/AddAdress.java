package eu.senla.task1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddAdress {
 public static void main(String[] args) throws InterruptedException {
  String fileDriver = "C:\\Users\\User\\SenlaAqa\\chromedriver_win32\\chromedriver.exe";
  String filePicture = "C:\\Users\\User\\Desktop\\task8_OlgaKorzik\\img\\naroch.jpeg";

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
  driver.findElement(By.cssSelector("a[data-test = \"create\"]")).click();
  driver.navigate().to("http://a.testaddressbook.com/addresses/new");
  driver.findElement(By.id("address_first_name")).sendKeys("Ivan");
  driver.findElement(By.id("address_last_name")).sendKeys("Ivanov");
  driver.findElement(By.name("address[address1]")).sendKeys("Central Street, 5");
  driver.findElement(By.name("address[address2]")).sendKeys("Central Street, 15");
  driver.findElement(By.name("address[city]")).sendKeys("Orlando");
  driver.findElement(By.name("address[state]")).click();
  driver.findElement(By.cssSelector("option[value='FL']")).click();
  driver.findElement(By.id("address_zip_code")).sendKeys("123456");
  driver.findElement(By.xpath("//*[@id=\"address_country_us\"]")).click();
  driver.findElement(By.name("address[birthday]")).sendKeys("01011988");
  driver.findElement(By.id("address_color")).sendKeys("#0000FF");
  driver.findElement(By.id("address_age")).sendKeys("25");
  driver.findElement(By.id("address_website")).sendKeys("http://a.testaddressbook.com/addresses/new");
  driver.findElement(By.cssSelector("input[type=file]")).sendKeys(filePicture);
  driver.findElement(By.id("address_phone")).sendKeys("+375-29-123-45-67");
  driver.findElement(By.id("address_interest_read")).click();
  driver.findElement(By.id("address_note")).sendKeys("Friend");
  driver.findElement(By.xpath("//*[@id=\"new_address\"]/div[17]/input")).click();
  driver.findElement(By.xpath("/html/body/div/div[2]/a[2]")).click();

  Thread.sleep(5000);
  driver.quit();
 }

}

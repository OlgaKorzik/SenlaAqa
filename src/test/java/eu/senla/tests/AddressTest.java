package eu.senla.tests;

import eu.senla.utils.IConstants;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebElement;

import java.util.List;

import static eu.senla.locators.MyLocators.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AddressTest extends BeforeTest {

    @BeforeEach
    public void login() {
        pagesBehaviour.login(IConstants.email, IConstants.password);
    }

    @Test
    @DisplayName("Check to adding of new address")
    @Order(1)
    public void addNewAddressTest() {
        driver.findElement(ADDRESS_TAB).click();
        driver.navigate().to("http://a.testaddressbook.com/addresses");
        driver.findElement(NEW_ADDRESS_LINK).click();
        driver.navigate().to("http://a.testaddressbook.com/addresses/new");
        driver.findElement(FIRST_NAME).sendKeys("Ivan");
        driver.findElement(LAST_NAME).sendKeys("Ivanov");
        driver.findElement(FIRST_ADDRESS).sendKeys("Central Street, 5");
        driver.findElement(LAST_ADDRESS).sendKeys("Central Street, 15");
        driver.findElement(ADDRESS_CITY).sendKeys("Orlando");
        driver.findElement(ADDRESS_STATE).click();
        driver.findElement(ADDRESS_STATE_VALUE).click();
        driver.findElement(ADDRESS_ZIP_CODE).sendKeys("123456");
        driver.findElement(ADDRESS_COUNTRY).click();
        driver.findElement(BIRTHDAY).sendKeys("01011988");
        driver.findElement(COLOR).sendKeys("#0000FF");
        driver.findElement(ADDRESS_AGE).sendKeys("25");
        driver.findElement(WEBSITE).sendKeys("http://a.testaddressbook.com/addresses/new");
        driver.findElement(PICTURE).sendKeys(System.getProperty("user.dir") + "/src/main/resources/img/naroch.jpeg");
        driver.findElement(PHONE).sendKeys("+375-29-123-45-67");
        driver.findElement(INTEREST_READ).click();
        driver.findElement(ADDRESS_NOTE).sendKeys("Friend");
        driver.findElement(CREATE_ADDRESS_BUTTON).click();
        driver.findElement(BUTTON_LIST).click();

        List<WebElement> element = driver.findElements(LAST_ELEMENT_TABLE);
        Assertions.assertNotNull(element, "No address added");


    }

    @Test
    @DisplayName("Check to changing of address data")
    @Order(2)
    public void changeAddressTest() {
        driver.findElement(ADDRESS_TAB).click();
        driver.navigate().to("http://a.testaddressbook.com/addresses");
        driver.findElement(BUTTON_EDIT).click();
        WebElement lastName = driver.findElement(LAST_NAME);
        lastName.clear();
        lastName.sendKeys("Sidorov");
        WebElement address = driver.findElement(LAST_ADDRESS);
        address.clear();
        address.sendKeys("New Street, 65");
        WebElement zipCode = driver.findElement(ADDRESS_ZIP_CODE);
        zipCode.clear();
        zipCode.sendKeys("999999");
        WebElement birthday = driver.findElement(BIRTHDAY);
        birthday.clear();
        birthday.sendKeys("23071990");
        driver.findElement(COLOR).sendKeys("#0100FF");
        WebElement age = driver.findElement(ADDRESS_AGE);
        age.clear();
        age.sendKeys("25");
        WebElement phone = driver.findElement(PHONE);
        phone.clear();
        phone.sendKeys("+375-29-987-65-43");
        driver.findElement(INTEREST_DANCE).click();
        driver.findElement(ADDRESS_NOTE).sendKeys(" and Man");
        driver.findElement(ADDRESS_EDIT_BUTTON).click();
        driver.findElement(BUTTON_LIST).click();

        WebElement element = driver.findElement(SECOND_ELEMENT_TABLE);
        Assertions.assertEquals("Sidorov",element,"Address not changed");
    }
    @Test
    @DisplayName("Check to delete of address data")
    @Order(3)
    public void deleteAddressTest(){
        driver.findElement(ADDRESS_TAB).click();
        driver.navigate().to("http://a.testaddressbook.com/addresses");
        int count = driver.findElements(SIZE_TABLE).size();
        driver.findElement(BUTTON_DELETE).click();
        driver.switchTo().alert().accept();
        int count2 = driver.findElements(SIZE_TABLE).size();
       Assertions.assertEquals(count-1,count2);

    }
    @Ignore
    @DisplayName("Check to title of address")
    public void titleAddressTest(){
        driver.findElement(ADDRESS_TAB).click();
        driver.navigate().to("http://a.testaddressbook.com/addresses");
        String title = driver.getTitle();
        Assertions.assertTrue("Address Book".contains(title));
    }

    @AfterEach
    public void logout() {
        pagesBehaviour.logout();
    }
}

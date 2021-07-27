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
        pagesBehaviour.click(ADDRESS_TAB);
        pagesBehaviour.navigatePage("http://a.testaddressbook.com/addresses");
        pagesBehaviour.click(NEW_ADDRESS_LINK);
        pagesBehaviour.navigatePage("http://a.testaddressbook.com/addresses/new");
        pagesBehaviour.inputField(FIRST_NAME,"Ivan");
        pagesBehaviour.inputField(LAST_NAME,"Ivanov");
        pagesBehaviour.inputField(FIRST_ADDRESS,"Ivanov");
        pagesBehaviour.inputField(LAST_ADDRESS,"Central Street, 15");
        pagesBehaviour.inputField(ADDRESS_CITY,"Orlando");
        pagesBehaviour.click(ADDRESS_STATE);
        pagesBehaviour.click(ADDRESS_STATE_VALUE);
        pagesBehaviour.inputField(ADDRESS_ZIP_CODE,"123456");
        pagesBehaviour.click(ADDRESS_COUNTRY);
        pagesBehaviour.inputField(BIRTHDAY,"01011988");
        pagesBehaviour.inputField(COLOR,"#0000FF");
        pagesBehaviour.inputField(ADDRESS_AGE,"25");
        pagesBehaviour.inputField(WEBSITE,"http://a.testaddressbook.com/addresses/new");
        driver.findElement(PICTURE).sendKeys(System.getProperty("user.dir") + "/src/main/resources/img/naroch.jpeg");
        pagesBehaviour.inputField(PHONE,"+375-29-123-45-67");
        pagesBehaviour.click(INTEREST_READ);
        pagesBehaviour.inputField(ADDRESS_NOTE,"Friend");
        pagesBehaviour.click(CREATE_ADDRESS_BUTTON);
        pagesBehaviour.click(BUTTON_LIST);

        List<WebElement> element = driver.findElements(LAST_ELEMENT_TABLE);
        Assertions.assertNotNull(element, "No address added");


    }

   @Test
    @DisplayName("Check to changing of address data")
    @Order(2)
    public void changeAddressTest() {
        pagesBehaviour.click(ADDRESS_TAB);
       pagesBehaviour.navigatePage("http://a.testaddressbook.com/addresses");
        pagesBehaviour.click(BUTTON_EDIT);
        pagesBehaviour.clearElement(LAST_NAME);
       pagesBehaviour.inputField(LAST_NAME,"Sidorov");
       pagesBehaviour.clearElement(LAST_ADDRESS);
       pagesBehaviour.inputField(LAST_ADDRESS,"New Street, 65");
       pagesBehaviour.clearElement(ADDRESS_ZIP_CODE);
       pagesBehaviour.inputField(ADDRESS_ZIP_CODE,"999999");
       pagesBehaviour.clearElement(BIRTHDAY);
       pagesBehaviour.inputField(BIRTHDAY,"23071990");
       pagesBehaviour.inputField(COLOR,"#0100FF");
       pagesBehaviour.clearElement(ADDRESS_AGE);
       pagesBehaviour.inputField(ADDRESS_AGE,"25");
       pagesBehaviour.clearElement(PHONE);
       pagesBehaviour.inputField(PHONE,"+375-29-987-65-43");
       pagesBehaviour.click(INTEREST_DANCE);
       pagesBehaviour.inputField(ADDRESS_NOTE," and Man");
       pagesBehaviour.click(ADDRESS_EDIT_BUTTON);
       pagesBehaviour.click(BUTTON_LIST);

        WebElement element = driver.findElement(SECOND_ELEMENT_TABLE);
        Assertions.assertEquals("Sidorov",element,"Address not changed");
    }
    @Test
    @DisplayName("Check to delete of address data")
    @Order(3)
    public void deleteAddressTest(){
        pagesBehaviour.click(ADDRESS_TAB);
        pagesBehaviour.navigatePage("http://a.testaddressbook.com/addresses");
        int count = driver.findElements(SIZE_TABLE).size();
        pagesBehaviour.click(BUTTON_DELETE);
        pagesBehaviour.switchTo();
        int count2 = driver.findElements(SIZE_TABLE).size();

       Assertions.assertEquals(count-1,count2);

    }
    @Ignore
    @DisplayName("Check to title of address")
    public void titleAddressTest(){
        pagesBehaviour.click(ADDRESS_TAB);
        pagesBehaviour.navigatePage("http://a.testaddressbook.com/addresses");
        String title = driver.getTitle();
        Assertions.assertTrue("Address Book".contains(title));
    }

    @AfterEach
    public void logout() {
        pagesBehaviour.logout();
    }
}

package eu.senla.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;

import static eu.senla.locators.MyLocators.*;

public class AddressTest extends BeforeTest {

    @BeforeClass
    public void login() {
        pagesBehaviour.login("", "");
    }

    @Test
    @DisplayName("Check to adding of new address")
    @Order(1)
    public void addNewAddressTest() {
        driver.findElement(ADDRESS_TAB).click();
        driver.findElement(NEW_ADDRESS_LINK).click();
    }

    @Test
    @DisplayName("Check to changing of address data")
    @Order(2)
    public void changeAddressTest() {
        driver.findElement(ADDRESS_TAB).click();
        driver.findElement(NEW_ADDRESS_LINK).click();
    }

    @AfterClass
    public void logout() {
        pagesBehaviour.logout();
    }
}

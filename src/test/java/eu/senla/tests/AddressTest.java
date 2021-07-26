package eu.senla.tests;

import eu.senla.utils.IConstants;
import org.junit.jupiter.api.*;

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
        driver.findElement(NEW_ADDRESS_LINK).click();
    }

    @Test
    @DisplayName("Check to changing of address data")
    @Order(2)
    public void changeAddressTest() {
        driver.findElement(ADDRESS_TAB).click();
        driver.findElement(NEW_ADDRESS_LINK).click();
    }

    @AfterEach
    public void logout() {
        pagesBehaviour.logout();
    }
}

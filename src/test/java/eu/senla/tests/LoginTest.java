package eu.senla.tests;

import eu.senla.utils.IConstants;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LoginTest extends BeforeTest {

    @Test
    public void loginTest() {
        pagesBehaviour.login(IConstants.email, IConstants.password);
        String actual = pagesBehaviour.getCurrentUserName();
        assertEquals(actual, IConstants.email, "User has not logged in");
    }

    @Test
    public void logoutTest() {
        pagesBehaviour.logout();
        String url = driver.getCurrentUrl();
        assertEquals(IConstants.URL, url, "User doesn't logged out");
    }

}

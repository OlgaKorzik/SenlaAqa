package eu.senla.tests;

import org.junit.Test;

import static eu.senla.locators.MyLocators.*;

public class LoginTest extends BeforeTest {

    @Test
    public void loginTest() {
        pagesBehaviour.inputField(LOGIN_INPUT, "")
                .inputField(PASSWORD_INPUT, "")
                .click(SUBMIT_BUTTON);
    }

}

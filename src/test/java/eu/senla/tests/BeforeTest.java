package eu.senla.tests;

import eu.senla.locators.PagesBehaviour;
import eu.senla.utils.Driver;
import eu.senla.utils.IConstants;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class BeforeTest {

    protected WebDriver driver;
    protected PagesBehaviour pagesBehaviour;

    @BeforeAll
    public void setUp() {
        driver = Driver.getDriver();
        driver.get(IConstants.URL);
        pagesBehaviour = new PagesBehaviour(driver);
    }

    @AfterAll
    public void tearDown() {
        driver.quit();
    }
}

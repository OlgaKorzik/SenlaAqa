package eu.senla.tests;

import eu.senla.locators.PagesBehaviour;
import eu.senla.utils.Driver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class BeforeTest {

    protected WebDriver driver;
    protected PagesBehaviour pagesBehaviour = new PagesBehaviour();

    @BeforeAll
    public void setUp() {
        driver = Driver.getDriver();
        driver.get("");
    }

    @AfterAll
    public void tearDown() {
        driver.quit();
    }
}

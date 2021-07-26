package eu.senla.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PagesBehaviour extends BasePage {

    public PagesBehaviour(WebDriver driver) {
        super(driver);
    }

    public PagesBehaviour inputField(By element, String value) {
        driver.findElement(element).sendKeys(value);
        return this;
    }

    public void click(By element) {
        driver.findElement(element).click();
    }

    public void login(String login, String password) {
        inputField(MyLocators.LOGIN_INPUT, login);
        inputField(MyLocators.PASSWORD_INPUT, password);
        click(MyLocators.SUBMIT_BUTTON);
    }

    public void logout() {
        click(MyLocators.SING_OUT_BUTTON);
    }

    public String getCurrentUserName() {
        return driver.findElement(MyLocators.CURRENT_USER).getText();
    }
}

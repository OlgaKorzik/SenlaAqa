package eu.senla.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static eu.senla.locators.MyLocators.*;

public class PagesBehaviour extends BasePage {

    public PagesBehaviour(WebDriver driver) {
        super(driver);
    }

    public PagesBehaviour inputField(By element, String value) {
        driver.findElement(element).sendKeys(value);
        return this;
    }

    public void clearElement(By element) {
        driver.findElement(element).clear();
    }

    public void click(By element) {
        driver.findElement(element).click();
    }

    public void navigatePage(String url) {
        driver.navigate().to(url);
    }

    public void switchTo() {
        driver.switchTo().alert().accept();
    }

    public void login(String login, String password) {
        inputField(LOGIN_INPUT, login);
        inputField(PASSWORD_INPUT, password);
        click(SUBMIT_BUTTON);
    }

    public void logout() {
        click(SING_OUT_BUTTON);
    }

    public String getCurrentUserName() {
        return driver.findElement(CURRENT_USER).getText();
    }
}

package eu.senla.locators;

import org.openqa.selenium.By;

public class MyLocators {

    public static final By LOGIN_INPUT = By.id("session_email");
    public static final By PASSWORD_INPUT = By.id("session_password");
    public static final By SUBMIT_BUTTON = By.name("commit");

    public static final By ADDRESS_TAB = By.xpath("//a[@data-test = 'addresses']");
    public static final By NEW_ADDRESS_LINK = By.cssSelector("a[data-test = \"create\"]");
    public static final By FIRST_NAME = By.id("address_first_name");

    public static final By SING_OUT_BUTTON = By.xpath("//a[@data-test = 'sign-out']");
}

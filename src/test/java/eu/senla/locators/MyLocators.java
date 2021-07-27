package eu.senla.locators;

import org.openqa.selenium.By;

public class MyLocators {

    public static final By LOGIN_INPUT = By.id("session_email");
    public static final By PASSWORD_INPUT = By.id("session_password");
    public static final By SUBMIT_BUTTON = By.name("commit");

    public static final By ADDRESS_TAB = By.xpath("//a[@data-test = 'addresses']");
    public static final By NEW_ADDRESS_LINK = By.cssSelector("a[data-test = \"create\"]");
    public static final By FIRST_NAME = By.id("address_first_name");
    public static final By LAST_NAME = By.id("address_last_name");
    public static final By FIRST_ADDRESS = By.name("address[address1]");
    public static final By LAST_ADDRESS = By.name("address[address2]");
    public static final By ADDRESS_CITY= By.name("address[city]");
    public static final By ADDRESS_STATE = By.name("address[state]");
    public static final By ADDRESS_STATE_VALUE = By.cssSelector("option[value='FL']");
    public static final By ADDRESS_ZIP_CODE = By.id("address_zip_code");
    public static final By ADDRESS_COUNTRY =By.xpath("//*[@id=\"address_country_us\"]");
    public static final By BIRTHDAY = By.name("address[birthday]");
    public static final By COLOR = By.id("address_color");
    public static final By ADDRESS_AGE = By.id("address_age");
    public static final By WEBSITE = By.id("address_website");
    public static final By PICTURE = By.cssSelector("input[type=file]");
    public static final By PHONE = By.id("address_phone");
    public static final By INTEREST_READ = By.id("address_interest_read");
    public static final By INTEREST_DANCE = By.id("address_interest_dance");
    public static final By ADDRESS_NOTE = By.id("address_note");
    public static final By CREATE_ADDRESS_BUTTON = By.xpath("//*[@id=\"new_address\"]/div[17]/input");
    public static final By BUTTON_LIST = By.xpath("/html/body/div/div[2]/a[2]");
    public static final By BUTTON_EDIT = By.xpath("//tr[1]/td[6]/a");
    public static final By ADDRESS_EDIT_BUTTON = By.name("commit");
    public static final By BUTTON_DELETE = By.xpath("//tr/td[7]/a");

    public static final By SING_OUT_BUTTON = By.xpath("//a[@data-test = 'sign-out']");
    public static final By CURRENT_USER = By.xpath("//span[@data-test = 'current-user']");
    public static final By LAST_ELEMENT_TABLE = By.xpath("//tbody/tr[last()]/td[1]");
    public static final By SECOND_ELEMENT_TABLE = By.xpath("//tbody/tr[1]/td[2]");
    public static final By SIZE_TABLE = By.xpath(".//table/tbody/tr");

}

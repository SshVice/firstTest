package ru.u920152e.beget.tech;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static LoginPage loginPage;
    public static WebDriver driver;

    @BeforeAll
    public static void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromewebdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.get(ConfProperties.getProperty("loginPage"));
    }
    @Test
    public void loginTest() {

        loginPage.inputLogin(ConfProperties.getProperty("login"));
        loginPage.inputPasswd(ConfProperties.getProperty("passwd"));
        loginPage.clickLoginBtn();

    }
}

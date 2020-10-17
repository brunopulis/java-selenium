package br.com.brunopulis.test.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private WebDriver driver;
    private final String AUT_URL = "http://automationpractice.com/index.php";

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AUT_URL);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

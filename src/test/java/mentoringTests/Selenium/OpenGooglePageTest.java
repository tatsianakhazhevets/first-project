package mentoringTests.Selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OpenGooglePageTest {

    private WebDriver webDriver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tatsi\\OneDrive\\Рабочий стол\\Менторинг\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @Test
    public void enterSeleniumInGoogle() {
        webDriver.get("https://www.google.com/");

        WebElement agreeButton = webDriver.findElement(By.xpath("//*[@id='L2AGLb']"));
        agreeButton.click();

        WebElement inputField = webDriver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        assertTrue(inputField.isDisplayed());

        inputField.sendKeys("selenium");
        inputField.sendKeys(Keys.ENTER);
        
    }

    @AfterEach
    public void tearDown() {
        if(webDriver != null) {
            webDriver.quit();
        }
    }
}
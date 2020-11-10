package testRunner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class LoggingToTheSiteTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Svitlana_Bychevska\\Downloads\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void logginingToTheSite(){
        driver.get("https://panama.ua/");
        System.out.println("Go to site method");
        WebElement inputLink = driver.findElement(By.cssSelector("div.header__button.enter"));
        inputLink.click();
        WebElement inputEmail = driver.findElement(By.name("user_login"));
        WebElement inputPass = driver.findElement(By.name("user_pw"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"popup-auth-form\"]/div[3]/button"));
        inputEmail.sendKeys("Svitlana");
        inputPass.sendKeys("Password1");
        submitButton.click();
        System.out.println("Open Browser method");
    }

    @AfterEach
    public void tearDown(){
        driver.close();
        driver.quit();
        System.out.println("Close Browser method");
    }
}

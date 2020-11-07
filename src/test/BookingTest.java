import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

public class BookingTest {
        private WebDriver driver;

        @BeforeEach
        public void setUp(){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Svitlana_Bychevska\\Documents\\Mckensson docs\\Automation\\sv_new_maven_untitled\\src\\main\\resources\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--ignore-certificate-errors");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @Test
        public void booking(){
            driver.get("https://ecsc00a03ccd.epam.com:9002/yacceleratorstorefront/?site=electronics");
            System.out.println("Open Browser method");
            driver.manage().window().fullscreen();
            WebElement searchField = driver.findElement(By.xpath("//div/input[@type=\"text\"]"));
            WebElement searchElement = driver.findElement(By.xpath("//button[@class=\"btn btn-link js_search_button\"]"));
            searchField.sendKeys("camileo");
            searchElement.click();
            WebElement submit = driver.findElement(By.xpath("//div/form[@id=\"addToCartForm1776948\"]/button[@type=\"submit\"]"));
            submit.click();
            WebElement checkOut = driver.findElement(By.xpath("//a[@class=\"btn btn-primary btn-block add-to-cart-button\"]"));
            checkOut.click();
            WebElement subTotalPrice = driver.findElement(By.xpath("//div[@class=\"col-xs-6 cart-totals-right text-right\"]"));
            assertEquals("$146.88",subTotalPrice.getText());
            WebElement totalPrice = driver.findElement(By.xpath("//div[@class=\"col-xs-6 cart-totals-right text-right grand-total\"]"));
            assertEquals("$146.88", totalPrice.getText());
            WebElement checkOut2 = driver.findElement(By.xpath("//div[@class=\"cart__actions\"]//button[@class=\"btn btn-primary btn-block btn--continue-checkout js-continue-checkout-button\"]"));
            checkOut2.click();
            WebElement guestEmail1 = driver.findElement(By.xpath("//input[@id=\"guest.email\"]"));
            guestEmail1.sendKeys("test@user.com");
            WebElement guestEmail2 = driver.findElement(By.xpath("//input[@class=\"confirmGuestEmail form-control\"]"));
            guestEmail2.sendKeys("test@user.com");
            WebElement checkOutAsaGuest = driver.findElement(By.xpath("//div/button[@type=\"submit\"]"));
            checkOutAsaGuest.click();
            WebElement subtotalPrice2 = driver.findElement(By.xpath("//div[@class=\"subtotal\"]/span"));
            assertEquals("$146.88", subtotalPrice2.getText());
            WebElement totalPrice2 = driver.findElement(By.xpath("//div[@class=\"totals\"]/span"));
            assertEquals("$146.88", totalPrice2.getText());
            WebElement tax = driver.findElement(By.xpath("//div[@class=\"realTotals\"]/p"));
            assertEquals("Your order includes $6.99 tax.",tax.getText());
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


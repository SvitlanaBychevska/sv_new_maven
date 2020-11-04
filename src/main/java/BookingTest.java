import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;

//@RunWith(JUnitPlatform.class)
public class BookingTest {
        private WebDriver driver;

        @Before
        public void setUp(){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Svitlana_Bychevska\\Downloads\\chromedriver.exe");
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
            Assert.assertEquals("$146.88",subTotalPrice.getText());
            WebElement totalPrice = driver.findElement(By.xpath("//div[@class=\"col-xs-6 cart-totals-right text-right grand-total\"]"));
            Assert.assertEquals("$146.88", totalPrice.getText());
            WebElement checkOut2 = driver.findElement(By.xpath("//div[@class=\"cart__actions\"]//button[@class=\"btn btn-primary btn-block btn--continue-checkout js-continue-checkout-button\"]"));
            checkOut2.click();
            WebElement guestEmail1 = driver.findElement(By.xpath("//input[@id=\"guest.email\"]"));
            guestEmail1.sendKeys("test@user.com");
            WebElement guestEmail2 = driver.findElement(By.xpath("//input[@class=\"confirmGuestEmail form-control\"]"));
            guestEmail2.sendKeys("test@user.com");
            WebElement checkOutAsaGuest = driver.findElement(By.xpath("//div/button[@type=\"submit\"]"));
            checkOutAsaGuest.click();
            WebElement subtotalPrice2 = driver.findElement(By.xpath("//div[@class=\"subtotal\"]/span"));
            Assert.assertEquals("$146.88", subtotalPrice2.getText());
            WebElement totalPrice2 = driver.findElement(By.xpath("//div[@class=\"totals\"]/span"));
            Assert.assertEquals("$146.88", totalPrice2.getText());
            WebElement tax = driver.findElement(By.xpath("//div[@class=\"realTotals\"]/p"));
            Assert.assertEquals("Your order includes $6.99 tax.",tax.getText());
        }

        @After
        public void tearDown(){
            driver.close();
            driver.quit();
            System.out.println("Close Browser method");
        }
    }


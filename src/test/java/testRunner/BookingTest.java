package testRunner;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static constants.SitesUrls.url1;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static driver.SetUpChromeDriver.getChromeDriver;

public class BookingTest {

    @Test
    public void booking(){
        getChromeDriver().get(url1);
        System.out.println("Open Browser method");
        getChromeDriver().manage().window().fullscreen();
        WebElement searchField = getChromeDriver().findElement(By.xpath("//div/input[@type=\"text\"]"));
        WebElement searchElement = getChromeDriver().findElement(By.xpath("//button[@class=\"btn btn-link js_search_button\"]"));

        searchField.sendKeys("camileo");
        searchElement.click();
        WebElement submit = getChromeDriver().findElement(By.xpath("//div/form[@id=\"addToCartForm1776948\"]/button[@type=\"submit\"]"));
        submit.click();
        WebElement checkOut = getChromeDriver().findElement(By.xpath("//a[@class=\"btn btn-primary btn-block add-to-cart-button\"]"));
        checkOut.click();
        WebElement subTotalPrice = getChromeDriver().findElement(By.xpath("//div[@class=\"col-xs-6 cart-totals-right text-right\"]"));
        assertEquals("$146.88",subTotalPrice.getText());
        WebElement totalPrice = getChromeDriver().findElement(By.xpath("//div[@class=\"col-xs-6 cart-totals-right text-right grand-total\"]"));
        //div[contains(@class, 'grand-total')]
        assertEquals("$146.88", totalPrice.getText());
        WebElement checkOut2 = getChromeDriver().findElement(By.xpath("//div[@class=\"cart__actions\"]//button[@class=\"btn btn-primary btn-block btn--continue-checkout js-continue-checkout-button\"]"));
        checkOut2.click();
        WebElement guestEmail1 = getChromeDriver().findElement(By.xpath("//input[@id=\"guest.email\"]"));
        guestEmail1.sendKeys("test@user.com");
        WebElement guestEmail2 = getChromeDriver().findElement(By.xpath("//input[@class=\"confirmGuestEmail form-control\"]"));
        guestEmail2.sendKeys("test@user.com");
        WebElement checkOutAsaGuest = getChromeDriver().findElement(By.xpath("//div/button[@type=\"submit\"]"));
        checkOutAsaGuest.click();
        WebElement subtotalPrice2 = getChromeDriver().findElement(By.xpath("//div[@class=\"subtotal\"]/span"));
        //assertEquals("$146.88", subtotalPrice2.getText());
        WebElement totalPrice2 = getChromeDriver().findElement(By.xpath("//div[@class=\"totals\"]/span"));
        //assertEquals("$146.88", totalPrice2.getText());
        WebElement tax = getChromeDriver().findElement(By.xpath("//div[@class=\"realTotals\"]/p"));
        //assertEquals("Your order includes $6.99 tax.",tax.getText());
        assertAll("Something gone wrong",
                () -> assertEquals("$146.88", subtotalPrice2.getText(), "SubTotal Price is incorrect"),
                () -> assertEquals("$146.88", totalPrice2.getText(), "Total Price is incorrect"),
                () -> assertEquals("Your order includes $6.99 tax.",tax.getText(), "Tax is incorrect")
        );
    }
}


package desktop.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static driver.SetUpChromeDriver.getChromeDriver;

public class CartPageLABA {

    //@FindBy(xpath = "//h1[@class=\"cart-headline\"]")
    WebElement cartHeader = getChromeDriver().findElement(By.xpath("//h1[@class=\"cart-headline\"]"));
    //@FindBy(xpath = "//div[@class=\"col-xs-6 cart-totals-right text-right\"]")
    WebElement subTotalPrice = getChromeDriver().findElement(By.xpath("//div[@class=\"col-xs-6 cart-totals-right text-right\"]"));
    //@FindBy(xpath = "//div[@class=\"col-xs-6 cart-totals-right text-right grand-total\"]")
    WebElement totalPrice = getChromeDriver().findElement(By.xpath("//div[@class=\"col-xs-6 cart-totals-right text-right grand-total\"]"));
    //@FindBy(xpath = "//div[@class=\"cart__actions\"]//button[@class=\"btn btn-primary btn-block btn--continue-checkout js-continue-checkout-button\"]")
    WebElement submitButton2 = getChromeDriver().findElement(By.xpath("//div[contains(@class, 'border')]//button[contains(@class, 'js-continue-checkout-button')]"));


//CartPage is displayed
    public Boolean testCartPageIsOpened(){
        return cartHeader.isDisplayed();
    }

    //Get subtotal value
    public void getSubTotalValue(){
        subTotalPrice.getText();
    }

    //Get TotalPrice value
    public void getTotalPriceValue(){
        totalPrice.getText();
    }

    public void checkTotalPriceValue(String totalPriceValue){
        assertEquals (totalPriceValue, totalPrice.getText());
    }

    public void checkSubTotalPriceValue(String subTotalPriceValue){
        assertEquals (subTotalPriceValue, subTotalPrice.getText());
    }

    //Click on Submit button
    public void clickOnSubmitButton(){
        submitButton2.click();
    }
}

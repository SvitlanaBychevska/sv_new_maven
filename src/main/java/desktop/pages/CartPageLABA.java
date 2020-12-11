package desktop.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static driver.SetUpChromeDriver.getChromeDriver;

public class CartPageLABA {

    //WebElement cartHeader = getChromeDriver().findElement(By.xpath("//h1[@class=\"cart-headline\"]"));
    private static final By CART_HEADER = By.xpath("//h1[@class=\"cart-headline\"]");
   // WebElement subTotalPrice = getChromeDriver().findElement(By.xpath("//div[@class=\"col-xs-6 cart-totals-right text-right\"]"));
    private static final By SUB_TOTAL_PRICE = By.xpath("//div[@class=\"col-xs-6 cart-totals-right text-right\"]");
   // WebElement totalPrice = getChromeDriver().findElement(By.xpath("//div[@class=\"col-xs-6 cart-totals-right text-right grand-total\"]"));
    private static final By TOTAL_PRICE = By.xpath("//div[@class=\"col-xs-6 cart-totals-right text-right grand-total\"]");
   // WebElement submitButton2 = getChromeDriver().findElement(By.xpath("//div[contains(@class, 'border')]//button[contains(@class, 'js-continue-checkout-button')]"));
    private static final By SUBMIT_BUTTON2 = By.xpath("//div[contains(@class, 'border')]//button[contains(@class, 'js-continue-checkout-button')]");
    //WebElement tax = getChromeDriver().findElement(By.xpath("//div[@class=\"cart-totals-taxes text-right\"]"));
    private static final By TAX = By.xpath("//div[@class=\"cart-totals-taxes text-right\"]");

//CartPage is displayed
    public Boolean testCartPageIsOpened(){
        return
                getChromeDriver().findElement(CART_HEADER).isDisplayed();
    }

    //Get subtotal value
    public void getSubTotalValue(){
        getChromeDriver().findElement(SUB_TOTAL_PRICE).getText();
    }
public boolean isSubTotalValueDisplayed(){
        return getChromeDriver().findElement(SUB_TOTAL_PRICE).isDisplayed();
}
    //Get TotalPrice value
    public void getTotalPriceValue(){
        getChromeDriver().findElement(TOTAL_PRICE).getText();
    }

    public boolean isTotalValueDisplayed(){
        return getChromeDriver().findElement(TOTAL_PRICE).isDisplayed();
    }
    public void getTaxValue(){getChromeDriver().findElement(TAX).getText(); }

    public boolean isTaxValueDisplayed(){
        return getChromeDriver().findElement(TAX).isDisplayed();
    }

    public void checkTotalPriceValue(String totalPriceValue){
        assertEquals (totalPriceValue, getChromeDriver().findElement(TOTAL_PRICE).getText(), "Total Price is incorrect");
    }

    public void checkSubTotalPriceValue(String subTotalPriceValue){
        assertEquals (subTotalPriceValue, getChromeDriver().findElement(SUB_TOTAL_PRICE).getText(), "SubTotal Price is incorrect");
    }

    public void checkTaxPriceValue(String taxPriceValue){
        assertEquals(taxPriceValue, getChromeDriver().findElement(TAX).getText(), "Tax Price is incorrect");
    }

    //Click on Submit button
    public void clickOnSubmitButton(){
        getChromeDriver().findElement(SUBMIT_BUTTON2).click();
    }
}

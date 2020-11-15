package desktop.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartPageLABA {

    WebDriver driver;
    @FindBy(xpath = "//h1[@class=\"cart-headline\"]")
    WebElement cartHeader;
    @FindBy(xpath = "//div[@class=\"col-xs-6 cart-totals-right text-right\"]")
    WebElement subTotalPrice;
    @FindBy(xpath = "//div[@class=\"col-xs-6 cart-totals-right text-right grand-total\"]")
    WebElement totalPrice;
    @FindBy(xpath = "//div[@class=\"cart__actions\"]//button[@class=\"btn btn-primary btn-block btn--continue-checkout js-continue-checkout-button\"]")
    WebElement submitButton2;


    public CartPageLABA(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
//CartPage is displayed
    public Boolean testCartPageOpened(){
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

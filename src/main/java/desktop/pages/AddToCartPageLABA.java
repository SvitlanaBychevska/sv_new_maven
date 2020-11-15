package desktop.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddToCartPageLABA {

    WebDriver driver;
    @FindBy(xpath = "//div[@id=\"cboxTitle\"]")
    WebElement addToCartHeader;
    @FindBy(xpath = "//a[@class=\"btn btn-primary btn-block add-to-cart-button\"]")
    WebElement checkOutButton;

    public AddToCartPageLABA(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public Boolean testAddToCartPageOpened(){
       return addToCartHeader.isDisplayed();
    }

    public void clickOnCheckOutButton(){
        checkOutButton.click();
    }
}

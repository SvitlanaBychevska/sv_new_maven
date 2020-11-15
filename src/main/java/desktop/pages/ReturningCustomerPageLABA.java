package desktop.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReturningCustomerPageLABA {

    WebDriver driver;
    @FindBy(xpath = "//div[@class=\"login-page__headline\"]")
    WebElement returnCustomerPagetHeader;
    @FindBy(xpath = "//input[@id=\"guest.email\"]")
    WebElement guestEmail1;
    @FindBy(xpath = "//input[@class=\"confirmGuestEmail form-control\"]")
    WebElement guestEmail2;
    @FindBy(xpath = "//div/button[@type=\"submit\"]")
    WebElement logInAndCheckOutButton;


    public ReturningCustomerPageLABA(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    //Returning Customer Page is displayed
    public Boolean testReturningCustomerPageIsOpened(){
        return returnCustomerPagetHeader.isDisplayed();
    }

    //Input the first email
    public void setEmail1Value(String email1){
        guestEmail1.sendKeys(email1);
    }

    //Input the second email
    public void setEmail2Value(String email2){
        guestEmail1.sendKeys(email2);
    }

    //Click on logInAndCheckOut Button button
    public void clickOnLogInAndCheckOutButton(){
        logInAndCheckOutButton.click();
    }
}

package desktop.pages;
import abstractClasses.page.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static driver.SetUpChromeDriver.getChromeDriver;

public class ReturningCustomerPageLABA extends AbstractPage {

    //FindBy(xpath = "//div[@class='js-mobile-logo']")
    WebElement returnCustomerPageHeader = getChromeDriver().findElement(By.xpath("//div[@class='login-page__headline']"));
    //@FindBy(xpath = "//input[@id=\"guest.email\"]")
    WebElement guestEmail1 = getChromeDriver().findElement(By.xpath("//input[@id=\"guest.email\"]"));
    //@FindBy(xpath = "//input[@class=\"confirmGuestEmail form-control\"]")
    WebElement guestEmail2 = getChromeDriver().findElement(By.xpath("//input[@class=\"confirmGuestEmail form-control\"]"));
    //@FindBy(xpath = "//div/button[@type=\"submit\"]")
    WebElement logInAndCheckOutButton = getChromeDriver().findElement(By.xpath("//div/button[@type=\"submit\"]"));


    //Returning Customer Page is displayed
    public Boolean testPageIsOpened(){
        return returnCustomerPageHeader.isDisplayed();
    }

//    public Boolean testReturningCustomerPageIsOpened(){
//        return returnCustomerPageHeader.isDisplayed();
//    }

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

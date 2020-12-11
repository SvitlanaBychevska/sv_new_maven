package desktop.pages;
import abstractClasses.page.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static driver.SetUpChromeDriver.getChromeDriver;

public class ReturningCustomerPageLABA extends AbstractPage {


    //WebElement returnCustomerPageHeader = getChromeDriver().findElement(By.xpath("//div[@class='login-page__headline']"));
    private static final By RETURN_CUSTOMER_PAGE_HEADER = By.xpath("//div[@class='login-page__headline']");
    //WebElement guestEmail1 = getChromeDriver().findElement(By.xpath("//input[@id=\"guest.email\"]"));
    private static final By GUEST_EMAIL1 = By.xpath("//input[@id=\"guest.email\"]");
    //WebElement guestEmail2 = getChromeDriver().findElement(By.xpath("//input[@class=\"confirmGuestEmail form-control\"]"));
    private static final By GUEST_EMAIL2 = By.xpath("//input[@class=\"confirmGuestEmail form-control\"]");
    //WebElement logInAndCheckOutButton = getChromeDriver().findElement(By.xpath("//div/button[@type=\"submit\"]"));
    private static final By LOG_IN_AND_CHECK_OUT_BUTTON = By.xpath("//div/button[@type=\"submit\"]");

    //Returning Customer Page is displayed
    public boolean testPageIsOpened(){
        return getChromeDriver().findElement(RETURN_CUSTOMER_PAGE_HEADER).isDisplayed();
    }

//    public Boolean testReturningCustomerPageIsOpened(){
//        return returnCustomerPageHeader.isDisplayed();
//    }

    //Input the first email
    public void setEmail1Value(String email1){
        getChromeDriver().findElement(GUEST_EMAIL1).sendKeys(email1);
    }

    //Input the second email
    public void setEmail2Value(String email2){
        getChromeDriver().findElement(GUEST_EMAIL2).sendKeys(email2);
    }

    //Click on logInAndCheckOut Button button
    public void clickOnLogInAndCheckOutButton(){
        getChromeDriver().findElement(LOG_IN_AND_CHECK_OUT_BUTTON).click();
    }
}

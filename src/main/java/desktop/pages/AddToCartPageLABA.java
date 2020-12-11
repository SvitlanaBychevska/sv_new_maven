package desktop.pages;
import abstractClasses.fragment.AbstractFragment;
import abstractClasses.page.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static driver.SetUpChromeDriver.getChromeDriver;


public class AddToCartPageLABA extends AbstractFragment {

    //WebElement addToCartHeader = getChromeDriver().findElement(By.xpath("//div[@id=\"cboxTitle\"]"));
    private static final By ADD_TO_CART_HEADER = By.xpath("//div[@id=\"cboxTitle\"]");
   // WebElement checkOutButton = getChromeDriver().findElement(By.xpath("//a[@class=\"btn btn-primary btn-block add-to-cart-button\"]"));
    private static final By CHECK_OUT_BUTTON = By.xpath("//a[@class=\"btn btn-primary btn-block add-to-cart-button\"]");

    public boolean testPageIsOpened(){
       //return getChromeDriver().findElement(ADD_TO_CART_HEADER).isDisplayed();

       return isElementDisplayed(ADD_TO_CART_HEADER);
    }

    public void clickOnCheckOutButton(){
        getChromeDriver().findElement(CHECK_OUT_BUTTON).click();
    }
}

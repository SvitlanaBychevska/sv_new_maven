package desktop.pages;
import abstractClasses.page.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static driver.SetUpChromeDriver.getChromeDriver;


public class AddToCartPageLABA extends AbstractPage {

    //@FindBy(xpath = "//div[@id=\"cboxTitle\"]")
    WebElement addToCartHeader = getChromeDriver().findElement(By.xpath("//div[@id=\"cboxTitle\"]"));
    //@FindBy(xpath = "//a[@class=\"btn btn-primary btn-block add-to-cart-button\"]")
    WebElement checkOutButton = getChromeDriver().findElement(By.xpath("//a[@class=\"btn btn-primary btn-block add-to-cart-button\"]"));


    public Boolean testPageIsOpened(){
       return addToCartHeader.isDisplayed();
    }

    public void clickOnCheckOutButton(){
        checkOutButton.click();
    }
}

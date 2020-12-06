package desktop.pages;
import abstractClasses.page.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static driver.SetUpChromeDriver.getChromeDriver;

public class SearchResultPageLABA extends AbstractPage {
    //@FindBy(xpath = "//div[@class=\"results\"]")
    WebElement searchResultPage = getChromeDriver().findElement(By.xpath("//div[@class=\"results\"]"));
    //@FindBy(xpath = "//div/form[@id=\"addToCartForm1776948\"]/button[@type=\"submit\"]")
    WebElement submitButton = getChromeDriver().findElement(By.xpath("//div/form[@id=\"addToCartForm1776948\"]/button[@type=\"submit\"]"));


    //Get the Page name from Home Page
    public Boolean testPageIsOpened(){
        return	searchResultPage.isDisplayed();
    }

    //Click on Submit Button
    public void clickOnSubmitButton(){
        submitButton.click();
    }

}

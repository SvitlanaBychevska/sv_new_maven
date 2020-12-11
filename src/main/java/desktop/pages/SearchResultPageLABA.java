package desktop.pages;
import abstractClasses.fragment.AbstractFragment;
import abstractClasses.page.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static driver.SetUpChromeDriver.getChromeDriver;

public class SearchResultPageLABA extends AbstractFragment {

//    WebElement searchResultPage = getChromeDriver().findElement(By.xpath("//div[@class=\"results\"]"));
    private static final By SEARCH_RESULTS = By.xpath("//div[@class=\"results\"]");

//    WebElement submitButton = getChromeDriver().findElement(By.xpath("//div/form[@id=\"addToCartForm1776948\"]/button[@type=\"submit\"]"));
    private static final By SUBMIT_BUTTON = By.xpath("//div/form[@id=\"addToCartForm1776948\"]/button[@type=\"submit\"]");


    //Get the Page name from Home Page
    public Boolean testPageIsOpened() {
//        clickElement(SEARCH_RESULTS).isElementDisplayed(SEARCH_RESULTS);
        return isElementDisplayed(SEARCH_RESULTS);

//        return getChromeDriver().findElement(SEARCH_RESULTS).isDisplayed();
//        return	searchResultPage.isDisplayed();
    }

    //Click on Submit Button
    public void clickOnSubmitButton(){
        getChromeDriver().findElement(SUBMIT_BUTTON).click();
    }

}

package desktop.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPageLABA {

    WebDriver driver;

    @FindBy(xpath = "//div[@class=\"results\"]")
    WebElement searchResultPage;
    @FindBy(xpath = "//div/form[@id=\"addToCartForm1776948\"]/button[@type=\"submit\"]")
    WebElement submitButton;


    public SearchResultPageLABA(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //Get the Page name from Home Page
    public Boolean getSearchResultText(){
        return	searchResultPage.isDisplayed();
    }

    //Click on Submit Button
    public void clickOnSubmitButton(){
        submitButton.click();
    }

}

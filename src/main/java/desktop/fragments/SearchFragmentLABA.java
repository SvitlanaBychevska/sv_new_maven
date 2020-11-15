package desktop.fragments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFragmentLABA {

    WebDriver driver;
    @FindBy(xpath = "//div/input[@type=\"text\"]")
    WebElement searchField;
    @FindBy(xpath = "//button[@class=\"btn btn-link js_search_button\"]")
    WebElement searchButton;


    public SearchFragmentLABA(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void fillInSearchField(String textForSearch){
        searchField.sendKeys(textForSearch);
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }


    /**
     * This POM method will be used in test case for finding desired product
     * @param textForSearch
     * @return
     */
    public void searchProduct(String textForSearch){
        //Fill in search field
        this.fillInSearchField(textForSearch);
        //click on Search button
        this.clickOnSearchButton();
       }
}

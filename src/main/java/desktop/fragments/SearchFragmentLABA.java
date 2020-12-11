package desktop.fragments;
import org.openqa.selenium.By;
import static driver.SetUpChromeDriver.getChromeDriver;


public class SearchFragmentLABA {

   // WebElement searchField = getChromeDriver().findElement(By.xpath("//div/input[@type=\"text\"]"));
    private static final By SEARCH_FIELD = By.xpath("//div/input[@type=\"text\"]");
    //WebElement searchButton = getChromeDriver().findElement(By.xpath("//button[@class=\"btn btn-link js_search_button\"]"));
    private static final By SEARCH_BUTTON = By.xpath("//button[@class=\"btn btn-link js_search_button\"]");

    public void fillInSearchField(String textForSearch){
        getChromeDriver().findElement(SEARCH_FIELD).sendKeys(textForSearch);
    }

    public void clickOnSearchButton(){
        getChromeDriver().findElement(SEARCH_BUTTON).click();
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

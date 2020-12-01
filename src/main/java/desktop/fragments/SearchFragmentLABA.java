package desktop.fragments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static driver.SetUpChromeDriver.getChromeDriver;

public class SearchFragmentLABA {

    //@FindBy(xpath = "//div/input[@type=\"text\"]")
    WebElement searchField = getChromeDriver().findElement(By.xpath("//div/input[@type=\"text\"]"));
    //@FindBy(xpath = "//button[@class=\"btn btn-link js_search_button\"]")
    WebElement searchButton = getChromeDriver().findElement(By.xpath("//button[@class=\"btn btn-link js_search_button\"]"));


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

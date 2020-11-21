package stepDefs;
import desktop.fragments.SearchFragmentLABA;
import desktop.pages.SearchResultPageLABA;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class HomePageSteps {
    WebDriver driver;
    SearchFragmentLABA objSearchFragment;
    SearchResultPageLABA objSearchResult;

    @When("I search for {string}")
    public void searchProduct(String product){
        objSearchFragment = new SearchFragmentLABA(driver);
        objSearchFragment.fillInSearchField(product);
    }

    @And("I click on the search button")
    public void clickOnSearchButton(){
        objSearchFragment = new SearchFragmentLABA(driver);
        objSearchFragment.clickOnSearchButton();
    }

    @And("I click on the CheckOut button on Result page")
    public void clickOnCheckOutButtonOnResultPage(){
        objSearchResult = new SearchResultPageLABA(driver);
        objSearchResult.clickOnSubmitButton();
        //  objAddToCartPage = new AddToCartPageLABA(driver);
        //Assert.assertTrue(objAddToCartPage.testAddToCartPageIsOpened());
    }

    @Then("I got search result page")
    public void searchResultIsShown(){
        objSearchResult = new SearchResultPageLABA(driver);
        Assert.assertTrue(objSearchResult.getSearchResultText());
    }


}

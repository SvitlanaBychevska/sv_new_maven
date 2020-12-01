package stepDefs;
import desktop.fragments.SearchFragmentLABA;
import desktop.pages.AddToCartPageLABA;
import desktop.pages.SearchResultPageLABA;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class HomePageSteps {
    SearchFragmentLABA objSearchFragment;
    SearchResultPageLABA objSearchResult;
    AddToCartPageLABA objAddToCartPage;

    @When("I search for {string}")
    public void searchProduct(String product){
        objSearchFragment = new SearchFragmentLABA();
        objSearchFragment.fillInSearchField(product);
    }

    @And("I click on the search button")
    public void clickOnSearchButton(){
        objSearchFragment = new SearchFragmentLABA();
        objSearchFragment.clickOnSearchButton();
    }

    @And("I click on the CheckOut button on Result page")
    public void clickOnCheckOutButtonOnResultPage(){
        objSearchResult = new SearchResultPageLABA();
        objSearchResult.clickOnSubmitButton();
        objAddToCartPage = new AddToCartPageLABA();
        Assert.assertTrue(objAddToCartPage.testPageIsOpened());
    }

    @Then("I got search result page")
    public void searchResultIsShown(){
        objSearchResult = new SearchResultPageLABA();
        Assert.assertTrue(objSearchResult.testPageIsOpened());
    }


}

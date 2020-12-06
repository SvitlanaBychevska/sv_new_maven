package stepDefs;
import desktop.fragments.SearchFragmentLABA;
import desktop.pages.AddToCartPageLABA;
import desktop.pages.SearchResultPageLABA;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class HomePageSteps {
    SearchFragmentLABA objSearchFragment = new SearchFragmentLABA();
    SearchResultPageLABA objSearchResult = new SearchResultPageLABA();
    AddToCartPageLABA objAddToCartPage = new AddToCartPageLABA();

    @When("I search for {string}")
    public void searchProduct(String product){
        objSearchFragment.fillInSearchField(product);
    }

    @And("^I click on the search|magnifier button$")
    public void clickOnSearchButton(){
        objSearchFragment.clickOnSearchButton();
    }

    @And("^I click on the CheckOut|Submit button on Result page$")
    public void clickOnCheckOutButtonOnResultPage(){
        objSearchResult.clickOnSubmitButton();
        Assert.assertTrue(objAddToCartPage.testPageIsOpened());
    }

    @Then("I got search result page")
    public void searchResultIsShown(){
        Assert.assertTrue(objSearchResult.testPageIsOpened());
    }


}

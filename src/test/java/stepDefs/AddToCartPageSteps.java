package stepDefs;
import desktop.pages.AddToCartPageLABA;
import desktop.pages.CartPageLABA;
import desktop.pages.SearchResultPageLABA;
import io.cucumber.java.en.And;
import org.junit.Assert;


public class AddToCartPageSteps {
    AddToCartPageLABA objAddToCartPage;
    CartPageLABA objCartPage;
    SearchResultPageLABA objSearchResult;

    @And("I click on the CheckOut button on the Add to Cart Page")
    public void clickOnCheckOutButtonOnAddToCartPage(){
        objAddToCartPage = new AddToCartPageLABA();
        Assert.assertTrue(objAddToCartPage.testPageIsOpened());
        objAddToCartPage.clickOnCheckOutButton();
    }


    }






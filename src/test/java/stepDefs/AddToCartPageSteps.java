package stepDefs;
import desktop.pages.AddToCartPageLABA;
import desktop.pages.CartPageLABA;
import desktop.pages.SearchResultPageLABA;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class AddToCartPageSteps {
    WebDriver driver;
    AddToCartPageLABA objAddToCartPage;
    CartPageLABA objCartPage;
    SearchResultPageLABA objSearchResult;

    @And("I click on the CheckOut button on the Add to Cart Page")
    public void clickOnCheckOutButtonOnAddToCartPage(){
        objAddToCartPage = new AddToCartPageLABA(driver);
        //Assert.assertTrue(objAddToCartPage.testAddToCartPageIsOpened());
        objAddToCartPage.clickOnCheckOutButton();
    }


    }






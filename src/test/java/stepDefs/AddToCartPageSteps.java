package stepDefs;
import desktop.pages.AddToCartPageLABA;
import io.cucumber.java.en.And;
import org.junit.Assert;


public class AddToCartPageSteps {
    AddToCartPageLABA objAddToCartPage = new AddToCartPageLABA();

    @And("^I click on the CheckOut|Submit button on the Add to Cart Page$")
    public void clickOnCheckOutButtonOnAddToCartPage(){
        Assert.assertTrue(objAddToCartPage.testPageIsOpened());
        objAddToCartPage.clickOnCheckOutButton();
    }


    }






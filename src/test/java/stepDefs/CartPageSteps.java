package stepDefs;
import desktop.pages.CartPageLABA;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CartPageSteps {
    CartPageLABA objCartPage;

    @Then("I go to Cart Page")
    public void cartPageIsOpened(){
        objCartPage = new CartPageLABA();
        Assert.assertTrue(objCartPage.testCartPageIsOpened());
    }

    @And("I click on the CheckOut button on the Cart Page")
    public void  clickOnCheckOutButtonOnTheCartPage(){
        objCartPage = new CartPageLABA();
        objCartPage.clickOnSubmitButton();
    }
}

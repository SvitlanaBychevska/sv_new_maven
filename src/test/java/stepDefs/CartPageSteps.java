package stepDefs;

import desktop.pages.CartPageLABA;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartPageSteps {
    WebDriver driver;
    CartPageLABA objCartPage;

    @Then("I go to Cart Page")
    public void cartPageIsOpened(){
        objCartPage = new CartPageLABA(driver);
        Assert.assertTrue(objCartPage.testCartPageIsOpened());
    }

    @And("I click on the CheckOut button on the Cart Page")
    public void  clickOnCheckOutButtonOnTheCartPage(){
        objCartPage.clickOnSubmitButton();
    }
}

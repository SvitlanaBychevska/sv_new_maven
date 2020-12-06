package stepDefs;
import desktop.pages.CartPageLABA;
import dto.PricesCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.assertj.core.api.SoftAssertions;

public class CartPageSteps {
    CartPageLABA objCartPage = new CartPageLABA();

    @Then("I go to Cart Page")
    public void cartPageIsOpened(){
        Assert.assertTrue(objCartPage.testCartPageIsOpened());
    }

    @And("I click on the CheckOut|Submit button on the Cart Page")
    public void  clickOnCheckOutButtonOnTheCartPage(){
        objCartPage.clickOnSubmitButton();
    }

    @And("I have the following final Prices and they are correct")
    public void checkPricesValue(PricesCartPage pricesCartPage){
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(objCartPage.isSubTotalValueDisplayed())
                .as("SubTotal price is not displayed").isTrue();
        softly.assertThat(objCartPage.isTotalValueDisplayed())
                .as("Total price is not displayed").isTrue();
        softly.assertThat(objCartPage.isTaxValueDisplayed())
                .as("Tax price is not displayed").isTrue();
        softly.assertAll();
    objCartPage.checkTotalPriceValue(pricesCartPage.total);
    objCartPage.checkSubTotalPriceValue(pricesCartPage.subtotal);
    objCartPage.checkTaxPriceValue(pricesCartPage.tax);

    }
}

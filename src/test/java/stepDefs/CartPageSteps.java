package stepDefs;
import desktop.pages.CartPageLABA;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.assertj.core.api.SoftAssertions;

import java.util.Map;

public class CartPageSteps {
    CartPageLABA objCartPage = new CartPageLABA();

    @Then("I go to Cart Page")
    public void cartPageIsOpened(){
        Assert.assertTrue(objCartPage.testCartPageIsOpened());
    }

    @And("I click on the CheckOut button on the Cart Page")
    public void  clickOnCheckOutButtonOnTheCartPage(){
        objCartPage.clickOnSubmitButton();
    }

    @And("I have the following final Prices and they are correct")
//    public void iCanReviewOrderSummary(Map<String, String> values) {
//        String subTotalExpRes = values.get("Subtotal");
//        String totalExpRes = values.get("Total");
//
//        String subTotalActRes = orderDetailsPage.getSubTotalOnOrderDetails();
//        String totalActRes = orderDetailsPage.getTotalOnOrderDetails();
//        Assertions.assertAll("Total prices do not equal",
//                () -> assertEquals("$99.85", subTotalActRes),
//                () -> assertEquals("$99.85", totalActRes)
//        () -> assertEquals(subTotalExpRes, subTotalActRes),
//                () -> assertEquals(totalExpRes, totalActRes)
//        );
//    }
    public void checkPricesValue(Map<String, String> values){
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(objCartPage.isSubTotalValueDisplayed())
                .as("SubTotal price is not displayed").isTrue();
        softly.assertThat(objCartPage.isTotalValueDisplayed())
                .as("Total price is not displayed").isTrue();
        softly.assertThat(objCartPage.isTaxValueDisplayed())
                .as("Tax price is not displayed").isTrue();
        softly.assertAll();
        String subtotal = values.get("subtotal");
        String total = values.get("total");
        String tax = values.get("tax");
    objCartPage.checkTotalPriceValue(total);
    objCartPage.checkSubTotalPriceValue(subtotal);
    objCartPage.checkTaxPriceValue(tax);
    }
}

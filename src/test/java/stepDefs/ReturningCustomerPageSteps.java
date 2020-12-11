package stepDefs;
import desktop.pages.ReturningCustomerPageLABA;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class ReturningCustomerPageSteps {
    ReturningCustomerPageLABA objReturningCustomerPage = new ReturningCustomerPageLABA();

    @Then("I go to Returning Customer Page")
    public void checkThatReturningCustomerPageIsOpened(){
        Assert.assertTrue(objReturningCustomerPage.testPageIsOpened());
    }
}

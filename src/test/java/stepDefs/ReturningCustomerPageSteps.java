package stepDefs;

import desktop.pages.ReturningCustomerPageLABA;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ReturningCustomerPageSteps {

    WebDriver driver;
    ReturningCustomerPageLABA objReturningCustomerPage;

    @Then("I go to Returning Customer Page")
    public void checkThatReturningCustomerPageIsOpened(){
        objReturningCustomerPage = new ReturningCustomerPageLABA(driver);
        Assert.assertTrue(objReturningCustomerPage.testReturningCustomerPageIsOpened());
    }
}

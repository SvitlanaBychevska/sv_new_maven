package testRunner;
import desktop.fragments.SearchFragmentLABA;
import desktop.pages.AddToCartPageLABA;
import desktop.pages.CartPageLABA;
import desktop.pages.ReturningCustomerPageLABA;
import desktop.pages.SearchResultPageLABA;
import org.junit.jupiter.api.Test;
import static constants.SitesUrls.url1;
import static driver.SetUpChromeDriver.getChromeDriver;

public class CheckReturningCustomerPageTest {
    SearchFragmentLABA objSearchPanel;
    SearchResultPageLABA objSearchResult;
    AddToCartPageLABA objAddToCartPage;
    CartPageLABA objCartPage;
    ReturningCustomerPageLABA objReturningCustomerPage;

    /**
     * This test case will search Products in https://ecsc00a03ccd.epam.com:9002/yacceleratorstorefront/?site=electronics
     * Verify that user can submit purchasing of Product
     */
    @Test
    public void testProductSubmision(){
        getChromeDriver().get(url1);
        //Create Search Page object
        objSearchPanel = new SearchFragmentLABA();
        //Search Product
        objSearchPanel.fillInSearchField("camileo");
        objSearchPanel.clickOnSearchButton();
        //Click on submit button on the Search Result Page
        objSearchResult = new SearchResultPageLABA();
        objSearchResult.clickOnSubmitButton();
        //Click on checkout button on the Add To Cart Page
        objAddToCartPage = new AddToCartPageLABA();
        objAddToCartPage.clickOnCheckOutButton();
        //Click on checkout button on the Cart Page
        objCartPage = new CartPageLABA();
        objCartPage.clickOnSubmitButton();
        //Fill in emails on the Returning Customer Page
        objReturningCustomerPage = new ReturningCustomerPageLABA();
        objReturningCustomerPage.setEmail1Value("test@user.com");
        objReturningCustomerPage.setEmail2Value("test@user.com");
        //Click on Log in and checkout button
        objReturningCustomerPage.clickOnLogInAndCheckOutButton();
    }
}

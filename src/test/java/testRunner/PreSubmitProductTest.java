package testRunner;
import desktop.fragments.SearchFragmentLABA;
import desktop.pages.AddToCartPageLABA;
import desktop.pages.CartPageLABA;
import desktop.pages.SearchResultPageLABA;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static constants.SitesUrls.url1;
import static driver.SetUpChromeDriver.getChromeDriver;

public class PreSubmitProductTest {
    SearchFragmentLABA objSearchPanel = new SearchFragmentLABA();
    SearchResultPageLABA objSearchResult  = new SearchResultPageLABA();
    AddToCartPageLABA objAddToCartPage = new AddToCartPageLABA();
    CartPageLABA objCartPage = new CartPageLABA();

    /**
     * This test case will search Products in https://ecsc00a03ccd.epam.com:9002/yacceleratorstorefront/?site=electronics
     * Verify that user can submit purchasing of Product
     */
    @Test
    public void testProductSubmision(){
        getChromeDriver().get(url1);
        //Search Product
        objSearchPanel.fillInSearchField("camileo");
        objSearchPanel.clickOnSearchButton();
        //Check that search result page is shown
        Assert.assertTrue(objSearchResult.testPageIsOpened());
        //Click on Submit button
        objSearchResult.clickOnSubmitButton();
        //Check that Add To Cart Page is shown
        // Assert.assertTrue(objAddToCartPage.testPageIsOpened());
        //Click on checkout button
        objAddToCartPage.clickOnCheckOutButton();
        //Check that Cart Page is opened
        Assert.assertTrue(objCartPage.testCartPageIsOpened());
    }
}

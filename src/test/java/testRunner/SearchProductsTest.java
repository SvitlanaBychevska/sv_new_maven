package testRunner;
import desktop.fragments.SearchFragmentLABA;
import desktop.pages.SearchResultPageLABA;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static constants.SitesUrls.url1;
import static driver.SetUpChromeDriver.getChromeDriver;

public class SearchProductsTest {

    SearchFragmentLABA objSearchPanel = new SearchFragmentLABA();
    SearchResultPageLABA objSearchResult = new SearchResultPageLABA();

    /**
     * This test case will search Products in https://ecsc00a03ccd.epam.com:9002/yacceleratorstorefront/?site=electronics
     * Verify the search result is shown
     */
    @Test
    public void testSearchResultIsCorrect(){
        getChromeDriver().get(url1);
        //Create Search Page object
    //Search Product
    objSearchPanel.fillInSearchField("camileo");
    objSearchPanel.clickOnSearchButton();
    //Check that search result page is shown
    Assert.assertTrue(objSearchResult.testPageIsOpened());

    }

}

package testRunner;
import desktop.fragments.SearchFragmentLABA;
import desktop.pages.SearchResultPageLABA;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static constants.SitesUrls.url1;

public class SearchProductsTest {

    WebDriver driver;
    SearchFragmentLABA objSearchPanel;
    SearchResultPageLABA objSearchResult;

    @BeforeEach
    public void setup(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    /**
     * This test case will search Products in https://ecsc00a03ccd.epam.com:9002/yacceleratorstorefront/?site=electronics
     * Verify the search result is shown
     */
    @Test
    public void testSearchResultIsCorrect(){
        driver.get(url1);
        //Create Search Page object
    objSearchPanel = new SearchFragmentLABA(driver);
    //Search Product
    objSearchPanel.fillInSearchField("camileo");
    objSearchPanel.clickOnSearchButton();
    //Check that search result page is shown
    objSearchResult = new SearchResultPageLABA(driver);
    Assert.assertTrue(objSearchResult.getSearchResultText());
    }

    @AfterEach
    public void tearDown(){
        driver.close();
        driver.quit();
        System.out.println("Close Browser method");
    }
}

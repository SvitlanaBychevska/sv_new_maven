package testRunner;
import desktop.fragments.SearchFragmentLABA;
import desktop.pages.AddToCartPageLABA;
import desktop.pages.CartPageLABA;
import desktop.pages.ReturningCustomerPageLABA;
import desktop.pages.SearchResultPageLABA;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static constants.SitesUrls.url1;

public class CheckReturningCustomerPageTest {
    WebDriver driver;
    SearchFragmentLABA objSearchPanel;
    SearchResultPageLABA objSearchResult;
    AddToCartPageLABA objAddToCartPage;
    CartPageLABA objCartPage;
    ReturningCustomerPageLABA objReturningCustomerPage;

    @BeforeEach
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Svitlana_Bychevska\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    /**
     * This test case will search Products in https://ecsc00a03ccd.epam.com:9002/yacceleratorstorefront/?site=electronics
     * Verify that user can submit purchasing of Product
     */
    @Test
    public void testProductSubmision(){
        driver.get(url1);
        //Create Search Page object
        objSearchPanel = new SearchFragmentLABA(driver);
        //Search Product
        objSearchPanel.fillInSearchField("camileo");
        objSearchPanel.clickOnSearchButton();
        //Click on submit button on the Search Result Page
        objSearchResult = new SearchResultPageLABA(driver);
        objSearchResult.clickOnSubmitButton();
        //Click on checkout button on the Add To Cart Page
        objAddToCartPage = new AddToCartPageLABA(driver);
        objAddToCartPage.clickOnCheckOutButton();
        //Click on checkout button on the Cart Page
        objCartPage = new CartPageLABA(driver);
        objCartPage.clickOnSubmitButton();
        //Fill in emails on the Returning Customer Page
        objReturningCustomerPage = new ReturningCustomerPageLABA(driver);
        objReturningCustomerPage.setEmail1Value("test@user.com");
        objReturningCustomerPage.setEmail2Value("test@user.com");
        //Click on Log in and checkout button
        objReturningCustomerPage.clickOnLogInAndCheckOutButton();
    }

    @AfterEach
    public void tearDown(){
        driver.close();
        driver.quit();
        System.out.println("Close Browser method");
    }
}

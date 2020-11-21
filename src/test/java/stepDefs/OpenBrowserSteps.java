package stepDefs;
import driver.SetUpChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static constants.SitesUrls.url1;

public class OpenBrowserSteps {
   WebDriver driver;
   SetUpChromeDriver objChromeBrowserPage;

    @Given("I open Browser")
    public void openChromeBrowser(){
        objChromeBrowserPage = new SetUpChromeDriver(driver);
        objChromeBrowserPage.setUpChromeDriver();
//        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //objHomePage = new ReturningCustomerPageLABA(driver);
        //Assert.assertTrue(objHomePage.testReturningCustomerPageIsOpened());
    }

    @And("put URL")
    public void putURL(){
        objChromeBrowserPage.setUpUrl(url1);
    }
}

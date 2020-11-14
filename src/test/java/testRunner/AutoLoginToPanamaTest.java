package testRunner;
import desktop.pages.PanamaLoginPage;
import desktop.pages.PanamaMainPage;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static constants.SitesUrls.url2;

public class AutoLoginToPanamaTest {
    WebDriver driver;
    PanamaLoginPage objLogin;
    PanamaMainPage objHomePage;

    @BeforeEach
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Svitlana_Bychevska\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url2);
    }
    /**
     * This test case will login in http://autoqa.pp.ua/wp-login.php
     * Login to application
     * Verify the home page using Dashboard message
     */
    @Test
    public void test_Home_Page_Appear_Correct(){
        //Create Login Page object
        objLogin = new PanamaLoginPage(driver);
        //login to application
        objLogin.loginToPanamaSite("subscriber", "subscriberpass");
        // go the next page
        objHomePage = new PanamaMainPage(driver);
        //Verify home page
        Assert.assertTrue(objHomePage.getHomePageHeaderLogo());
    }
}

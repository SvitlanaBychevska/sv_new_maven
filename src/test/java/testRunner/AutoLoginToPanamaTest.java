package testRunner;
import desktop.pages.PanamaLoginPage;
import desktop.pages.PanamaMainPage;
import org.junit.jupiter.api.Test;
import static constants.SitesUrls.url2;
import static driver.SetUpChromeDriver.getChromeDriver;
import org.junit.Assert;

public class AutoLoginToPanamaTest {
    PanamaLoginPage objLogin;
    PanamaMainPage objHomePage;

    /**
     * This test case will login in https://panama.ua/
     * Login to application
     * Verify the home page has header logo
     */
    @Test
    public void test_Home_Page_Appear_Correct(){
        getChromeDriver().get(url2);
        //Create Login Page object
        objLogin = new PanamaLoginPage();
        //login to application
        objLogin.loginToPanamaSite("subscriber", "subscriberpass");
        // go the next page
        objHomePage = new PanamaMainPage();
        //Verify home page
        Assert.assertTrue(objHomePage.testPageIsOpened());
    }

}

package testRunner;
import desktop.pages.PanamaLoginPage;
import desktop.pages.PanamaMainPage;
import org.junit.jupiter.api.Test;
import static constants.SitesUrls.url2;
import static driver.SetUpChromeDriver.getChromeDriver;


public class MainPageLoadedTest{
    PanamaMainPage objMainPanamaPage;
    PanamaLoginPage objLoginPanamaPage;


    @Test
    public void testingOfMainPageIsLoaded(){
        getChromeDriver().get(url2);
        System.out.println("Go to site method");
        objMainPanamaPage = new PanamaMainPage();
        objMainPanamaPage.testPageIsOpened();
        objLoginPanamaPage = new PanamaLoginPage();
        objLoginPanamaPage.loginToPanamaSite("Svitlana","Password1");
     }

}

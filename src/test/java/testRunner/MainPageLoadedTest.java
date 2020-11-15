package testRunner;
import desktop.pages.PanamaLoginPage;
import desktop.pages.PanamaMainPage;
import driver.SetUpChromeDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;
import static constants.SitesUrls.url1;
import static constants.SitesUrls.url2;
//import static driver.SetUpChromeDriver.setUpChromeDriver;

public class MainPageLoadedTest {
    WebDriver driver;
    SetUpChromeDriver setUpNewDriver;
    PanamaMainPage objMainPanamaPage;
    PanamaLoginPage objLoginPanamaPage;

//    @BeforeEach
//    public void setUp(){
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Svitlana_Bychevska\\Downloads\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--ignore-certificate-errors");
//        driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }


    @Test
    public void testingOfMainPageIsLoaded(){
        setUpNewDriver = new SetUpChromeDriver(driver);
        setUpNewDriver.setUpChromeDriver();
        setUpNewDriver.setUpUrl(url2);
        System.out.println("Go to site method");
        objMainPanamaPage = new PanamaMainPage(driver);
        objMainPanamaPage.getHomePageHeaderLogo();
        objLoginPanamaPage = new PanamaLoginPage(driver);
        objLoginPanamaPage.loginToPanamaSite("Svitlana","Password1");
        System.out.println("Open Browser method");
        //tearDown;
    }

//    @AfterEach
//    public void tearDown(){
//        driver.close();
//        driver.quit();
//        System.out.println("Close Browser method");
//    }
}

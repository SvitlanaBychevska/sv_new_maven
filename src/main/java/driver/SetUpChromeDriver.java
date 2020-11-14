package driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class SetUpChromeDriver {


    public WebDriver setUpChromeDriver(){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Svitlana_Bychevska\\Documents\\Mckensson docs\\Automation\\sv_new_maven_untitled\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}

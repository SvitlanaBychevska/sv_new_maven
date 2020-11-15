package driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class SetUpChromeDriver {
    WebDriver driver;

    public SetUpChromeDriver(WebDriver driver){
        this.driver = driver;
        //PageFactory.initElements(driver,this);
    }

    public void setUpChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Svitlana_Bychevska\\Documents\\Mckensson docs\\Automation\\sv_new_maven_untitled\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.get(urls);
    }
    public void setUpUrl(String urls){
        driver.get(urls);
    }
}

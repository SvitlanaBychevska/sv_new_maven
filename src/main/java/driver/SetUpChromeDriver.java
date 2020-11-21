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
        PageFactory.initElements(driver,this);
    }

    public void setUpChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void setUpUrl(String urls){
        driver.get(urls);
    }
}

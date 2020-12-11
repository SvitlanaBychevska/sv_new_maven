package driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;


public class SetUpChromeDriver {
    private static WebDriver instance;

    public static WebDriver getChromeDriver() {
        if (instance == null) {
            instance = driverFactory("chrome");
            instance.manage().window().maximize();
            instance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return instance;
    }

    public static WebDriver FirefoxDriver() {
        if (instance == null) {
            instance = driverFactory("fireFox");
            instance.manage().window().maximize();
            instance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return instance;
    }

    private static WebDriver driverFactory(String type) {
        WebDriver driver;
        switch (type) {
            case CHROME:
                driver = new ChromeDriver(getChromeOptions());
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalStateException("Such driver is not supported");
        }
        return driver;
    }

    public static ChromeOptions getChromeOptions() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--ignore-certificate-errors");
        return chromeOptions;
    }
    public static FirefoxOptions getFireFoxOptions() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        FirefoxOptions fireFoxOptions = new FirefoxOptions();
        fireFoxOptions.addArguments("--ignore-certificate-errors");
        return fireFoxOptions;
    }

}
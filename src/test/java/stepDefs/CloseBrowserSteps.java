package stepDefs;
import driver.CloseBrowser;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class CloseBrowserSteps {

    WebDriver driver;
    CloseBrowser objCloseBrowser;

    @Then("Browser is closed")
    public void closeChromeBrowser(){
        objCloseBrowser = new CloseBrowser(driver);
        objCloseBrowser.closeBrowser();
    }
}

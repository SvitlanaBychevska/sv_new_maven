package stepDefs;
import static driver.SetUpChromeDriver.getChromeDriver;
import io.cucumber.java.en.Given;


public class OpenBrowserSteps {

    @Given("I go to the site {string}")
    public void openChromeBrowserAndGoToSite(String url){
        getChromeDriver().get(url);
    }

}

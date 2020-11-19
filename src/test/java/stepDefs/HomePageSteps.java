package stepDefs;

import desktop.pages.ReturningCustomerPageLABA;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import static constants.SitesUrls.url1;

public class HomePageSteps {
    WebDriver driver;
    private ReturningCustomerPageLABA homePage = new ReturningCustomerPageLABA(driver);

    @And("^I log in to the site$")
public void logInToTheSite(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           driver.get(url1);
}

    @Then("^I got search result page$")
    public void searchResultIsShown(){
        Assert.assertTrue(homePage.testReturningCustomerPageIsOpened());
    }
}

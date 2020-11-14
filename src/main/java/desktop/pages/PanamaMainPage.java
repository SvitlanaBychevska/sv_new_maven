package desktop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PanamaMainPage {

    WebDriver driver;
    By homePageHeaderLogoName = By.xpath("//div[@class=\"header__logo wide\"]");

    public PanamaMainPage(WebDriver driver){
        this.driver = driver;
    }

    //Get the Page name from Home Page
    public Boolean getHomePageHeaderLogo(){
        return	driver.findElement(homePageHeaderLogoName).isDisplayed();
    }
}

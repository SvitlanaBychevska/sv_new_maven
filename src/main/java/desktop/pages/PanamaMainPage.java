package desktop.pages;
import abstractClasses.page.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static driver.SetUpChromeDriver.getChromeDriver;

public class PanamaMainPage extends AbstractPage {

    //WebElement homePageHeaderLogoName = getChromeDriver().findElement(By.xpath("//div[@class=\"header__logo wide\"]"));
  private static final By HOME_PAGE_HEADER_LOGO_NAME = By.xpath("//div[@class=\"header__logo wide\"]");

    //Get the Header Logo from Home Page
    public boolean testPageIsOpened(){
        return	getChromeDriver().findElement(HOME_PAGE_HEADER_LOGO_NAME).isDisplayed();
    }

}

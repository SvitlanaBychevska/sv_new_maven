package desktop.pages;
import abstractClasses.page.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static driver.SetUpChromeDriver.getChromeDriver;

public class PanamaMainPage extends AbstractPage {

  //  WebDriver driver;
 //   @FindBy(xpath="//div[@class=\"header__logo wide\"]")
    WebElement homePageHeaderLogoName = getChromeDriver().findElement(By.xpath("//div[@class=\"header__logo wide\"]"));

//    public PanamaMainPage(WebDriver driver){
//        this.driver = driver;
//        PageFactory.initElements(driver,this);
//    }

    //Get the Header Logo from Home Page
    public Boolean testPageIsOpened(){
        return	homePageHeaderLogoName.isDisplayed();
    }

//  public Boolean getHomePageHeaderLogo(){
//    return	homePageHeaderLogoName.isDisplayed();
//  }
}

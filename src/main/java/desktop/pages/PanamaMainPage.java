package desktop.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PanamaMainPage {

    WebDriver driver;
    @FindBy(xpath="//div[@class=\"header__logo wide\"]")
    WebElement homePageHeaderLogoName;

    public PanamaMainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //Get the Header Logo from Home Page
    public Boolean getHomePageHeaderLogo(){
        return	homePageHeaderLogoName.isDisplayed();
    }
}

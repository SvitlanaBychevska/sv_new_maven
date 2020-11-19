package desktop.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PanamaLoginPage {

    WebDriver driver;
    @FindBy(css = "div.header__button.enter")
    WebElement enterButton;
    @FindBy(name = "user_login")
            WebElement userName;
    @FindBy(name = "user_pw")
            WebElement password;
    @FindBy(xpath = "//*[@id='popup-auth-form']/div[3]/button")
    WebElement loginButton;

//    By enterButton = By.cssSelector("div.header__button.enter");
//    By userName = By.name("user_login");
//    By password = By.name("user_pw");
//    By loginButton = By.xpath("//*[@id=\"popup-auth-form\"]/div[3]/button");

    public PanamaLoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //Click on Enter button
//    public void clickEnterButton(){
//        driver.findElement(enterButton).click();
//    }
    public void clickEnterButton(){
        enterButton.click();
    }
    //Set user name in textbox
    public void setUserName(String strUserName){
        userName.sendKeys(strUserName);
    }

    //Set password in password textbox
    public void setPassword(String strPassword){
        password.sendKeys(strPassword);
    }

    //Click on login button
    public void clickLogin(){
        loginButton.click();
    }

    /**
     * This POM method will be exposed in test case to login in the application
     * @param strUserName
     * @param strPassword
     * @return
     */
    public void loginToPanamaSite(String strUserName, String strPassword){
        //Click Login button
        this.clickEnterButton();
        //Fill user name
        this.setUserName(strUserName);
        //Fill password
        this.setPassword(strPassword);
        //Click Login button
        this.clickLogin();
    }
}

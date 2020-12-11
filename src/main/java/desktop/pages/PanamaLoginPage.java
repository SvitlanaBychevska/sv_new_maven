package desktop.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static driver.SetUpChromeDriver.getChromeDriver;

public class PanamaLoginPage {

    //WebElement enterButton = getChromeDriver().findElement(By.cssSelector("div.header__button.enter"));
    private static final By ENTER_BUTTON = By.cssSelector("div.header__button.enter");
           // WebElement userName = getChromeDriver().findElement(By.name("user_login"));
    private static final By USER_NAME = By.name("user_login");
            //WebElement password = getChromeDriver().findElement(By.name("user_pw"));
    private static final By PASSWORD = By.name("user_pw");
    //WebElement loginButton = getChromeDriver().findElement(By.xpath("//*[@id='popup-auth-form']/div[3]/button"));
    private static final By LOGIN_BUTTON = By.xpath("//*[@id='popup-auth-form']/div[3]/button");


    public void clickEnterButton(){
        getChromeDriver().findElement(ENTER_BUTTON).click();
    }
    //Set user name in textbox
    public void setUserName(String strUserName){

        getChromeDriver().findElement(USER_NAME).sendKeys(strUserName);
    }

    //Set password in password textbox
    public void setPassword(String strPassword){

        getChromeDriver().findElement(PASSWORD).sendKeys(strPassword);
    }

    //Click on login button
    public void clickLogin(){

        getChromeDriver().findElement(LOGIN_BUTTON).click();
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

package desktop.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PanamaLoginPage {

    WebDriver driver;
    By enterButton = By.cssSelector("div.header__button.enter");
    By userName = By.name("user_login");
    By password = By.name("user_pw");
    By loginButton = By.xpath("//*[@id=\"popup-auth-form\"]/div[3]/button");

    public PanamaLoginPage(WebDriver driver){
        this.driver = driver;
    }

    //Click on Enter button
    public void clickEnterButton(){
        driver.findElement(enterButton).click();
    }
    //Set user name in textbox
    public void setUserName(String strUserName){
        driver.findElement(userName).sendKeys(strUserName);
    }

    //Set password in password textbox
    public void setPassword(String strPassword){
        driver.findElement(password).sendKeys(strPassword);
    }

    //Click on login button
    public void clickLogin(){
        driver.findElement(loginButton).click();
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

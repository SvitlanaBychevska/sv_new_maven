package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CloseBrowser {
    WebDriver driver;

    public CloseBrowser(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}

package abstractClasses.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static driver.SetUpChromeDriver.getChromeDriver;

public class AbstractPage {

    public boolean testPageIsOpened(By byLocator) {
            return getChromeDriver().findElement(byLocator).isDisplayed();
    }

}

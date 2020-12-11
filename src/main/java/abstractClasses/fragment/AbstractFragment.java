package abstractClasses.fragment;

import org.openqa.selenium.By;

import static driver.SetUpChromeDriver.getChromeDriver;

public class AbstractFragment {

    public AbstractFragment clickElement(By byLocator){
        getChromeDriver().findElement(byLocator).click();
        return this;
    }

    public boolean isElementDisplayed(By byLocator) {
        return getChromeDriver().findElement(byLocator).isDisplayed();
    }
}

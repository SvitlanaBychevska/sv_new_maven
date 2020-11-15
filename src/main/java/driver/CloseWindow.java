package driver;

import org.openqa.selenium.WebDriver;

public class CloseWindow {
    static WebDriver driver;

    public static WebDriver tearDown(){

        driver.close();
        driver.quit();
        System.out.println("Close Browser method");
        return driver;
    }
}

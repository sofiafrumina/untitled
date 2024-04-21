package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

abstract public class BaseSeleniumPage {
    protected static ChromeDriver driver;
    public static void setDriver(ChromeDriver chromeDriver){
        driver = chromeDriver;

    }
}

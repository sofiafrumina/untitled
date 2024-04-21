package core;

import com.frogking.chromedriver.ChromeDriverBuilder;
import com.frogking.chromedriver.ChromeDriverBuilder;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import readConfig.ConfigProvider;

import java.util.concurrent.TimeUnit;

abstract public class BaseSeleniumTest {
    //protected WebDriver driver;
    protected ChromeDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        String driver_home = "YOUR DRIVER HOME";
        ChromeDriver driver1 = new ChromeDriverBuilder()
                .build(driver_home);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        BaseSeleniumPage.setDriver(driver);
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}

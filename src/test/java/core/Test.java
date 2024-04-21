package core;

import com.frogking.chromedriver.ChromeDriverBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import readConfig.ConfigProvider;

public class Test{
    protected ChromeDriver driver;
    public static void main(String[] args) throws InterruptedException {
        String driver_home = "YOUR DRIVER HOME";
        ChromeDriver chromeDriver2 = new ChromeDriverBuilder()
                .build(driver_home);

        chromeDriver2.get(ConfigProvider.URL);
        Thread.sleep(3000);
        //Всплывающая кнопка
        chromeDriver2.findElement(By.xpath("//span[text()='Всё верно']")).click();
        //Кнопка Войти
        chromeDriver2.findElement(By.xpath("//span[@class='base-ui-button-v2__text']/..")).click();
       /* //Кнопка логин
        chromeDriver2.findElement(By.xpath("//div[@class='block-other-login-methods__password-button']")).sendKeys(ConfigProvider.DEMO_LOGIN);
        //Кнопка пароль
        chromeDriver2.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys(ConfigProvider.DEMO_PASSWORD, Keys.ENTER);*/

    }
}

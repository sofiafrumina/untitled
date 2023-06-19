package helpDesk;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readConfig.ConfigProvider;

public class MainPage extends BaseSeleniumPage {
    @FindBy (xpath = "//div[@class='homepage__content']")
    private WebElement homepageContent;
    //поиск через строку
    @FindBy (xpath = "//div[@class='presearch__wrapper']//input[@name='q']")
    private WebElement search;
    //для смены города
    @FindBy (xpath = "//div[@class='city-select_cKYOq'] ")
    private WebElement city;
    @FindBy (xpath = "//input[@placeholder='Найти город']")
    private WebElement entryCity;
    //авторизация
    @FindBy (xpath = "//span[@class='base-ui-button-v2__text']/..")
    private WebElement entryBtn;
    @FindBy(xpath = "//div[@class='block-other-login-methods__password-button']")
    private WebElement loginBtn;

    public MainPage() {
        PageFactory.initElements(driver, this);
        driver.get("https://www.dns-shop.ru/");
    }
    public LoginPage openLoginPage(){
        entryBtn.click();
        loginBtn.click();
        return new LoginPage();
    }
}

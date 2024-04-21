/*
//Метод обхождения капчи для сайта Yandex.ru
package helpDesk;

import core.BaseSeleniumPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readConfig.ConfigProvider;

public class CitePath extends BaseSeleniumPage {
    @FindBy(xpath = "//input[@name='text']")
    private WebElement yandexSearch;
    @FindBy(xpath = "//a[@href='https://www.dns-shop.ru/']//h2")
    private WebElement linkDNS;
    @FindBy(xpath = "//input[@id='js-button']")
    WebElement capchaBtn;
    public CitePath() {
        PageFactory.initElements(driver, this);
        driver.get(ConfigProvider.URL1);
    }

    public CitePath goToCite(String s) throws InterruptedException {
        capchaBtn.click();
        Thread.sleep(1000);
        capchaBtn.click();
        yandexSearch.sendKeys(s, Keys.ENTER);
        linkDNS.click();
        return new CitePath();
    }
}
*/

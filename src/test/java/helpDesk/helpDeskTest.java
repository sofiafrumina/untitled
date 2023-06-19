package helpDesk;

import core.BaseSeleniumTest;
import org.junit.Test;
import readConfig.ConfigProvider;

public class helpDeskTest extends BaseSeleniumTest {
    @Test
    public void checkEntry() {
        MainPage mainPage = new MainPage();
        mainPage.openLoginPage()
                .auth(ConfigProvider.DEMO_LOGIN, ConfigProvider.DEMO_PASSWORD);
        mainPage.chekCity(ConfigProvider.city1);
        mainPage.chekCity(ConfigProvider.city2);
        PersonalPage personalPage = new PersonalPage();
        personalPage.checkBasket(ConfigProvider.product);
    }
}

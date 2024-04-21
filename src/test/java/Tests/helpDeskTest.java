package Tests;

import core.BaseSeleniumTest;
import helpDesk.MainPage;
import org.junit.Test;
import readConfig.ConfigProvider;

public class helpDeskTest extends BaseSeleniumTest {
    @Test
    public void checkEntry() {

        MainPage mainPage = new MainPage();
        /*mainPage.openLoginPage()
                .auth(ConfigProvider.DEMO_LOGIN, ConfigProvider.DEMO_PASSWORD);*/
                /*.checkCity(ConfigProvider.city1);
                  .chekCity(ConfigProvider.city2);

        PersonalPage personalPage = new PersonalPage();
        personalPage.checkBasket(ConfigProvider.product);

        //Assert.assertTrue(MainPage.contains(homepageContent));*/
    }
}

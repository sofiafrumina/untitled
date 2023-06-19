package helpDesk;

import core.BaseSeleniumPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalPage extends BaseSeleniumPage {
    @FindBy(xpath = "//div[@class='presearch__wrapper']//input[@name='q']")
    private WebElement search;
    @FindBy(xpath = "//div[@data-code='5055229']//button[@class='button-ui buy-btn button-ui_brand button-ui_passive']")
    private WebElement buyBtn;
    @FindBy(xpath = "//div[@data-code='5055229']//button[text()='В корзине']")
    private WebElement basketBtn;
    @FindBy(xpath ="//div[@class='cart-items__product-code']/div[text()='5055229']")
    private WebElement correctProductCode;

    public PersonalPage() { PageFactory.initElements(driver,this); }

    public PersonalPage checkBasket(String s){
       search.sendKeys(s);
       buyBtn.click();
       basketBtn.click();
        return this;
    }
}

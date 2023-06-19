package helpDesk;

import core.BaseSeleniumPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseSeleniumPage {
    @FindBy (xpath = "//span[@class='base-ui-button-v2__text']/..")
    private WebElement entryBtn;
    @FindBy(xpath = "//div[@class='block-other-login-methods__password-button']")
    private WebElement loginBtn;
    @FindBy(xpath = "//input[@autocomplete='username']")
    private WebElement loginInput;
    @FindBy(xpath = "//input[@autocomplete='current-password']")
    private WebElement passwordInput;

    public LoginPage() {
        PageFactory.initElements(driver,this);
    }
    public PersonalPage auth(String login, String password){
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password, Keys.ENTER);
        return new PersonalPage();
    }
}

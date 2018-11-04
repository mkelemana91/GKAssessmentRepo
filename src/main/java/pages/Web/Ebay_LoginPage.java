package pages.Web;

import driver_handlers.WebDriverHandler;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_LoginPage extends WebDriverHandler {

    @FindBy(xpath = "//*[@id=\"gh-ug\"]/a")
    WebElement _signInlink;

    @FindBy(id = "userid")
    WebElement _usernameTextbox;

    @FindBy(id = "pass")
    WebElement _passwordTextbox;

    @FindBy(id = "sgnBt")
    WebElement _signInButton;

    public Ebay_LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public Ebay_HomePage successfulLogin(String username, String password) {
        _signInlink.click();
        _usernameTextbox.sendKeys(username);
        _passwordTextbox.sendKeys(password);
        _signInButton.click();

        return new Ebay_HomePage();
    }
}

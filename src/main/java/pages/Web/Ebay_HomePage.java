package pages.Web;

import driver_handlers.WebDriverHandler;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_HomePage extends WebDriverHandler {

    @FindBy(id = "gh-ug")
    WebElement _greetingMessage;

    @FindBy(id = "gh-p-2")
    WebElement _sellLink;


    public Ebay_HomePage(){
        PageFactory.initElements(driver, this);
    }

    public String getGreetingMessage(){
        return _greetingMessage.getText();
    }

    public Ebay_SellPage clickSellLink(){

        _sellLink.click();
        return new Ebay_SellPage();
    }
}

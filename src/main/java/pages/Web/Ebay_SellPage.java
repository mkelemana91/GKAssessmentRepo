package pages.Web;

import driver_handlers.WebDriverHandler;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_SellPage extends WebDriverHandler {

    @FindBy(id = "countryId")
    WebElement _countryDropdownList;

    @FindBy(id = "address1")
    WebElement _addressTextbox;

    @FindBy(id = "sbtBtn")
    WebElement _listYourItemButton;

    public Ebay_SellPage(){
        PageFactory.initElements(driver, this);
    }

    public WebElement selectCountry(){
      return  _countryDropdownList;
    }
    public void captureSellDetails(String address){

        _addressTextbox.sendKeys(address);
        _listYourItemButton.click();
        return;
    }
}

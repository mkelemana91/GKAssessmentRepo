package pages.Mobile;

import driver_handlers.MobileDriverHandler;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class UMP_LandingPage extends MobileDriverHandler {

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'UAMP')]")
    MobileElement _headerNameLabel;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Wake Up')]")
    MobileElement _albumName;

    public boolean isHeaderDisplayed(){
        return _headerNameLabel.isDisplayed();
    }
    public UMP_LandingPage(){
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver),this);

    }
    public UMP_AlbumPage viewAlbum(){

        _albumName.click();
        return new UMP_AlbumPage();
    }

}

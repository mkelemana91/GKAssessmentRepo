package pages.Mobile;

import driver_handlers.MobileDriverHandler;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class UMP_LandingPage extends MobileDriverHandler {

    //Page Objects
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'UAMP')]")
    MobileElement _headerNameLabel;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Wake Up')]")
    MobileElement _albumName;

    //Initialize Page Objects
    public UMP_LandingPage() {
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);

    }

    //Perform action on Page Objects
    public boolean isHeaderDisplayed() {
        return _headerNameLabel.isDisplayed();
    }

    public UMP_AlbumPage viewAlbum() {

        _albumName.click();
        return new UMP_AlbumPage();
    }

}

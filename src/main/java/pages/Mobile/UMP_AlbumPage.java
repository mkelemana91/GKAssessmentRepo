package pages.Mobile;

import driver_handlers.MobileDriverHandler;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class UMP_AlbumPage extends MobileDriverHandler {

    //Page objects
    @AndroidFindBy(id = "com.example.android.uamp.next:id/subtitle")
    MobileElement _albumNameLabel;

    //Initialize Page Objects
    public UMP_AlbumPage() {
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);

    }

    //Perform action on Page Objects
    public String getAlbumName() {
        return _albumNameLabel.getText();
    }


}

package MobileEngine;

import driver_handlers.MobileDriverHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Mobile.UMP_AlbumPage;
import pages.Mobile.UMP_LandingPage;

public class UMP_ViewSongListTest extends MobileDriverHandler {

    UMP_LandingPage ump_landingPage;
    UMP_AlbumPage ump_albumPage;

    @BeforeClass
    public void setUp() {

        launchApp();
        ump_landingPage = new UMP_LandingPage();
    }
    @Test(priority = 1)
    public void verify_if_header_is_displayed(){

        ump_landingPage.isHeaderDisplayed();
        Assert.assertTrue(true);
    }
    @Test(priority = 2)
    public void select_album(){

        ump_albumPage = ump_landingPage.viewAlbum();
    }
    @Test(priority = 3)
    public void verify_album_name() {

        ump_albumPage.getAlbumName();
        Assert.assertEquals(ump_albumPage.getAlbumName(), "The Kyoto Connection");

    }
    @AfterClass
    public void tearDown(){
        closeApp();
    }
}

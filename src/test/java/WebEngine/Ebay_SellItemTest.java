package WebEngine;

import data_readers.Excel_Reader;
import driver_handlers.WebDriverHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Web.Ebay_HomePage;
import pages.Web.Ebay_LoginPage;
import pages.Web.Ebay_SellPage;

public class Ebay_SellItemTest extends WebDriverHandler {

    Excel_Reader excelReader = new Excel_Reader(System.getProperty("user.dir") + "/data_source/GK_ebay_TestCases_v0.1.xlsx");


    String email = prop.getProperty("email");
    Ebay_LoginPage loginPage;
    Ebay_HomePage homePage;
    Ebay_SellPage sellPage;

    @BeforeClass
    public void login_with_valid_credentials() {
        startBrowser();
        loginPage = new Ebay_LoginPage();
    }

    @Test(priority = 1)
    public void login() {
        homePage = loginPage.successfulLogin(email, prop.getProperty("password"));
    }

    @Test(priority = 2)
    public void verify_greeting_message() {
        String greetingMsg = homePage.getGreetingMessage();

        Assert.assertEquals(greetingMsg, excelReader.getCellData("TestSteps", "ExpectedResults", 2));
    }

    @Test(priority = 3)
    public void list_your_item_with_incomplete_details() {

        sellPage = homePage.clickSellLink();

        new Select(sellPage.selectCountry()).selectByVisibleText(excelReader.getCellData("TestData", "Countries", 2));
        sellPage.captureSellDetails(email);

    }

    @AfterClass
    public void tearDown() {
        closeBrowser();
    }
}

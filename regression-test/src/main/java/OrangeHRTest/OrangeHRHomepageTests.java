package OrangeHRTest;

import OrangeHRTest.pageobjects.BookAFreeDemoPage.BookAFreeDemoPage;
import OrangeHRTest.pageobjects.CookieBar.CookieBarPage;
import OrangeHRTest.pageobjects.GoogleCaptcha.GoogleCaptcha;
import org.testng.annotations.Test;
import OrangeHRTest.framework.core.BaseTest;
import OrangeHRTest.pageobjects.homepage.OrangeHRHomepage;

public class OrangeHRHomepageTests extends BaseTest {

    @Test
    public void requestFreeDemoTest() {
        getDriver().get("https://www.orangehrm.com/");

//        CookieBarPage cookieBarPage = new CookieBarPage(getDriver());
        OrangeHRHomepage orangeHRHomepage = new OrangeHRHomepage(getDriver());
        BookAFreeDemoPage bookAFreeDemoPage = new BookAFreeDemoPage(getDriver());
        GoogleCaptcha googleCaptcha = new GoogleCaptcha(getDriver());

//        cookieBarPage.clickAcceptCookiesButton();

        orangeHRHomepage.clickBookAFreeDemoButton();

        bookAFreeDemoPage.typeIntoFullNameTextInputBox("John Doe");
        bookAFreeDemoPage.typeIntoBusinessEmailTextInputBox("john.doe@gmail.com");
        bookAFreeDemoPage.selectCountryDropDown("Malaysia");
        bookAFreeDemoPage.typeIntoContactTextInputBox("0123456789");

        googleCaptcha.clickReadCaptchaCheckBox();

        bookAFreeDemoPage.clickSubmitButton();
    }
}

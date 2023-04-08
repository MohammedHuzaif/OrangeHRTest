package OrangeHRTest;

import org.testng.annotations.Test;
import OrangeHRTest.framework.core.BaseTest;
import OrangeHRTest.pageobjects.homepage.OrangeHRHomepage;

public class OrangeHRHomepageTests extends BaseTest {

    @Test
    public void homepageTests() {
        OrangeHRHomepage orangeHRHomepage = new OrangeHRHomepage(getDriver());
    }
}

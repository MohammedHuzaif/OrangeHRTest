package OrangeHRTest.pageobjects.GoogleCaptcha;

import OrangeHRTest.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleCaptcha extends BasePage {

    @FindBy(css=".recaptcha-checkbox-border")
    private WebElement reachCaptchaCheckBox;

    public void clickReadCaptchaCheckBox(){
        reachCaptchaCheckBox.click();
    }

    public GoogleCaptcha(WebDriver driver) {
        super(driver);
    }
}

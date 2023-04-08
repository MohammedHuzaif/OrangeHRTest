package OrangeHRTest.pageobjects.GoogleCaptcha;

import OrangeHRTest.framework.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static java.lang.Thread.sleep;

public class GoogleCaptcha extends BasePage {

    @FindBy(css=".recaptcha-checkbox-border")
    private WebElement captchaCheckBox;

    @FindBy(xpath = "//*[@title='reCAPTCHA']")
    private WebElement captchaFrame;

    public void clickReadCaptchaCheckBox() {
        driver.switchTo().frame(1);
        captchaCheckBox.click();
        driver.switchTo().defaultContent();
    }

    public GoogleCaptcha(WebDriver driver) {
        super(driver);
    }
}

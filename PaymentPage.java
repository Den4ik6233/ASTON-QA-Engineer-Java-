import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentPage {
    protected WebDriver driver;
    private WebDriverWait wait;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement getPhoneNumberField() {
        return driver.findElement(By.id("connection-phone"));
    }

    public WebElement getAmountField() {
        return driver.findElement(By.id("connection-sum"));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.id("connection-email"));
    }

    public WebElement getContinueButton() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#pay-connection .button__default")));
    }

    public void fillPaymentForm(String phone, String amount, String email) {
        getPhoneNumberField().sendKeys(phone);
        getAmountField().sendKeys(amount);
        getEmailField().sendKeys(email);
    }
}

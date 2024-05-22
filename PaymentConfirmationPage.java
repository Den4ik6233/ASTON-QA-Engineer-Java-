import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class PaymentConfirmationPage {
    protected WebDriver driver;

    public PaymentConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getTotalAmountElement() {
        return driver.findElement(By.id("total-amount"));
    }

    public WebElement getConfirmedPhoneNumberElement() {
        return driver.findElement(By.id("confirmed-phone-number"));
    }

    public boolean isPaymentPartnersDisplayed() {
        return driver.findElement(By.id("pay__partners")).isDisplayed();
    }

    public void checkConfirmationPage(String expectedAmount, String expectedPhone) {
        Assert.assertEquals(getTotalAmountElement().getText(), expectedAmount);
        Assert.assertEquals(getConfirmedPhoneNumberElement().getText(), expectedPhone);
        Assert.assertTrue(isPaymentPartnersDisplayed());
    }

    public void checkPaymentSystemIcons() {
        List<WebElement> paymentIcons = driver.findElements(By.cssSelector(".pay__partners img"));
        Assert.assertFalse(paymentIcons.isEmpty(), "No payment system icons found");
    }
}

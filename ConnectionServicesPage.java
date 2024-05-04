import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ConnectionServicesPage extends PaymentPage {

    public ConnectionServicesPage(WebDriver driver) {
        super(driver);
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

    // Existing methods
    public void checkPaymentSystemIcons() {
        List<WebElement> paymentIcons = driver.findElements(By.cssSelector(".pay__partners img"));
        Assert.assertFalse(paymentIcons.isEmpty(), "No payment system icons found");
    }

    public void checkConfirmationPage(String expectedAmount, String expectedPhone) {
        Assert.assertEquals(getTotalAmountElement().getText(), expectedAmount);
        Assert.assertEquals(getConfirmedPhoneNumberElement().getText(), expectedPhone);
        Assert.assertTrue(isPaymentPartnersDisplayed());
    }

    public void checkEmptyFieldsLabels() {
        Assert.assertEquals(driver.findElement(By.id("connection-phone")).getAttribute("placeholder"), "Номер телефона");
        Assert.assertEquals(driver.findElement(By.id("connection-sum")).getAttribute("placeholder"), "Сумма");
        Assert.assertEquals(driver.findElement(By.id("connection-email")).getAttribute("placeholder"), "E-mail для отправки чека");

        Assert.assertEquals(driver.findElement(By.id("internet-phone")).getAttribute("placeholder"), "Номер абонента");
        Assert.assertEquals(driver.findElement(By.id("internet-sum")).getAttribute("placeholder"), "Сумма");
        Assert.assertEquals(driver.findElement(By.id("internet-email")).getAttribute("placeholder"), "E-mail для отправки чека");

        Assert.assertEquals(driver.findElement(By.id("score-instalment")).getAttribute("placeholder"), "Номер счета на 44");
        Assert.assertEquals(driver.findElement(By.id("instalment-sum")).getAttribute("placeholder"), "Сумма");
        Assert.assertEquals(driver.findElement(By.id("instalment-email")).getAttribute("placeholder"), "E-mail для отправки чека");

        Assert.assertEquals(driver.findElement(By.id("score-arrears")).getAttribute("placeholder"), "Номер счета на 2073");
        Assert.assertEquals(driver.findElement(By.id("arrears-sum")).getAttribute("placeholder"), "Сумма");
        Assert.assertEquals(driver.findElement(By.id("arrears-email")).getAttribute("placeholder"), "E-mail для отправки чека");
    }
}


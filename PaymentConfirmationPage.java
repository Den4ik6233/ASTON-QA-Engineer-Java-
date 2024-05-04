import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentConfirmationPage {
    protected WebDriver driver;
    private WebDriverWait wait;

    public PaymentConfirmationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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

    // Другие методы для проверок и действий на странице подтверждения оплаты
}

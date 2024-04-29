import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {
    private WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
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
        return driver.findElement(By.cssSelector(".homepage .pay-form button[type=submit]"));
    }

}
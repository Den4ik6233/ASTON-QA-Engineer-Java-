import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.mts.by/");
    }

    public void openPaymentPage() {
        driver.findElement(By.cssSelector(".pay__wrapper .pay-form#pay-connection")).click();
    }
}

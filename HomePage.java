import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.mts.by/");
    }

    public WebElement getOnlinePaymentBlockTitle() {
        return driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2"));
    }

    public List<WebElement> getPaymentLogos() {
        return driver.findElements(By.className("pay__partners"));
    }

    public WebElement getMoreInfoLink() {
        return driver.findElement(By.xpath("/html/body/div[6]/main/div/div[3]/div[1]/div/div/div[2]/section/div/a"));
    }
}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.qameta.allure.Description;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @Description("Открытие главной страницы MTS")
    public void open() {
        driver.get("https://www.mts.by/");
    }
}

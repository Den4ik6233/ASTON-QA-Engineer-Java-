import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import io.qameta.allure.Description;

public class ConnectionServicesPage {

    private WebDriver driver;

    public ConnectionServicesPage(WebDriver driver) {
        this.driver = driver;
    }

    @Description("Проверка надписей в незаполненных полях каждого варианта оплаты услуг")
    public void checkEmptyFieldsLabels() {
        // Ваш код проверки надписей в незаполненных полях
    }
}

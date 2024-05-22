import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

@Epic("Payment")
@Feature("Connection Services")
public class MtsTest {

    private WebDriver driver;
    private HomePage homePage;
    private ConnectionServicesPage connectionServicesPage;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\mts_tests\\chromedriver.exe");

        driver = new ChromeDriver();

        homePage = new HomePage(driver);
        connectionServicesPage = new ConnectionServicesPage(driver);
    }

    @Test
    @Description("Проверка надписей в незаполненных полях каждого варианта оплаты услуг")
    public void testEmptyFieldsLabels() {
        homePage.open();
        connectionServicesPage.checkEmptyFieldsLabels();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

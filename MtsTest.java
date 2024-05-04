import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MtsTest {

    private WebDriver driver;
    private HomePage homePage;
    private ConnectionServicesPage connectionServicesPage;
    private PaymentPage paymentPage;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().driverVersion("124.0.6367.119").setup();
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        connectionServicesPage = new ConnectionServicesPage(driver);
        paymentPage = new PaymentPage(driver);
    }

    @Test
    public void testEmptyFieldsLabels() {
        homePage.open();
        connectionServicesPage.checkEmptyFieldsLabels();
    }

    @Test
    public void testConfirmationPage() {
        homePage.open();
        homePage.openPaymentPage();
        paymentPage.fillPaymentForm("297777777", "10", "test@example.com");
        paymentPage.getContinueButton().click();
        connectionServicesPage.checkConfirmationPage("10.00 BYN", "297777777");
        connectionServicesPage.checkPaymentSystemIcons();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

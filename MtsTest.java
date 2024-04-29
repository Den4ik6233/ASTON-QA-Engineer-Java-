import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MtsTest {
    private WebDriver driver;
    private HomePage homePage;
    private PaymentPage paymentPage;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\IdeaProjects\\mts_tests\\msedgedriver.exe");
        driver = new EdgeDriver();
        homePage = new HomePage(driver);
        paymentPage = new PaymentPage(driver);
    }

    @Test
    public void testOnlinePayment() {
        homePage.open();

        // Проверка названия блока
        WebElement blockTitle = homePage.getOnlinePaymentBlockTitle();
        Assert.assertEquals(blockTitle.getText(), "Онлайн пополнение");

        // Проверка наличия логотипов платежных систем
        List<WebElement> logos = homePage.getPaymentLogos();
        Assert.assertTrue(!logos.isEmpty(), "Логотипы платежных систем не найдены");

        // Проверка работы ссылки "Подробнее о сервисе"
        WebElement moreInfoLink = homePage.getMoreInfoLink();
        moreInfoLink.click();

        // Переход на страницу оплаты
        WebElement payButton = driver.findElement(By.cssSelector(".homepage .pay-form button[type=submit]']"));
        payButton.click();

        // Заполнение полей
        paymentPage.getPhoneNumberField().sendKeys("297777777");
        paymentPage.getAmountField().sendKeys("10");
        paymentPage.getEmailField().sendKeys("test@example.com");

        paymentPage.getContinueButton().click();

        //  Проверка наличия элемента
        WebElement confirmationElement = driver.findElement(By.id("cc-number"));
        Assert.assertTrue(confirmationElement.isDisplayed());
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
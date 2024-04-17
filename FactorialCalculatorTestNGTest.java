import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTestNGTest {

    @Test
    public void testFactorialForZero() {
        Assert.assertEquals(FactorialCalculator.calculateFactorial(0), 1);
    }

    @Test
    public void testFactorialForPositiveNumbers() {
        Assert.assertEquals(FactorialCalculator.calculateFactorial(1), 1);
        Assert.assertEquals(FactorialCalculator.calculateFactorial(2), 2);
        Assert.assertEquals(FactorialCalculator.calculateFactorial(3), 6);
        Assert.assertEquals(FactorialCalculator.calculateFactorial(4), 24);
        Assert.assertEquals(FactorialCalculator.calculateFactorial(5), 120);
    }

    @Test
    public void testFactorialForNegativeNumber() {
        try {
            FactorialCalculator.calculateFactorial(-1);
            Assert.fail("Ожидалось исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // искл ожидается
        }
    }
}
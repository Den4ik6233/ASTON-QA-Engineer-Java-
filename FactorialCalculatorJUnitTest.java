import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorJUnitTest {

    @Test
    void testFactorialForZero() {
        assertEquals(1, FactorialCalculator.calculateFactorial(0));
    }

    @Test
    void testFactorialForPositiveNumbers() {
        assertEquals(1, FactorialCalculator.calculateFactorial(1));
        assertEquals(2, FactorialCalculator.calculateFactorial(2));
        assertEquals(6, FactorialCalculator.calculateFactorial(3));
        assertEquals(24, FactorialCalculator.calculateFactorial(4));
        assertEquals(120, FactorialCalculator.calculateFactorial(5));
    }

    @Test
    void testFactorialForNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.calculateFactorial(-1));
    }
}
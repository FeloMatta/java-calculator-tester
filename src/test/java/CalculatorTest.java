import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void init() {
        calc = new Calculator();
    }

    @Test
    @DisplayName("Test metodo somma - caso numeri positivi")
    void addNumbers() {
        assertEquals(4.0f, calc.add(1.5f, 2.5f));

    }

    @Test
    @DisplayName("Test metodo sottrazione - caso numeri positivi")
    void subtractNumbers() {
        assertEquals(1.0f, calc.subtract(2.5f, 1.5f));
    }

    @Test
    @DisplayName("Test metodo divisione - caso base")
    void divide() {
        assertEquals(3.25f, calc.divide(6.5f, 2.0f));
    }

    @Test
    @DisplayName("Test metodo divisione - caso divisore == 0")
    void divideException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calc.divide(6.5f, 0.0f)
        );
    }

    @Test
    @DisplayName("Test metodo moltiplicazione - caso numeri positivi")
    void multiplyNumbers() {
        assertEquals(3.75f, calc.multiply(2.5f, 1.5f));
    }

}

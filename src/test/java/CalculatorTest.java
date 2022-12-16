import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void add() {
        assertEquals(5, calculator.add(3,2));
    }

    @Test
    void dif() {
        assertEquals(5, calculator.dif(12,7));
    }

    @Test
    void div() {
        assertEquals(5, calculator.div(15,3));
    }

    @Test
    void times() {
        assertEquals(6, calculator.times(3,2));
    }

    @Test
    void solver() {
        assertEquals(9, calculator.solver(3));
    }
}
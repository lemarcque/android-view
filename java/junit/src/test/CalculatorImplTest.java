package test;

import main.CalculatorImpl;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class to test method of {@link main.CalculatorImpl}
 * @author Henoc Sese (lemarcque)
 */
class CalculatorImplTest {

    @org.junit.jupiter.api.Test
    void multiply() {
        CalculatorImpl calculator = new CalculatorImpl();
        assertEquals(35, calculator.multiply(5, 7));
    }

    @org.junit.jupiter.api.Test
    void divide() {
        CalculatorImpl calculator = new CalculatorImpl();
        assertEquals(5, calculator.divide(10, 2));
    }

    @org.junit.jupiter.api.Test
    void add() {
        CalculatorImpl calculator = new CalculatorImpl();
        assertEquals(12, calculator.add(5, 7));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        CalculatorImpl calculator = new CalculatorImpl();
        assertEquals(-2, calculator.subtract(5, 7));
    }
}
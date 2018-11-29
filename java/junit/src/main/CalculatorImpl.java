package main;

/**
 * Implementation of {@link Calculator}
 */
public class CalculatorImpl implements Calculator {

    /**
     * Multiplication : a * b
     * @param a factor
     * @param b factor
     * @return int the product of the multiplication
     */
    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Division : a / b
     * @param a dividend
     * @param b divider
     * @return
     */
    @Override
    public int divide(int a, int b) {
        return a / b;
    }

    /**
     * Addition : a + b
     * @param a term
     * @param b term
     * @return
     */
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Substraction : a - b
     * @param a diminuende
     * @param b subtrahend
     * @return
     */
    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}

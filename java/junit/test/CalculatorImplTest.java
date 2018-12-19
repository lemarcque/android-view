/**
 * MIT License
 *
 * Copyright (c) 2018 Henoc Sese
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
import main.CalculatorImpl;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class to test method of {@link main.CalculatorImpl}
 * @author Henoc Sese (lemarcque)
 */
class CalculatorImplTest {



    /**
     * Test the multiplication of two integer
     */
    @org.junit.jupiter.api.Test
    void multiply() {
        // Arrange
        CalculatorImpl calculator = new CalculatorImpl();

        // Act
        int product = calculator.multiply(5, 7);

        // Assert
        assertEquals(35, product);
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
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
package anonymous;

/**
 * Set the class as an FunctionalInterface to
 * force the declaration of one unique asbtract method.
 * @author Henoc Sese
 */
@FunctionalInterface
public interface Math {

    /**
     * Perform some operations,
     */
    int compute(int a, int b);


    /**
     * To add a one or multiple non overreding-abstract methods
     * in the interface, the keyowrd 'default' is required
     * @param n The number to multiply
     * @return The result of the multiplication of n by five
     */
     public default int multiplyByFive(int n) {
         return n * 5;
    }
}

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

import java.time.LocalDateTime;

/**
 *
 * The method addOne() is an example of a pure function :
 *  - The returned value is always the same for the given argument;
 *  - There is no side effect. The function just apply an expression it does not depend on external environment;
 *  - (Immutability : Take in parameter an argument that doesn't change. That is immutable.)
 *
 * The method getSecondTime() is an impure function:
 *  - Even if we give the argument's value in parameter, the return value always change.
 *  - It embodies side-effect. The function call another method that have a side effect with variable that mutate.
 *  - The value of the argument 'length' change. Argument should be immutable.
 *
 * @author Henoc Sese
 */
public class Pure {

    public static void main(String[] args) {
        new Pure();
    }

    public Pure() {

        // add : 10 + 1
        System.out.println(addOne(10));

        System.out.println(getSecondsTime(10));
    }


    /**
     * Function (in mathematics sens) that add one to a integer.
     * @param n the number to "addtionned"
     * @return an incremented integer
     */
    public int addOne(int n) {
        return n + 1;
    }


    /**
     * Function (in mathematics sens) that return a date, independently of the number of time displayed desired.
     * @param length
     * @return
     */
    public int getSecondsTime(int length) {
        length *= length;
        return LocalDateTime.now().getSecond();
    }
}

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

/**
 * Class displaying message on the System Output
 * @author Henoc Sese
 */
public class Log {


    /**
     * Return a empty string
     * @return string with no character
     */
    public static String getNothing() {
        return "";
    }

    /**
     * The printMessage(String, boolean) methods print a message on the output
     *
     * @param message the message that will
     */
    public static void printMessage(String message) {
        System.out.print("Log: " +  message);
    }

    /**
     * The printMessage(String, boolean) methods print a message on the output
     *
     * @param message           The message that will be displayed
     * @param carriageReturn    Determines if the console write a carriage return at the end of the line
     */
    public static void printMessage(String message, boolean carriageReturn) {
        if(carriageReturn) {
            System.out.println("Log: " + message);
        }else {
            System.out.print(" / " + message);
        }
    }
}

package principles; /**
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

import java.util.ArrayList;
import java.util.List;

/**
 * Sample to show how the
 * The concept of immutability allow to ensures the value of variables from the beginning to the end of an operation.
 * There is no mutable state.
 * @author Henoc Sese
 */
public class Immutability {

    public static void main(String[] args) {
        new Immutability();
    }

    /**
     * Constructor
     * By default Array in Java are not mutable so we will use a List and set it mutable.
     */
    public Immutability() {
        // principles.Immutability (without)
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mark");

        names.add("Luke");
        System.out.println("names => "+ names); // output : John, Marc, Luke

        // principles.Immutability
        List<String> namesList = new ArrayList<>();
        namesList.add("John");
        namesList.add("Mark");

        List<String> newNamesList = new ArrayList<>();
        newNamesList = new ArrayList<>(namesList);
        newNamesList.add("Matthew");

        System.out.println("namesList => "+ namesList); // output : John, Marc
        System.out.println("newNamesList => "+ newNamesList); // output : John, Marc, Matthew
    }
}

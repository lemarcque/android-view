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


import anonymous.*;
import anonymous.Math;

/**
 * Testing Functional programming
 */
public class Main {

    public static void main (String[] args) {
        new Main();
    }

    public Main() {
        // Unfortunately, we can't pass a method
        // as an argument in parameter of a method like in javascript:
        // this.setCallback(printHelloWorld);

        // ------
        // Rather we should create an Abstract class (or Interface) with
        // abstract method and implement it in a class and then call it:
        Fighter knight = new Knight();
        knight.fight();

        // ------
        // Then, Java 1.1 introduces the anonymous class that allow to implement
        // the behaviour in small piece of code by calling the class without a name,
        // letting programmer the possibility to avoid creating a new class just for some instructions.
        Fighter fighter = new Fighter() {
            @Override
            public void fight() {
                log("I am a fighter and i am fighthing");
            }
        };

        fighter.fight();

        // We could then pass in parameter of a method directly an object that
        // implement the abstract method of an interface
        this.func(new Fighter() {
            @Override
            public void fight() {
                log("I am a anonymous fighter !");
            }
        });

        // ------
        // Java 8 introduces the possibility to use what i called pseudo
        // lambda expressions with the operator " -> "
        // The functional paradigm implies that we can manipulate mathematical function
        Fighter warrior = () -> System.out.println("I am a warrior lambda and i'm fighting");
        warrior.fight();

        // we can also pass a lambda function in parameter of another method
        // or function (called higher-order function) in a functional point of view.
        // This means that we can create an anonymous function (Called also lambda)
        // We don't need anymore to create an object to define a function we can chains
        // them (this is what we call the Composition principle)
        this.func(() -> System.out.println("I am a anonymous lambda that are fighting !"));

        // To ensure that we are manipulating a "Function" we can use
        // a class with annotation "@FunctionalInterface"
        log(apply((a, b) -> a + b));    // addition
        log(apply((a, b) -> a - b));    // substraction
        log(apply((a, b) -> a * b));    // multiplication
        log(apply((a, b) -> a / b));    // division (exception with divison by zero)

        // ------
        // Java 8 introduces also the concept of 'Method References'
        // They are compact; easy-to-read lambda expressions for methods
        // that have already a name.
        // It is useful when a lambda expression does nothing that calling
        // another method.
        final Addition addition = new Addition();

        Function funcNothing = (n) -> addition.multiplyByFive(n);   // No lambda expressions
        Function funcLambda = (n) -> n * 5;                         // Lambda expressions
        Function funcZero = (n) -> addition.returnZero();           // Lambda expressions that call an method
        Function funcRef = addition::multiplyByFive;                // Method references to an obhect
        Substraction substraction = addition::returnZero;           // Method references to an object

        System.out.println(substraction.apply());
        System.out.println(funcNothing.apply(11));
        System.out.println(funcLambda.apply(11));
        System.out.println(funcRef.apply(11));      // Method references to an instance's method
    }

    /**
     * A method that receive a callback method to call after execution
     * @param function
     */
    private void setCallback(Object function) {
        System.out.println(function);
    }

    private void func(Fighter fighter) {
        fighter.fight();
    }

    /**
     * Apply() is a higher-order function that takes in parameter
     * an Function and return the result of the calculation performed
     * by the function.
     * @param function
     * @return
     */
    private int apply(Math function) {
        return function.compute(10, 13);
    }

    private void printHelloWorld() {
        System.out.println("Hello World !");
    }

    private void log(Object object) {
        System.out.println(object);
    }
}

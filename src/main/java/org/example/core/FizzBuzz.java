package org.example.core;

/**
 * FizzBuzz implementation demonstrating Test-Driven Development (TDD).
 * This class shows the evolution of the FizzBuzz algorithm through multiple iterations,
 * each driven by new test requirements.
 */

public class FizzBuzz {

    /**
     * Initial implementation - returns null to demonstrate a failing test.
     * @param number The number to evaluate.
     * @return null
     */

    public static String fizzBuzz1(int number){
        return null;
    }

    /**
     * First evolution - returns "1" for any input to make the first test pass.
     * @param number The input number
     * @return Always returns "1"
     */

    public static String fizzBuzz2(int number){
        return "1";
    }

    /**
     * Second evolution - handles specific cases for 1 and 2.
     * @param number The input number
     * @return "1" if input is 1, otherwise "2"
     */

    public static String fizzBuzz3(int number){
        if (number == 1) {
            return "1";
        } else {
            return "2";
        }
    }

    /**
     * Third evolution - generalizes to convert any number to string.
     * @param number The input number
     * @return String representation of the input number
     */

    public static String fizzBuzz4(int number){
        return String.valueOf(number);
    }

    /**
     * Fourth evolution - handles multiples of 3 returning "Fizz".
     * @param number The input number
     * @return "Fizz" for multiples of 3, otherwise the number as string
     */

    public static String fizzBuzz5(int number){
        if (number % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(number);
        }
    }

    /**
     * Fifth evolution - adds support for multiples of 5 returning "Buzz".
     * @param number The input number
     * @return "Fizz" for multiples of 3, "Buzz" for multiples of 5, otherwise the number as string
     */

    public static String fizzBuzz6(int number){
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    /**
     * Final implementation - complete FizzBuzz solution.
     * - Throws IllegalArgumentException for zero input
     * - Returns "Fizz Buzz" for numbers divisible by both 3 and 5
     * - Returns "Fizz" for numbers divisible by 3
     * - Returns "Buzz" for numbers divisible by 5
     * - Returns the number as string for all other cases
     *
     * @param number The input number
     * @return The FizzBuzz result according to the rules
     * @throws IllegalArgumentException if input is zero
     */

    public static String fizzBuzz7(int number){
        if (number == 0) {
            throw new IllegalArgumentException("Input cannot be zero");
        }

        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        if (divisibleBy3 && divisibleBy5) {
            return "Fizz Buzz";
        }
        if (divisibleBy3) {
            return "Fizz";
        }
        if (divisibleBy5) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}

package core;

import org.example.core.FizzBuzz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Parameterized test class for FizzBuzz that tests multiple inputs with expected outputs.
 * This class contains several test iterations, some commented out, to show the progression
 * of tests that initially failed and were later fixed.
 */

public class FizzBuzzTestParameterized {

/**
 * Tests various input values using parameterized testing.
 * The test data includes regular numbers, multiples of 3, multiples of 5,
 * and multiples of both 3 and 5.
 */

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, Fizz",
            "4, 4",
            "5, Buzz",
            "6, Fizz",
            "9, Fizz",
            "10, Buzz",
            "15, Fizz Buzz",
            "20, Buzz",
            "30, Fizz Buzz"
    })

    /**
     * This test fails for the "Buzz" case since fizzBuzz5 doesn't handle multiples of 5
     */

    public final void testFizzBuzz1(int input, String expected){
        String res = FizzBuzz.fizzBuzz5(input);
        assertEquals(expected, res, "!!!");
    }

    /**
     * This test passes for the "Buzz" case with fizzBuzz6
     * But it fails for the "FizzBuzz" case since fizzBuzz6 doesn't handle numbers
     * divisible by both 3 and 5 correctly
     */

    public final void testFizzBuzz2(int input, String expected){
        String res = FizzBuzz.fizzBuzz6(input);
        assertEquals(expected, res, "!!!");
    }

    /**
     * Test to verify that zero input throws IllegalArgumentException.
     * This test would fail with fizzBuzz6 since it doesn't check for zero.
     */

    @Test
    public final void testAvecZero() {
        Throwable exception = assertThrows(Throwable.class, () -> {
            FizzBuzz.fizzBuzz6(0);
        });
        assertEquals(IllegalArgumentException.class, exception.getClass());
    }

    /**
     * This test passes for all cases, including "FizzBuzz" and the zero check,
     * with the final implementation fizzBuzz7.
     */

    public final void testFizzBuzz3(int input, String expected){
        String res = FizzBuzz.fizzBuzz7(input);
        assertEquals(expected, res, "!!!");
    }

    /**
     * Test to verify that zero input throws IllegalArgumentException with fizzBuzz7.
     * This test should pass with the final implementation.
     */

    public final void testAvecZero2() {
        Throwable exception = assertThrows(Throwable.class, () -> {
            FizzBuzz.fizzBuzz7(0);
        });
        assertEquals(IllegalArgumentException.class, exception.getClass());
    }
}

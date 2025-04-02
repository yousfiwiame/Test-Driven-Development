package core;

import org.example.core.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for FizzBuzz demonstrating a Test-Driven Development approach.
 * Each test method corresponds to a specific implementation stage of the FizzBuzz class.
 */

public class FizzBuzzTest {

    /**
     * Tests that the initial implementation returns a non-null value.
     * This test is expected to fail with the initial implementation.
     */

    @Test
    public void testFizzBuzz(){
        assertNotNull("FizzBuzz result should not be null", FizzBuzz.fizzBuzz1(1));
    }

    /**
     * Tests that the method returns "1" for input 1.
     * This test is expected to fail with the initial implementation.
     */

    @Test
    public final void testAvecValeurUn(){
        String res = FizzBuzz.fizzBuzz1(1);
        assertEquals("1", res, "Problem with the number 1");
    }

    /**
     * Tests that fizzBuzz2 correctly returns "1" for input 1.
     * This test should pass with fizzBuzz2 implementation.
     */

    @Test
    public final void testAvecValeurUn1(){
        String res = FizzBuzz.fizzBuzz2(1);
        assertEquals("1", res, "Problem with the number 1");
    }

    /**
     * Tests that fizzBuzz2 correctly returns "2" for input 2.
     * This test is expected to fail with fizzBuzz2 implementation.
     */

    @Test
    public final void testAvecValeurDeux(){
        String res = FizzBuzz.fizzBuzz2(2);
        assertEquals("2", res, "Problem with the number 2");
    }

    /**
     * Tests that fizzBuzz3 correctly returns "1" for input 1.
     */

    @Test
    public final void testAvecValeurUn2(){
        String res = FizzBuzz.fizzBuzz3(1);
        assertEquals("1", res, "Problem with the number 1");
    }

    /**
     * Tests that fizzBuzz3 correctly returns "2" for input 2.
     */

    @Test
    public final void testAvecValeurDeux2(){
        String res = FizzBuzz.fizzBuzz3(2);
        assertEquals("2", res, "Problem with the number 2");
    }

    /**
     * Tests that fizzBuzz4 returns "Fizz" for input 3.
     * This test is expected to fail with fizzBuzz4 implementation.
     */

    @Test
    public final void testAvecValeurTrois(){
        String res = FizzBuzz.fizzBuzz4(3);
        assertEquals("Fizz", res, "Problem with the number 3");
    }

    /**
     * Tests that fizzBuzz4 returns "Fizz" for various multiples of 3.
     * This test is expected to fail with fizzBuzz4 implementation.
     */

    @Test
    public final void testAvecMultipleDeTrois(){
        assertEquals("Fizz", FizzBuzz.fizzBuzz4(6), "Problem with the number 6");
        assertEquals("Fizz", FizzBuzz.fizzBuzz4(9), "Problem with the number 9");
        assertEquals("Fizz", FizzBuzz.fizzBuzz4(12), "Problem with the number 12");
    }

    /**
     * Tests that fizzBuzz5 returns "Fizz" for various multiples of 3.
     * This test should pass with fizzBuzz5 implementation.
     */

    @Test
    public final void testAvecMultipleDeTrois1(){
        assertEquals("Fizz", FizzBuzz.fizzBuzz5(6), "Problem with the number 6");
        assertEquals("Fizz", FizzBuzz.fizzBuzz5(9), "Problem with the number 9");
        assertEquals("Fizz", FizzBuzz.fizzBuzz5(12), "Problem with the number 12");
    }

}

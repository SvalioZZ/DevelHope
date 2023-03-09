package it.develhope.ex_advanced.ex_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    /**
     * 1:
     * <p>
     * <p>
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     * <p>
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     * <p>
     * Verify that the methods return the correct result for each test case.
     * <p>
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Calculator calculator = new Calculator();
        
        //test for sum
        
        Assertions.assertEquals(5, calculator.add(2, 3));
        Assertions.assertEquals(-1, calculator.subtract(2, 3));
        Assertions.assertEquals(0, calculator.add(0, 0));
        
        //test for subtraction
        
        Assertions.assertEquals(-1, calculator.subtract(2, 3));
        Assertions.assertEquals(5, calculator.subtract(2, -3));
        Assertions.assertEquals(0, calculator.subtract(0, 0));
        
    }
    
    /**
     * 2:
     * <p>
     * <p>
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     * <p>
     * Test the same kind of inputs as before as exercise 1
     * <p>
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        
        // Your code here
        
        Calculator calculator = new Calculator();
        
        //test for multiplication
        
        Assertions.assertEquals(0, calculator.multiply(0, 0));
        Assertions.assertEquals(6, calculator.multiply(2, 3));
        Assertions.assertEquals(-6, calculator.multiply(-2, 3));
        
        //test for division
        
        Assertions.assertEquals(0, calculator.divide(0, -3));
        Assertions.assertEquals(-2, calculator.divide(6, -3));
        Assertions.assertEquals(2, calculator.divide(6, 3));
        
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
    
    /**
     * 3:
     * <p>
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     * <p>
     * If there is an error you may have to change the code in Calculator to fix it!
     * <p>
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Calculator calculator = new Calculator();
        
        // Test base cases
        Assertions.assertEquals(1, calculator.power(0, 0));
        Assertions.assertEquals(0, calculator.power(0, 1));
        
        // Test positive and negative bases with zero exponent
        Assertions.assertEquals(1, calculator.power(2.5, 0));
        Assertions.assertEquals(1, calculator.power(-2.5, 0));
        
        // Test positive base with positive and negative exponent
        Assertions.assertEquals(8, calculator.power(2, 3));
        Assertions.assertEquals(0.125, calculator.power(2, -3));
        
        // Test negative base with positive and negative exponent
        Assertions.assertEquals(-8, calculator.power(-2, 3));
        Assertions.assertEquals(-0.125, calculator.power(-2, -3));
        
        // Test decimal base with integer exponent
        Assertions.assertEquals(27.0, calculator.power(3.0, 3));
        Assertions.assertEquals(0.125, calculator.power(0.5, 3));
        Assertions.assertEquals(1.0, calculator.power(1.0, 3));
        
        // Test decimal base with decimal exponent
        Assertions.assertEquals(4.0, calculator.power(2.0, 2.0));
        Assertions.assertEquals(0.25, calculator.power(2.0, -2.0));
        Assertions.assertEquals(1.0, calculator.power(2.0, 0.0));
    }
}


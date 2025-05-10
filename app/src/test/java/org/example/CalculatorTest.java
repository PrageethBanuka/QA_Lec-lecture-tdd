package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void additionTest() {
        var Calculator = new Calculator();
        var result = Calculator.addition(3, 5);
        System.out.println(result);
        assertEquals(8, result);
    }

    @Test
    public void substractionTest() {
        var Calculator = new Calculator();

        var result1 = Calculator.substract(5, 3);
        System.out.println(result1);
        assertEquals(2, result1);

        var result2 = Calculator.substract(5, 10);
        System.out.println(result2);
        assertEquals(-5, result2);
    }
}

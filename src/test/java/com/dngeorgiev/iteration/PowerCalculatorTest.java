package com.dngeorgiev.iteration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerCalculatorTest {
    @Test
    public void testAnythingRaisedToThePowerOfZeroIsOne() {
        PowerCalculator calculator = PowerCalculator.INSTANCE;

        assertEquals(1, calculator.calculate(0, 0));
        assertEquals(1, calculator.calculate(1, 0));
        assertEquals(1, calculator.calculate(27, 0));
        assertEquals(1, calculator.calculate(143, 0));
    }

    @Test
    public void testAnythingRaisedToThePowerOfOneIsItself() {
        PowerCalculator calculator = PowerCalculator.INSTANCE;

        assertEquals(0, calculator.calculate(0, 1));
        assertEquals(1, calculator.calculate(1, 1));
        assertEquals(27, calculator.calculate(27, 1));
        assertEquals(143, calculator.calculate(143, 1));
    }

    @Test
    public void testAritrary() {
        PowerCalculator calculator = PowerCalculator.INSTANCE;

        assertEquals(0, calculator.calculate(0, 2));
        assertEquals(1, calculator.calculate(1, 2));
        assertEquals(4, calculator.calculate(2, 2));
        assertEquals(8, calculator.calculate(2, 3));
        assertEquals(27, calculator.calculate(3, 3));
    }
}
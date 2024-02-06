package com.junitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    void testAdd() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(5, mathUtils.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testSubtract() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(1, mathUtils.subtract(3, 2), "3 - 2 should equal 1");
    }

    @Test
    void testMultiply() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(6, mathUtils.multiply(2, 3), "2 * 3 should equal 6");
    }

    @Test
    void testDivide() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(2.0, mathUtils.divide(6, 3), "6 / 3 should equal 2.0");
        assertEquals(-1.0, mathUtils.divide(1, 0), "division by zero should return -1.0");
    }
}
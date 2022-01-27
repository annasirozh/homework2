package com.calculatorproject;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SubtractionTest {
    private Calculate calculate;

    @BeforeEach
    public void setUp() throws Exception {
        calculate = new Calculate();
    }

    @DisplayName("Test to check the correctness of subtraction method")
    @ParameterizedTest
    @MethodSource("testSubtractionDataProvider")
    public void testAddition(double expected, double firstNumber, double secondNumber) {
        Assert.assertEquals("Substraction is incorrect",-8,calculate.subtraction(-12,-4),0.0);
    }

    static Stream<Arguments> testSubtractionDataProvider() {
        return Stream.of(
                Arguments.arguments(-8, -12, -4),
                Arguments.arguments(3.5, 5.6, 2.1),
                Arguments.arguments(7.24, 10.235, 3)
        );
    }

}

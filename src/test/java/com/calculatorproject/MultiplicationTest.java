package com.calculatorproject;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MultiplicationTest {
    private Calculate calculate;

    @BeforeEach
    public void setUp() throws Exception {
        calculate = new Calculate();
    }

    @DisplayName("Test to check the correctness of multiplication method")
    @ParameterizedTest
    @MethodSource("testMultiplicationDataProvider")
    public void testAddition(double expected, double firstNumber, double secondNumber) {
        Assert.assertEquals("Multiplication is incorrect",expected,calculate.multiplication(firstNumber,secondNumber),0.0);
    }

    static Stream<Arguments> testMultiplicationDataProvider() {
        return Stream.of(
                Arguments.arguments(992, 8, 124),
                Arguments.arguments(0.05, 1.5, 0.035),
                Arguments.arguments(0, 0, 569)
        );
    }
}

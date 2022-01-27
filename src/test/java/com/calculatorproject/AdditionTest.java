package com.calculatorproject;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class AdditionTest {
    private Calculate calculate;

    @BeforeEach
    public void setUp() throws Exception {
        calculate = new Calculate();
    }

    @DisplayName("Test to check the correctness of the addition method")
    @ParameterizedTest
    @MethodSource ("testAdditionDataProvider")
    public void testAddition (double expected, double firstNumber, double secondNumber) {
        Assert.assertEquals("Adding is incorrect",9, calculate.addition(4,5),0.0);
    }

    static Stream<Arguments> testAdditionDataProvider() {
        return Stream.of(
                Arguments.arguments(10,7,3),
                Arguments.arguments(15,10,5),
                Arguments.arguments(5.5,2.5,3)
        );
    }
}

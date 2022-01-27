package com.calculatorproject;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class DivisionTest {
    private Calculate calculate;

    @BeforeEach
    public void setUp() throws Exception {
        calculate = new Calculate();
    }

    @DisplayName("Test to check the correctness of division method")
    @ParameterizedTest
    @MethodSource("testDivisionDataProvider")
    public void testAddition(double expected, double firstNumber, double secondNumber) {
        Assert.assertEquals("Divission is incorrect", expected, calculate.division(firstNumber,secondNumber),0.0);
    }

    static Stream<Arguments> testDivisionDataProvider() {
        return Stream.of(
                Arguments.arguments(-1.52, 85, -56),
                Arguments.arguments(191.2, 956, 5),
                Arguments.arguments(69.08, 1589, 23)
        );
    }
}

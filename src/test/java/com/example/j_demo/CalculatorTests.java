package com.example.j_demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
    Calculator calculator;

    @BeforeEach
    void freshObject() {

        calculator = new Calculator();
    }

    @Test
    void addingTwoNumbersShouldReturnSum() {
        int a = 1;
        int b = 2;
        int expected = 3;
        int result = calculator.add(a, b);
        Assertions.assertEquals(expected, result);
        System.out.print("Adding result");
    }

    @Test
    void subtractTwoNumbersShouldReturnSubtract() {
        int a = 3;
        int b = 2;
        int expected = 1;
        int result = calculator.subtract(a, b);
        Assertions.assertEquals(expected, result);
        System.out.print("Subtract result");
    }
    @Test
    void multiplyTwoNumbersShouldReturnMultiply() {
        int a = 4;
        int b = 6;
        int expected = 20;
        int result = calculator.multiply(a, b);
        Assertions.assertEquals(expected, result);
        System.out.print("Multiply result");
    }


    @Test
    void divideTwoNumbersShouldReturnDivide() {
        int a = 8;
        int b = 4;
        int expected = 2;
        int result = (int) calculator.divide(a, b);
        Assertions.assertEquals(expected, result);
        System.out.print("Divide result");
    }

    @Test
    void squareRootOfShouldResult() {
        int a = 16;
        int expected = 4;
        int result = (int) calculator.squareRootOf(a);
        Assertions.assertEquals(expected, result);
        System.out.print("squareRootOf result");
    }
}

package org.example.unittesting;

import org.example.unittesting.services.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTests {

    @Autowired
    private CalculatorService calculator = new CalculatorService();

    // Add tests here

    @Test
    void add() {
        // Arrange
        Double a = 1.0;
        Double b = 2.0;
        Double expected = 3.0;

        // Act
        Double actual = calculator.add(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void subtract() {
        // Arrange
        Double a = 3.0;
        Double b = 2.0;
        Double expected = 1.0;

        // Act
        Double actual = calculator.subtract(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        // Arrange
        Double a = 3.0;
        Double b = 2.0;
        Double expected = 6.0;

        // Act
        Double actual = calculator.multiply(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void divide() {
        // Arrange
        Double a = 8.0;
        Double b = 2.0;
        Double expected = 4.0;

        // Act
        Double actual = calculator.divide(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void square() {
        // Arrange
        Double a = 3.0;
        Double expected = 9.0;

        // Act
        Double actual = calculator.square(a);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void squareRoot() {
        // Arrange
        Double a = 16.0;
        Double expected = 4.0;

        // Act
        Double actual = calculator.squareRoot(a);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void modulus() {
        // Arrange
        Double a = 8.0;
        Double b = 3.0;
        Double expected = 2.0;

        // Act
        Double actual = calculator.modulus(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void power() {
        // Arrange
        Double a = 3.0;
        Double b = 4.0;
        Double expected = 81.0;

        // Act
        Double actual = calculator.power(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void squareRootFailed() {
        // Arrange
        Double a = 9.0;
        Double expected = 2.0;

        // Act
        Double actual = calculator.squareRoot(a);

        // Assert
        assert(actual != expected);
    }

    @Test
    void modulusFailed() {
        // Arrange
        Double a = 4.0;
        Double b = 2.0;
        Double expected = 1.0;

        // Act
        Double actual = calculator.modulus(a, b);

        // Assert
        assert(expected != actual);
    }



}

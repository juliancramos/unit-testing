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



}

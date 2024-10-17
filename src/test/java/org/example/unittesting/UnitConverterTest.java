package org.example.unittesting;

import org.example.unittesting.services.UnitConverterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UnitConverterTest {

    @Autowired
    private UnitConverterService unitConverter = new UnitConverterService();

    @Test
    void celsiusToFahrenheit() {
        // Arrange
        Double celsius = 0.0;
        Double expected = 32.0;

        // Act
        Double actual = unitConverter.celsiusToFahrenheit(celsius);

        // Assert
        assert expected.equals(actual);
    }
}

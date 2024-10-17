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

    void fahrenheitToCelsius() {
        // Arrange
        Double fahrenheit = 32.0;
        Double expected = 0.0;

        // Act
        Double actual = unitConverter.fahrenheitToCelsius(fahrenheit);

        // Assert
        assert expected.equals(actual);
    }
    void kilometerToMile() {
        // Arrange
        Double kilometer = 1.0;
        Double expected = 0.621371;

        // Act
        Double actual = unitConverter.kilometerToMile(kilometer);

        // Assert
        assert expected.equals(actual);
    }
    void mileToKilometer() {
        // Arrange
        Double mile = 1.0;
        Double expected = 1.609;

        // Act
        Double actual = unitConverter.mileToKilometer(mile);

        // Assert
        assert expected.equals(actual);
    }

void kilogramToPounds() {
    // Arrange
    Double kilogram = 1.0;
    Double expected = 2.205;

    // Act
    Double actual = unitConverter.kilogramToPound(kilogram);

    // Assert
    assert expected.equals(actual);
}
void poundsToKilogram() {
    // Arrange
    Double pound = 2.205;
    Double expected = 1.0;

    // Act
    Double actual = unitConverter.poundToKilogram(pound);

    // Assert
    assert expected.equals(actual);
}
}

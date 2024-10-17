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
    @Test
    void fahrenheitToCelsius() {
        // Arrange
        Double fahrenheit = 32.0;
        Double expected = 0.0;

        // Act
        Double actual = unitConverter.fahrenheitToCelsius(fahrenheit);

        // Assert
        assert expected.equals(actual);
    }
    @Test
    void kilometerToMile() {
        // Arrange
        Double kilometer = 1.0;
        Double expected = 0.625;

        // Act
        Double actual = unitConverter.kilometerToMile(kilometer);

        // Assert
        assert expected.equals(actual);
    }
    @Test
    void mileToKilometer() {
        // Arrange
        Double mile = 1.0;
        Double expected = 1.609;

        // Act
        Double actual = unitConverter.mileToKilometer(mile);

        // Assert
        assert expected.equals(actual);
    }
    @Test
void kilogramToPounds() {
    // Arrange
    Double kilogram = 1.0;
    Double expected = 2.205;

    // Act
    Double actual = unitConverter.kilogramToPound(kilogram);

    // Assert
    assert expected.equals(actual);
}
    @Test
void poundsToKilogram() {
    // Arrange
    Double pound = 1.0;
    Double expected = 0.454;

    // Act
    Double actual = unitConverter.poundToKilogram(pound);

    // Assert
    assert expected.equals(actual);
}
    @Test
    void fahrenheitToCelsiusFailed() {
        // Arrange
        Double fahrenheit = 35.0;
        Double expected = 1.0;

        // Act
        Double actual = unitConverter.fahrenheitToCelsius(fahrenheit);

        // Assert
        assert !expected.equals(actual);
    }
    @Test
    void kilometerToMileFailed() {
        // Arrange
        Double kilometer = 2.0;
        Double expected = 0.625;

        // Act
        Double actual = unitConverter.kilometerToMile(kilometer);

        // Assert
        assert !expected.equals(actual);
    }
    @Test
    void mileToKilometerFailed() {
        // Arrange
        Double mile = 2.0;
        Double expected = 1.609;

        // Act
        Double actual = unitConverter.mileToKilometer(mile);

        // Assert
        assert !expected.equals(actual);
    }
    @Test
    void kilogramToPoundsFailed() {
        // Arrange
        Double kilogram = 5.0;
        Double expected = 2.205;

        // Act
        Double actual = unitConverter.kilogramToPound(kilogram);

        // Assert
        assert !expected.equals(actual);
    }
}

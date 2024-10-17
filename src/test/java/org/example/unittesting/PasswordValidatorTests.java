package org.example.unittesting;

import org.example.unittesting.services.PasswordValidatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PasswordValidatorTests {

    @Autowired
    private PasswordValidatorService passwordValidator = new PasswordValidatorService();

    // Add tests here
    @Test
    void validateCorrectPassword() {
        // Arrange
        String password = "password?";
        boolean expected = true;

        // Act
        boolean actual = passwordValidator.validate(password);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void validateIncorrectPassword() {
        String password = "password";
        boolean expected = false;

        boolean actual = passwordValidator.validate(password);

        assertEquals(expected, actual);
    }

    @Test
    void validatePasswordTooShort() {
        // Arrange
        String password = "Short1!";
        boolean expected = false;

        // Act
        boolean actual = passwordValidator.validate(password);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void validatePasswordWithoutSpecialCharacter() {
        // Arrange
        String password = "NoSpecialChar";
        boolean expected = false;

        // Act
        boolean actual = passwordValidator.validate(password);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void validatePasswordExactlyEightCharactersWithoutSpecialCharacter() {
        // Arrange
        String password = "Eight1po";
        boolean expected = false;

        // Act
        boolean actual = passwordValidator.validate(password);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void validatePasswordMoreThanEightCharactersWithSpecialCharacter() {
        // Arrange
        String password = "Eightgsb1@";
        boolean expected = true;

        // Act
        boolean actual = passwordValidator.validate(password);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void validatePasswordWithSpecialCharactersOnly() {
        // Arrange
        String password = "?¡?¡##!)(";
        boolean expected = true;

        // Act
        boolean actual = passwordValidator.validate(password);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void validatePasswordWithNumbersAndSpecialCharacters() {
        // Arrange
        String password = "12345678@#";
        boolean expected = true;

        // Act
        boolean actual = passwordValidator.validate(password);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void validatePasswordWithMixedCharacters() {
        // Arrange
        String password = "Valid1#Pass";
        boolean expected = true;

        // Act
        boolean actual = passwordValidator.validate(password);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void validateEmptyPassword() {
        String password = "";
        boolean expected = false;

        boolean actual = passwordValidator.validate(password);

        assertEquals(expected, actual);
    }
}

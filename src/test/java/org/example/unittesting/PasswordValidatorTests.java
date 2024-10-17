package org.example.unittesting;

import org.example.unittesting.services.PasswordValidatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PasswordValidatorTests {

    @Autowired
    private PasswordValidatorService passwordValidator = new PasswordValidatorService();

    // Add tests here
    @Test
    void validate() {
        // Arrange
        String password = "password";
        boolean expected = false;

        // Act
        boolean actual = passwordValidator.validate(password);

        // Assert
        assert expected == actual;
    }
}

package org.example.unittesting.services;

import org.springframework.stereotype.Service;

@Service
public class PasswordValidatorService {
    private static final int MIN_LENGTH = 8;
    private static final String SPECIAL_CHAR_REGEX = ".*[!@#$%^&*(),.?\":{}|<>].*";


    /**
     * Validate password with at least 8 characters and contains at least one special character
     * @param password password to validate
     * @return true if password is valid, false otherwise
     */
    public boolean validate(String password) {
        boolean valida = (password.length() > 8) && (password.matches(SPECIAL_CHAR_REGEX));
        return valida;
    }
}

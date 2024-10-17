package org.example.unittesting.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Double add(Double a, Double b) {
        return a + b;
    }

    public Double subtract(Double a, Double b) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Double multiply(Double a, Double b) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Double divide(Double a, Double b) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Double square(Double a) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Double squareRoot(Double a) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Double modulus(Double a, Double b) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Double power(Double a, Double b) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}

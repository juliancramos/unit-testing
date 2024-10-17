package org.example.unittesting.services;

import org.springframework.stereotype.Service;

@Service
public class UnitConverterService {

    /**
     * Convert celsius to fahrenheit
     * @param celsius temperature in celsius
     * @return temperature in fahrenheit
     */
    public Double celsiusToFahrenheit(Double celsius) {
        return (celsius * 1.8   ) + 32;
    }

    /**
     * Convert fahrenheit to celsius
     * @param fahrenheit temperature in fahrenheit
     * @return temperature in celsius
     */
    public Double fahrenheitToCelsius(Double fahrenheit) {
        return (fahrenheit - 32)*(5/9);
    }

    /**
     * Convert kilometer to mile
     * @param kilometer distance in kilometer
     * @return distance in mile
     */
    public Double kilometerToMile(Double kilometer) {
        return (kilometer/1.60);
    }

    /**
     * Convert mile to kilometer
     * @param mile distance in mile
     * @return distance in kilometer
     */
    public Double mileToKilometer(Double mile) {
        return (mile * 1.609);
    }

    /**
     * Convert kilogram to pound
     * @param kilogram weight in kilogram
     * @return weight in pound
     */
    public Double kilogramToPound(Double kilogram) {
        return (kilogram*2.205);
    }

    /**
     * Convert pound to kilogram
     * @param pound weight in pound
     * @return weight in kilogram
     */
    public Double poundToKilogram(Double pound) {
        return (pound*0.454);
    }
}


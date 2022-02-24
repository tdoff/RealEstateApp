package com.realestateapp;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ApartmentRaterTest {

    @Test
    void should_ReturnErrorValue_When_IncorrectApartment() {
        // given
        Apartment apartment = new Apartment(0, BigDecimal.valueOf(3000));

        // when
        int rate = ApartmentRater.rateApartment(apartment);

        //then
        assertEquals(-1, rate);
    }

    @Test
    void should_ReturnZero_When_AreaEqualsZero() {//120000/30
    }

    @Test
    void calculateAverageRating() {
    }
}
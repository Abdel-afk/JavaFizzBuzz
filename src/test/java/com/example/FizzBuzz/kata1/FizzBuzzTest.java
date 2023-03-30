package com.example.FizzBuzz.kata1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testGetFizzOrNumberReturnsFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzOrNumber(9);
        assertEquals("Fizz", result);
    }
}
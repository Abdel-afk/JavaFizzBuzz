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

    @Test
    void getFizzOrBuzzOrNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzOrBuzzOrNumber(10);
        assertEquals("Buzz", result);
    }


    @Test
    void testGetFizzOrBuzzOrNumberReturnsFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzOrBuzzOrNumber(15);
        assertEquals("FizzBuzz", result);
    }
}
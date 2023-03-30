package com.example.FizzBuzz.kata1;

public class FizzBuzz {

    public String execute(Integer num){
        return "hola";
    }

    public String getFizzOrNumber(int i) {
        return "Fizz";
    }

    public String getFizzOrBuzzOrNumber(int number) {
        if (number % 3 == 0 && number % 5 == 0 && number >= 1 && number <= 100) {
            return "FizzBuzz";
        } else if (number % 3 == 0 && number >= 1 && number <= 100) {
            return "Fizz";
        } else if (number % 5 == 0 && number >= 1 && number <= 100) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }


}

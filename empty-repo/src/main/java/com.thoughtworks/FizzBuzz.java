package com.thoughtworks;

public class FizzBuzz {
    public boolean isDevidedBy3(int number){
        if (number % 3 ==0){return true;}
        return false;

    }

    public String getResult(int number){
        if (isDevidedBy3(number)){
            return "Fizz";
        }
        return String.valueOf(number);
    }
}

package com.thoughtworks;

public class FizzBuzz {

    public boolean isDevidedByDivided(int number,int divided){
        if (number % divided ==0){return true;}
        return false;
    }
    public String getResult(int number){
        int FizzNumber = 3;
        int BuzzNumber = 5;
        int FizzBuzzNumber = 15;
        if (isDevidedByDivided(number,FizzBuzzNumber)){
            return "FizzBuzz";
        }
        else if (isDevidedByDivided(number,FizzNumber)){
            return "Fizz";
        } else if (isDevidedByDivided(number,BuzzNumber)) {
        return "Buzz";
        }

        return String.valueOf(number);
    }
}

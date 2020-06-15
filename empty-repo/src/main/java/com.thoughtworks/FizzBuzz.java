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
        int WhizzNumber = 7;
        int FizzWhizzNumber = 21;
        int BuzzWhizzNumber = 35;
        int FizzBuzzWhizzNumber = 105;

        if (isDevidedByDivided(number,FizzBuzzWhizzNumber)){
            return "FizzBuzzWhizz";
        }
        if (isDevidedByDivided(number,BuzzWhizzNumber)){
            return "BuzzWhizz";
        }
        if (isDevidedByDivided(number,FizzWhizzNumber)){
            return "FizzWhizz";
        }
        if (isDevidedByDivided(number,FizzBuzzNumber)){
            return "FizzBuzz";
        }
        else if (isDevidedByDivided(number,FizzNumber)){
            return "Fizz";
        } else if (isDevidedByDivided(number,BuzzNumber)) {
        return "Buzz";
        }
        else if (isDevidedByDivided(number,WhizzNumber)) {
            return "Whizz";
        }

        return String.valueOf(number);
    }
}

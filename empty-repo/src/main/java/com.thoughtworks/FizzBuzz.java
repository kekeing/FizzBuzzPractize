package com.thoughtworks;

public class FizzBuzz {

    public boolean isDividedByDivided(int number,int divisor){
        if (number % divisor ==0){return true;}
        return false;
    }
    public boolean isIncluded(int number,int includedNumber){
        String stringNumber = String.valueOf(number);
        String stringIncludedNumer = String.valueOf(includedNumber);
        if (stringNumber.contains(stringIncludedNumer)){
            return true;
        }
        return false;
    }
    public String getResult(int number){
        int FizzNumber = 3;
        int BuzzNumber = 5;
        int WhizzNumber = 7;
        String resultString = "";
         if (isDividedByDivided(number,FizzNumber)){
            resultString = resultString + "Fizz";
        }
         if (isDividedByDivided(number,BuzzNumber)) {
             resultString = resultString + "Buzz";
        }
         if (isDividedByDivided(number,WhizzNumber)) {
             resultString = resultString + "Whizz";
        }
       if (resultString == "" && !isIncluded(number,3)){
           return String.valueOf(number);
       }else if (isIncluded(number,3)){
           return "Fizz";
       }else {
           return resultString;
       }
    }
}

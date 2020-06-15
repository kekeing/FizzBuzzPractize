package com.thoughtworks;

public class FizzBuzz {

    public boolean isDividedByDivided(int number,int divisor){
        if (number % divisor ==0){return true;}
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
       if (resultString == ""){
           return String.valueOf(number);
       }else {
           return resultString;
       }
    }
}

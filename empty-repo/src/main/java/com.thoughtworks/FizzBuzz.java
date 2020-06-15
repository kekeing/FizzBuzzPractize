package com.thoughtworks;

public class FizzBuzz {

    private boolean isDividedByDivided(int number, int divisor) {
        if (number % divisor == 0) {
            return true;
        }
        return false;
    }

    private boolean isIncluded(int number, int includedNumber) {
        String stringNumber = String.valueOf(number);
        String stringIncludedNumer = String.valueOf(includedNumber);
        if (stringNumber.contains(stringIncludedNumer)) {
            return true;
        }
        return false;
    }

    public String getResult(int number) {
        int includedFizzNumber = 3;
        int includedBuzzNumber = 5;
        int FizzNumber = 3;
        int BuzzNumber = 5;
        int WhizzNumber = 7;
        String resultString = "";
        if (!isIncluded(number,includedBuzzNumber)) {
            if (isDividedByDivided(number, FizzNumber)) {
                resultString = resultString + "Fizz";
            }
        }
        if (isDividedByDivided(number, BuzzNumber)) {
            resultString = resultString + "Buzz";
        }
        if (isDividedByDivided(number, WhizzNumber)) {
            resultString = resultString + "Whizz";
        }
        if (resultString == "" && !isIncluded(number, includedFizzNumber)) {
            resultString = String.valueOf(number);
        } else if (isIncluded(number, includedFizzNumber) && !isIncluded(number,includedBuzzNumber)) {
            resultString = "Fizz";
        }
        return resultString;

    }
}

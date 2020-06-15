package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_get_number_1_when_given_1() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();


        //when
        String result = fizzBuzz.getResult(1);

        //then
        assertEquals(result, "1");
    }
    @Test
    public void should_get_word_Fizz_when_given_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();


        //when
        String result = fizzBuzz.getResult(3);

        //then
        assertEquals(result, "Fizz");
    }
    @Test
    public void should_get_word_Buzz_when_given_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();


        //when
        String result = fizzBuzz.getResult(5);

        //then
        assertEquals(result, "Buzz");
    }

    @Test
    public void should_get_word_FizzBuzz_when_given_15() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();


        //when
        String result = fizzBuzz.getResult(15);

        //then
        assertEquals(result, "FizzBuzz");
    }
    @Test
    public void should_get_word_Whizz_when_given_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();


        //when
        String result = fizzBuzz.getResult(7);

        //then
        assertEquals(result, "Whizz");
    }
    @Test
    public void should_get_word_FizzWhizz_when_given_21() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();


        //when
        String result = fizzBuzz.getResult(21);

        //then
        assertEquals(result, "FizzWhizz");
    }

    @Test
    public void should_get_word_BuzzWhizz_when_given_35() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();


        //when
        String result = fizzBuzz.getResult(35);

        //then
        assertEquals(result, "BuzzWhizz");
    }
    @Test
    public void should_get_word_FizzBuzzWhizz_when_given_105() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();


        //when
        String result = fizzBuzz.getResult(105);

        //then
        assertEquals(result, "FizzBuzzWhizz");
    }
}

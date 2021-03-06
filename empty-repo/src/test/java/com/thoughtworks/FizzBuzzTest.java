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
        assertEquals(result, "Buzz");
    }

    @Test
    public void should_get_word_FizzBuzz_when_given_60() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.getResult(60);
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
    public void should_get_word_BuzzWhizz_when_given_70() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.getResult(70);
        //then
        assertEquals(result, "Whizz");
    }
    @Test
    public void should_get_word_BuzzWhizz_when_given_140() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.getResult(140);
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
        assertEquals(result, "BuzzWhizz");
    }
    @Test
    public void should_get_word_FizzBuzzWhizz_when_given_210() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.getResult(210);
        //then
        assertEquals(result, "FizzBuzzWhizz");
    }

    @Test
    public void should_get_word_Fizz_when_given_13() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.getResult(13);
        //then
        assertEquals(result, "Fizz");
    }

    @Test
    public void should_get_word_Fizz_when_given_30() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.getResult(30);
        //then
        assertEquals(result, "Fizz");
    }
    @Test
    public void should_get_word_Fizz_when_given_75() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.getResult(75);
        //then
        assertEquals(result, "Fizz");
    }
    @Test
    public void should_get_word_Fizz_when_given_105() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.getResult(105);
        //then
        assertEquals(result, "BuzzWhizz");
    }
    @Test
    public void should_get_word_Fizz_when_given_153() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.getResult(153);
        //then
        assertEquals(result, "153");
    }
    @Test
    public void should_get_word_Fizz_when_given_753() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.getResult(753);
        //then
        assertEquals(result, "Fizz");
    }

    @Test
    public void should_get_word_Fizz_when_given_173() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.getResult(173);
        //then
        assertEquals(result, "Fizz");
    }
    @Test
    public void should_get_word_Fizz_when_given_53() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.getResult(53);
        //then
        assertEquals(result, "53");
    }
}

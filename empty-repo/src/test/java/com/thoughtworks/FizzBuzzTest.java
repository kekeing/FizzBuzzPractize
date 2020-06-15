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

}

package com.thoughtworks;

import java.util.List;

public class MoveMarsRover {
    public MarsRover moveMarsRoverAccordOrders(MarsRover marsRover, List<Character> orders){
        MarsRover resultMarsRover = new MarsRover();
        for (Character character : orders)
        {
             resultMarsRover = moveMarsRoverAccordOrder(marsRover,character);
        }
        return resultMarsRover;
    }

    private MarsRover moveMarsRoverAccordOrder(MarsRover marsRover, Character character) {
        MarsRover resultMarsRoverAccordCharacter = new MarsRover();
        if (character == 'M'){

        }
        return  resultMarsRoverAccordCharacter;
    }
}

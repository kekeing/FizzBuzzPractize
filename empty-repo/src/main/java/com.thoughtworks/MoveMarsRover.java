package com.thoughtworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveMarsRover {
    public static int border = 5;
    public MarsRover moveMarsRoverAccordOrders(MarsRover marsRover, List<Character> orders){
        MarsRover testMarsRover = new MarsRover();
        for (Character character : orders)
        {
            testMarsRover.setCoordinateY(marsRover.getCoordinateY());
            testMarsRover.setCoordinateX(marsRover.getCoordinateX());
            testMarsRover.setDirection(marsRover.getDirection());
            moveMarsRoverAccordOrder(testMarsRover,character);
            if (Math.abs(testMarsRover.getCoordinateX()) > border || Math.abs(testMarsRover.getCoordinateY()) > border)
            {return marsRover;}
              moveMarsRoverAccordOrder(marsRover,character);
        }
        return marsRover;
    }

    private void moveMarsRoverAccordOrder(MarsRover marsRover, Character character) {
        if (character == 'M'){
         resultMarsRoverAccordCharacterM(marsRover);
        }
        else if (character == 'L'){
            resultMarsRoverAccordCharacterL(marsRover);
        }
        else if (character == 'R'){
             resultMarsRoverAccordCharacterR(marsRover);
        }else{
        throw new RuntimeException("XXX");
        }
    }

    private void resultMarsRoverAccordCharacterLorR(MarsRover marsRover,Character character){
        List<Character> list = Arrays.asList('N','E','S','W');
        int index = list.indexOf(marsRover.getDirection());
        int resultIndex = 0;
        if (character == 'R'){ resultIndex = (index + 1) % 4;}
        if (character == 'L'){ resultIndex = (index + 3) % 4;}
        marsRover.setDirection(list.get(resultIndex));
        marsRover.setCoordinateY(marsRover.getCoordinateY());
        marsRover.setCoordinateX(marsRover.getCoordinateX());
    }

    private void resultMarsRoverAccordCharacterL(MarsRover marsRover) {
        resultMarsRoverAccordCharacterLorR(marsRover,'L');
    }
    private void resultMarsRoverAccordCharacterR(MarsRover marsRover) {
         resultMarsRoverAccordCharacterLorR(marsRover,'R');
    }

    private void resultMarsRoverAccordCharacterM(MarsRover marsRover) {
        if (Arrays.asList('N','S').contains(marsRover.getDirection())){
            marsRover.setCoordinateX(marsRover.getCoordinateX());
            marsRover.setDirection(marsRover.getDirection());
            if (marsRover.getDirection() == 'N'){
                marsRover.setCoordinateY(marsRover.getCoordinateY() + 1);
            }
            if (marsRover.getDirection() == 'S'){
                marsRover.setCoordinateY(marsRover.getCoordinateY() - 1);
            }
        }
        if (Arrays.asList('W','E').contains(marsRover.getDirection())){
            marsRover.setCoordinateY(marsRover.getCoordinateY());
            marsRover.setDirection(marsRover.getDirection());
            if (marsRover.getDirection() == 'W'){
                marsRover.setCoordinateX(marsRover.getCoordinateX() - 1);
            }
            if (marsRover.getDirection() == 'E'){
                marsRover.setCoordinateX(marsRover.getCoordinateX() + 1);
            }
        }
    }
}

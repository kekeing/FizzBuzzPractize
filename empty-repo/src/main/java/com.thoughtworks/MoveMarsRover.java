package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class MoveMarsRover {
    public MarsRover moveMarsRoverAccordOrders(MarsRover marsRover, List<Character> orders){
        for (Character character : orders)
        {
              moveMarsRoverAccordOrder(marsRover,character);
        }
        return marsRover;
    }

    private void moveMarsRoverAccordOrder(MarsRover marsRover, Character character) {
        if (character == 'M'){
         resultMarsRoverAccordCharacterM(marsRover);
        }
        if (character == 'L'){
            resultMarsRoverAccordCharacterL(marsRover);
        }
        if (character == 'R'){
             resultMarsRoverAccordCharacterR(marsRover);
        }
    }

    private void resultMarsRoverAccordCharacterLorR(MarsRover marsRover,Character character){
        List<Character> list = new ArrayList<>();
        list.add('N');
        list.add('E');
        list.add('S');
        list.add('W');
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
        if (marsRover.getDirection() == 'N'){
            marsRover.setCoordinateY(marsRover.getCoordinateY() + 1);
            marsRover.setCoordinateX(marsRover.getCoordinateX());
            marsRover.setDirection(marsRover.getDirection());
        }
        if (marsRover.getDirection() == 'W'){
            marsRover.setCoordinateX(marsRover.getCoordinateX() - 1);
            marsRover.setCoordinateY(marsRover.getCoordinateY());
            marsRover.setDirection(marsRover.getDirection());
        }
        if (marsRover.getDirection() == 'S'){
            marsRover.setCoordinateY(marsRover.getCoordinateY() - 1);
            marsRover.setCoordinateX(marsRover.getCoordinateX());
            marsRover.setDirection(marsRover.getDirection());        }
        if (marsRover.getDirection() == 'E'){
            marsRover.setCoordinateX(marsRover.getCoordinateX() + 1);
            marsRover.setCoordinateY(marsRover.getCoordinateY());
            marsRover.setDirection(marsRover.getDirection());        }
    }
}

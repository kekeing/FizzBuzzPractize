package com.thoughtworks;

import java.util.ArrayList;
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
        resultMarsRoverAccordCharacter = resultMarsRoverAccordCharacterM(marsRover);
        }
        if (character == 'L'){
            resultMarsRoverAccordCharacter = resultMarsRoverAccordCharacterL(marsRover);
        }
        if (character == 'R'){
            resultMarsRoverAccordCharacter = resultMarsRoverAccordCharacterR(marsRover);
        }
        return  resultMarsRoverAccordCharacter;
    }

    private MarsRover resultMarsRoverAccordCharacterL(MarsRover marsRover) {
        MarsRover resultMarsRoverAccordCharacter = new MarsRover();
        List<Character> list = new ArrayList<>();
        list.add('N');
        list.add('E');
        list.add('S');
        list.add('W');
        int index = list.indexOf(marsRover.getDirection());
        int resultIndex = list.get((index + 4 - 1) % 4);
        resultMarsRoverAccordCharacter.setDirection(list.get(resultIndex));
        resultMarsRoverAccordCharacter.setCoordinateY(marsRover.getCoordinateY());
        resultMarsRoverAccordCharacter.setCoordinateX(marsRover.getCoordinateX());
        return resultMarsRoverAccordCharacter;
    }
    private MarsRover resultMarsRoverAccordCharacterR(MarsRover marsRover) {
        MarsRover resultMarsRoverAccordCharacter = new MarsRover();
        List<Character> list = new ArrayList<>();
        list.add('N');
        list.add('E');
        list.add('S');
        list.add('W');
        int index = list.indexOf(marsRover.getDirection());
        int resultIndex = list.get((index + 1) % 4);
        resultMarsRoverAccordCharacter.setDirection(list.get(resultIndex));
        resultMarsRoverAccordCharacter.setCoordinateY(marsRover.getCoordinateY());
        resultMarsRoverAccordCharacter.setCoordinateX(marsRover.getCoordinateX());
        return resultMarsRoverAccordCharacter;
    }

    private MarsRover resultMarsRoverAccordCharacterM(MarsRover marsRover) {
        MarsRover resultMarsRoverAccordCharacter = new MarsRover();
        if ("N".equals(marsRover.getDirection())){
            resultMarsRoverAccordCharacter.setCoordinateY(marsRover.getCoordinateY() + 1);
            resultMarsRoverAccordCharacter.setCoordinateX(marsRover.getCoordinateX());
            resultMarsRoverAccordCharacter.setDirection(marsRover.getDirection());
        }
        if ("W".equals(marsRover.getDirection())){
            resultMarsRoverAccordCharacter.setCoordinateX(marsRover.getCoordinateX() - 1);
            resultMarsRoverAccordCharacter.setCoordinateY(marsRover.getCoordinateY());
            resultMarsRoverAccordCharacter.setDirection(marsRover.getDirection());
        }
        if ("S".equals(marsRover.getDirection())){
            resultMarsRoverAccordCharacter.setCoordinateY(marsRover.getCoordinateY() - 1);
            resultMarsRoverAccordCharacter.setCoordinateX(marsRover.getCoordinateX());
            resultMarsRoverAccordCharacter.setDirection(marsRover.getDirection());        }
        if ("E".equals(marsRover.getDirection())){
            resultMarsRoverAccordCharacter.setCoordinateX(marsRover.getCoordinateX() + 1);
            resultMarsRoverAccordCharacter.setCoordinateY(marsRover.getCoordinateY());
            resultMarsRoverAccordCharacter.setDirection(marsRover.getDirection());        }
        return resultMarsRoverAccordCharacter;
    }
}

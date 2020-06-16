package com.thoughtworks;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MoveMarsRoverTest {
    @Test
    public void should_get_MarsRover_xIs0_yIs1_directionIsN_when_given_MarsRover_xIs0_yIs0_directionIsN_listIsM() {
        //given
        MarsRover marsRover = new MarsRover(0,0,'N');
        MarsRover expectMarsRover = new MarsRover(0,1,'N');
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        List<Character> list= new ArrayList<>();
        list.add('M');

        //when
        MarsRover resultMarsRover = moveMarsRover.moveMarsRoverAccordOrders(marsRover,list);
        //then
        assertEquals(resultMarsRover.getCoordinateX(),expectMarsRover.getCoordinateX());
        assertEquals(resultMarsRover.getCoordinateY(),expectMarsRover.getCoordinateY());
        assertEquals(resultMarsRover.getDirection(),expectMarsRover.getDirection());
    }

    @Test
    public void should_get_MarsRover_xIs0_yIs0_directionIsW_when_given_MarsRover_xIs0_yIs0_directionIsN_listIsL() {
        //given
        MarsRover marsRover = new MarsRover(0,0,'N');
        MarsRover expectMarsRover = new MarsRover(0,0,'W');
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        List<Character> list= new ArrayList<>();
        list.add('W');

        //when
        MarsRover resultMarsRover = moveMarsRover.moveMarsRoverAccordOrders(marsRover,list);
        //then
        assertEquals(resultMarsRover.getCoordinateX(),expectMarsRover.getCoordinateX());
        assertEquals(resultMarsRover.getCoordinateY(),expectMarsRover.getCoordinateY());
        assertEquals(resultMarsRover.getDirection(),expectMarsRover.getDirection());
    }
    @Test
    public void should_get_MarsRover_xIs0_yIs0_directionIsE_when_given_MarsRover_xIs0_yIs0_directionIsN_listIsR() {
        //given
        MarsRover marsRover = new MarsRover(0,0,'N');
        MarsRover expectMarsRover = new MarsRover(0,0,'E');
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        List<Character> list= new ArrayList<>();
        list.add('E');

        //when
        MarsRover resultMarsRover = moveMarsRover.moveMarsRoverAccordOrders(marsRover,list);
        //then
        assertEquals(resultMarsRover.getCoordinateX(),expectMarsRover.getCoordinateX());
        assertEquals(resultMarsRover.getCoordinateY(),expectMarsRover.getCoordinateY());
        assertEquals(resultMarsRover.getDirection(),expectMarsRover.getDirection());
    }
}

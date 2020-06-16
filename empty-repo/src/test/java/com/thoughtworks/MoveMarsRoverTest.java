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
        moveMarsRover.moveMarsRoverAccordOrders(marsRover,list);
        //then
        assertEquals(marsRover.getCoordinateX(),expectMarsRover.getCoordinateX());
        assertEquals(marsRover.getCoordinateY(),expectMarsRover.getCoordinateY());
        assertEquals(marsRover.getDirection(),expectMarsRover.getDirection());
    }

    @Test
    public void should_get_MarsRover_xIs0_yIs0_directionIsW_when_given_MarsRover_xIs0_yIs0_directionIsN_listIsL() {
        //given
        MarsRover marsRover = new MarsRover(0,0,'N');
        MarsRover expectMarsRover = new MarsRover(0,0,'W');
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        List<Character> list= new ArrayList<>();
        list.add('L');

        //when
        moveMarsRover.moveMarsRoverAccordOrders(marsRover,list);
        //then
        assertEquals(marsRover.getCoordinateX(),expectMarsRover.getCoordinateX());
        assertEquals(marsRover.getCoordinateY(),expectMarsRover.getCoordinateY());
        assertEquals(marsRover.getDirection(),expectMarsRover.getDirection());
    }
    @Test
    public void should_get_MarsRover_xIs0_yIs0_directionIsE_when_given_MarsRover_xIs0_yIs0_directionIsN_listIsR() {
        //given
        MarsRover marsRover = new MarsRover(0,0,'N');
        MarsRover expectMarsRover = new MarsRover(0,0,'E');
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        List<Character> list= new ArrayList<>();
        list.add('R');

        //when
        moveMarsRover.moveMarsRoverAccordOrders(marsRover,list);
        //then
        assertEquals(marsRover.getCoordinateX(),expectMarsRover.getCoordinateX());
        assertEquals(marsRover.getCoordinateY(),expectMarsRover.getCoordinateY());
        assertEquals(marsRover.getDirection(),expectMarsRover.getDirection());
    }
    @Test
    public void should_get_MarsRover_xIs1_yIs0_directionIsE_when_given_MarsRover_xIs0_yIs0_directionIsE_listIsM() {
        //given
        MarsRover marsRover = new MarsRover(0,0,'E');
        MarsRover expectMarsRover = new MarsRover(1,0,'E');
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        List<Character> list= new ArrayList<>();
        list.add('M');

        //when
        moveMarsRover.moveMarsRoverAccordOrders(marsRover,list);
        //then
        assertEquals(marsRover.getCoordinateX(),expectMarsRover.getCoordinateX());
        assertEquals(marsRover.getCoordinateY(),expectMarsRover.getCoordinateY());
        assertEquals(marsRover.getDirection(),expectMarsRover.getDirection());
    }
    @Test
    public void should_get_MarsRover_xIs0_yIs0_directionIsW_when_given_MarsRover_xIs0_yIs0_directionIsN_listIsRRR() {
        //given
        MarsRover marsRover = new MarsRover(0,0,'N');
        MarsRover expectMarsRover = new MarsRover(0,0,'W');
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        List<Character> list= new ArrayList<>();
        list.add('R');
        list.add('R');
        list.add('R');

        //when
        moveMarsRover.moveMarsRoverAccordOrders(marsRover,list);
        //then
        assertEquals(marsRover.getCoordinateX(),expectMarsRover.getCoordinateX());
        assertEquals(marsRover.getCoordinateY(),expectMarsRover.getCoordinateY());
        assertEquals(marsRover.getDirection(),expectMarsRover.getDirection());
    }
    @Test
    public void should_get_MarsRover_xIs0_yIs2_directionIsN_when_given_MarsRover_xIs0_yIs0_directionIsN_listIsMM() {
        //given
        MarsRover marsRover = new MarsRover(0,0,'N');
        MarsRover expectMarsRover = new MarsRover(0,2,'N');
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        List<Character> list= new ArrayList<>();
        list.add('M');
        list.add('M');

        //when
        moveMarsRover.moveMarsRoverAccordOrders(marsRover,list);
        //then
        assertEquals(marsRover.getCoordinateX(),expectMarsRover.getCoordinateX());
        assertEquals(marsRover.getCoordinateY(),expectMarsRover.getCoordinateY());
        assertEquals(marsRover.getDirection(),expectMarsRover.getDirection());
    }
    @Test
    public void should_get_MarsRover_xIs2_yIs0_directionIsE_when_given_MarsRover_xIs0_yIs0_directionIsN_listIsRMM() {
        //given
        MarsRover marsRover = new MarsRover(0,0,'N');
        MarsRover expectMarsRover = new MarsRover(2,0,'E');
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        List<Character> list= new ArrayList<>();
        list.add('R');
        list.add('M');
        list.add('M');

        //when
        moveMarsRover.moveMarsRoverAccordOrders(marsRover,list);
        //then
        assertEquals(marsRover.getCoordinateX(),expectMarsRover.getCoordinateX());
        assertEquals(marsRover.getCoordinateY(),expectMarsRover.getCoordinateY());
        assertEquals(marsRover.getDirection(),expectMarsRover.getDirection());
    }
    @Test
    public void should_get_MarsRover_xIs5_yIs5_directionIsN_when_given_MarsRover_xIs5_yIs5_directionIsN_listIsM() {
        //given
        MarsRover marsRover = new MarsRover(5,5,'N');
        MarsRover expectMarsRover = new MarsRover(5,5,'N');
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        List<Character> list= new ArrayList<>();
        list.add('M');

        //when
        moveMarsRover.moveMarsRoverAccordOrders(marsRover,list);
        //then
        assertEquals(marsRover.getCoordinateX(),expectMarsRover.getCoordinateX());
        assertEquals(marsRover.getCoordinateY(),expectMarsRover.getCoordinateY());
        assertEquals(marsRover.getDirection(),expectMarsRover.getDirection());
    }
    @Test
    public void should_get_MarsRover_xIs_negative5_yIs_negative5_directionIsS_when_given_MarsRover_xIs_negative5_yIs_negative5_directionIsS_listIsM() {
        //given
        MarsRover marsRover = new MarsRover(-5,-5,'S');
        MarsRover expectMarsRover = new MarsRover(-5,-5,'S');
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        List<Character> list= new ArrayList<>();
        list.add('M');

        //when
        moveMarsRover.moveMarsRoverAccordOrders(marsRover,list);
        //then
        assertEquals(marsRover.getCoordinateX(),expectMarsRover.getCoordinateX());
        assertEquals(marsRover.getCoordinateY(),expectMarsRover.getCoordinateY());
        assertEquals(marsRover.getDirection(),expectMarsRover.getDirection());
    }
    @Test
    public void should_get_MarsRover_xIs_negative5_yIs_negative5_directionIsS_when_given_MarsRover_xIs_negative5_yIs_negative5_directionIsS_listIsMRR() {
        //given
        MarsRover marsRover = new MarsRover(-5,-5,'S');
        MarsRover expectMarsRover = new MarsRover(-5,-5,'S');
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        List<Character> list= new ArrayList<>();
        list.add('M');
        list.add('R');
        list.add('R');

        //when
        moveMarsRover.moveMarsRoverAccordOrders(marsRover,list);
        //then
        assertEquals(marsRover.getCoordinateX(),expectMarsRover.getCoordinateX());
        assertEquals(marsRover.getCoordinateY(),expectMarsRover.getCoordinateY());
        assertEquals(marsRover.getDirection(),expectMarsRover.getDirection());
    }

}

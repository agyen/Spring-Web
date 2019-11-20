package io.turntabl.Spring.Web.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathsTest {

    private Maths calculations = new Maths();
    @Test
    public void addTest(){
        assertEquals(3, calculations.add(1,2));
    }

    @Test
    public void subtraction(){
        assertEquals(5, calculations.subtract(15, 10));
    }

}
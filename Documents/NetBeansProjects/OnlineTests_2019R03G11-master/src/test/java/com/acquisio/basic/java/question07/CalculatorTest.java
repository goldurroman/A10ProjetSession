package com.acquisio.basic.java.question07;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    // TODO: Insert your code here.
    @Test
    public void testCalc22add() {
        assertEquals(new Integer(4) , new Calculator().applyOperation(2,2,'+'));
    }
    @Test
    public void testCalc22del() {
        assertEquals(new Integer(0) , new Calculator().applyOperation(2,2,'-'));
    }
    @Test
    public void testCalc22mult() {
        assertEquals(new Integer(4) , new Calculator().applyOperation(2,2,'*'));
    }
    @Test
    public void testCalc22div() {
        assertEquals(new Integer(1) , new Calculator().applyOperation(2,2,'/'));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCalc22opp() {
        assertEquals("Operator 'a' not supported" , new Calculator().applyOperation(2,2,'a'));
    }    
    @Test
    public void testCalc20div() {
        assertEquals(null , new Calculator().applyOperation(2,0,'/'));
    }
}

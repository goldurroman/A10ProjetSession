package com.acquisio.basic.java.question01;

import org.junit.Test;

import static org.junit.Assert.*;

public class FooBarTest {

    @Test
    public void testFooBar0() {
        assertEquals("FooBar", new FooBar().fooBar(0));
    }    
    @Test
    public void testFooBar2() {
        assertEquals("2", new FooBar().fooBar(2));
    }
    @Test
    public void testFooBar3() {
        assertEquals("Foo", new FooBar().fooBar(3));
    }

    @Test
    public void testFooBar5() {
        assertEquals("Bar", new FooBar().fooBar(5));
    }
    @Test
    public void testFooBar6() {
        assertEquals("Foo", new FooBar().fooBar(6));
    }
    
    @Test
    public void testFooBar10() {
        assertEquals("Bar", new FooBar().fooBar(10));
    }
    
    @Test
    public void testFooBar11() {
        assertEquals("11", new FooBar().fooBar(11));
    }
    
    @Test
    public void testFooBar15() {
        assertEquals("FooBar", new FooBar().fooBar(15));
    }
    
    
   
    @Test
    public void testFooBar30() {
        assertEquals("FooBar", new FooBar().fooBar(30));
    }

}
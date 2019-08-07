package edu.mum.cs.cs425.unittestapp;

import edu.mum.cs.cs425.unittestapp.tddwithjunit.ArithmeticOps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class ArithmeticOpsTest {

    private ArithmeticOps arithmeticOps = null;

    public ArithmeticOpsTest() {
        this.arithmeticOps = new ArithmeticOps();
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        this.arithmeticOps = null;
    }

    @Test
    public void add() {
        int a = 1;
        int b = 2;

        int expected =  3;
        int actual = arithmeticOps.add(a,b);
        assertEquals(expected, actual);
    }

    @Test
    public void subtract() {
        int a = 2;
        int b = 1;
        int expected =  1;
        int actual = arithmeticOps.subtract(a,b);
        assertEquals(expected, actual);
    }



}

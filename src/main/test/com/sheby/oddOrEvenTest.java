package com.sheby;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class oddOrEvenTest {
    private oddOrEven oddEven;

    @Before
    public void setUp() throws Exception {
        oddEven = new oddOrEven(25);
        //System.out.println("This test is running before the test cases");
    }

    @After
    public void tearDown() throws Exception {
        oddEven = new oddOrEven(25);
        //System.out.println("This test is running after the test cases");
    }

    @Test
    public void checkOdd() throws Exception {
        //oddEven=new oddOrEven(25);
        String result=oddEven.checkOddOrEven(25);
        assertEquals("Tom", result);

    }

    @Test
    public void checkEven() throws Exception {
        //oddEven=new oddOrEven(25);
        String result=oddEven.checkOddOrEven(26);
        assertEquals("Jerry", result);

    }

    @Test
    public void checkRange() throws Exception   {
        String result=oddEven.checkOddOrEven(32);
        assertEquals("Error",result);
    }

}
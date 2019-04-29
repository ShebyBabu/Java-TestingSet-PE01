package com.sheby;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessingNumberTest {
    private GuessingNumber guessNumber;

    @Before
    public void setUp() {
        guessNumber=new GuessingNumber(80);
    }

    @After
    public void tearDown() throws Exception {
        guessNumber = new GuessingNumber(25);
        //System.out.println("This test is running after the test cases");
    }

    @Test
    public void guessingNumberLess() {
        String result=guessNumber.guessingNumberMethod(25,100);
        assertEquals("Number guessed is less than original number",result);

    }

    @Test
    public void guessingNumberMore() {
        String result=guessNumber.guessingNumberMethod(170,100);
        assertEquals("Number guessed is more than original number",result);

    }

    @Test
    public void guessingNumberSame() {
        String result=guessNumber.guessingNumberMethod(100,100);
        assertEquals("Number guessed matches original number",result);

    }
}